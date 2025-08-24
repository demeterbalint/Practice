package systemDump;

import systemDump.hardware.Hardware;
import systemDump.hardware.HardwareType;
import systemDump.software.Software;
import systemDump.software.SoftwareType;

import java.util.ArrayList;
import java.util.List;

public class SystemDump {

    private List<Hardware> hardwareList = new ArrayList<>();

    public void registerHardware(String name, int capacity, int memory, HardwareType hardwareType) {
        Hardware hardware = new Hardware(name, capacity, memory, hardwareType);
        hardwareList.add(hardware);
    }

    public void registerSoftware(String hardwareName, String name, int capacity, int memory, SoftwareType softwareType) {
        Hardware hardware = getHardwareByName(hardwareName);
        Software software = new Software(name, capacity, memory, softwareType);
        if (hardware.getMaximumCapacity() - hardware.getCapacityInUse() >= software.getCapacityConsumption() && hardware.getMaximumMemory() - hardware.getMemoryInUse() >= software.getMemoryConsumption()) {
            hardware.getSoftwareList().add(software);
            hardware.setCapacityInUse(hardware.getCapacityInUse() + software.getCapacityConsumption());
            hardware.setMemoryInUse(hardware.getMemoryInUse() + software.getMemoryConsumption());
        } else {
            software = null;
        }
    }

    public void releaseSoftware(String hardwareName, String softwareName) {
        Hardware hardware = getHardwareByName(hardwareName);
        Software software = hardware.getSoftwareList().stream().filter(s -> s.getName().equals(softwareName)).findFirst().orElse(null);
        try {
            hardware.setCapacityInUse(hardware.getCapacityInUse() - software.getCapacityConsumption());
            hardware.setMemoryInUse(hardware.getMemoryInUse() - software.getMemoryConsumption());
            hardware.getSoftwareList().removeIf(s -> s.getName().equals(softwareName));
        } catch (NullPointerException ignored) {};
    }

    public void analyze() {
        int softwares = hardwareList.stream().mapToInt(h -> h.getSoftwareList().size()).sum();
        int totalMemoryInUse = hardwareList.stream().mapToInt(Hardware::getMemoryInUse).sum();
        int totalMemory = hardwareList.stream().mapToInt(Hardware::getMaximumMemory).sum();
        int totalCapacityInUse = hardwareList.stream().mapToInt(Hardware::getCapacityInUse).sum();
        int totalCapacity = hardwareList.stream().mapToInt(Hardware::getMaximumCapacity).sum();

        System.out.println("System Analysis\n" +
                "Hardware Components: " + hardwareList.size() + "\n" +
                "Software Components: " + softwares + "\n" +
                "Total Operational Memory: " + totalMemoryInUse + " / " + totalMemory + "\n" +
                "Total Capacity Taken: " + totalCapacityInUse + " / " + totalCapacity);
    }

    public void dump() {
        hardwareList.forEach(h -> { if (h.getHardwareType() == HardwareType.POWER) {System.out.println(h);}});
        hardwareList.forEach(h -> { if (h.getHardwareType() == HardwareType.HEAVY) {System.out.println(h);}});
    }

    private Hardware getHardwareByName(String hardwareName) {
        return hardwareList.stream()
                .filter(h -> h.getName().equals(hardwareName))
                .findFirst().orElse(null);
    }
}

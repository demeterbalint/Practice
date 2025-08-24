package systemDump.hardware;

import systemDump.software.Software;
import systemDump.software.SoftwareType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hardware {

    private String name;
    private int maximumCapacity;
    private int capacityInUse = 0;
    private int maximumMemory;
    private int memoryInUse = 0;
    private HardwareType hardwareType;
    private List<Software> softwareList;
    private List<Hardware> hardwareList;

    public Hardware(String name, int maximumCapacity, int maximumMemory, HardwareType hardwareType) {
        this.name = name;
        this.hardwareType = hardwareType;
        if (hardwareType == HardwareType.POWER) {
            this.maximumCapacity = (int) (maximumCapacity*0.25);
            this.maximumMemory = (int) (maximumMemory*1.75);
        } else if (hardwareType == HardwareType.HEAVY) {
            this.maximumCapacity = maximumCapacity*2;
            this.maximumMemory = (int) (maximumMemory*0.75);
        }
        this.softwareList = new ArrayList<>();
        this.hardwareList = new ArrayList<>();
    }

    private String softwareNames() {
        String names = this.softwareList.stream()
                .map(Software::getName)
                .collect(Collectors.joining(", "));
        if (names.isEmpty()) {
            return "None";
        } else {
            return names;
        }
    }

    public String getName() {
        return name;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getCapacityInUse() {
        return capacityInUse;
    }

    public void setCapacityInUse(int capacityInUse) {
        this.capacityInUse = capacityInUse;
    }

    public int getMaximumMemory() {
        return maximumMemory;
    }

    public int getMemoryInUse() {
        return memoryInUse;
    }

    public void setMemoryInUse(int memoryInUse) {
        this.memoryInUse = memoryInUse;
    }

    public HardwareType getHardwareType() {
        return hardwareType;
    }

    public List<Software> getSoftwareList() {
        return softwareList;
    }

    @Override
    public String toString() {
        return "Hardware Component – " + this.name + "\n" +
        "Express Software Components:" + this.softwareList.stream().filter(s -> s.getSoftwareType() == SoftwareType.EXPRESS).count() + "\n" +
        "Light Software Components: " + this.softwareList.stream().filter(s -> s.getSoftwareType() == SoftwareType.LIGHT).count() + "\n" +
        "Memory Usage: " + this.memoryInUse + " / " + this.maximumMemory + "\n" +
        "Capacity Usage: " + this.capacityInUse + " / " + this.maximumCapacity + "\n" +
        "Type: " + this.hardwareType.name() + "\n" +
        "Software Components: " + softwareNames();
    }
}

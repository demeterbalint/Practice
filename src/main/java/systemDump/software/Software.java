package systemDump.software;

public class Software {

    private String name;
    private int capacityConsumption;
    private int memoryConsumption;
    private SoftwareType softwareType;

    public Software(String name, int capacityConsumption, int memoryConsumption, SoftwareType softwareType) {
        this.name = name;
        this.softwareType = softwareType;
        if (softwareType == SoftwareType.EXPRESS) {
            this.capacityConsumption = capacityConsumption;
            this.memoryConsumption = memoryConsumption*2;
        } else if (softwareType == SoftwareType.LIGHT) {
            this.capacityConsumption = (int) (capacityConsumption*1.5);
            this.memoryConsumption = (int) (memoryConsumption*0.5);
        }
    }

    public String getName() {
        return name;
    }

    public int getCapacityConsumption() {
        return capacityConsumption;
    }

    public int getMemoryConsumption() {
        return memoryConsumption;
    }

    public SoftwareType getSoftwareType() {
        return softwareType;
    }
}

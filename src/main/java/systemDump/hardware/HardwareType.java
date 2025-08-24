package systemDump.hardware;

public enum HardwareType {

    POWER("Power"),
    HEAVY("Heavy");

    private String name;

    HardwareType(String name) {
        this.name = name;
    }
}

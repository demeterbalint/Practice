package settlers.buildings;

public enum BuildingType {

    BARRACKS("Barracks"),
    ARCHERY("Archery");

    private String name;

    BuildingType (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

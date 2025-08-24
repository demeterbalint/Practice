package settlers.units;

public enum UnitType {

    SWORDSMAN("Swordsman"),
    ARCHER("Archer");

    private String name;

    UnitType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

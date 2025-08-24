package settlers.units;

public abstract class Unit {

    private int health;
    private int attackDamage;
    private UnitType unitType;

    public Unit(int health, int attackDamage, UnitType unitType) {
        this.health = health;
        this.attackDamage = attackDamage;
        this.unitType = unitType;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public UnitType getUnitType() {
        return unitType;
    }
}

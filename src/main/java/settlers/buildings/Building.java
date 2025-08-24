package settlers.buildings;

import settlers.resources.Resource;
import settlers.units.Unit;
import settlers.units.UnitType;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private BuildingType buildingType;
    private int turns = 0;
    private Resource resource;
    private int resourceAmount = 0;
    private int unitAmount = 0;
    private int resourceCycle;
    private int unitCycle;
    private Unit unit;

    public static UnitType firstUnitType;
    public static List<Building> buildings = new ArrayList<>();

    public Building(BuildingType buildingType, Resource resource, Unit unit) {
        this.buildingType = buildingType;
        this.unit = unit;
        this.resource = resource;
        if (BuildingType.BARRACKS == buildingType) {
            this.resourceCycle = 3;
            this.unitCycle = 4;
        } else if (BuildingType.ARCHERY == buildingType) {
            this.resourceCycle = 2;
            this.unitCycle = 3;
        }
        buildings.add(this);
    }

    public void produce() {
        if (BuildingType.BARRACKS == this.buildingType) {
            turnCheckAndProducing();
        } else if (BuildingType.ARCHERY == this.buildingType) {
            turnCheckAndProducing();
        }
        this.turns++;
    }

    private void turnCheckAndProducing() {
        if (this.turns > 0 && this.turns % this.resourceCycle == 1) {
            this.resourceAmount += this.resource.getQuantity();
        }
        if (this.turns > 0 && this.turns % this.unitCycle == 1) {
            this.unitAmount++;
            if (firstUnitType == null) {
                firstUnitType = this.unit.getUnitType();
            }
        }
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public int getTurns() {
        return turns;
    }

    public int getResourceAmount() {
        return resourceAmount;
    }

    public int getUnitAmount() {
        return unitAmount;
    }

    public int getResourceCycle() {
        return resourceCycle;
    }

    public int getUnitCycle() {
        return unitCycle;
    }

    @Override
    public String toString() {
        return "--" + buildingType.getName() +
                ": " + turns + " turns" +
                " (" + (unitCycle - turns % unitCycle) + " turns until " + unit.getUnitType().getName() +
                ", " + (resourceCycle - turns % resourceCycle) + " turns until " + resource.getResourceType().getName() + ")";
    }
}

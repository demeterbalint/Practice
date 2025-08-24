package settlers;

import settlers.buildings.Archery;
import settlers.buildings.Barracks;
import settlers.buildings.Building;
import settlers.buildings.BuildingType;
import settlers.units.UnitType;

public class Settlers {

    public void build(String s) {
        if (s.equals("barracks")) {
            new Barracks();
        } else if (s.equals("archery")) {
            new Archery();
        }
    }

    public void advance() {
        for (Building building : Building.buildings) {
            building.produce();
        }
    }

    public void printStatus() {
        StringBuilder sb = new StringBuilder("Treasury:\n");

        int sumGold = Building.buildings.stream().filter(b -> b.getBuildingType() == BuildingType.ARCHERY).mapToInt(Building::getResourceAmount).sum();
        int sumSteel = Building.buildings.stream().filter(b -> b.getBuildingType() == BuildingType.BARRACKS).mapToInt(Building::getResourceAmount).sum();

        sb.append("--Gold: " + sumGold + "\n" +
                "--Steel: " + sumSteel + "\n" +
                "Buildings:\n");

        if (Building.buildings.size() == 0) {
            sb.append("N/A\n");
        } else {
            Building.buildings.forEach(building -> sb.append(building.toString() + "\n"));
        }

        sb.append("Units:\n");
        int sumArchers = Building.buildings.stream().filter(b -> b.getBuildingType() == BuildingType.ARCHERY).mapToInt(Building::getUnitAmount).sum();
        int sumSwordsman = Building.buildings.stream().filter(b -> b.getBuildingType() == BuildingType.BARRACKS).mapToInt(Building::getUnitAmount).sum();
        if (Building.firstUnitType == null) {
            sb.append("N/A");
        } else if (Building.firstUnitType == UnitType.ARCHER) {
            sb.append("--Archer: " + sumArchers);
            if (sumSwordsman > 0) {
                sb.append("\n--Swordsman: " + sumSwordsman);
            }
        } else if (Building.firstUnitType == UnitType.SWORDSMAN) {
            sb.append("--Swordsman: " + sumSwordsman);
            if (sumArchers > 0) {
                sb.append("\n--Archer: " + sumArchers);
            }
        }

        System.out.println(sb);
    }
}

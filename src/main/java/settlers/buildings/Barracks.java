package settlers.buildings;

import settlers.resources.Resource;
import settlers.resources.ResourceType;
import settlers.units.Swordsman;

public class Barracks extends Building {

    public Barracks() {
        super(BuildingType.BARRACKS, new Resource(ResourceType.STEEL), new Swordsman());
    }
}

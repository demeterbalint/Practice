package settlers.buildings;

import settlers.resources.Resource;
import settlers.resources.ResourceType;
import settlers.units.Archer;

public class Archery extends Building {

    public Archery() {
        super(BuildingType.ARCHERY, new Resource(ResourceType.GOLD), new Archer());
    }
}

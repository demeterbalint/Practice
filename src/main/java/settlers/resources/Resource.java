package settlers.resources;

public class Resource {

    private ResourceType resourceType;
    private int quantity;

    public Resource(ResourceType resourceType) {
        this.resourceType = resourceType;
        if (ResourceType.GOLD == resourceType) {
            this.quantity = 5;
        }
        if (ResourceType.STEEL == resourceType) {
            this.quantity = 10;
        }
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public int getQuantity() {
        return quantity;
    }
}

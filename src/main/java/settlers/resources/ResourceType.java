package settlers.resources;

public enum ResourceType {

    GOLD("Gold"),
    STEEL("Steel");

    private String name;

    ResourceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

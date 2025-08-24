package rexInc.animals;

public abstract class Animal {

    private String name;
    private int age;
    private CleansingStatus cleansingStatus;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.cleansingStatus = CleansingStatus.UNCLEANSED;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public CleansingStatus getCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(CleansingStatus cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }
}

package rexInc;

import rexInc.animals.Cat;
import rexInc.animals.CleansingStatus;
import rexInc.animals.Dog;
import rexInc.centers.AdoptionCenter;
import rexInc.centers.CleansingCenter;

import java.util.ArrayList;
import java.util.List;

public class RexInc {

    private CleansingCenter cleansingCenter =  new CleansingCenter();
    private List<AdoptionCenter> adoptionCenters = new ArrayList<>();

    public void registerAdoptionCenter(String name) {
        AdoptionCenter adoptionCenter = new AdoptionCenter(name, cleansingCenter);
        adoptionCenters.add(adoptionCenter);
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenter) {
        Dog dog = new Dog(name, age, learnedCommands);
        getAdoptionCenter(adoptionCenter).getAnimals().add(dog);
    }

    public void registerCat(String name, int age, int learnedCommands, String adoptionCenter) {
        Cat cat = new Cat(name, age, learnedCommands);
        getAdoptionCenter(adoptionCenter).getAnimals().add(cat);
    }

    private AdoptionCenter getAdoptionCenter(String name) {
        return adoptionCenters.stream()
                .filter(ac -> name.equals(ac.getName()))
                .findFirst().orElse(null);
    }

    public void sendForCleansing(String adoptionCenterName) {
        getAdoptionCenter(adoptionCenterName).sendForCleansing();
    }

    public void cleanse() {
        cleansingCenter.cleanse();
    }

    public void adopt(String adoptionCenterName) {
        getAdoptionCenter(adoptionCenterName).adopt();
    }

    public void printStats() {

        int adoptedAnimals = adoptionCenters.stream()
                .mapToInt(a -> a.getAdoptedAnimals().size())
                .sum();

        int awaitingAnimals = adoptionCenters.stream()
                .mapToInt(c -> (int) c.getAnimals().stream()
                        .filter(a -> a.getCleansingStatus() == CleansingStatus.CLEANSED).count())
                .sum();

        System.out.println("Rex Incorporated Regular Statistics\n"
                + "Adoption Centers: " + adoptionCenters.size() + "\n"
                + "Adopted Animals: " + adoptedAnimals + "\n"
                + "Animals Awaiting Adoption: " + awaitingAnimals + "\n"
                + "Animals Awaiting Cleansing: " + cleansingCenter.getAnimals().size());
    }

}

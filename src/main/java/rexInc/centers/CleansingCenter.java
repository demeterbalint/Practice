package rexInc.centers;

import rexInc.animals.Animal;
import rexInc.animals.CleansingStatus;

import java.util.HashMap;
import java.util.Map;

public class CleansingCenter {

    private Map<Animal, AdoptionCenter> animals;

    public CleansingCenter() {
        animals = new HashMap<>();
    }

    public void cleanse() {
        animals.forEach((animal, adoptionCenter) -> {
            animal.setCleansingStatus(CleansingStatus.CLEANSED);
            adoptionCenter.getAnimals().add(animal);
        });
        animals.clear();
    }

    public Map<Animal, AdoptionCenter> getAnimals() {
        return animals;
    }
}

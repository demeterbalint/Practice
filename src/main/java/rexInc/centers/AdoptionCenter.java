package rexInc.centers;

import rexInc.animals.Animal;
import rexInc.animals.CleansingStatus;

import java.util.ArrayList;
import java.util.List;

public class AdoptionCenter {

    private String name;
    private List<Animal> animals;
    private List<Animal> adoptedAnimals;
    private CleansingCenter cleansingCenter;

    public AdoptionCenter(String name, CleansingCenter cleansingCenter) {
        this.name = name;
        this.cleansingCenter = cleansingCenter;
        this.animals = new ArrayList<>();
        this.adoptedAnimals = new ArrayList<>();
    }

    public void sendForCleansing() {
        List<Animal> toCleanse = animals.stream().filter(animal -> animal.getCleansingStatus() == CleansingStatus.UNCLEANSED).toList();

        toCleanse.forEach(animal -> {
            cleansingCenter.getAnimals().put(animal, this);
            animals.remove(animal);
        });

    }

    public void adopt() {
        List<Animal> toAdopt = animals.stream().filter(animal -> animal.getCleansingStatus() == CleansingStatus.CLEANSED).toList();

        toAdopt.forEach(animal -> {
            adoptedAnimals.add(animal);
            animals.remove(animal);
        });
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getAdoptedAnimals() {
        return adoptedAnimals;
    }

    public String getName() {
        return name;
    }
}

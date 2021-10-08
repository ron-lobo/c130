package org.ron.c130.my1stOOP;

import java.util.ArrayList;
import java.util.List;

public class PetCentre {

    private List<Pet> pets = new ArrayList<>();

    public boolean dropOff(Pet pet) {
        boolean canAccept = !pets.contains(pet);
        if (canAccept) {
            pets.add(pet);
        }
        System.out.println("PetCentre: accepting " + pet.getName() + ": " +
                (canAccept ? "success" : "fail"));
        return canAccept;
    }

    public boolean collect(Pet pet) {
        boolean removedOk = pets.remove(pet);
        System.out.println("PetCentre: returning " + pet.getName() + ": " +
                (removedOk ? "success" : "fail"));
        return removedOk;
    }
}

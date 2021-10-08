package org.ron.c130.intro;

import org.ron.c130.my1stOOP.Pet;

import java.util.ArrayList;
import java.util.List;

public class Equality {

    private List<Pet> petList = new ArrayList<>();

    public static void main(String[] args) {
        Equality equality = new Equality();
        equality.readFromDB();
        Pet p = equality.getUserInput();
        equality.check(p);
        equality.testEquals();
    }

    public void readFromDB() {
        Pet pet1 = new Pet("Rover", "Poodle", 3, 'M', true);
        Pet pet2 = new Pet("Garfield", "Cat", 5, 'L', true);
        Pet pet3 = new Pet("Jaws", "goldfish", 2, 'S', false);
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
    }

    public Pet getUserInput() {
        System.out.println("\ngetUserInput");
        // take user input
        Pet pet1 = new Pet("Rover", "Poodle", 3, 'M', false);
        return pet1;
    }

    public void check(Pet p) {
        System.out.println("\ncheck");
        for (Pet pet : petList) {
            if (pet.equals(p)) {
                System.out.println("already in DB: " + p.getName());
                return;
            }
        }
        System.out.println("not found in DB: " + p.getName());
        petList.add(p);
    }

    public void testEquals() {
        testEquals("");
        testEquals("abc");
        testEquals(null);
        testEquals(petList.get(2));
        testEquals(petList.get(1));
    }

    public void testEquals(Object obj) {
        Pet pet = petList.get(1);
        boolean isEquals = pet.equals(obj);
        System.out.println(obj + ": isEquals = " + isEquals);
    }
}

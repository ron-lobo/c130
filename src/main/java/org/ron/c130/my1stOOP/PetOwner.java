package org.ron.c130.my1stOOP;

public class PetOwner {

    private PetCentre petCentre = new PetCentre();

    public static void main(String[] args) {
        PetOwner petOwner = new PetOwner();
//        petOwner.showPets();
        petOwner.usePetService1();
        petOwner.usePetService1();
        petOwner.usePetService3();
    }

    public void showPets() {
        Pet pet1 = new Pet("Rover", "Poodle", 3, 'M', true);
        Pet pet2 = new Pet("Garfield", "Cat", 5, 'L', true);
        Pet pet3 = new Pet("Jaws", "goldfish", 2, 'S', false);

        System.out.println("\nshowPets");
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
        pet1.exercisePet();
    }

    public void usePetService1() {
        System.out.println("\nusePetService1");
        Pet pet1 = new Pet("Rover", "Poodle", 3, 'M', true);
        Pet pet2 = new Pet("Garfield", "Cat", 5, 'L', true);
        Pet pet3 = new Pet("Jaws", "goldfish", 2, 'S', false);
        petCentre.dropOff(pet1);
        petCentre.dropOff(pet2);
        petCentre.dropOff(pet1);
    }

    public void usePetService3() {
        System.out.println("\nusePetService3");
        Pet pet1 = new Pet("Rover", "Poodle", 3, 'M', true);
        Pet pet2 = new Pet("Garfield", "Cat", 5, 'L', true);
        Pet pet3 = new Pet("Jaws", "goldfish", 2, 'S', false);
        petCentre.collect(pet1);
        petCentre.collect(pet2);
        petCentre.collect(pet3);
    }
}

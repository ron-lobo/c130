package org.ron.c130.my1stOOP;

public class PetOwner {

    public static void main(String[] args) {
        System.out.println("running Pet program");

//        Pet pet1 = new Pet();
//        pet1.setName("Rover");
//        pet1.setType("Poodle");
//        pet1.setAge(3);
//        pet1.setSize('M');
//        pet1.setMale(true);

        Pet pet1 = new Pet("Rover", "Poodle", 3, 'M', true);
        Pet pet2 = new Pet("Garfield", "Cat", 5, 'L', true);
        Pet pet3 = new Pet("Jaws", "goldfish", 2, 'S', false);

        pet1.printPet();
        pet2.printPet();
        pet3.printPet();
    }
}

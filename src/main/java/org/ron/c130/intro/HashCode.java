package org.ron.c130.intro;

import org.ron.c130.my1stOOP.Pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashCode {

    private Map<Pet, String> pet2OwnerMap = new HashMap<>();

    public static void main(String[] args) {
        HashCode hc = new HashCode();
        hc.readFromDB();
        Pet pet = hc.getUserInput();
        hc.checkDB(pet);
        hc.altCheckDB(pet);
    }

    private void altCheckDB(Pet pet) {
        System.out.println("\nalt check");
        for (Map.Entry<Pet, String> entry : pet2OwnerMap.entrySet()) {
            if (entry.getKey().equals(pet)) {
                System.out.println("found match; entry=" + entry);
                break;
            }
        }
    }

    private void checkDB(Pet pet) {
        System.out.println("checking if pet is in DB ... " + pet);
        String owner = pet2OwnerMap.get(pet);
        System.out.println("Owner: " + owner);
    }

    private Pet getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pet Name: ");
        String petName = scanner.nextLine();
        if ("".equals(petName)) {
            return new Pet("Rover", "Poodle", 3, 'M', true);
        }
        System.out.print("Enter Pet Type: ");
        String type = scanner.next();
        System.out.print("Enter Pet Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Pet Size: ");
        char size = scanner.next().charAt(0);
        System.out.print("Is your pet a boy? ");
        boolean isMale = scanner.nextBoolean();
        Pet pet = new Pet(petName, type, age, size, isMale);
        return pet;
    }

    private void readFromDB() {
        System.out.println("reading DB ...");
        Pet pet1 = new Pet("Rover", "Poodle", 3, 'M', true);
        Pet pet2 = new Pet("Garfield", "Cat", 5, 'L', true);
        Pet pet3 = new Pet("Jaws", "goldfish", 2, 'S', false);

        pet2OwnerMap.put(pet1, "Dom");
        pet2OwnerMap.put(pet2, "Lettie");
        pet2OwnerMap.put(pet3, "Dom");
        pet2OwnerMap.put(pet3, "Lettie");

        System.out.println("local DB cache contents ...");
        for (Pet pet : pet2OwnerMap.keySet()) {
            System.out.println("Pet=[" + pet + "], owner=" + pet2OwnerMap.get(pet));
        }
    }
}

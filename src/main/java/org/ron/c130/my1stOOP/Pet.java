package org.ron.c130.my1stOOP;

public class Pet {

    private String name;
    private String type;
    private int age;
    private char size;
    private boolean isMale;

    public Pet() {
    }

    public Pet(String name, String type, int age, char size, boolean isMale) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.size = size;
        this.isMale = isMale;
    }

    public void printPet() {
        System.out.println("Pet: name=" + this.getName() + ", type=" + getType() + ", age=" + getAge() +
                ", size=" + size + ", isMale=" + isMale);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public static void main(String[] args) {
        System.out.println("running Pet program");
        Pet pet1 = new Pet();
        pet1.name = "Rover";
        pet1.setType("Poodle");
        System.out.println("Pet1 = " + pet1.getName() + ", type=" + pet1.getType());
    }
}

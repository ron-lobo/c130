package org.ron.c130.my1stOOP;

public class Pet {

    private String name;
    private final String type;
    private int age;
    private char size;
    private final boolean isMale;

    public Pet(String name, String type, int age, char size, boolean isMale) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.size = size;
        this.isMale = isMale;
    }

    public void exercisePet() {
        System.out.println("taking " + name + " out for walkies");
    }

    @Override
    public String toString() {
        return "Pet: name=" + this.getName() +
                ", type=" + getType() +
                ", age=" + getAge() +
                ", size=" + size +
                ", isMale=" + isMale;
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
}

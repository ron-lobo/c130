package org.ron.c130.my1stOOP;

import java.util.Objects;

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
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", isMale=" + isMale +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || obj.getClass() != this.getClass()) {
//            return false;
//        }
//        Pet other = (Pet) obj;
//        return Objects.equals(name, other.name) &&
////                (type == other.type || type != null && type.equals(other.type)) &&
//                Objects.equals(type, other.type) &&
//                age == other.age &&
//                size == other.size &&
//                isMale == other.isMale;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && size == pet.size && isMale == pet.isMale && Objects.equals(name, pet.name) && Objects.equals(type, pet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, age, size, isMale);
    }

    public int hashCode_v1() {
        return 0;
    }

    public int hashCode_v2() {
        return name.hashCode() + type.hashCode() + age + size + Boolean.hashCode(isMale);
    }

    public int hashCode_v3() {
        final int PRIME = 13;
        int result = name.hashCode();
        result *= PRIME + type.hashCode();
        result *= PRIME + age;
        result *= PRIME + size;
        result *= PRIME + Boolean.hashCode(isMale);
        return result;
    }

    public int hashCode_v4() {
        return getHashCode(name, type, age, size, isMale);
    }

    public static int getHashCode(Object... objects) {
        final int PRIME = 13;
        int result = 1;
        for (Object obj : objects) {
            result *= PRIME + obj.hashCode();
        }
        return result;
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

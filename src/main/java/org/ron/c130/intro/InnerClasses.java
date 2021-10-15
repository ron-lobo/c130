package org.ron.c130.intro;

import java.util.ArrayList;
import java.util.List;

public class InnerClasses {

    private int i = 123;
    private boolean b = false;
    private Instructor instructor0 = new Instructor("Severus Snape");

    public static void main(String[] args) {
        InnerClasses ic = new InnerClasses();
        ic.doSomething();

//        Instructor instructor1 = new Instructor("Remus Lupin");
        Lecturer lecturer = new Lecturer("Remus Lupin");
    }

    private void doSomething() {
        Instructor instructor1 = new Instructor("Remus Lupin");
        String name1 = instructor1.getName();
        String name2 = instructor0.name;
    }

    private void doSomething2() {
        class Student {
            private int i = 3;
            private double d = 4;
            private boolean b = true;
        }

        Student s1 = new Student();
        s1.i++;
        s1.b = !s1.b;
    }

    // very rare
    public Instructor getInstructor() {
        return instructor0;
    }

    private void doSomething3() {
        Lecturer ron = new Lecturer("ron");
        Course c128 = new Course("C128", ron);
        Course c130 = new Course("C130", ron);
        c130.enroll("s0001");
        c130.enroll("s0002");
        System.out.println(c128.getEnrollees());
        IntroUser.showStudents("C130", c130);
    }

    private void doSomething4() {
        Enrollable c131 = new Enrollable() {

            public boolean enroll(String studentId) {
                return false;
            }

            public List<String> getEnrollees() {
                return null;
            }
        };

        c131.enroll("S2131");
        c131.enroll("S2132");
        IntroUser.showStudents("C131", c131);
    }

    public class Course implements Enrollable {

        private String courseId;
        private Lecturer lecturer;
        private List<String> enrollees = new ArrayList<>();

        public Course(String courseId, Lecturer lecturer) {
            this.courseId = courseId;
            this.lecturer = lecturer;
        }

        public boolean enroll(String studentId) {
            return enrollees.add(studentId);
        }

        public List<String> getEnrollees() {
            return enrollees;
        }
    }

    public class Instructor {

        private final String name;

        public Instructor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getXYZ() {
            return b ? i : -i;
        }
    }

    public static class Lecturer {

        private final String name;

        public Lecturer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

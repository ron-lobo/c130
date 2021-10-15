package org.ron.c130.intro;

public class IntroUser {

    public static void main(String[] args) {
        InnerClasses ic = new InnerClasses();
        InnerClasses.Instructor instructor = ic.new Instructor("Albus Dumbledore");     // very rarely done

        InnerClasses.Lecturer lecturer = new InnerClasses.Lecturer("Albus Dumbledore");     // rarely done
    }

    public static void showStudents(String courseId, Enrollable enrollable) {
        System.out.println("showing students in course " + courseId);
        for (String studentId : enrollable.getEnrollees()) {
            System.out.println(" enrollee = " + studentId);
        }
    }
}

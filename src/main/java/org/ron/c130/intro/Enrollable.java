package org.ron.c130.intro;

import java.util.List;

public interface Enrollable {

    boolean enroll(String studentId);

    List<String> getEnrollees();

    default boolean unenroll(String studentId) {
        return false;
    }
}

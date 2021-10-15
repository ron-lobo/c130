package org.ron.c130.intro;

import java.util.List;

interface Enrollable {

    boolean enroll(String studentId);

    List<String> getEnrollees();
}

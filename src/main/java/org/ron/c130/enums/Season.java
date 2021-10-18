package org.ron.c130.enums;

import java.time.LocalDate;
import java.time.Month;

public enum Season {

    SPRING(Month.MARCH),
    SUMMER(Month.JUNE),
    AUTUMN(Month.SEPTEMBER, "Fall"),
    WINTER(Month.DECEMBER);

    private Month startMonth;
    private String altName;

    Season(Month startMonth) {
        this(startMonth, null);
    }

    Season(Month startMonth, String altName) {
        this.startMonth = startMonth;
        this.altName = altName;
//        this.altName = altName == null ? name() : altName;
    }

    public String getAltName() {
        return altName;
    }

    public Month getStartMonth() {
        return startMonth;
    }

    public LocalDate getStartDate() {
        int year = LocalDate.now().getYear();
        return getStartDate(year);
    }

    public LocalDate getStartDate(int year) {
        return LocalDate.of(year, startMonth, 21);
    }

    public LocalDate getNextStartDate() {
        LocalDate today = LocalDate.now();
        LocalDate seasonStart = getStartDate();
        if (seasonStart.isBefore(today)) {
            return LocalDate.of(today.getYear() + 1, startMonth, 21);
        }
        return seasonStart;
    }

    public String getName() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }

    public static Season getSeason(String seasonStr) {
        try {
            return Season.valueOf(seasonStr.toUpperCase());
        } catch (Exception e) {
//            System.err.println("could not convert: " + seasonStr);
            return null;
        }
    }

    public static Season getSeason_v2(String seasonStr) {
        for (Season season : values()) {
            if (season.name().equalsIgnoreCase(seasonStr) ||
                    (season.getAltName() != null && season.getAltName().equalsIgnoreCase(seasonStr))) {
                return season;
            }
        }
//        System.err.println("could not convert: " + seasonStr);
        return null;
    }
}

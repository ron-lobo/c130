package org.ron.c130.enums;

public class EnumUser {

//    public static final int MALE = 1;
//    public static final int FEMALE = 2;

    public static void main(String[] args) {
        EnumUser enumUser = new EnumUser();
        enumUser.go("Dom", true);
        enumUser.go("Lettie", false);

        enumUser.go1("Dom", Boolean.TRUE);
        enumUser.go1("Lettie", false);
        enumUser.go1("Deckard", null);

        enumUser.go("Dom", Gender.MALE);
        enumUser.go("Lettie", Gender.FEMALE);
        enumUser.go("Hobbs", Gender.OTHER);

        enumUser.testSeason();
    }

    private void go(String babyName, boolean isMale) {
        System.out.println("baby=" + babyName + ": it's a " + (isMale ? "boy" : "girl") + "!");
    }

    private void go1(String babyName, Boolean isMale) {
        String s = "baby=" + babyName + ": it's a ";
        if (isMale == null) {
            s += "unknown";
        } else if (isMale) {
            s += "boy";
        } else {
            s += "girl";
        }
        System.out.println(s + "!");
    }

    private void go(String babyName, Gender gender) {
        String s = "baby=" + babyName + ": it's ";
        switch (gender) {
            case MALE:
                s += "a boy!";
                break;
            case FEMALE:
                s += "a girl!";
                break;
            default:
                s += "yours!";
                break;
        }
        System.out.println(s);
    }

    public void testSeason() {
        System.out.println("\ntestSeason()");
//        Season s = new Season();

        System.out.println("start of spring is: " + Season.SPRING.getStartDate());
        System.out.println("start of winter is: " + Season.WINTER.getStartDate());
        System.out.println("start of spring in 2030 is: " + Season.SPRING.getStartDate(2030));
        System.out.println("start of next spring is: " + Season.SPRING.getNextStartDate());
        System.out.println("start of next winter is: " + Season.WINTER.getNextStartDate());


        System.out.println("\ndata read from DB ...");
        String[] seasons = new String[]{"SPRING", "SUMMER", "WINTER", "AUTUMN", "summer", "Winter", "autum", "Fall", null, ""};
        for (String s : seasons) {
//            Season season = Season.getSeason(s);
            Season season = Season.getSeason_v2(s);
            if (season == null) {
                System.out.println("string conversion: string=" + s + ", season not found");
            } else {
                System.out.println("string conversion: string=" + s + ", season=" + season.getName());
                // do processing
            }
        }
    }
}

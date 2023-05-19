package org.ctac.java103;

//This problem is found under Logic-1 > caughtSpeeding on codingbat.com   https://codingbat.com/prob/p157733

public class caughtSpeeding {

    public static void main(String[] args) {

        System.out.println(caughtSpeeding(61, true)); //testing, expecting to return 0
        System.out.println(caughtSpeeding(61, false)); //testing, expecting to return 1
        System.out.println(caughtSpeeding(100, false)); //testing, expecting to return 2.
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        //variables set to meet speeding requirements
        int maxSpd = 60;
        int smallTik = 80;

        //if statement to check if it is the birthday of the speeder, which allows 5 more mph
        if (isBirthday) {
            maxSpd += 5;
            smallTik += 5;
        }

        //if statement that first checks if speeding at all, then checks if speeding within the 61-80 range,
        // and if it doesnt meet any of that then it must mean they were speeding over 81, returning 2.
        if (speed <= maxSpd) {
            return 0;
        } else if (speed <= smallTik) {
            return 1;
        } else {
            return 2;
        }
    }
}

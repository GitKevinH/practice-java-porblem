package org.ctac.java103;

//This problem is found under Warmup-1 > sleepIn on codingbat.com   https://codingbat.com/prob/p187868


/*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

        sleepIn(false, false) → true
        sleepIn(true, false) → false
        sleepIn(false, true) → true*/

public class sleepIn {

    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));

        System.out.println(sleepIn(true, false));

        System.out.println(sleepIn(false, true));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        //when the parameters are passed, the if statement checks the only two conditions to make
        // it so you can sleep in, which is NOT a weekday OR being on a vacation. Since either of those will be
        // okay to sleep in.

        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }

    }
}

package org.ctac.java103;

//This problem is found under Warmup-1 > nearHundred on codingbat.com   https://codingbat.com/prob/p184004

public class nearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));  //
        System.out.println(nearHundred(90));  //
        System.out.println(nearHundred(89));  //
    }

    public static boolean nearHundred(int n) {

        //setting variable for the 100 check using Math.abs to show absolute value (after subtracting n from 100)
        int near100 = Math.abs(n - 100);

        //setting variable for 200 check using Math.abs to show absolute value (after subtracting n from 200)
        int near200 = Math.abs(n - 200);

        // if statement comparing the newly set variables, where if either variables were within 10
        // it would return true.
        if (near100 <= 10 || near200 <= 10) {
            return true;
        } else {
            return false;
        }
    }

}

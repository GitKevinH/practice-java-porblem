package org.ctac.java103;

//This problem is found under String-1>makeAbba on codingbat.com   https://codingbat.com/prob/p161056
public class makeAbba {
    public static void main(String[] args) {

        System.out.println(makeAbba("Yes", "no"));
        System.out.println(makeAbba("Hot", "Cold"));
    }

    public static String makeAbba(String a, String b) {
        //very straightforward, this takes the parameters passed and puts it into the pattern requested
        return ( a + b + b + a );
    }

}

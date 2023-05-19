package org.ctac.java103;

//This problem is found under Logic-1 > cigarParty on codingbat.com   https://codingbat.com/prob/p159531

public class cigarParty {

    public static void main(String[] args) {


        System.out.println(cigarParty(30, false )); // testing for false

        System.out.println(cigarParty(61, true )); // testing for true

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        // The condition for the if statement was coded so only the parameters that made it true would trigger the
        // return of true. I combined the two cigar conditions and the weekend w/ cigar conditions, which were if there was
        // more than 40 cigars but under 60 it would be a party, or if it was a weekend and there was over 40 cigars, then there would
        // also be a party.

        if ((cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40)) {
            return true;
        } else {
            return false;
        }

    }

}

package org.ctac.java103;

public class makeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "hotdog"));    //copied from
        System.out.println(makeOutWord("{{}}", "hamburger"));
        System.out.println(makeOutWord(">><<", "steak"));
    }

    public static String makeOutWord(String out, String word) {
        // This holds the beginning, where substring takes the first two chars of the string.
        String wrapperBeg = out.substring(0, 2);
        // This holds the end of the wrapping string, where substring takes the last chars of the string, starting at 2.
        String wrapperEnd = out.substring(2);

        //using the variables to "wrap" the original word variable
        return wrapperBeg + word + wrapperEnd;
    }
}

package org.ctac.java103;

//This problem is found under String-1 > makeTags on codingbat.com   https://codingbat.com/prob/p147483
public class makeTags {
    public static void main(String[] args) {
        System.out.println(makeTags("p", "wordswordswords"));
        System.out.println(makeTags("ul", "unordered list"));
        System.out.println(makeTags("div", "another div"));
    }

    public static String makeTags(String tag, String word) {
        //grabbing the strings and concatonating with the static strings
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}

package org.ctac.java103;

//This problem is found under String-1>helloName on codingbat.com   https://codingbat.com/prob/p171896

//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//        helloName("Bob") → "Hello Bob!"
//        helloName("Alice") → "Hello Alice!"
//        helloName("X") → "Hello X!"
public class helloName {
    public static void main(String[] args) {

        System.out.println(helloName("Eric"));
        System.out.println(helloName("Bob"));



    }

    public static String helloName(String name) {
        //this takes the name parameter and concatonates it with the "Hello " static string.
        return "Hello "+name+"!";
    }


}

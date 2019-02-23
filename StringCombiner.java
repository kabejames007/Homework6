package edu.dmacc.codedsm.hw6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {

    public static void main(String[] args) {

        String stringOne = "Hello";
        String stringTwo = "World";
        String combinedString = combineTwoString(stringOne, stringTwo);
        System.out.println(combinedString); // result from combinedTwoString method

        System.out.println("Today is " + outputDate());// Today 's date displayed

        String dateAndStringsCombined = combineTwoString(combinedString, outputDate());
        System.out.println(dateAndStringsCombined);// result from combining two strings and the date
        

    }


    public static String combineTwoString(String strX, String strY) {

        return strX + " " + strY;
    }

    public static String outputDate() {

        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        return format.format(Date.from(Instant.now()));


    }


}

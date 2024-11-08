package com.teachmeskills.lesson_11.operation;

public class StringOperation {
    //- Display the first two blocks of 4 digits on the screen in one line.
    public static String first(String documentNumber){
        return documentNumber.substring(0,4) + " " + documentNumber.substring(9,13);
    }
    //- Display the document number, but replace blocks of three letters with *** (each letter will be replaced with *).
    public static String second(String documentNumber){
        documentNumber = documentNumber.replaceAll(documentNumber.substring(5,8),"***");
        return documentNumber.replaceAll(documentNumber.substring(14, 17), "***");
    }
    //- Display only one letter from the document number in the format yyy/yyy/y/y in lowercase.
    public static String third(String documentNumber){
        String[] separator = documentNumber.split("-");
        separator[4] = separator[4].replaceAll(separator[4].substring(0, 1), "/");
        separator[4] = separator[4].replaceAll(separator[4].substring(2, 3), "/");
        return (separator[1].concat("/") + separator[3] + separator[4]).toLowerCase();
    }
    //- Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase (implemented using the StringBuilder class).
    public static String fourth(String documentNumber){
        StringBuilder sb = new StringBuilder(documentNumber);
        sb.delete(0,5);
        sb.replace(3, 9,"/");
        sb.deleteCharAt(7);
        sb.setCharAt(7, '/');
        sb.setCharAt(9, '/');
        sb.insert(0, "Letters:");
        return sb.toString().toUpperCase();
    }
    //- Check whether the document number contains the sequence "abc" and display a message whether it does or not (and abc and ABC are considered the same sequence).
    public static boolean fifth(String documentNumber){
        return documentNumber.toLowerCase().contains("abc");
    }
    //- Check whether the document number begins with the sequence 555.
    public static boolean sixth(String documentNumber){
        return documentNumber.startsWith("555");
    }
    //- Check whether the document number ends with the sequence 1a2b.
    public static boolean seventh(String documentNumber){
        return documentNumber.endsWith("1a2b");
    }
}

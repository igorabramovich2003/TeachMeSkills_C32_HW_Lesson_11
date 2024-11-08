package com.teachmeskills.lesson_11;

import com.teachmeskills.lesson_11.operation.StringOperation;
/*
Write a program with the following functionality:
Pass a string as input (we will assume that this is a standard document number in a given format).
The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is any digit, and y is a letter of the Latin alphabet (can be upper or lower case).
*first* Display the first two blocks of 4 digits on one line.
*second* Display the document number, but replace the blocks of three letters with *** (each letter will be replaced with *).
*third* Display only the letters from the document number in the format yyy/yyy/y/y in lower case.
*fourth* Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in upper case (implemented using the StringBuilder class).
*fifth* Check whether the document number contains the sequence "abc" and display a message whether it does or not (moreover, abc and ABC are considered the same sequence).
*sixth* Check if the document number starts with the sequence 555.
*seventh* Check if the document number ends with the sequence 1a2b.
All these methods are implemented in a separate class in static methods, each task - in a separate method.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        String DocumentNumber = "5551-ABC-2222-Bbb-1a2b";
        System.out.println(StringOperation.first(DocumentNumber));
        System.out.println(StringOperation.second(DocumentNumber));
        System.out.println(StringOperation.third(DocumentNumber));
        System.out.println(StringOperation.fourth(DocumentNumber));
        System.out.println(StringOperation.fifth(DocumentNumber));
        System.out.println(StringOperation.sixth(DocumentNumber));
        System.out.println(StringOperation.seventh(DocumentNumber));
    }
}

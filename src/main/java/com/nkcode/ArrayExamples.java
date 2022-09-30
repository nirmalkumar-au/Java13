package com.nkcode;

/*
Author: Nirmal Kumar
*/

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        ArrayExamples arrayExamples = new ArrayExamples();
        arrayExamples.arrayToReverseString(new String[] {"civic", "radar", "eye", "repair", "done"});
    }

    public void arrayToReverseString(String[] itemArray) {
        char[] itemChars;
        System.out.println("Original string array " + Arrays.toString(itemArray));
        for (int i = 0; i < itemArray.length; i++) {
            itemChars = reverseCharArray(itemArray[i].toCharArray());
            itemArray[i] = new String(itemChars);
        }
        System.out.println("Reversed string array " + Arrays.toString(itemArray));
    }

    private char[] reverseCharArray(char[] charArray) {
        var length = charArray.length;
        char[] tempArray = new char[length];
        for (int i = 0; i < length; i++) {
            tempArray[i] = charArray[length - (i+1)];
        }
        return tempArray;
    }
}

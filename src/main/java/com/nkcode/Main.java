package com.nkcode;

public class Main {
    public static void main(String[] args) {
        String doubleValue = "156.99d";
        Double doubleObj = Double.parseDouble(doubleValue);
        var intValue = doubleObj.intValue();
        var floatValue = doubleObj.floatValue();
        var byteValue = doubleObj.byteValue();
        var stringValue = doubleObj.toString();
        var storedValue = doubleObj.doubleValue();

        System.out.println("intValue " + intValue);
        System.out.println("floatValue " + floatValue);
        System.out.println("byteValue " + byteValue);
        System.out.println("stringValue " + stringValue);
        System.out.println("storedValue " + storedValue);
    }
}

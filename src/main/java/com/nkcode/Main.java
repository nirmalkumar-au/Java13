package com.nkcode;

public class Main {
    public static void main(String[] args) {
        checkPrimitiveWrapper();
        checkUnsignedWrapper();
    }

    private static void checkPrimitiveWrapper() {
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

    private static void checkUnsignedWrapper() {
        String intValue = "300000000";
        Integer intUnsignedObj = Integer.parseUnsignedInt(intValue);
        System.out.println("Unsigned value " + intUnsignedObj);

        var result = Integer.divideUnsigned(intUnsignedObj, 7);
        System.out.println("Divide unsigned value " + result);

        result = Integer.remainderUnsigned(intUnsignedObj, 7);
        System.out.println("Remainder unsigned value " + result);
    }
}

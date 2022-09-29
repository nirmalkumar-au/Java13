package com.nkcode;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        checkPrimitiveWrapper();
//        checkUnsignedWrapper();
        checkBigDecimal();
    }

    private static void checkPrimitiveWrapper() {
        String doubleValue = "156.99";
        Double doubleObj = Double.parseDouble(doubleValue);
        var intValue = doubleObj.intValue();
        var floatValue = doubleObj.floatValue();
        var byteValue = doubleObj.byteValue();
        var stringValue = doubleObj.toString();

        System.out.println("intValue " + intValue);
        System.out.println("floatValue " + floatValue);
        System.out.println("byteValue " + byteValue);
        System.out.println("stringValue " + stringValue);
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

    private static void checkBigDecimal() {
        String strValue = "0.012";
        Double dblValue = Double.parseDouble(strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        var dblSum = dblValue + dblValue + dblValue;
        var bigSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of double value " + dblSum);
        System.out.println("Sum of big value " + bigSum);
        System.out.println("Double value in big value sum" + bigSum.doubleValue());
    }




}

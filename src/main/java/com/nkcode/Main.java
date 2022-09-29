package com.nkcode;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        checkPrimitiveWrapper();
//        checkUnsignedWrapper();
//        checkBigDecimal();
//        characterStringSwap();
//        checkStringBuilder();
//        checkNumberFormat();
        displayStringWithFormat();
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
        String intValue = "2147483647";
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

    private static void characterStringSwap() {
        char[] arrChars = {'h', 'e', 'l', 'l', 'o'};
        String strChars = String.valueOf(arrChars);

        arrChars = strChars.toCharArray();
        System.out.println("Char to String converted " + strChars);
        System.out.print("String to Char converted ");
        for (char aChar: arrChars
             ) {
            System.out.print('\'' );
            System.out.print( aChar );
            System.out.print( '\'');
        }
    }

    private static void checkStringBuilder() {
        StringBuffer strValue = new StringBuffer();
        strValue.append("Class name is ")
                .append(Main.class.getCanonicalName())
                .append("\n Package name ")
                .append(Main.class.getPackageName());
        System.out.println(strValue);
    }

    private static void checkNumberFormat() {
        var num = 3450.8999999f;
        var locale = new Locale("de", "DE");
        var numF = NumberFormat.getNumberInstance(locale);
        var currencyF = NumberFormat.getCurrencyInstance(locale);
        var percentF = NumberFormat.getPercentInstance(locale);
        var compactF = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);

        System.out.println("Number format " + numF.format(num));
        System.out.println("Currency format " + currencyF.format(num));
        System.out.println("Percentage format " + percentF.format(num));
        System.out.println("Compact number format " + compactF.format(num));

        numF.setGroupingUsed(false);
        currencyF.setGroupingUsed(false);
        percentF.setGroupingUsed(false);
        compactF.setGroupingUsed(false);
        System.out.println("Number format (without grouping)" + numF.format(num));
        System.out.println("Currency format  (without grouping)" + currencyF.format(num));
        System.out.println("Percentage format  (without grouping)" + percentF.format(num));
        System.out.println("Compact number format  (without grouping)" + compactF.format(num));
    }

    private static void displayStringWithFormat() {
        var strFormat = "State %s Region: %04d Temperature %(#.02f Celsius";
        var state = "VIC";
        var region = 378;
        var temp = -003.887;
        var displayFormat = String.format(strFormat, state, region, temp);
        System.out.println(displayFormat);
    }

}

package com.nkcode;

import com.nkcode.model.Employee;
import com.nkcode.model.EmploymentType;

import java.io.*;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Stream;

/*
Author: Nirmal Kumar
Examples of primitives, wrapper, unsigned, big decimal, char-string,
string builder, number formatter, locale, string formatter,
try catch with resources, file reader, buffered reader, custom class,
enum, array, for each, list, stream, set, and map
 */

public class EssentialExamples {
    public static void main(String[] args) {
//        checkPrimitiveWrapper();
//        checkUnsignedWrapper();
//        checkBigDecimal();
//        characterStringSwap();
//        checkStringBuilder();
//        checkNumberFormat();
//        displayStringWithFormat();
//        checkTryCatchWithResources();
//        displayArrayOfEmployees();
//        displayListOfEmployees();
        displayMapOfEmployees();
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
                .append(EssentialExamples.class.getCanonicalName())
                .append("\n Package name ")
                .append(EssentialExamples.class.getPackageName());
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

    private static void checkTryCatchWithResources() {
        File fileName = new File("Test.txt");
        if ( !fileName.exists() ) System.out.printf("File %s does not exists  %n", fileName.getName());

        try (
                FileReader file = new FileReader(fileName);
                BufferedReader bufferedFile = new BufferedReader(file);
        ) {
            String line = bufferedFile.readLine();;
            while ( line != null &&  !line.isEmpty() ) {
                System.out.println(line);
                line = bufferedFile.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayArrayOfEmployees() {
        Employee[] employees = {
                new Employee("John Davidson", "Williams Swift", 135, EmploymentType.FULL_TIME),
                new Employee("Steve Brown", "Jacob Johnson", 1789, EmploymentType.PART_TIME)
        };

        for (Employee employee: employees
             ) {
            employee.displayEmployeeDetails();
        }
    }

    private static void displayListOfEmployees() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add( new Employee("John Davidson",
                        "Williams Swift",
                        135,
                        EmploymentType.FULL_TIME) );
        employeeList.add( new Employee("Steve Brown",
                "Jacob Johnson",
                1789,
                EmploymentType.PART_TIME) );

        Stream<Employee> employeeStream = employeeList.stream();
        employeeStream.forEach(Employee::displayEmployeeDetails);
    }

    private static void displayMapOfEmployees() {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put( 135,
                new Employee(
                "John Davidson",
                "Williams Swift",
                135,
                EmploymentType.FULL_TIME) );
        employeeMap.put( 1789,
                new Employee(
                "Steve Brown",
                "Jacob Johnson",
                1789,
                EmploymentType.PART_TIME) );

        Set<Integer> employeeNumbers = employeeMap.keySet();
        Employee employee = null;
        for (Integer employeeNumber: employeeNumbers
             ) {
            employee = employeeMap.get(employeeNumber);
            employee.displayEmployeeDetails();
        }
    }
}

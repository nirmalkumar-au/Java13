package com.nkcode;

/*
Author: Nirmal Kumar
TreeSet exercises with default and custom comparator
*/

import com.nkcode.model.Employee;
import com.nkcode.model.EmploymentType;

import java.util.*;

public class TreeSetExamples {

    public static void main(String[] args) {
//        displayIntTreeSet();
        displayStringTreeSetWithCustomComparator();
    }

    private static void displayIntTreeSet() {
        Set<Integer> intSet = new TreeSet<>();
        // Tree set arranges the integer by ascending order
        intSet.add( 5 );
        intSet.add( 1);
        intSet.add( 50 );
        intSet.add( 20 );
        System.out.println(intSet);

        // Adding duplicate is not allowed in tree set, only one entry exist
        System.out.println("After adding an duplicate integer");
        intSet.add(5);
        System.out.println(intSet);

        // removes the integer from the tree set
        System.out.println("After removing an integer");
        intSet.remove(20);
        System.out.println(intSet);
    }

    private static void displayStringTreeSetWithCustomComparator() {
        Set<String> stringSet = new TreeSet<>(Comparator.comparing(String::toLowerCase));
        // Tree set arranges the using custom comparator ignoring case
        stringSet.add( "japan" );
        stringSet.add( "Australia");
        stringSet.add( "New Zealand" );
        stringSet.add( "singapore" );
        System.out.println(stringSet);

        // Adding duplicate is not allowed in tree set, only one entry exist
        System.out.println("After adding an duplicate string");
        stringSet.add("JAPAN");
        System.out.println(stringSet);

        // removes the string from the tree set, uses custom comparator ignoring case
        System.out.println("After removing an integer");
        stringSet.remove("SINGAPORE");
        System.out.println(stringSet);
    }
}

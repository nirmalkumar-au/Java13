package com.nkcode;

/*
Author: Nirmal Kumar
List and Synchronized List exercise
*/

import com.nkcode.model.Employee;
import com.nkcode.model.EmploymentType;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        synchronizedLinkedList();
    }

    private static void synchronizedLinkedList() {
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add( new Employee(
                        "John Davidson",
                        "Williams Swift",
                        135,
                        EmploymentType.FULL_TIME) );
        employeeList.add( new Employee(
                        "Steve Brown",
                        "Jacob Johnson",
                        1789,
                        EmploymentType.PART_TIME) );
        employeeList.add( 1, new Employee(
                        "Steve Job",
                        "Michael Sherman",
                        789,
                        EmploymentType.CASUAL));
        System.out.println(employeeList);

        employeeList.removeFirst();
        System.out.println(employeeList);

        List<Employee> synchronisedEmployeeList = Collections.synchronizedList(employeeList);
        System.out.println(synchronisedEmployeeList);
    }
}

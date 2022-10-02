package com.nkcode;

/*
Author: Nirmal Kumar
Exercises of
Stream, Stream filter, Parallel stream.
Stream to List, Map, Array, Sorted Map
*/

import com.nkcode.model.Employee;
import com.nkcode.model.EmploymentType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
        StreamExamples streamExample = new StreamExamples();
//        streamExample.streamToArray();
//        streamExample.streamToList();
//        streamExample.streamToMap();
//        streamExample.streamToSortedMap();
        streamExample.parallelStreamToMap();
    }

    private List<Employee> getEmployeeList() {
        // Create list of Employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new Employee(
                "John Davidson",
                "Williams Swift",
                135,
                EmploymentType.FULL_TIME) );
        employeeList.add( new Employee(
                "Michael Brown",
                "Jacob Johnson",
                1789,
                EmploymentType.PART_TIME) );
        employeeList.add( new Employee(
                "Steve Job",
                "Michael Sherman",
                789,
                EmploymentType.CASUAL));
        employeeList.add( new Employee(
                "Cuma",
                "Dainen",
                245,
                EmploymentType.PART_TIME));
        employeeList.add( new Employee(
                "Aimo",
                "Bassett",
                23,
                EmploymentType.FULL_TIME));
        employeeList.add( new Employee(
                "Hastie",
                "Juancarlos",
                346,
                EmploymentType.CASUAL));

        return employeeList;
    }

    private void streamToArray() {
        List<Employee> employeeList = getEmployeeList();

        // Stream to Array
        Employee[] employeeArray = employeeList.stream()
                .filter( e->  e.getFirstName().contains("Michael") || e.getLastName().contains("Michael") )
                .toArray(Employee[]::new);

        for ( Employee employee: employeeArray) {
            System.out.println(employee);
        }
    }

    private void streamToList() {
        List<Employee> employeeList = getEmployeeList();

        // Stream to List
        employeeList.stream()
                .filter( e->  e.getFirstName().contains("Michael") || e.getLastName().contains("Michael") )
                .toList()
                .forEach(System.out::println);
    }

    private void streamToMap() {
        List<Employee> employeeList = getEmployeeList();

        // Stream to Map
        employeeList.stream()
                .filter( e->  e.getFirstName().contains("Michael") || e.getLastName().contains("Michael") )
                .map(Employee::toString)
                .forEach(System.out::println);
    }

    private void streamToSortedMap() {
        List<Employee> employeeList = getEmployeeList();

        // Stream to sorted Map
        employeeList.stream()
                .sorted( Comparator.comparing(Employee::getEmployeeNumber) )
                .map(Employee::toString)
                .forEach(System.out::println);
    }

    private void parallelStreamToMap() {
        List<Employee> employeeList = getEmployeeList();

        // Parallel Stream to Map
        employeeList.stream().parallel()
                .map(Employee::toString)
                .forEach(System.out::println);
    }
}

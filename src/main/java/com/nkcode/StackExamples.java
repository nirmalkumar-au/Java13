package com.nkcode;

/*
Author: Nirmal Kumar
Stack and Stack using Deque exercises
*/

import com.nkcode.model.Employee;
import com.nkcode.model.EmploymentType;

import java.util.*;

public class StackExamples {

    public static void main(String[] args) {
        displayDequeStack();
        displayStack();
    }

    private static void displayDequeStack() {
        Deque<Employee> employeeStack = new ArrayDeque<>();
        employeeStack.push( new Employee(
                        "John Davidson",
                        "Williams Swift",
                        135,
                        EmploymentType.FULL_TIME) );
        employeeStack.push( new Employee(
                        "Steve Brown",
                        "Jacob Johnson",
                        1789,
                        EmploymentType.PART_TIME) );
        employeeStack.push( new Employee(
                        "Steve Job",
                        "Michael Sherman",
                        789,
                        EmploymentType.CASUAL));
        System.out.println("Stack with Deque");
        System.out.println(employeeStack);

        // displays top element in stack
        System.out.println("After peek the Deque stack");
        System.out.println(employeeStack.peek());

        // removes top element and throws exception if empty stack
        System.out.println("After pop the Deque stack");
        employeeStack.pop();
        System.out.println(employeeStack);

        // removes top element and returns null if empty stack
        System.out.println("After poll the Deque stack");
        employeeStack.poll();
        System.out.println(employeeStack);
    }

    private static void displayStack() {
        Stack<Employee> employeeStack = new Stack<>();
        employeeStack.push( new Employee(
                "John Davidson",
                "Williams Swift",
                135,
                EmploymentType.FULL_TIME) );
        employeeStack.push( new Employee(
                "Steve Brown",
                "Jacob Johnson",
                1789,
                EmploymentType.PART_TIME) );
        employeeStack.push( new Employee(
                "Steve Job",
                "Michael Sherman",
                789,
                EmploymentType.CASUAL));
        System.out.println("Stack");
        System.out.println(employeeStack);

        // displays top element in stack
        System.out.println("After peek the stack");
        System.out.println(employeeStack.peek());

        // removes top element and throws exception if empty stack
        System.out.println("After pop the stack");
        employeeStack.pop();
        System.out.println(employeeStack);
    }
}

package com.nkcode;

/*
Author: Nirmal Kumar
Queue using ArrayDeque and LinkedList exercises
*/

import com.nkcode.model.Employee;
import com.nkcode.model.EmploymentType;

import java.util.*;

public class QueueExamples {

    public static void main(String[] args) {
//        displayQueueWithArrayDeque();
        displayQueueWithLinkedList();
    }

    private static void displayQueueWithArrayDeque() {
        Queue<Employee> employeeQueue = new ArrayDeque<>();
        // First in first out in queue
        employeeQueue.offer( new Employee(
                        "John Davidson",
                        "Williams Swift",
                        135,
                        EmploymentType.FULL_TIME) );
        employeeQueue.offer( new Employee(
                        "Steve Brown",
                        "Jacob Johnson",
                        1789,
                        EmploymentType.PART_TIME) );
        employeeQueue.offer( new Employee(
                        "Richardson",
                        "Michael Sherman",
                        789,
                        EmploymentType.CASUAL));
        System.out.println("Queue with ArrayDeque");
        System.out.println(employeeQueue);

        // displays first element in the queue
        System.out.println("After peek the ArrayDeque queue");
        System.out.println(employeeQueue.peek());

        // removes first element in the queue
        System.out.println("After poll the ArrayDeque queue");
        employeeQueue.poll();
        System.out.println(employeeQueue);
    }

    private static void displayQueueWithLinkedList() {
        Queue<Employee> employeeQueue = new LinkedList<>();
        // First in first out in queue
        employeeQueue.offer( new Employee(
                "John Davidson",
                "Williams Swift",
                135,
                EmploymentType.FULL_TIME) );
        employeeQueue.offer( new Employee(
                "Steve Brown",
                "Jacob Johnson",
                1789,
                EmploymentType.PART_TIME) );
        employeeQueue.offer( new Employee(
                "Richardson",
                "Michael Sherman",
                789,
                EmploymentType.CASUAL));
        System.out.println("Queue with LinkedList");
        System.out.println(employeeQueue);

        // displays first element in the queue
        System.out.println("After peek the LinkedList queue");
        System.out.println(employeeQueue.peek());

        // removes first element in the queue
        System.out.println("After poll the LinkedList queue");
        employeeQueue.poll();
        System.out.println(employeeQueue);
    }
}

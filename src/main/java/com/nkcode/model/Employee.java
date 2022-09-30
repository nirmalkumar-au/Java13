package com.nkcode.model;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeNumber;
    private EmploymentType employmentType;

    public Employee(String firstName, String lastName, int employeeNumber, EmploymentType employmentType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.employmentType = employmentType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(EmploymentType employmentType) {
        this.employmentType = employmentType;
    }

    @Override
    public String toString() {
        return String.format("Employee name: %s , %s%nNumber: %05d%nType: %s%n",
                lastName, firstName, employeeNumber, employmentType.toString());
    }

}

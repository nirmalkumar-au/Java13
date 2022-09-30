package com.nkcode.model;

public enum EmploymentType {
    CASUAL("Casual"), FULL_TIME("Full Time"), PART_TIME("Part Time");

    private final String description;

    EmploymentType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

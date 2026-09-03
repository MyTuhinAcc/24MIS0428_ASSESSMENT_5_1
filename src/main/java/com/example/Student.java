package com.example;

public class Student {

    private String name;

    private String studentId;

    private String[] subjects;

    private int[] credits;

    public Student(String name, String studentId,
                   String[] subjects, int[] credits) {

        this.name = name;

        this.studentId = studentId;

        this.subjects = subjects;

        this.credits = credits;
    }

    public String getName() {

        return name;
    }

    public String getStudentId() {

        return studentId;
    }

    public String[] getSubjects() {

        return subjects;
    }

    public int[] getCredits() {

        return credits;
    }
}

package com.example;

import java.util.Scanner;

public class CourseRegistrationSystem {

    public static int calculateTotalCredits(Student student) {

        int total = 0;

        for (int credit : student.getCredits()) {

            total = total + credit;
        }

        return total;
    }

    public static String checkEligibility(Student student) {

        int totalCredits = calculateTotalCredits(student);

        if (totalCredits >= 15) {

            return "Eligible for Course Registration";

        }

        return "Not Eligible - Minimum 15 Credits Required";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");

        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");

        String studentId = scanner.nextLine();

        System.out.print("Enter number of subjects: ");

        int n = scanner.nextInt();

        scanner.nextLine();

        String[] subjects = new String[n];

        int[] credits = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for subject " + (i + 1));

            System.out.print("Subject name: ");

            subjects[i] = scanner.nextLine();

            System.out.print("Credits: ");

            credits[i] = scanner.nextInt();

            scanner.nextLine();
        }

        Student student = new Student(

                name,

                studentId,

                subjects,

                credits
        );

        System.out.println("\nStudent Name: " + student.getName());

        System.out.println("Student ID: " + student.getStudentId());

        System.out.println("\nSelected Subjects:");

        for (int i = 0; i < subjects.length; i++) {

            System.out.println(
                    subjects[i] + " - " + credits[i] + " credits"
            );
        }

        System.out.println(
                "\nTotal Credits: " +
                calculateTotalCredits(student)
        );

        System.out.println(
                "Result: " +
                checkEligibility(student)
        );

        scanner.close();
    }
}

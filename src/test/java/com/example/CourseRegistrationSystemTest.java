package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CourseRegistrationSystemTest {

    @Test
    public void testEligibleStudent() {

        String[] subjects = {
                "Java",
                "Database",
                "Computer Networks",
                "Software Engineering"
        };

        int[] credits = {
                4,
                4,
                3,
                4
        };

        Student student = new Student(

                "Harsh",

                "24MIS0428",

                subjects,

                credits
        );

        assertEquals(

                "Eligible for Course Registration",

                CourseRegistrationSystem.checkEligibility(student)

        );
    }


    @Test
    public void testMinimumCredits() {

        String[] subjects = {
                "Java",
                "Database",
                "Networks"
        };

        int[] credits = {
                5,
                5,
                5
        };

        Student student = new Student(

                "Rahul",

                "24MIS0429",

                subjects,

                credits
        );

        assertEquals(

                "Eligible for Course Registration",

                CourseRegistrationSystem.checkEligibility(student)

        );
    }


    @Test
    public void testLessThanMinimumCredits() {

        String[] subjects = {
                "Java",
                "Database",
                "Networks"
        };

        int[] credits = {
                4,
                4,
                3
        };

        Student student = new Student(

                "John",

                "24MIS0430",

                subjects,

                credits
        );

        assertEquals(

                "Not Eligible - Minimum 15 Credits Required",

                CourseRegistrationSystem.checkEligibility(student)

        );
    }


    @Test
    public void testLowCredits() {

        String[] subjects = {
                "Java",
                "Database"
        };

        int[] credits = {
                3,
                3
        };

        Student student = new Student(

                "Arun",

                "24MIS0431",

                subjects,

                credits
        );

        assertEquals(

                "Not Eligible - Minimum 15 Credits Required",

                CourseRegistrationSystem.checkEligibility(student)

        );
    }


    @Test
    public void testExactly15Credits() {

        String[] subjects = {
                "Operating Systems",
                "Computer Networks",
                "Software Engineering"
        };

        int[] credits = {
                5,
                5,
                5
        };

        Student student = new Student(

                "Vijay",

                "24MIS0432",

                subjects,

                credits
        );

        assertEquals(

                "Eligible for Course Registration",

                CourseRegistrationSystem.checkEligibility(student)

        );
    }
}

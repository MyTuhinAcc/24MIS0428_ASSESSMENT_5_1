package com.example;

import java.util.Scanner;

public class VotingEligibilitySystem {

    public static String checkEligibility(Voter voter) {

        if (voter.getAge() < 18) {
            return "Not Eligible - Underage";
        }

        if (!voter.getCitizenship().equalsIgnoreCase("Indian")) {
            return "Not Eligible - Not an Indian Citizen";
        }

        if (!voter.isIdValid()) {
            return "Not Eligible - Invalid Voter ID";
        }

        return "Eligible to Vote";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of voters: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for voter " + i);

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Citizenship: ");
            String citizenship = scanner.nextLine();

            System.out.print("Voter ID: ");
            String voterId = scanner.nextLine();

            System.out.print("Is Voter ID valid? (true/false): ");
            boolean idValid = scanner.nextBoolean();
            scanner.nextLine();

            Voter voter = new Voter(
                    name,
                    age,
                    citizenship,
                    voterId,
                    idValid
            );

            System.out.println(
                    "Result: " + checkEligibility(voter)
            );
        }

        scanner.close();
    }
}

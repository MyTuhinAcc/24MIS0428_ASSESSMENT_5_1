package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VotingEligibilitySystemTest {

    @Test
    public void testEligibleVoter() {
        Voter voter = new Voter(
                "Harsh",
                20,
                "Indian",
                "IND123",
                true
        );

        assertEquals(
                "Eligible to Vote",
                VotingEligibilitySystem.checkEligibility(voter)
        );
    }

    @Test
    public void testUnderageVoter() {
        Voter voter = new Voter(
                "Rahul",
                17,
                "Indian",
                "IND456",
                true
        );

        assertEquals(
                "Not Eligible - Underage",
                VotingEligibilitySystem.checkEligibility(voter)
        );
    }

    @Test
    public void testNonCitizen() {
        Voter voter = new Voter(
                "John",
                25,
                "American",
                "USA123",
                true
        );

        assertEquals(
                "Not Eligible - Not an Indian Citizen",
                VotingEligibilitySystem.checkEligibility(voter)
        );
    }

    @Test
    public void testInvalidVoterId() {
        Voter voter = new Voter(
                "Arun",
                25,
                "Indian",
                "IND789",
                false
        );

        assertEquals(
                "Not Eligible - Invalid Voter ID",
                VotingEligibilitySystem.checkEligibility(voter)
        );
    }

    @Test
    public void testAge18() {
        Voter voter = new Voter(
                "Vijay",
                18,
                "Indian",
                "IND999",
                true
        );

        assertEquals(
                "Eligible to Vote",
                VotingEligibilitySystem.checkEligibility(voter)
        );
    }
}

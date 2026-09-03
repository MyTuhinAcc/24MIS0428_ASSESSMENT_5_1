class VoterTest {
    String name;
    int age;
    String citizenship;
    boolean validId;
    boolean expected;

    VoterTest(String name, int age, String citizenship,
              boolean validId, boolean expected) {

        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.validId = validId;
        this.expected = expected;
    }

    boolean checkEligibility() {

        return age >= 18
                && citizenship.equalsIgnoreCase("Indian")
                && validId;
    }
}

public class VotingEligibilityTesting {

    public static void main(String[] args) {

        VoterTest[] tests = {

            new VoterTest(
                "Test 1 - Eligible",
                25,
                "Indian",
                true,
                true
            ),

            new VoterTest(
                "Test 2 - Underage",
                17,
                "Indian",
                true,
                false
            ),

            new VoterTest(
                "Test 3 - Non Citizen",
                25,
                "American",
                true,
                false
            ),

            new VoterTest(
                "Test 4 - Invalid ID",
                25,
                "Indian",
                false,
                false
            ),

            new VoterTest(
                "Test 5 - All Invalid",
                16,
                "American",
                false,
                false
            )
        };

        int passed = 0;

        System.out.println("VOTING ELIGIBILITY TESTING");
        System.out.println("==========================");

        for (VoterTest test : tests) {

            boolean result = test.checkEligibility();

            if (result == test.expected) {
                System.out.println(
                    test.name + " : PASS"
                );
                passed++;
            }
            else {
                System.out.println(
                    test.name + " : FAIL"
                );
            }
        }

        System.out.println("==========================");
        System.out.println(
            "Tests Passed: " + passed + "/" + tests.length
        );
    }
}

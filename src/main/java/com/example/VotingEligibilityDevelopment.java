class Voter {
    String name;
    int age;
    String citizenship;
    String voterId;
    boolean validId;

    Voter(String name, int age, String citizenship,
          String voterId, boolean validId) {

        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.validId = validId;
    }

    void checkEligibility() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Citizenship: " + citizenship);
        System.out.println("Voter ID: " + voterId);

        if (age < 18) {
            System.out.println("Status: NOT ELIGIBLE");
            System.out.println("Reason: Underage");
        }
        else if (!citizenship.equalsIgnoreCase("Indian")) {
            System.out.println("Status: NOT ELIGIBLE");
            System.out.println("Reason: Not an Indian citizen");
        }
        else if (!validId) {
            System.out.println("Status: NOT ELIGIBLE");
            System.out.println("Reason: Invalid Voter ID");
        }
        else {
            System.out.println("Status: ELIGIBLE");
        }

        System.out.println("---------------------------");
    }
}

public class VotingEligibilityDevelopment {

    public static void main(String[] args) {

        Voter v1 = new Voter(
            "Rahul", 25, "Indian", "VID1001", true
        );

        Voter v2 = new Voter(
            "Amit", 16, "Indian", "VID1002", true
        );

        Voter v3 = new Voter(
            "John", 30, "American", "VID1003", true
        );

        Voter v4 = new Voter(
            "Raj", 22, "Indian", "VID1004", false
        );

        v1.checkEligibility();
        v2.checkEligibility();
        v3.checkEligibility();
        v4.checkEligibility();
    }
}

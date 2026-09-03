package com.example;

public class Voter {

    private String name;
    private int age;
    private String citizenship;
    private String voterId;
    private boolean idValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean idValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.idValid = idValid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getVoterId() {
        return voterId;
    }

    public boolean isIdValid() {
        return idValid;
    }
}

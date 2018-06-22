package com.brainacad.oop.testexcp1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(121);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}

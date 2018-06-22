package com.brainacad.oop.testexcp1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=1&&age<=120) {
            this.age = age;
        }else {
            throw new InvalidAgeException("Invalid age. "+age+" is not allowed for age field.");
        }
    }
}

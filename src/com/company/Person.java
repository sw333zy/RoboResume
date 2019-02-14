package com.company;
//part of composition exercise
public class Person{
    //person has a name and a title the title will end up coming from driver.java
    private String name;
    private String email;
    private String phoneNumber;

    //constructor
    public Person(){
        name = "";
        email = "";
        phoneNumber = "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String displayPerson(){
        return String.format("%s \n %s \n %s \n", this.getName(), this.getEmail(), this.getPhoneNumber());
    }
}


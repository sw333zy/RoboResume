package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        resumeMaker();
    }

    public static void createPerson(){
//        ArrayList<Person> people = new ArrayList<>();

        while(true){
            //creating a new person
            System.out.println("Enter name: ");
            Person p = new Person();
            String name = keyboard.nextLine();
            p.setName(name);
            System.out.println("Enter email: ");
            String email = keyboard.nextLine();
            p.setEmail(email);
            System.out.println("Enter phone number: ");
            String phoneNumber = keyboard.nextLine();
            p.setPhoneNumber(phoneNumber);

//            people.add(p);
            System.out.println("========================");
            System.out.println(p.displayPerson());

            System.out.println("Is this information correct? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("y")){
                break;
            }
        }




    } public static void createEducation(){
        ArrayList<Education> education = new ArrayList<>();
        //creating new education
        Education edu = new Education();
        System.out.println("Enter School: ");
        String school = keyboard.nextLine();
        edu.setSchool(school);
        System.out.println("Enter Degree: ");
        String degree = keyboard.nextLine();
        edu.setDegree(degree);
        System.out.println("Enter Major: ");
        String major = keyboard.nextLine();
        edu.setMajor(major);
        System.out.println("Enter Year: ");
        String year = keyboard.nextLine();
        edu.setYear(year);
//        education.add(edu);


        System.out.println(edu.displayEducation());


    }
    public static void createExperience(){
//        ArrayList<Experience> experience = new ArrayList<>();
        //creating new experience
        Experience exp = new Experience();
        System.out.println("Enter Company: ");
        String company = keyboard.nextLine();
        exp.setCompany(company);
        System.out.println("Enter Title: ");
        String title = keyboard.nextLine();
        exp.setTitle(title);
        System.out.println("Enter Year: ");
        String expYear = keyboard.nextLine();
        exp.setExpYear(expYear);
        System.out.println("Enter Description: ");
        String description = keyboard.nextLine();
        exp.setDescription(description);
//        experience.add(exp);


        System.out.println(exp.displayExperience());


    }
    public static void createSkills(){
//        ArrayList<Skills> skills = new ArrayList<>();
        //creating new skills
        Skills ski = new Skills();
        System.out.println("Enter Skill: ");
        String skill = keyboard.nextLine();
        ski.setSkills(skill);
        System.out.println("Enter Competency: ");
        String competency = keyboard.nextLine();
        ski.setCompetency(competency);
//        skills.add(ski);


        System.out.println(ski.displaySkills());

    }

    public static void resumeMaker(){
        while(true){
            createPerson();
            createEducation();
            createExperience();
            createSkills();
            System.out.println("Enter a new person? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("n")){
                break;
            }
            System.out.println();
        }


    }
}

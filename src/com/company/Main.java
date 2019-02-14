package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createResume();
    }

    public static void createResume(){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Education> education = new ArrayList<>();
        ArrayList<Experience> experience = new ArrayList<>();
        ArrayList<Skills> skills = new ArrayList<>();
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
            //creating new skills
            Skills ski = new Skills();
            System.out.println("Enter Skill: ");
            String skill = keyboard.nextLine();
            ski.setSkills(skill);
            System.out.println("Enter Competency: ");
            String competency = keyboard.nextLine();
            ski.setCompetency(competency);


            people.add(p);
            education.add(edu);
            experience.add(exp);
            skills.add(ski);
            System.out.println("Enter a new person? (y/n)");
            if (keyboard.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println("========================");
        for (Person eachPerson: people){
            System.out.println(eachPerson.displayPerson());
        }
        for (Education eachEducation: education){
            System.out.println(eachEducation.displayEducation());
        }
        for (Experience eachExperience: experience){
            System.out.println(eachExperience.displayExperience());
        }
        for (Skills eachSkills: skills){
            System.out.println(eachSkills.displaySkills());
        }

    }
}

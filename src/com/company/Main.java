package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static String displayPerson;
    static String eduList;
    static String expList;
    static String skillList;


    public static void main(String[] args) {
        resumeMaker();
    }

    //creating new person
    public static void createPerson(){
        ArrayList<Person> people = new ArrayList<>();

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
            //make variable to be able to call the person created
            people.add(p);
            displayPerson = p.displayPerson();

            System.out.println("Is this information correct? (y/n): ");
            if (keyboard.nextLine().equalsIgnoreCase("y")){
                break;
            }
        }
    }

    //creating new education
    public static void createEducation(){
        //create array to be able to have more than one education
        ArrayList<Education> education = new ArrayList<>();
        //while its true that user wants to add education keep looping
        while(true) {
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
            //Add the education to the array list
            education.add(edu);
            System.out.println("Do you want to enter more education? (y/n): ");
            if (keyboard.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
        //for each of the educations added build a string and append each additional education to it
        StringBuilder displayEducation = new StringBuilder();
        for (Education eachEducation: education) {
            String addThem = eachEducation.displayEducation();
            displayEducation.append(addThem);
        }
        //create a variable to hold the results of our displayEducation string builder
        eduList =  displayEducation.toString();
    }

    //creating new experience
    public static void createExperience() {
        Scanner keyboard = new Scanner(System.in);
        //create an array to hold all the experiences the user creates
        ArrayList<Experience> experience = new ArrayList<>();
        //while its true that a user wants to keep entering new experiences
        while (true) {
            System.out.println("Please enter your employment experience.");
            System.out.println("Enter Company: ");
            Experience exp = new Experience();
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
            //Add the skills to the array list
            experience.add(exp);
            //break if user enters no
            System.out.println("Do you want to enter new employment experience? (y/n): ");
            if (keyboard.nextLine().equalsIgnoreCase("n")) {
            break;
            }

        }
        //string builder for appending contents of each education
        StringBuilder displayExperience = new StringBuilder();
        for (Experience eachExperience: experience) {
            String addThem = eachExperience.displayExperience();
            displayExperience.append(addThem);
        }
        //variable is set for the created string to be able to call it later
        expList =  displayExperience.toString();
    }

    //create new skills
    public static void createSkills(){
        Scanner keyboard = new Scanner(System.in);
        //array list to hold newly created skills
        ArrayList<Skills> skills = new ArrayList<>();
        //able to continue creating skills until user enter (n) making this false
        while(true) {
            //create new skill and enter its attributes
            System.out.println("Please enter a skill: ");
            Skills c = new Skills();
            String skill = keyboard.nextLine();
            c.setSkill(skill);
            System.out.println("Enter competency level:");
            System.out.println("Please rank your skill level based on the numbers 1-5 with one being the lowest.");
            String competency = keyboard.nextLine();
            //any entry besides numbers will break loop
            if (competency.equalsIgnoreCase("1")) {
                competency = "Fundamental";
            } else if (competency.equalsIgnoreCase("2")){
                competency = "Novice";
            } else if (competency.equalsIgnoreCase("3")){
                competency = "Intermediate";
            } else if (competency.equalsIgnoreCase("4")){
                competency = "Advanced";
            } else if (competency.equalsIgnoreCase("5")){
                competency = "Expert";
            } else break;
            c.setCompetency(competency);
            //Add the skills to the array list
            skills.add(c);
            //allow the user to enter another skill or else break loop
            System.out.println("Do you want to enter a new skill? (y/n): ");
            if (keyboard.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }
        //creat a string builder so that when looping through skills they can be made into a string to be called on
        StringBuilder displaySkills = new StringBuilder();
        for (Skills eachSkills: skills) {
            String addThem = eachSkills.displaySkills();
            displaySkills.append(addThem);
        }
        //list for calling the created string
        skillList =  displaySkills.toString();
    }
    //resume builder function
    public static void resumeMaker(){
        Scanner keyboard = new Scanner(System.in);
        //array list to hold newly created resumes
        ArrayList<Resume> resumes = new ArrayList<>();
        //keep looping until user doesnt want another resume
        while(true){
            Resume r = new Resume();
            //call the following functions then set their property to the string created in each section
            createPerson();
            r.setPerson(displayPerson);
            createEducation();
            r.setEducationSet(eduList);
            createExperience();
            r.setExperienceSet(expList);
            createSkills();
            r.setSkillSet(skillList);
            //add the newly created resume to the array
            resumes.add(r);
            System.out.println("Enter a new resume? (y/n): ");
            //end if user doesnt want another resume
            if (keyboard.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }
        //for loop for printing out the resumes
        for (Resume eachResume: resumes) {
            System.out.println(eachResume.displayResumes());
        }

    }
//    public static void recruiterSearch(){
//        Recruiter s = new Recruiter();
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Please enter a search term: ");
//        String searchTerm = keyboard.nextLine();
//        s.setText(searchTerm);
//        String resumeContents = Resume.display;
//        s.setWord();
//
//
//        if(searchTerm.equals())
//
//    }

}

//    public static void createSkills() {
//        ArrayList<Skills> skills = new ArrayList<>();
//        //creating new skills
//        Skills ski = new Skills();
//        do {
//            System.out.println("Enter Skill: ");
//            String skill = keyboard.nextLine();
//            ski.setSkill(skill);
//            System.out.println("With 1 being the lowest and 5 being the highest, rank your competency in this skill.");
//            System.out.println("Enter Competency: ");
//            String comp = keyboard.nextLine();
//            String competency = "";
//            switch (comp) {
//                case "1":
//                    competency = "Fundamental";
//                case "2":
//                    competency = "Novice";
//                case "3":
//                    competency = "Intermediate";
//                case "4":
//                    competency = "Advanced";
//                case "5":
//                    competency = "Expert";
//                default:
//                    break;
//            }
//            ski.setCompetency(competency);
//            skills.add(ski);
//
//            System.out.println("Do you want to enter a new skill? (y/n)");
//        }while (keyboard.nextLine().equalsIgnoreCase("y"));
//
//        for (Skills eachSkills : skills) {
//            System.out.println(eachSkills.displaySkills());
//        }
//
//    }

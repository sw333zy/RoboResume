package com.company;

public class Resume {
    private String person;
    private String educationSet;
    private String experienceSet;
    private String skillSet;


    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getEducationSet() {
        return educationSet;
    }

    public void setEducationSet(String educationSet) {
        this.educationSet = educationSet;
    }

    public String getExperienceSet() {
        return experienceSet;
    }

    public void setExperienceSet(String experienceSet) {
        this.experienceSet = experienceSet;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String displayResumes(){
        return String.format("==================================\n" + person + "\n Education " + educationSet + "\n Experience " + experienceSet + "\n Skills" + skillSet);
    }
    String searchContent = displayResumes();

}

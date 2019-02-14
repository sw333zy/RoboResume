package com.company;

public class Skills extends Person {
    private String skills;
    private String competency;

    public Skills(){
        skills = "";
        competency = "";
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public String displaySkills(){
        return String.format("Skills \n %s, %s \n", this.getSkills(), this.getCompetency());
    }
}

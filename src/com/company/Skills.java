package com.company;

public class Skills extends Person {
    private String skill;
    private String competency;

    public Skills(){
        skill = "";
        competency = "";
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public String displaySkills(){
        return String.format(" %s, %s \n", this.getSkill(), this.getCompetency());
    }
}

package com.company;

public class Education extends Person {
    private String school;
    private String degree;
    private String major;
    private String year;

    public Education(){
        school = "";
        degree = "";
        major = "";
        year = "";
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String displayEducation(){
        return String.format("Education \n %s in %s, \n %s, %s \n", this.getDegree(), this.getMajor(), this.getSchool(), this.getYear());
    }
}

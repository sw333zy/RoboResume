package com.company;

public class Experience extends Person {
    private String company;
    private String title;
    private String expYear;
    private String description;

    public Experience(){
        company = "";
        title = "";
        expYear = "";
        description = "";
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String displayExperience(){
        return String.format("\n %s \n %s, %s \n %s \n",  this.getTitle(), this.getCompany(),  this.getExpYear(), this.getDescription());
    }

}


package com.company;

import java.util.Scanner;

public class Recruiter extends Resume {
    private String text;
    private String word;
    public Recruiter(){
        text = "";
        word = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

package com.haowei.score;

public class Scoring {
    public static void main(String[] args) {
        Student howard = new Student("Howard", 8,100);
        //howard.name = "Howard";
        //howard.english = 8;
        //howard.math = 100;
        Student sean = new Student("Sean", 90, 70);
        //sean.name = "Sean";
        //sean.english = 90;
        //sean.math = 70;
        GraduateStudent elsa = new GraduateStudent("Elsa", 100, 70, 65);
        howard.print();
        sean.print();
        elsa.print();
    }
}
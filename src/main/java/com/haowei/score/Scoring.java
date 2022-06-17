package com.haowei.score;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Howard", 8,100));
        students.add(new Student("Sean", 90,70));
        students.add(new GraduateStudent("Elsa", 100, 70, 65));
        for (Student stu : students) {
            stu.print();
        }
//        Student howard = new Student("Howard", 8,100);
//        Student sean = new Student("Sean", 90, 70);
//        GraduateStudent elsa = new GraduateStudent("Elsa", 100, 70, 65);
    }
}

package com.haowei.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
//                System.out.println(line);
                // Howard,96,75
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name, english, math);
                stu.print();
                line = bufferedReader.readLine();
            }
            /*int data = fileReader.read();
            while(data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }*/
        } catch (FileNotFoundException e) {
            System.out.println("檔案讀取失敗");
        } catch (IOException e) {
            System.out.println("資料讀取失敗");
        }
        System.out.println("Continuing");
    }
}

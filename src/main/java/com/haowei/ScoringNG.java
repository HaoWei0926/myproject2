package com.haowei;

public class ScoringNG {
    public static void main(String[] args) {
        int[] english = {90, 87, 60, 75, 98};
        int[] math = {70, 60, 88, 35, 100};
        String[] name = {"Sean", "Jenny", "Jack", "Elsa", "Howard"};
        for (int i = 0; i < 5; i++) {
            int average = (english[i]+math[i])/2;
            System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i]+math[i])/2);
        }
    }
}

package com.haowei.highspeedrail;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI, Station.TAICHUNG);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <0; i++) {
            System.out.println("Your start station?" + "/n" + "1.Taipei" + "/t" + "2.Taichung" + "/t" + "3.Kaohsiung");
            int choice = Integer.parseInt(scanner.next());
            Station startStation = null;
            switch (choice) {
                case 1:
                    startStation = Station.TAIPEI;
                    break;
                case 2:
                    startStation = Station.TAICHUNG
                    break;
                case 3:
                    startStation = Station.KAOHSIUNG;
                    break;
            }
            System.out.println("Your final station?" + "/n" + "1.Taipei" + "/t" + "2.Taichung" + "/t" + "3.Kaohsiung");
            choice = Integer.parseInt(scanner.next());
            Station finalStation = null;
            switch (choice) {
                case 1:
                    finalStation = Station.TAIPEI;
                    break;
                case 2:
                    finalStation = Station.TAICHUNG;
                    break;
                case 3:
                    finalStation = Station.KAOHSIUNG;
                    break;
            }
            System.out.println("Which types?" + "/n" + "1.Normal" + "/t" + "2.Student" + "/t" + "3.Elder&Youngers(65 years old above or 135cm below)" + "/t" + "4.Round-Trip");
            //int
            for (int k = 0; k <3; k++) {

            }
            System.out.println("How many tickets?" + "/n" + "1" + "/t" + "2" + "/t" + "3" + "/t" + "4" + "/t" + "5");
            int times = Integer.parseInt(scanner.next());
            for (int j = 0; j < times; j++) {

            }
        }
    }
}


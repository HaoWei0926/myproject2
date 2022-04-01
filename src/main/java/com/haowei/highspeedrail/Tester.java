package com.haowei.highspeedrail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        List<Ticket> ticket = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (exit != true) {
            System.out.println("Your start station?" + "\n" + "1.Taipei" + "\t" + "2.Taichung" + "\t" + "3.Kaohsiung");
            int choice = Integer.parseInt(scanner.next());
            Station startStation = null;
            switch (choice) {
                case 1:
                    startStation = Station.TAIPEI;
                    break;
                case 2:
                    startStation = Station.TAICHUNG;
                    break;
                case 3:
                    startStation = Station.KAOHSIUNG;
                    break;
            }
            System.out.println("Your final station?" + "\n" + "1.Taipei" + "\t"  + "2.Taichung" + "\t" + "3.Kaohsiung");
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
            System.out.println("Which types?" + "\n" + "1.Regular" + "\t" + "2.Student" + "\t" + "3.Elders" + "\t" + "4.Round-Trip");
            choice = Integer.parseInt(scanner.next());
            System.out.println("How many tickets?");
            int count = Integer.parseInt(scanner.next());
            String tp = null;
            switch (choice){
                case 1:
                    tp = "Regular";
                    Ticket regular = new Ticket(startStation, finalStation, tp, count);
                    ticket.add(regular);
                    break;
                case 2:
                    tp = "Student";
                    Student student = new Student(startStation, finalStation, tp, count);
                    ticket.add(student);
                    break;
                case 3:
                    tp = "Elders";
                    Elders elders = new Elders(startStation, finalStation, tp, count);
                    ticket.add(elders);
                    break;
                case 4:
                    tp = "Round-Trip";
                    RoundTrip roundtrip = new RoundTrip(startStation, finalStation, tp, count);
                    ticket.add(roundtrip);
                    break;
            }
            System.out.println("Continue?" + "\n" + "1.Yes" + "\t" + "2.No");
            int options = Integer.parseInt(scanner.next());
            if (options == 1) {
                exit = false;
            } else if (options == 2) {
                exit = true;
            }
        }
        for (Ticket t : ticket) {
            t.print();
        }
        System.out.println("Thank you for buying.");
    }
}




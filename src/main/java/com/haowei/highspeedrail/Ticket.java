package com.haowei.highspeedrail;

public class Ticket {
        public static final int TAIPEI = 100;
        public static final int TAICHUNG= 200;
        public static final int KAOHSIUNG = 300;
        int price;
        Station start;
        Station destination;
        public Ticket(Station start, Station destination){
            this.start = start;
            this.destination = destination;
        }
        //String start[] = {"Taipei", "Taichung", "Kaohsiung"};
        //String destination[] = {"Taipei", "Taichung", "Kaohsiung"};
        //public Ticket(start[0], destination[0], String types, int price){
        //}
}


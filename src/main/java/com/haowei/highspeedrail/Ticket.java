package com.haowei.highspeedrail;

public class Ticket {
    public static final int TAIPEI = 100;
    public static final int TAICHUNG = 200;
    public static final int KAOHSIUNG = 300;
    Station start;
    Station destination;
    String types;
    int num;
    int price;
    public Ticket(Station start, Station destination, String types, int num) {
        this.start = start;
        this.destination = destination;
        this.types = types;
        this.num = num;
        int diff = Math.abs(start.id - destination.id);
        switch (diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
        /*if (start == Station.TAIPEI && destination == Station.TAICHUNG || start == Station.TAICHUNG && destination == Station.TAIPEI) {
            price = 500;
        } else if (start == Station.TAICHUNG && destination == Station.KAOHSIUNG || start == Station.KAOHSIUNG && destination == Station.TAICHUNG) {
            price = 600;
        } else if (start == Station.TAIPEI && destination == Station.KAOHSIUNG || start == Station.KAOHSIUNG && destination == Station.TAIPEI) {
            price = 1100;
        }*/
    }
    public void print() {
        System.out.print("from " + start.name + " to "  + destination.name + "\t" + "(" + types + ")" + "\t" + num +"\t" + price*num);
        System.out.println();
    }
}


package com.haowei.highspeedrail;

public class Student extends Ticket {
    public Student(Station start, Station destination, String types, int num){
        super(start, destination, types, num);
    }
    public int getPrice() {
        return (int)(price*0.8f);
    }
    @Override
    public void print() {
        System.out.println("from " + start.name + " to " + destination.name + "\t" +  "(" + types + ")" + "\t" + num + "\t" + getPrice()*num);
    }
}

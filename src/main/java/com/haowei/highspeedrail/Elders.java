package com.haowei.highspeedrail;

public class Elders extends Student{
    public Elders(Station start, Station destination, String types, int num){
        super(start, destination, types, num);
    }
    @Override
    public int getPrice() {
            return (int)(price*0.5f);
    }
    @Override
    public void print() {
        System.out.println("from " + start.name + " to " + destination.name + "\t" + "(" + types + ")" + "\t" + num + "\t" + getPrice()*num);
    }
}

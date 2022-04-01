package com.haowei.highspeedrail;

public class RoundTrip extends Elders{
    public RoundTrip(Station start, Station destination, String types, int num){
        super(start, destination, types, num);
    }
    @Override
    public int getPrice() {
        return (int)((price*2)*0.9f);
    }
    @Override
    public void print() {
        System.out.println("from " + start.name + " to " + destination.name + "\t" +  "(" + types + ")" + "\t" + num+ "\t" + getPrice()*num);
    }
}

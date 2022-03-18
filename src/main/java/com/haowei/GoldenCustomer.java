package com.haowei;

public class GoldenCustomer extends SilverCustomer{
    public GoldenCustomer(String id, int cost){
        super(id, cost);
    }
    public int getReturnMoney(){
        return (int)(cost*0.1f);
    }
    public void print(){
        System.out.println(id + "\t" + cost + "\t" + getDiscount() + "\t" + "(" + getReturnMoney() + ")");
    }
}

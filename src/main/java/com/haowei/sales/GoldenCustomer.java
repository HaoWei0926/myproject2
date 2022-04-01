package com.haowei.sales;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String id, int cost){
        super(id, cost);
    }
    @Override
    public int getDiscount() {
        return (int)(cost*0.9f);
    }
    @Override
    public int getReturnMoney() {
        return (int)(cost*0.1f);
    }
    @Override
    public void print() {
        System.out.println(id + "\t" + cost + "\t" + getDiscount() + "\t" + "(" + getReturnMoney() + ")");
    }
}

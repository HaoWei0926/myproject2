package com.haowei.sales;

public class PlatinumCustomer extends GoldenCustomer{
    public PlatinumCustomer(String id, int cost){
        super(id,cost);
    }
    @Override
    public int getDiscount() {
        return (int)(cost*0.7f);
    }
    @Override
    public int getReturnMoney() {
            return (int)(cost*0.2f);
    }
    @Override
    public void print() {
            System.out.println(id + "\t" + cost + "\t" + getDiscount() + "\t" + "(" + getReturnMoney() + ")");
    }
}

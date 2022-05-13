package com.haowei.sales;

import com.haowei.sales.Customer;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int cost) {
        super(id, cost);
    }
    public int getReturnMoney() {
        return (cost/1000)*100;
    }
    @Override
    public void print() {
        System.out.println(id + "\t" + cost + "\t" + getDiscount() + "\t" + "(" + getReturnMoney() + ")");
    }
}

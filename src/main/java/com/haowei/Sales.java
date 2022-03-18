package com.haowei;

public class Sales {
    public static void main(String[] args) {
        SilverCustomer p1 = new SilverCustomer("0001", 1200);
        Customer p2 = new Customer("0002", 800);
        GoldenCustomer p3 = new GoldenCustomer("0003", 2000);
        p1.print();
        p2.print();
        p3.print();
    }
}

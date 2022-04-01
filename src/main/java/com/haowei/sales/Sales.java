package com.haowei.sales;

import com.haowei.sales.Customer;
import com.haowei.sales.GoldenCustomer;
import com.haowei.sales.SilverCustomer;
import com.haowei.score.GraduateStudent;

import java.util.ArrayList;
import java.util.List;

public class Sales {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001", 1200));
        customers.add(new Customer("0002",800));
        customers.add(new SilverCustomer("0003", 2000));
        customers.add(new GoldenCustomer("0004",3200));
        customers.add(new PlatinumCustomer("0005",4500));

        for (Customer p : customers) {
            p.print();
        }

        Customer p1 = new Customer("0001", 1200);
        Customer p2 = new Customer("0002", 800);
        SilverCustomer p3 = new SilverCustomer("0003", 2000);
        GoldenCustomer p4 = new GoldenCustomer("0004",3200);
        PlatinumCustomer p5 = new PlatinumCustomer("0005",4500);
        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();
    }
}

package com.haowei;

public class Customer {
    String id;
    int cost;
    public Customer(String id, int cost){
        this.id = id;
        this.cost = cost;
    }
    public int getDiscount(){
        return cost - (cost/1000)*100;
    }
    public void print(){
        System.out.print(id + "\t" + cost + "\t" + getDiscount());
        System.out.println();
    }
}
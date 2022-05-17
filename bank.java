package com.OOP;

import java.util.ArrayList;

public class bank {
    private ArrayList<customer> Customers;
    private int NumberOfCustomer;
    private String bankname;
    public bank(String bname){
        this.bankname = bname;
        this.Customers = new ArrayList<>();
        this.NumberOfCustomer = NumberOfCustomer;
    }
    public void addCustomer(String f, String l){
        customer Customer = new customer(f, l);
        NumberOfCustomer++;
    }
    public int getNumberOfCustomer(){
        this.NumberOfCustomer = Customers.size();
        return NumberOfCustomer;
    }
    public customer getCustomer(int index){
        return Customers.get(index);
    }
}

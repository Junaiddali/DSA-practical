package com.DSA;

public class Practical21 {
    private int salary;
    private int hours;
    public void getInfo(int salary ,int hours){
this.salary = salary;
this.hours = hours;
    }
    public void addSal(){
        if (this.salary<500){
            this.salary+=10;
        }
        else
            System.out.println("Salary is more than $500");

    }
    public void addWork(){
        if (this.hours>6){
            this.salary+=5;
        }
        else
            System.out.println("Working hours are less then 6 hours");
    }
    public void print(){
        System.out.println("The salary is: "+salary+" The working hour are: "+hours);
    }
    public static void main(String[] args) {
        Practical21 employee = new Practical21();
        employee.getInfo(499,7);
        employee.addSal();
        employee.addWork();
        employee.print();

    }
}

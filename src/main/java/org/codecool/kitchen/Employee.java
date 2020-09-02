package org.codecool.kitchen;

import java.util.Calendar;

public abstract class Employee {
    protected String name;
    private int birthDate;
    private double salary;
    private int numberOfKnives = 0;

    public Employee(String name, int birthDate, double salary, int numberOfKnives) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
        this.numberOfKnives = numberOfKnives;
    }

    public String getName() {
        return name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee name= " + name ;
    }

    public double countTax(){
        return salary*0.99;
    }

    public void printCountTax(){
        System.out.println("The tax is for " + name + " " + countTax());
    }

    public boolean isKnife(){
        return numberOfKnives == 0;
    }

    public void setKnife(){
        numberOfKnives++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

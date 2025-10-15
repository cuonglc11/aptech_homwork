package com.aptect.btkethua;

public class Student extends  Person {
    private  double gpa;

    protected Student(String name, int age, String address , double gpa) {
        super(name, age, address);
        this.gpa =gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("GPA is: " + gpa);
    }
}

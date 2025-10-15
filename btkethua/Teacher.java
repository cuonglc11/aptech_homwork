package com.aptect.btkethua;

public class Teacher extends  Person{
    private  int salary;
    protected Teacher(String name, int age, String address , int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("Teacher salary is: " + salary);
    }
}

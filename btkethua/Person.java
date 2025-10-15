package com.aptect.btkethua;

public class Person {
    protected  String  name;
    protected int  age;
    protected  String address ;

    protected Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }
    protected void  display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
    }
}

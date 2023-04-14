package com.class7;

public abstract class Person {
    String name;
    String email;
    int salary;
    int id;

//    Person(){
//        this.name = "";
//        this.email ="";
//        this.salary =0;
//    }
//
//    Person(String name, String email, int wage){
//        this.name = name;
//        this.email = email;
//        this.salary = wage;
//    }
    public abstract void inputData();
    public abstract void display();
    public abstract int getTotalBonusOfCompany();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    public abstract void updateData();

    public abstract void updateSalary();

}

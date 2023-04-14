package com.class7;

import java.util.Scanner;

public class Manager extends Person{
//    protected String clop;

    public Manager(){
//        super();
    }

    public Manager(String name, String email, int salary){
        this.name = name;
        this.email = email;
        this.salary = salary;
//        this.clop = clop;
    }


    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : " );
        this.name = input.nextLine();
        System.out.print("Enter email : ");
        this.email = input.nextLine();
        System.out.print("Enter salary : ");
        this.salary = input.nextInt();
//        System.out.print("Enter clop : ");
//        this.clop = input.nextLine();
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(this.salary);
    }

    @Override
    public void display() {
        System.out.println("Id = "+this.id+" ==> Manager");
        System.out.println("Name :" +this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Salary : "+this.salary);
    }

    @Override
    public int getTotalBonusOfCompany() {
        return this.salary*4;
    }

    @Override
    public void updateData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : " );
        this.name = input.nextLine();
        System.out.print("Enter email : ");
        this.email = input.nextLine();
        System.out.print("Enter salary : ");
        this.salary = input.nextInt();

        System.out.println("Name :" +this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Salary : "+this.salary);
    }

    @Override
    public void updateSalary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary : ");
        this.salary = input.nextInt();
        System.out.println("Salary : "+this.salary);
    }
}

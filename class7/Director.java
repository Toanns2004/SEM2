package com.class7;

import java.util.Scanner;

public class Director extends Person{

//    private String roll;

    Director(){
//        super();
//        this.roll = "";
    }

    public Director(String name, String email, int salary){
        this.name = name;
        this.email = email;
        this.salary = salary;
//        this.roll = roll;
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
//        System.out.print("Enter roll : ");
//        this.roll = input.nextLine();
        System.out.println("Name :" +this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Salary : "+this.salary);

    }

    @Override
    public void display() {
        System.out.println("Id = "+this.id+" ==> Director");
        System.out.println("Name :" +this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Salary : "+this.salary);
    }
    public int getTotalBonusOfCompany() {
        return this.salary*5;
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

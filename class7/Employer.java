package com.class7;

import java.util.Scanner;

public class Employer extends Person{
//    private String skill;

    public Employer(){
//    super();
    }

    public Employer(String name, String email, int salary){
        this.name = name;
        this.email = email;
        this.salary = salary;
//        this.skill = skill;
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

        System.out.println("Name :" +this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Salary : "+this.salary);

    }

    @Override
    public void display() {
        System.out.println("Id = "+this.id+" ==> Employer");
        System.out.println("Name :" +this.name);
        System.out.println("Email : "+this.email);
        System.out.println("Salary : "+this.salary);
    }
    public int getTotalBonusOfCompany() {
        return this.salary*3;
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

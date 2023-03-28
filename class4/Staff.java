package com.class4;

import java.util.Scanner;

public class Staff {
    String name;
    String email;
    int salary;

    Staff(){
        this.name = "";
        this.email ="";
        this.salary =0;
    }

    Staff(String name, String email, int wage){
        this.name = name;
        this.email = email;
        this.salary = wage;
    }

    public void inputDate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name :");
        this.name = input.nextLine();
        System.out.println("Enter email :");
        this.email = input.nextLine();
        System.out.println("Enter Wage :");
        this.salary = input.nextInt();
    }
    public void Display(){
        System.out.println("Name :"+this.name);
        System.out.println("Email :"+this.email);
        System.out.println("Salary :"+this.salary);
    }
}

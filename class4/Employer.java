package com.class4;

import java.util.Scanner;

public class Employer extends Staff {
    private String skill;

    public Employer(){
        super();
        this.skill = "";
    }
    public Employer(String name, String email, int wage, String skill){
        super(name, email,wage);
        this.skill = skill;
    }

    public void inputDate(){
        super.inputDate();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Skill :");
        this.skill = input.nextLine();

    }
    public void Display(){
        super.Display();
        System.out.println("Enter Skill :"+this.skill);
    }
}

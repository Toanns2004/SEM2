package com.class4;

import java.util.Scanner;

public class Manger extends Staff {
    private String clop;

    public Manger(){
        super();
        this.clop = "";
    }

    public Manger(String name, String email, int wage, String clop){
        super(name,email,wage);
        this.clop = clop;
    }

    public void inputDate(){
        super.inputDate();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Clop :");
        this.clop = input.nextLine();

    }
    public void Display(){
        super.Display();
        System.out.println("Enter Clop :"+this.clop);
    }
}

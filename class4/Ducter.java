package com.class4;

import java.util.Scanner;

public class Ducter extends Staff {
    private String roll;

    Ducter(){
        super();
        this.roll = "";
    }

    Ducter(String name, String email, int wage, String roll){
        super(name,email,wage);
        this.roll = roll;
    }

    public void inputDate(){
        super.inputDate();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll :");
        this.roll = input.nextLine();

    }
    public void Display(){
        super.Display();
        System.out.println("Enter roll :"+this.roll);
    }
}

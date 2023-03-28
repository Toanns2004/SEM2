package com.class4;

public class Main {
    public static void main(String[] args) {
      Staff person[] = new Staff[3];
      person[0] = new Ducter();
      person[1] = new Manger();
      person[2] = new Employer();
        for (int i = 0; i < person.length; i++) {
            person[i].inputDate();
        }
        for (int i = 0; i < person.length; i++) {
            person[i].Display();
        }
    }
}

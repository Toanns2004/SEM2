package com.class5;

public class Main {
    public static void main(String[] args) {
        Person person[] = new Person[3];

        person[0] = new Triangle();
        person[1] = new Rectangle();
        person[2] = new Circle();


        person[0].inputDate(2,3,4);
        person[1].inputDate(4,5,0);
        person[2].inputDate(6);
//        for (Person item : person){
//            item.inputDate();
//        }
//        person[0].getAcreage();
        for (Person item : person){
            item.acreage();
        }
//        person[0].getAcreage();
//        person[1].getAcreage();
//        person[2].getAcreage();

    }
}

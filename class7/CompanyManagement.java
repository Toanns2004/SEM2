package com.class7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManagement {
    List<Person> list;
    int currentId = 0;
    public CompanyManagement() {
        list = new ArrayList<Person>();
        Person d = new Director("Nguyen Van A","A@gmail.com",300);
        d.setId(++currentId);
        list.add(d);

        Person m = new Manager("Nguyen Van B","B@gmail.com",200);
        m.setId( ++currentId );
        list.add( m );

        Person e = new Employer("Nguyen Van C","C@gmail.com",100);
        e.setId(++currentId );
        list.add( e );
    }

    public void addNewPerson(){
        System.out.println("1. Create a Director ");
        System.out.println("2. Create a Manager");
        System.out.println("3. Create a Employer ");
        System.out.print("Please choose: ");

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        Person s = null;

        switch (choose){
            case 1:{
                s = new Director();
            }
            break;
            case 2:{
                s = new Manager();
            }
            break;
            case 3:{
                s = new Employer();
            }
            break;

        }
        s.inputData();
        list.add( s );
        s.setId(++currentId);
    }
    public void displayAll(){
        for (Person item : list){
            item.display();
        }
    }

    Person findPersonById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();

        for (Person item : list) {
            if(findId == item.getId()) {
                item.display();
                //return item that has id
                return item;
            }
        }
        return null;
    }
    public void getTotalBonusOfCompany(){
        int total=0;
        for(Person i : list){
            total+=i.getTotalBonusOfCompany();
        }
        System.out.println("Total bonus : "+total);
    }
    public void updatePerson() {
      Person findPerson = this.findPersonById();
        if(findPerson != null) {
            findPerson.updateData();
        } else {
            System.out.println("Not found");
        }
    }
    public void updateSalary(){
        Person findPerson = this.findPersonById();
        if(findPerson != null) {
            findPerson.updateSalary();
        } else {
            System.out.println("Not found");
        }
    }

}

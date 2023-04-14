package com.class7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CompanyManagement companyManagement = new CompanyManagement();

        do {
            System.out.println("1. Create a Person");
            System.out.println("2. Display all");
            System.out.println("3. Find person by id");
            System.out.println("4. Update Person");
            System.out.println("5. Salary bonus");
            System.out.println("6. Update Salary");
            System.out.println("7. Exit");

            System.out.print("Choose person: ");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();

            switch (choose) {
                case 1: {
                    companyManagement.addNewPerson();
                }
                break;
                case 2: {
                    companyManagement.displayAll();
                }
                break;
                case 3: {
                    Person s = companyManagement.findPersonById();
                    if( s != null) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                }
                break;
                case 4: {
                    companyManagement.updatePerson();
                }

                break;
                case 5: {
                    companyManagement.getTotalBonusOfCompany();
                }
                break;
                case 6:{
                    companyManagement.updateSalary();
                }
                break;
                case 7: {
                    System.out.println("Close application");
                    return;
                }
            }

        } while(true);


    }



}

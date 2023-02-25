package com.bridgelabz;

import java.util.Scanner;

public class Main {
    Scanner objec = new Scanner(System.in);
    Contacts contacts = new Contacts();//created object of class Contacts
    public static void main(String args[]){
    Main main = new Main();//created object of Main class to call non-static method  of this class
    main.initiate();
    }
    private void initiate(){
        System.out.println("Press 1 for add contact");
        System.out.println("Press 2 to display contact");
        System.out.println("Press 3 to edit contact");
        int input = objec.nextInt();
        switch (input){
            case 1:
                contacts.addContact();
                System.out.println("CONTACT ADDED !");
                initiate();
                break;
            case 2:
                contacts.displayContact();
                break;
            case 3:
                System.out.println("Enter name for editing the contact");
                String nameForEditContactDetails = new Scanner(System.in).nextLine();
                contacts.editContact(nameForEditContactDetails);
                System.out.println("Contact edited successfully");
                initiate();
            default:
                System.out.println("Invalid Input");
        }
    }
}


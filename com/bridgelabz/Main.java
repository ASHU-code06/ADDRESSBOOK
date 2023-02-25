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
        System.out.println("Press 4 to delete contact");
        System.out.println("Press 5 to exit successfully");
        int input = objec.nextInt();
        switch (input){
            case 1:
                contacts.addContact();
                System.out.println("CONTACT ADDED !");
                initiate();
                break;
            case 2:
                System.out.println("AddressBook has following contacts");
                contacts.displayContact();
                initiate();
                break;
            case 3:
                System.out.println("Enter name for editing the contact");
                String nameForEditContactDetails = new Scanner(System.in).nextLine();
                contacts.editContact(nameForEditContactDetails);
                System.out.println("Contact edited successfully");
                initiate();
            case 4:
                System.out.println("Enter Name for Delete Contact");
                String contactNameForDelete = (new Scanner(System.in)).nextLine();
                contacts.deleteContact(contactNameForDelete);
                System.out.println("Deleted succesfully");
                initiate();
                break;
            case 5:
                System.out.println("Exit successfully");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}


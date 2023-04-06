package com.bridgelabz;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    String name;
    Scanner object = new Scanner(System.in);
    AddressBook addressBook = new AddressBook();//created object of class Contacts
   // ArrayList<String> AddressBook = new ArrayList<>();
    public static void main(String args[]){
    Main main = new Main();//created object of Main class to call non-static method  of this class
    main.initiate();
    }
    private void initiate(){

        System.out.println("Press 1 for add a Address book");
        System.out.println("Press 2 to display contact");
        System.out.println("Press 3 to edit contact");
        System.out.println("Press 4 to delete contact");
        System.out.println("Press 5 to exit ");

        int input = object.nextInt();
        switch (input){
            case 1:
                addressBook.addContact();
                System.out.println("SUCCESSFULLY ADDED !");
                initiate();
                break;
            case 2:
                System.out.println("*****************************************************************************************");
                //addressBook.displayContact();
                addressBook.displayAddressBooks();
                initiate();
                break;
//            case 3:
////                System.out.println("Enter name for editing the contact");
////                String nameForEditContactDetails = new Scanner(System.in).nextLine();
////                addressBook.editContact(nameForEditContactDetails);
////                System.out.println("Contact edited successfully");
////                initiate();
//            case 4:
////                System.out.println("Enter Name for Delete Contact");
////                String contactNameForDelete = (new Scanner(System.in)).nextLine();
////                addressBook.deleteContact(contactNameForDelete);
////                System.out.println("Deleted successfully");
////                initiate();
////                break;
            case 5:
                System.out.println("Exit successfully");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}


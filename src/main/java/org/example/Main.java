package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner object = new Scanner(System.in);
    AddressBook addressBook = new AddressBook();//created object of class Contacts
    String nameOfAddressBook;

    public static void main(String args[]){
        Main main = new Main();//created object of Main class to call non-static method  of this class
        main.initiate();
    }
    private void initiate(){
        try {
            System.out.println("Press 1 for add a Address book");
            System.out.println("Press 2 to display Address Book");
            System.out.println("Press 3 to edit contact");
            System.out.println("Press 4 to delete contact");
            System.out.println("Press 5 to search by city/state ");
            System.out.println("Press 6 to sort person details in alphabetical order");
            System.out.println("Press 7 to sort the entries by city , state and ZIP");
            System.out.println("Press 8 to read your entered AddressBook file");
            System.out.println("Press 0 to exit ");

            int input = object.nextInt();
            switch (input) {
                case 0:
                    System.out.println("Exit successfully");
                    break;
                case 1:
                    System.out.println("Enter name of address book");
                    nameOfAddressBook = object.next();
                    addressBook.addContact(nameOfAddressBook);
                    System.out.println(" DONE !");
                    initiate();
                    break;
                case 2:
                    System.out.println("AddressBook has following contacts : ");
                    addressBook.displayContact();
                    initiate();
                    break;
                case 3:
                    System.out.println("Enter name for editing the contact");
                    String nameForEditContactDetails = new Scanner(System.in).nextLine();
                    addressBook.editContact(nameForEditContactDetails);
                    System.out.println("Contact edited successfully");
                    initiate();
                    break;
                case 4:
                    System.out.println("Enter Name for Delete Contact");
                    String contactNameForDelete = (new Scanner(System.in)).nextLine();
                    addressBook.deleteContact(contactNameForDelete);
                    System.out.println("Deleted successfully");
                    initiate();
                    break;
                case 5:
                    addressBook.displayContact();
                    addressBook.searchByCityOrState();
                    break;
                case 6:
                    addressBook.sortByAlbhabeticalOrder();
                    break;
                case 7:
                    addressBook.sortTheEntries();
                    break;
                case 8:
                    addressBook.readjsondatafile(nameOfAddressBook);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }catch(Exception e){
            System.out.println("some error occurred");
        }
    }
}


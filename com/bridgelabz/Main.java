package com.bridgelabz;

import java.util.Scanner;

public class Main {
    Contacts contacts = new Contacts();//created object of class Contacts
    public static void main(String args[]){
    Main main = new Main();//created object of Main class to call non-static method  of this class
    main.initiate();
    }
    private void initiate(){
        System.out.println("Press 1 for add contact");
        System.out.println("Press 2 to display contact");
        int input = new Scanner(System.in).nextInt();
        switch (input){
            case 1:
                contacts.addContact();
                System.out.println("CONTACT ADDED !");
                break;
            case 2:
                contacts.displayContact();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}


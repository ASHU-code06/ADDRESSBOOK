package com.bridgelabz;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
  class Contacts {
        public int contactId;
       ArrayList<ContactModel> contactlist = new ArrayList<ContactModel>();
       public void addContact(){
           //Method for creating contacts only
           ContactModel contactModel = new ContactModel();//creating object of other class
           Scanner input = new Scanner(System.in);
           Random generatingId = new Random();//Using random function to generate contact id
           contactModel.contactId = String.valueOf(generatingId.nextInt(200)+100);
           System.out.println("Enter your details as follows");
           System.out.println("Enter first name");
           contactModel.firstName = input.nextLine();
           System.out.println("Enter last name");
           contactModel.lastName = input.nextLine();
           System.out.println("Enter Address");
           contactModel.address = input.nextLine();
           System.out.println("Enter City");
           contactModel.city = input.nextLine();
           System.out.println("Enter State");
           contactModel.state = input.nextLine();
           System.out.println("Enter ZIP");
           contactModel.zip = input.nextLine();
           System.out.println("Enter PhoneNumber");
           contactModel.phoneNumber = input.nextLine();
           System.out.println("Enter email ");
           contactModel.email = input.nextLine();
           System.out.println("Your ContactId is "+contactModel.contactId);

           contactlist.add(contactModel);//Added contact details in contactModel
       }
}
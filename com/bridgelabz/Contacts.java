package com.bridgelabz;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
  class Contacts {
        public int contactId;
       ArrayList<ContactModel> contactList = new ArrayList<ContactModel>();
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

           contactList.add(contactModel);//Added contact details in contactModel
       }
       void displayContact(){
           for (int i=0;i<contactList.size();i++){
                ContactModel obj = contactList.get(i);
               System.out.println("Name : "+obj.firstName+" "+obj.lastName);
               System.out.println("Address : "+obj.address);
               System.out.println("City : "+obj.city);
               System.out.println("State : "+obj.state);
               System.out.println("zip : "+obj.zip);
               System.out.println("Phone-Number : "+obj.phoneNumber);
               System.out.println("Email : "+obj.email);
           }
       }
      private int getContactIndex(String name) {
          for (int i = 0; i < contactList.size(); i++) {
              if (contactList.get(i).firstName.equals(name)) {
                  return i;
              }
          }
          return -1;
      }

      public void editContact(String name) {
          int contactIndex = getContactIndex(name);
          if (contactIndex == -1) {
              System.out.println("Contact Not Exists!");
              return;
          }


          boolean isEdit = true;
          while (isEdit) {
              System.out.println("SELECT ");
              System.out.println(
                      "1. firstname \n" +
                              "2. lastname \n" +
                              "3. address \n" +
                              "4. city \n" +
                              "5. state \n" +
                              "6. zip \n" +
                              "7. phone-number \n" +
                              "8. email \n" +
                              "9. exit ");
              int choice = (new Scanner(System.in)).nextInt();
              switch (choice) {
                  case 1:
                      System.out.println("Enter First Name: ");
                      String firstName = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).firstName = firstName;
                      break;
                  case 2:
                      System.out.println("Enter Last Name: ");
                      String lastName = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).lastName = lastName;
                      break;
                  case 3:
                      System.out.println("Enter Address: ");
                      String address = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).address = address;
                      break;
                  case 4:
                      System.out.println("Enter City: ");
                      String city = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).city = city;
                      break;
                  case 5:
                      System.out.println("Enter State: ");
                      String state = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).state = state;
                      break;
                  case 6:
                      System.out.println("Enter Zip: ");
                      String zip = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).zip = zip;
                      break;
                  case 7:
                      System.out.println("Enter PhoneNo: ");
                      String phoneNumber = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).phoneNumber = phoneNumber;
                      break;
                  case 8:
                      System.out.println("Enter Email Id: ");
                      String email = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).email = email;
                      break;
                  case 9:
                      isEdit = false;
                      break;
                  default:
                      System.out.println("Invalid Option!, try Again");
              }   break;
          }
      }
  }
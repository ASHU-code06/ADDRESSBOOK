package com.bridgelabz;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
  class Contacts {
        public int contactId;
       ArrayList<ContactModel> contactList = new ArrayList<ContactModel>();
       public void addContact() {
           //Method for creating contacts only
           System.out.println("How may contacts you want to add ? ");
           int numOfContacts = new Scanner(System.in).nextInt();

           for (int i = 1; i <= numOfContacts; i++) {
               ContactModel contactModel = new ContactModel();//creating object of other class
               Scanner input = new Scanner(System.in);
               Random generatingId = new Random();//Using random function to generate contact id
               contactModel.contactId = String.valueOf(generatingId.nextInt(200) + 100);
               System.out.println("Enter your details as follows");
               System.out.println("Enter first name");
               String firstName = input.nextLine();
               contactModel.setFirstName(firstName);
               System.out.println("Enter last name");
               String lastName = input.nextLine();
               contactModel.setLastName(lastName);
               System.out.println("Enter Address");
               String address = input.nextLine();
               contactModel.setAddress(address);
               System.out.println("Enter City");
               String city = input.nextLine();
               contactModel.setCity(city);
               System.out.println("Enter State");
               String state = input.nextLine();
               contactModel.setState(state);
               System.out.println("Enter ZIP");
               String zip = input.nextLine();
               contactModel.setZip(zip);
               System.out.println("Enter PhoneNumber");
               String phoneNumber = input.nextLine();
               contactModel.setPhoneNumber(phoneNumber);
               System.out.println("Enter email ");
               String email = input.nextLine();
               contactModel.setEmail(email);
               System.out.println("Your ContactId is " + contactModel.contactId);


               contactList.add(contactModel);//Added contact details in contactModel
           }
       }
       void displayContact(){
           for (int i=0;i<contactList.size();i++){
                ContactModel obj = contactList.get(i);
               System.out.println("Name : "+obj.getFirstName()+" "+obj.getLastName());
               System.out.println("Address : "+obj.getAddress());
               System.out.println("City : "+obj.getCity());
               System.out.println("State : "+obj.getState());
               System.out.println("zip : "+obj.getZip());
               System.out.println("Phone-Number : "+obj.getPhoneNumber());
               System.out.println("Email : "+obj.getEmail());
           }
       }
      private int getContactIndex(String name) {
          for (int i = 0; i < contactList.size(); i++) {
              if (contactList.get(i).getFirstName().equals(name)) {
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
                      contactList.get(contactIndex).setFirstName(firstName);
                      break;
                  case 2:
                      System.out.println("Enter Last Name: ");
                      String lastName = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).setLastName(lastName);
                      break;
                  case 3:
                      System.out.println("Enter Address: ");
                      String address = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).setAddress(address);
                      break;
                  case 4:
                      System.out.println("Enter City: ");
                      String city = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).setCity(city);
                      break;
                  case 5:
                      System.out.println("Enter State: ");
                      String state = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).setState(state);
                      break;
                  case 6:
                      System.out.println("Enter Zip: ");
                      String zip = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).setZip(zip);
                      break;
                  case 7:
                      System.out.println("Enter PhoneNo: ");
                      String phoneNumber = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).setPhoneNumber(phoneNumber);
                      break;
                  case 8:
                      System.out.println("Enter Email Id: ");
                      String email = (new Scanner(System.in)).nextLine();
                      contactList.get(contactIndex).setEmail(email);
                      break;
                  case 9:
                      isEdit = false;
                      break;
                  default:
                      System.out.println("Invalid Option!, try Again");
              }   break;
          }
      }
      void deleteContact(String name){
              int contactIndex = getContactIndex(name);
              contactList.remove(contactIndex);
       }

  }

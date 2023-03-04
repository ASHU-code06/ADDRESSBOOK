package com.bridgelabz;
import java.util.Scanner;
   public class Main {
       Contacts contacts = new Contacts();
        public static void main(String[] args) {
            //there i prefered non-static methods so i m calling them using object creation .
            Main main = new Main();
            while(true){
            main.initiate();
            }
        }//MAIN METHOD ENDS HERE
       private void initiate(){

               System.out.println("Press 1 for ADD CONTACT ");
               System.out.println("Press 2 for EDIT CONTACT ");
               System.out.println("Press 3 for DELETE CONTACT ");
               System.out.println("Press 4 for DISPALY CONTACT ");
               int input = new Scanner(System.in).nextInt();
               switch (input) {
                   case 1:
                       contacts.addContact();
                       System.out.println("Contact Added! ");
                       break;
                   case 2:
                       System.out.println("Enter Name for Edit Contact");
                       String contactNameForEdit = (new Scanner(System.in)).nextLine();
                       contacts.EditContact(contactNameForEdit);
                       System.out.println("Contact Updated Successfully! ");
                       break;
                   case 3:
                       System.out.println("Enter Name for Delete Contact");
                       String contactNameForDelete = (new Scanner(System.in)).nextLine();
                       contacts.DeleteContact(contactNameForDelete);
                       break;
                   case 4:
                       contacts.displayContactList();
                       break;
                   default:
                       System.out.println("INVALID");
               }
        }
   }



package com.bridgelabz;
import java.util.*;

class AddressBook {
    Scanner scanner = new Scanner(System.in);
   // AddressBook addressBook = new AddressBook();

    Map<String,Address> map = new HashMap<>();
    ArrayList<Address> contactList = new ArrayList<Address>();
    ArrayList<Address> contactList2 = new ArrayList<>();
    ArrayList<Address> contactList3 = new ArrayList<>();
    Map<String,ArrayList<Address>> mapForAddressBook = new HashMap<>();
    public void addContact() { //Method for creating contacts only
        System.out.println("How many AddressBook you want to add ? This program is designed to add upto 3 address books");
        int numberOfAddressBook = new Scanner(System.in).nextInt();
        for (int i = 1 ; i <= numberOfAddressBook ; i++) {
            System.out.println("Enter the name of AddressBook");
            String nameOfAddressBook = scanner.nextLine();
            if (mapForAddressBook.containsKey(nameOfAddressBook)){
                System.out.println("error : Address Book already exist ");
            }

            System.out.println("How may contacts you want to add ? ");
            int numOfContacts = new Scanner(System.in).nextInt();

            for (int j = 0; j < numOfContacts; j++) {
                Address address = new Address();//creating object of other class
                Scanner input = new Scanner(System.in);
                Random generatingId = new Random();//Using random function to generate contact id
                address.contactId = String.valueOf(generatingId.nextInt(200) + 100);
                System.out.println("Enter your details as follows");
                System.out.println("Enter first name");
                String firstName = input.nextLine();
                address.setFirstName(firstName);
                System.out.println("Enter last name");
                String lastName = input.nextLine();
                address.setLastName(lastName);
                System.out.println("Enter Address");
                String PersonAddress = input.nextLine();
                address.setAddressOfPerson(PersonAddress);
                System.out.println("Enter City");
                String city = input.nextLine();
                address.setCity(city);
                System.out.println("Enter State");
                String state = input.nextLine();
                address.setState(state);
                System.out.println("Enter ZIP");
                String zip = input.nextLine();
                address.setZip(zip);
                System.out.println("Enter PhoneNumber");
                String phoneNumber = input.nextLine();
                address.setPhoneNumber(phoneNumber);
                System.out.println("Enter email ");
                String email = input.nextLine();
                address.setEmail(email);
                System.out.println("Your ContactId is " + address.contactId);

                if (i == 1) {
                    contactList.add(address);
                    mapForAddressBook.put(nameOfAddressBook,contactList);

                }

                if (i == 2){
                    contactList2.add(address);
                    mapForAddressBook.put(nameOfAddressBook,contactList2);

                }

                if (i == 3){
                    contactList3.add(address);
                    mapForAddressBook.put(nameOfAddressBook,contactList3);

                }
            }
        }
    }
    void displayAddressBooks(){
       for(Map.Entry<String,ArrayList<Address>> m : mapForAddressBook.entrySet()){
           System.out.print(m.getKey()+ "   "+m.getValue());
       }
    }

}

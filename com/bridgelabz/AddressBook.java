package com.bridgelabz;
import java.util.*;

class AddressBook {
    ArrayList<Address> contactList = new ArrayList<Address>();
    public void addContact() { //Method for creating contacts only
        Map<String,Address> map = new HashMap<>();
        System.out.println("Enter name of address book");

        System.out.println("How may contacts you want to add ? ");
        int numOfContacts = new Scanner(System.in).nextInt();

        for (int i = 0; i < numOfContacts; i++) {
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

            contactList.add(address);//Added contact details in list

            //Calling constructor of address class and passing aguments
            Address data = new Address(firstName , lastName , PersonAddress ,  city , state , zip , phoneNumber , email);
            if (map.containsKey(firstName.concat(lastName))) {
                System.out.println("\nError : " + firstName + " " + lastName + " already exists on this address book.");
                break;
            }
            map.put(firstName.concat(lastName), data);
        }
    }

    void displayContact(){
       for(Address data : contactList){
           System.out.println(data.toString());;
       }// to print the map and see output
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
                    String addressOfPerson = (new Scanner(System.in)).nextLine();
                    contactList.get(contactIndex).setAddressOfPerson(addressOfPerson);
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

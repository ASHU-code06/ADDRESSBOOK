package org.example;

import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class AddressBook {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Address> contactList = new ArrayList<Address>();
    Map<String,ArrayList<Address>> mapForAddressBook = new HashMap<>();

    public void addContact(String nameOfAddressBook) { //Method for creating contacts only
        Map<String,Address> map = new HashMap<>();

        System.out.println("How may contacts you want to add ? ");
        int numOfContacts = scanner.nextInt();

        for (int i = 0; i < numOfContacts; i++) {
            Address address = new Address();//creating object of other class
            Random generatingId = new Random();//Using random function to generate contact id
            address.contactId = String.valueOf(generatingId.nextInt(200) + 100);
            System.out.println("Enter your details as follows");
            System.out.println("Enter first name");
            String firstName = scanner.next();
            address.setFirstName(firstName);

            System.out.println("Enter last name");
            String lastName = scanner.next();
            if (map.containsKey(firstName.concat(lastName))) {
                System.out.println("\nError : " + firstName + " " + lastName + " already exists on this address book.");
                break;
            }address.setLastName(lastName);

            System.out.println("Enter Age");
            String age = scanner.next();
            address.setAge(age);

            System.out.println("Enter Address");
            String PersonAddress = scanner.next();
            address.setAddressOf(PersonAddress);

            System.out.println("Enter City");
            String city = scanner.next();
            address.setCity(city);

            System.out.println("Enter State");
            String state = scanner.next();
            address.setState(state);

            System.out.println("Enter ZIP");
            String zip = scanner.next();
            address.setZip(zip);

            System.out.println("Enter PhoneNumber");
            String phoneNumber = scanner.next();
            address.setPhoneNumber(phoneNumber);

            System.out.println("Enter email ");
            String email = scanner.next();
            address.setEmail(email);

            System.out.println("Your ContactId is " + address.contactId);

            contactList.add(address);//Added contact details in list

            //Calling constructor of address class and passing arguments
            Address data = new Address(firstName , lastName , age , PersonAddress ,  city , state , zip , phoneNumber , email);
            map.put(firstName.concat(lastName), data);
            mapForAddressBook.put(nameOfAddressBook,contactList);
            writejsondatafile(nameOfAddressBook);

            //writeIntoFile(nameOfAddressBook);
        }
    }
//    void  writeIntoFile(String nameOfAddressBook){
//        File filePath = new File("E:\\Java\\IdeaProjectsREMAPPED\\AddressBook\\src\\com\\bridgelabz\\AddressBookFile.txt");
//        try {
//            FileWriter fileWriter = new FileWriter(filePath);
//            fileWriter.write("Welcome to "+nameOfAddressBook);
//            fileWriter.write(String.valueOf(contactList));
//            fileWriter.close();
//        }catch(Exception e){
//            System.out.println("Oops !!!! Error!");
//            e.printStackTrace();
//        }
//
//    }
//    void  readIntoFile(){
//        File filePath = new File("E:\\Java\\IdeaProjectsREMAPPED\\AddressBook\\src\\com\\bridgelabz\\AddressBookFile.txt");
//        int i ;
//        try {
//            FileReader fileReader = new FileReader(filePath);
//            while ((i = fileReader.read() ) != -1){
//                System.out.println((char) i );
//                /*(char) i converts the integer value i to its corresponding character,
//                and then System.out.println() prints this character to the console.
//                This way, the contents of the file are printed to the console one character at a time
//                as the while loop iterates through each character of the file.*/
//            }
//            fileReader.close();
//        }catch(Exception e){
//            System.out.println("Oops !!!! Error!");
//            e.printStackTrace();
//        }
//
//        void  writeIntoFile(String filename){
//        try {
//            FileWriter outputfile = new FileWriter("E:\\Java\\IdeaProjectsREMAPPED\\addressbookmaven\\src\\AddressBook.csv");
//            CSVWriter writer = new CSVWriter(outputfile);
//            ArrayList<String[]> csvdata = new ArrayList<>();
//            csvdata.add(
//                    new String[] { "First_name", "Last_name", "age" ,"address",  "city", "state", "zip","phoneNum", "email" });
//            for (Address address : contactList) {
//                csvdata.add(new String[] { address.getFirstName(), address.getLastName(), address.getAge(),address.getAddressOf(),address.getCity(), address.getState(),address.getZip(), address.getPhoneNumber(), address.getEmail() });
//            }
//            writer.writeAll(csvdata);
//            writer.close();
//        } catch ( IOException e) {
//            System.out.println("Some error has occurred !");
//            e.printStackTrace();
//        }
//
//    }
//    void  readIntoFile(){
//        try {
//            FileReader filereader = new FileReader("E:\\Java\\IdeaProjectsREMAPPED\\addressbookmaven\\src\\AddressBook.csv");
//            CSVReader csvReader = new CSVReader(filereader);
//            String[] nextRecord;
//            // read data line by line
//            while ((nextRecord = csvReader.readNext()) != null) {
//                for (String cell : nextRecord) {
//                    System.out.print(cell + "\t");
//                }
//                System.out.println();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
    public void writejsondatafile(String filename) {

        try {
            // create a writer
            Writer writer = new FileWriter("E:\\Java\\IdeaProjectsREMAPPED\\addressbookmaven\\src"+filename);
            // convert list to JSON File
            new Gson().toJson(contactList, writer);
            System.out.println("Done");
            // close the writer
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void readjsondatafile(String filename) {

        Gson gson = new Gson();
        try {

            Address[] jsondata = gson.fromJson(new FileReader("E:\\Java\\IdeaProjectsREMAPPED\\addressbookmaven\\src" + filename), Address[].class);

            System.out.println(gson.toJson(jsondata));
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    void sortTheEntries(){
        sortByCity();
        sortByState();
        sortByZip();
    }
    void sortByCity(){
        System.out.println("sorted by city");
        List <String> sortedByCity = contactList.stream().map(Value -> Value.getCity()).sorted().collect(Collectors.toList());
        System.out.println(sortedByCity);
    }
    void sortByState(){
        System.out.println("sorted by state");
        List <String> sortedByState = contactList.stream().map(Value -> Value.getState()).sorted().collect(Collectors.toList());
        System.out.println(sortedByState);
    }
    void sortByZip(){
        System.out.println("sorted by zip");
        List <String> sortedByZip = contactList.stream().map(Value -> Value.getZip()).sorted().collect(Collectors.toList());
        System.out.println(sortedByZip);
    }
    void searchByCityOrState(){
        System.out.println("Enter city");
        String searchByCityOrState = scanner.next();
        int countOfPersonsLiveInTheCity_Or_State = 0;

        List <Address> list = contactList.stream().filter(cityName -> cityName.getCity().equals(searchByCityOrState)).collect(Collectors.toList()) /*alt+enter then tab(before semicolon)*/;

        for (Address c : list ) {
            System.out.println("Person details "+c.getFirstName()+" "+c.getLastName()+" :  "+c.getPhoneNumber() );
            countOfPersonsLiveInTheCity_Or_State++;
        }
        System.out.println(countOfPersonsLiveInTheCity_Or_State+"  People belong to this city/state");
    }
    void sortByAlbhabeticalOrder(){

        System.out.println("Sorted : ");
        List<String> sortedList =  contactList.stream().map(Value -> Value.getFirstName()).sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }

    void displayContact(){
        for(Address data : contactList){
            System.out.println(data.toString());;
        }
        for(Map.Entry<String,ArrayList<Address>> m : mapForAddressBook.entrySet()){
            System.out.print(m.getKey()+ "   "+m.getValue());
        }
    }
    private int getContactIndex(String name) {//to check if contact exist or not
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
                    contactList.get(contactIndex).setAddressOf(addressOfPerson);
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
                    System.out.println("Enter Age");
                    String age = scanner.next();
                    contactList.get(contactIndex).setAge(age);
                    break;
                case 10:
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

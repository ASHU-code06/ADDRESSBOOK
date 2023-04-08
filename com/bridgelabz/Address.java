package com.bridgelabz;

public class Address {
    public String contactId;
    private String firstName;
    private String lastName ;
    private String age ;
    private String addressOf;
    private String city;
    private String state ;
    private String zip;
    private String phoneNumber;
    private String email;


    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getAddressOf() {
        return addressOf;
    }

    public void setAddressOf(String addressOf) {
        this.addressOf = addressOf;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address(){
        //default constructor
    }
    public Address(String firstName, String lastName, String age , String addressOf, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.addressOf = addressOf;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressOfPerson() {
        return addressOf;
    }

    public void setAddressOfPerson(String addressOf) {
        this.addressOf = addressOf;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
       return firstName+" "+lastName+"\n"+addressOf+"\n"+city+"\n"+state+" "+zip+"\n"+phoneNumber+"\n"+email;


    }
    public void display(){
        System.out.println("\n First Name : " + firstName + "\n Last Name : " + lastName + "\n Address : " + addressOf
                + "\n Email : " + email + "\n Phone No : " + phoneNumber + "\n Zip Code : " + zip + "\n City : " + city
                + "\n State : " + state);
        System.out.println("  ");
    }

}

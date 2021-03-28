/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagement;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

/**
 *
 * @author makhanyi
 */
public class PersonalDetails {
  
    private String email, country, state, streetAddress, gender;
    private String name, phoneNum;
    private String dob;

    public PersonalDetails() {
        this.email = "";
        this.country = "";
        this.state = "";
        this.streetAddress = "";
        this.gender = "";
        this.name = "";
        this.phoneNum = "";
        this.dob= "";
                }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getDob() {
        return dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void RetrieveDetails(String email, String country, String state, String streetAddress, String gender, String name, String phoneNum, Date dob) {
        System.out.println(name+"'s details are listed below: ");
        System.out.println("Name & Surname\t: "+name);
        System.out.println("Gender\t: "+gender);
        System.out.println("Date of birth\t: "+dob);
        System.out.println("Mobile,office and Home phone number(separated by common)\t: "+phoneNum);
        System.out.println("Country\t: "+country);
        System.out.println("State\t: "+state);
        System.out.println("Street Address\t: "+streetAddress);
         System.out.println("Email address and alternative email(separated by common)\t: "+email);
        
    }
    
   
    
}
    
    
    
    
    


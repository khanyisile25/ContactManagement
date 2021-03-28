/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagement;

import java.util.*;
import java.text.*;



/**
 *
 * @author makhanyi
 */
public class ContactManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int counter=0;
        String[] email={null}, country={null}, state={null}, streetAddress={null}, gender={null};
        String[] name={null};
        String[] phoneNum={null}, physicalAddress={null};
        Date[] dob={null};
        PersonalDetails myObj = new PersonalDetails();
        Scanner input= new Scanner(System.in);
        boolean islooping =true;
        while(islooping==true){
            
            System.out.println("Please enter your full name");
            name[counter]=input.nextLine();
            
             System.out.println("Please enter your gender(M for male or F for female)");
             gender[counter]=input.nextLine();
                
      SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
      Scanner sc = new Scanner(System.in);
 
      
      System.out.print("Enter date of birth: ");
      String str = sc.nextLine();
 
      try {
         Date date = sdf.parse(str); 
 
         sdf = new SimpleDateFormat("EEE, d MMM yyyy");
         System.out.println("Date: " + sdf.format(date));
      } catch (ParseException e) { 
         System.out.println("Parse Exception");
      }
            
            //dob[counter]=new Date(userDob);
            
       
        
            
            switch(gender[counter]){
                case "M":
                    gender[counter]="Male";
                    break;
                case "m":
                    gender[counter]="Male";
                    break;
                case "f":
                    gender[counter]="Female";
                    break;
                case "F":
                    gender[counter]="Female";
                    break;
                default:
                    gender[counter]="No gender selected";
                    break;
            }
            
            
            System.out.println("Please enter your country of origin");
            country[counter]=input.nextLine();
            
            System.out.println("Please enter your state");
            state[counter]=input.nextLine();
            
            System.out.println("Please enter your street address");
            streetAddress[counter]=input.nextLine();
            
            physicalAddress[counter]=country[counter]+", "+state[counter]+", "+streetAddress[counter];
            
            System.out.println("Please enter your cellphone number");
            phoneNum[counter]=input.nextLine();
            System.out.println("do you have an alternative number? (YES OR NO)");
            String response=input.nextLine();
               
            switch(response){
                case "YES":
                    System.out.println("Enter your office/home number ");
                    phoneNum[counter]=phoneNum[counter]+" "+input.nextLine();
                    break;
                case "yes":
                    System.out.println("Enter your office/home number ");
                    phoneNum[counter]=phoneNum[counter]+" "+input.nextLine();
                    break;
                default:
                    break;
            }
            
            System.out.println("Please enter your email address: ");
            
            email[counter]=input.nextLine();
            
            System.out.println("do you have an alternative email address? (YES OR NO)");
            response=input.nextLine();
               
            switch(response){
                case "YES":
                    System.out.println("Enter your alternative email address: ");
                    email[counter]=email[counter]+" "+input.nextLine();
                    break;
                case "yes":
                    System.out.println("Enter your alternative address: ");
                    email[counter]=email[counter]+" "+input.nextLine();
                    break;
                default:
                    break;
            }    
            
            System.out.println("Do wish to continue (true or false)");
            islooping=input.nextBoolean();
            
            counter++; 
        }
        
        for (int i = 0; i <= counter-1; i++) {    
            myObj.RetrieveDetails(email[i], country[i], state[i], streetAddress[i], gender[i], name[i], phoneNum[i], dob[i]);
        }
    }
   
}    

        
        
        
        
        
        
    
    


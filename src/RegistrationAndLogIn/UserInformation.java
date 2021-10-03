package RegistrationAndLogIn;

import java.util.Scanner;

public class UserInformation {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    String setPassword;

    Scanner input = new Scanner(System.in);
    public UserInformation()
    {

    }
    public UserInformation(String lastName,String setPassword)
    {

        this.lastName = lastName;
        this.setPassword = setPassword;
    }
    public UserInformation(String firstName , String lastName,String phoneNumber,String email , String setPassword)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.setPassword = setPassword;

    }
    public  void takeInfo()
    {
        System.out.println("Enter your First name : ");
        firstName = input.nextLine();
        System.out.println("Enter your Last name : ");
        lastName = input.nextLine();
        System.out.println("Enter your Phone Number : ");
        phoneNumber= input.nextLine();
        System.out.println("Enter your email id  : ");
        email = input.nextLine();
        System.out.println("Set your Password : ");
         setPassword = input.nextLine();

    }

    public  void showInfo()
    {
        System.out.println("***************************************************************");
        System.out.println("Your First name : "+firstName);

        System.out.println("Your Last name : "+lastName);

        System.out.println("Your Phone Number : "+phoneNumber);

        System.out.println("Your email id  : "+email);

        System.out.println("Your Password : "+setPassword);

        System.out.println("***************************************************************");
    }
}

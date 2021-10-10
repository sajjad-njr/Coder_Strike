package Main;
import RegistrationAndLogIn.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.security.PublicKey;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String  firstName,lastName,setPassword;
        Scanner input = new Scanner(System.in);

        UserInformation obj = new UserInformation();
        FilePutUserData obj2 = new FilePutUserData();


        System.out.println("\t\t\tWelcome to E A S Y SHOP\n\n\n\n");

        System.out.println("\t\t\t1. Registration ");
        System.out.println("\t\t\t2. Log In");

        int data;
        data = input.nextInt();

        if(data == 1)
        {
            obj.takeInfo();
        }
        else if(data == 2) //error found here log in take only 2 part
        {
            System.out.println("Enter your First Last Password ");
            firstName = input.nextLine();
            lastName = input.nextLine();
            setPassword = input.nextLine();

           // LogIn(firstName, lastName , setPassword);
            System.out.println("\n\n\nCongrats");
        }
        else
        {
            System.out.println("wrong bro ");
        }
   }

}


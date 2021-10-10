package Main;

import RegistrationAndLogIn.*;
import RegistrationAndLogIn.ReadDataFroFromFile;
import java.util.Scanner;

/*
 import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.security.PublicKey;
 */

public class Main {

    public static void main(String[] args) {

       // String  firstName,lastName,setPassword;
        Scanner input = new Scanner(System.in);

        UserInformation obj = new UserInformation();
        FilePutUserData obj2 = new FilePutUserData();

        LogIn obj3 = new LogIn();

        ReadDataFroFromFile ob23 = new ReadDataFroFromFile();
       // ReadDataFroFromFile objhhjh4 = new ReadDataFroFromFile();
        //ReadDataFroFromFile jfdasj = new ReadDataFroFromFile();

        System.out.println("\n\t\t\t*****************************");
        System.out.println("\t\t\t---\tWelcome to E A S Y SHOP\n");
        System.out.println("\t\t\t---\t1. Registration \n");
        System.out.println("\t\t\t---\t2. Log In\n");
        System.out.print("\t\t\t---\tChoice Option : ");


        int data;
        data = input.nextInt();

        if(data == 1)
        {
            obj2.takeInfo();

            System.out.println("Now Log In and go Forward ");

            if(obj3.takeDataFromFile()) //that means true
            {
                System.out.println("Go Forward ");
            }

        }
        else if(data == 2) //error found here log in take only 2 part
        {
            if(obj3.takeDataFromFile()) //that means true
            {
                System.out.println("Go Forward ");
            }
            else
            {
                System.out.println("Here we are for you !!!");
                //System.out.println("Enter your first name & last name to all bio data");
                String firstName1, lastName1;
                firstName1 = input.nextLine();
                System.out.println("Enter your Set Up First Name : ");
                firstName1 = input.nextLine();

                System.out.println("Enter your Set Up  Last Name : ");
                lastName1 = input.nextLine();

                ob23.outputDataFromFile(firstName1,lastName1);
                obj3.takeDataFromFile();
            }

        }
        else
        {
            System.out.println("\t\t\tWrong Choice ");
        }
   }

}


package Main;
import RegistrationAndLogIn.FilePutUserData;
import RegistrationAndLogIn.LogIn;
import RegistrationAndLogIn.ReadDataFroFromFile;
import RegistrationAndLogIn.UserInformation;
import electronic_part.*;


import java.util.Scanner;

//This is the class here all Method activities add
public class Submain {
    Scanner input = new Scanner(System.in);

    UserInformation obj = new UserInformation();
    FilePutUserData obj2 = new FilePutUserData();
    LogIn obj3 = new LogIn();
    ReadDataFroFromFile ob23 = new ReadDataFroFromFile();

    ElectronicsMainByMethod objElectronics = new ElectronicsMainByMethod();

    Submain() {

    }

    public void registrationFrom()
    {
        obj2.takeInfo();

        System.out.println("\n\tNow Log In and go Forward ");

        if(obj3.takeDataFromFile()) //that means true
        {
            System.out.println("\n\tGo Forward ");
        }
    }
    public void logIn()
    {
        if(obj3.takeDataFromFile()) //that means true
        {
            System.out.println("\n\tGo Forward ");
            catagoriesPart();

        }
        else{
            System.out.println("\n\tYou may forget your Password ! Here we are for you !!!");
            System.out.println("\n\tPress '1' to show your Bio data from File ");
            System.out.println("\n\tPress '2' to  Log In again ");

            int var = input.nextInt();
            if(var == 1)
            {
                //System.out.println("Enter your first name & last name to all bio data");
                String firstName1, lastName1;
                firstName1 = input.nextLine();
                System.out.print("\n\tEnter your Set Up First Name : ");
                firstName1 = input.nextLine();

                System.out.print("\n\tEnter your Set Up  Last Name : ");
                lastName1 = input.nextLine();

                ob23.outputDataFromFile(firstName1,lastName1);
                System.out.println("\n\tNow Enter your correct information ");
                logIn();
            }
            else if(var == 2) logIn();
            else System.out.println("\n\tWrong Input ");

        }
    }

    public void catagoriesPart()
    {
        System.out.println("\n\t1.Electronics \n\t2.Grocery\n\tFurniture\n\tClothes\n\tExit");
        int var;
        //this loop also like infinity true Loop . so far work good
        for(int ii = 0 ; (var = input.nextInt())>0; ii++)
        {
            switch (var)
            {
                case 1:
                    System.out.println("\n\tWelcome to electronics Part");
                    //allAboutElectronics();
                    objElectronics.ElectronicsAllMedtod();
                    break;
                case 2:
                    System.out.println("\n\tWelcome to Grocery Part");
                    break;
                case 3:
                    System.out.println("\n\tWelcome to Furniture Part");
                    break;
                case 4:
                    System.out.println("\n\tWelcome to Cloths Part");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("\n\tBreak");
            }

        }

    }

    public void allSubMainParts()
    {

        System.out.println("\n\t1.Electronics\n\t2.Grocery\n\t3.Furniture\n\t4.Clothes\n\t5.Exit");
        System.out.println("\n\tChoice Option : ");

        int var1 = input.nextInt();

        if(var1 == 1)
        {
            System.out.println("\n\tWelcome to electronics Part");
            //allAboutElectronics();
            objElectronics.ElectronicsAllMedtod();
        }
        else if(var1 == 2)
        {
            System.out.println("\n\t\t\t\tWelcome to Grocery Part");
        }
        else if(var1 == 3)
        {
            System.out.println("\n\t\t\t\tWelcome to Furniture Part");
        }
        else if(var1 == 4)
        {
            System.out.println("\n\t\t\t\tWelcome to Cloths Part");
        }
        else if(var1 == 5)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Wrong Choice ");
            allSubMainParts();
        }


    }
    public void backPreviousFromElectronics()
    {
        System.out.println("\n\t'1' for back previous part");
        int x;
        x = input.nextInt();
        if(x == 1)
            catagoriesPart();
        else
        {
             backPreviousFromElectronics();
        }
    }
    public void  allAboutElectronics()
    {
        //System.out.println("q\ng\ngd\ngf\ngfd\nfng\ngfd\nfdn\ngdg\ngf");

        backPreviousFromElectronics();

    }


    //that actual call form main
    public void subMainPart()
    {

        System.out.println("\n\t*****************************");
        System.out.println("\t---Welcome to E A S Y SHOP\n");
        System.out.println("\t---1. Registration \n");
        System.out.println("\t---2. Log In\n");
        System.out.print("\t---Choice Option : ");

        int data;
        data = input.nextInt();

        if(data == 1)
        {
            registrationFrom();

        }
        else if(data == 2) //error found here log in take only 2 part
        {
            logIn();

        }else
        {
            System.out.println("\n\tWrong Choice ");
            subMainPart();
        }

    }


}

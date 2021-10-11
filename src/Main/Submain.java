package Main;
import RegistrationAndLogIn.FilePutUserData;
import RegistrationAndLogIn.LogIn;
import RegistrationAndLogIn.ReadDataFroFromFile;
import RegistrationAndLogIn.UserInformation;


import java.util.Scanner;

//This is the class here all Method activities add
public class Submain {
    Scanner input = new Scanner(System.in);

    UserInformation obj = new UserInformation();
    FilePutUserData obj2 = new FilePutUserData();
    LogIn obj3 = new LogIn();
    ReadDataFroFromFile ob23 = new ReadDataFroFromFile();

    Submain() {

    }
    public  void registrationFrom()
    {
        obj2.takeInfo();

        System.out.println("\t\tNow Log In and go Forward ");

        if(obj3.takeDataFromFile()) //that means true
        {
            System.out.println("\t\tGo Forward ");
        }
    }
    public void logIn()
    {
        if(obj3.takeDataFromFile()) //that means true
        {
            System.out.println("\t\t\t\tGo Forward ");
            catagoriesPart();

        }
        else{
            System.out.println("\t\t\t\tYou forget your Password ! Here we are for you !!!");

            System.out.println("\t\t\t\tPress '1' to show your Bio data from File ");
            System.out.println("\t\t\t\tPress '2' to  Log In again ");

            int var = input.nextInt();
            if(var == 1)
            {
                //System.out.println("Enter your first name & last name to all bio data");
                String firstName1, lastName1;
                firstName1 = input.nextLine();
                System.out.print("\t\t\t\tEnter your Set Up First Name : ");
                firstName1 = input.nextLine();

                System.out.print("\t\t\t\tEnter your Set Up  Last Name : ");
                lastName1 = input.nextLine();

                ob23.outputDataFromFile(firstName1,lastName1);
                System.out.println("\t\t\t\tNow Enter your correct information ");
                logIn();
            }
            else if(var == 2) logIn();
            else System.out.println("\t\t\t\tWrong Input ");

        }
    }

    public void catagoriesPart()
    {
        System.out.println("\n\t\t\t\t1.Electronics\n\t\t\t\t2.Grocery\n\t\t\t\tFurniture\n\t\t\t\tOthers\n\t\t\t\tExit");
        int var;
        //this loop also like infinity true Loop . so far work good
        for(int ii = 0 ; (var = input.nextInt())>0; ii++)
        {
            switch (var)
            {
                case 1:
                    System.out.println("\n\t\t\t\tWelcome to electronics Part");
                    allAboutElectronics();

                    break;
                case 2:
                    System.out.println("\n\t\t\t\tWelcome to Grocery Part");
                    break;
                case 3:
                    System.out.println("\n\t\t\t\tWelcome to Furniture Part");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\n\n\tBreak");
            }

        }

    }

    public void  allAboutElectronics()
    {
        //System.out.println("q\ng\ngd\ngf\ngfd\nfng\ngfd\nfdn\ngdg\ngf");
    }


    //that actual call form main
    public void subMainPart()
    {

        System.out.println("\n\t\t\t*****************************");
        System.out.println("\t\t\t---\tWelcome to E A S Y SHOP\n");
        System.out.println("\t\t\t---\t1. Registration \n");
        System.out.println("\t\t\t---\t2. Log In\n");
        System.out.print("\t\t\t---\tChoice Option : ");

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
            System.out.println("\t\tWrong Choice ");
            subMainPart();
        }

    }


}

package Main;
import RegistrationAndLogIn.FilePutUserData;
import RegistrationAndLogIn.LogIn;
import RegistrationAndLogIn.ReadDataFroFromFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner;

//This is the class here all Method activities add

public class Submain extends AllMethodsCombine{
    Scanner input = new Scanner(System.in);

    //UserInformation obj = new UserInformation();
    FilePutUserData obj2 = new FilePutUserData();
    LogIn obj3 = new LogIn();
    ReadDataFroFromFile ob23 = new ReadDataFroFromFile();

   // ElectronicsMainByMethod objElectronics = new ElectronicsMainByMethod();


   public Submain() {

    }

    public void registrationFrom()
    {
        obj2.takeInfo();

        System.out.println("\n\tNow Log In and go Forward ");
        logIn();

    }
    public void logIn()
    {
        if(obj3.takeDataFromFile()) //that means true
        {
            System.out.print("\n\t---------------");
            System.out.print("\t   Go Forward  ");
            System.out.print("\t---------------");
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
                System.out.println("\n\tNow Enter your correct information \n");
                logIn();
            }
            else if(var == 2) logIn();
            else System.out.println("\n\tWrong Input ");

        }
    }

    //so called all functions technacally call here after log in
    public void catagoriesPart()
    {
        System.out.println("\n\t1. Grocery \n\t2. Cloths\n\t3. Electronics\n\t4. Furniture\n\t5. Payment \n\t6. Exit\n");

        System.out.println("\t---------------------------------\n");
        int var;
        System.out.print("\tChoice an option : ");
        //this loop also like infinity true Loop . so far work good
        for(int ii = 0 ; (var = input.nextInt())>0; ii++)
        {
            switch (var)
            {
                case 1:
                    System.out.println("\n\t----------------------------");
                    System.out.println("\t         Grocery Part       ");
                    System.out.println("\t----------------------------");
                    //System.out.println(" Item Count : " + itemCount);
                    GroMain();

                    break;
                case 2:
                    System.out.println("\n\t----------------------------");
                    System.out.println("\t         Cloths Part"         );
                    System.out.println("\t----------------------------");
                    //System.out.println(" Item Count : " + itemCount);
                    clotheAllMethod();
                    break;
                case 3:
                    System.out.println("\n\t----------------------------");
                    System.out.println("\t       Electronics Part       ");
                    System.out.println("\t----------------------------");
                   // System.out.println(" Item Count : " + itemCount);
                    electronicsAllMedtod();
                    break;
                case 4:
                    System.out.println("\n\t----------------------------");
                    System.out.println("\t         Furniture Part"      );
                    System.out.println("\t----------------------------");
                    furintureMain();

                    break;
                case 5:
                    System.out.println("\n\t----------------------------");
                    System.out.println("\t        P A Y M E N T       ");
                    System.out.println("\t----------------------------");

                    paymentMake();
                case 6:
                    System.out.println("\n\t----------------------------");
                    System.out.println("\t       T H A N K   Y O U      ");
                    System.out.println("\t----------------------------  ");
                    System.exit(0);

                default:
                    System.out.println("\n\t wrong choice ");
            }

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

    //that actual call form main
    public void subMainPart()
    {

        System.out.println("\n\t*****************************");
        System.out.println("\t-------------------------------");
        System.out.println("\t---Welcome to E A S Y SHOP\n");
        System.out.println("\t---1. Registration \n");
        System.out.println("\t---2. Log In\n");
        System.out.println("\t---3. About Work\n");
        System.out.println("\t---4. Exit \n");
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

        }
        else if(data == 3)
        {
            aboutWork();
            System.out.println("\tEnter '1' for Back : ");
            int c = input.nextInt();
            if(c == 1)
            {
                subMainPart();
            }
        }
        else if(data == 4)
        {
            System.out.println("\n\t----------------------------");
            System.out.println("\t       T H A N K   Y O U      ");
            System.out.println("\t----------------------------  ");
            System.exit(0);
        }
        else
        {
            System.out.println("\n\tWrong Choice ");
            subMainPart();
        }

    }

    void aboutWork()
    {
        Scanner input = new Scanner(System.in);
        try {

            File myObj = new File("aboutUs.txt");

            try (Scanner myReader = new Scanner(myObj)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    //ar[i++] = data;
                    System.out.println(data);
                } }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }
    void paymentMake()
    {
        if(itemCount == 0)
        {
            System.out.println("\n\tYou did not buy anything yet .!!");

            System.out.println("\n\tIf we want to buy daily goods press '1'");
            System.out.println("\tShow Pre Order  ITEM press '2'\n");
            System.out.print("\tChoice an Option :  ");


            int var1 = input.nextInt();

            if(var1 == 1)
            {
                catagoriesPart();
            }
            else if(var1 == 2)
            {
                preOrder();
                backCatagories();
            }

        }
        else
        {
            takenItemPrint();
            clearPayment();
            backCatagories();
        }

    }

    void backCatagories()
    {
        System.out.println("'1' For back : ");
        System.out.print("\tChoice an option : ");
        int a = input.nextInt();
        if(a==1)
        {
            catagoriesPart();
        }
        else
        {
            backCatagories();
        }
    }
    public void clearPayment()
    {

        System.out.println("\t---------------------------------\n");
        System.out.println("\n\t1. Self Delivery\t2. Home Delivery");
        System.out.print("\tFor Payment Choice Option = ");

        int del = input.nextInt();

        //SELF DELIVERY
        if(del == 1)
        {
            paymentCardOrMobile();
            backClearPayment();
        }
        else if(del == 2)
        {
            System.out.print("\n\tEnter your House Distance : ");
            int dis = input.nextInt();

            totalCost += (dis * 100);

            System.out.println("\tTotal Cost "+totalCost);
            paymentCardOrMobile();
            backClearPayment();
        }


        else
        {
            System.out.println("\n\tWrong Choice ");
            clearPayment();
        }

    }
    void backClearPayment()
    {

        System.out.println("\n");
        System.out.print("\t'0' for Back\n");
        System.out.print("\tChoice Option = ");
        int card = input.nextInt();
        if(card == 0)
        {

            catagoriesPart();
        }
        else
        {
            backClearPayment();
        }
    }

    void paymentCardOrMobile()
    {
        System.out.println("\n\t1. card \t2. Mobile Banking\n");
//       System.out.println("\t*********************************\n");
        System.out.println("\t---------------------------------\n");
        System.out.print("\tFor Payment Choice Option = ");
        int card = input.nextInt();

        if(card == 1)
        {
            System.out.println();

            System.out.print("\n\tEnter Your Card Number : ");
            int visa = input.nextInt();
            System.out.println("\tThank you for your Payment ");
        }
        else if(card == 2)
        {
            System.out.println();

            System.out.print("\n\t1. B - K A S \n\t2. N A G A D \n\t3. R O C K E T\n");
            System.out.println("\t------------------------------------------------------\n");
            System.out.print("\tFor Payment Choice Option : ");

            int visa = input.nextInt();
            if(visa == 1)
            {
                System.out.print("\tEnter your B-kas Number = ");
                int bkas = input.nextInt();
                System.out.print("\tEnter your  PIN  Number = ");
                int bkasPin = input.nextInt();
                System.out.println("\nThank you for your Payment ");
            }
            else if(visa == 2)
            {
                System.out.print("\tEnter your  Nagad Number =  ");
                int bkas = input.nextInt();
                System.out.print("\tEnter your  PIN  Number : ");
                int bkasPin = input.nextInt();
                System.out.print("\tThank you for your Payment  ");
            }
            else if(visa == 3)
            {
                System.out.print("\tEnter your  Rocket Number ");
                int bkas = input.nextInt();
                System.out.print("\tEnter your  PIN  Number ");
                int bkasPin = input.nextInt();
                System.out.print("\nThank you for your Payment ");
            }

        }
    }

}

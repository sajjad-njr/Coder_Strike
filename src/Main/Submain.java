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

        System.out.println("\n\tNow Log In and see more features ");
        logIn();

    }
    public void logIn()
    {
        if(obj3.takeDataFromFile()) //that means true
        {
//            System.out.print("\n\t---------------");
//            System.out.print("\t   Go Forward  ");
//            System.out.print("\t---------------");
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
        System.out.println("\n\t-----Our project cetagories-----\n");
        System.out.println("\n\t1. Electronics \n\t2. Cloths\n\t3. Grocery\n\t4. Furniture\n\t5. Payment \n\t6. Exit\n");

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
                    System.out.println("\t         Electronics Part       ");
                    System.out.println("\t----------------------------");
                    //System.out.println(" Item Count : " + itemCount);
                    electronicsAllMedtod();


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
                    System.out.println("\t      Grocery Part       ");
                    System.out.println("\t----------------------------");
                    GroMain();
                   // System.out.println(" Item Count : " + itemCount);

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

        //System.out.println("\n\t*****************************");
        System.out.println("\t-------------------------------\n");
        System.out.println("\t-------------------------------\n");
        System.out.println("\n\t---Welcome to E A S Y SHOP\n");
        System.out.println("\t---1. Registration \n");
        System.out.println("\t---2. Log In\n");
        System.out.println("\t---3. About Work\n");
        System.out.println("\t---4. Exit \n");
        System.out.print("\t---Choice Option : ");

        int data;
        data = input.nextInt();

        if(data == 1)
        {
            welcomeRegMessage();
            registrationFrom();

        }
        else if(data == 2) //error found here log in take only 2 part
        {
            logIn();

        }
        else if(data == 3)
        {
            aboutWork();
            backtoAbout();
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
        //case add

    }

    void welcomeRegMessage()
    {
        System.out.println("\n\t-------------Welcome to Easy Shop Family ----------------\n");
        System.out.println("\n\t--Very carefully enter you First and Last name ");
        System.out.println("\n\t--Both name together be your file name ");
        System.out.println("\n\t--Enter right address that help in further payment option ");
        System.out.println("\n\t--Remember your first name last name and Password for Log in ");
        System.out.println("\n\t------------------------------------------------------------------\n\n");
    }
    void backtoAbout()
    {
        System.out.print("\n\n\t'0' for Back : ");
        int c = input.nextInt();
        if(c == 0)
        {
            subMainPart();
        }
        else
        {
            backtoAbout();
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
            System.out.println("\n\t---You did not buy anything yet .!!");

            System.out.println("\n\t---If we want to buy daily goods press '1'");
            System.out.println("\t---Show Pre Order  ITEM press '2'\n");
            System.out.print("\t---Choice an Option :  ");


            int var1 = input.nextInt();

            if(var1 == 1)
            {
                catagoriesPart();
            }
            else if(var1 == 2)
            {
                preOrder();
                preOrderGiva();
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

    void preOrderGiva()
    {
        System.out.println("\t'0' for back \n");
        System.out.print("\tEnter Number of Item that You Want to Buy : ");
        item = input.nextInt();

        if(item == 0)catagoriesPart();
        else
        {
            for (int k = 0; k < item; k++) {
                System.out.println("\tEnter Code Numnber : ");
                int code = input.nextInt();
                if (code >= 1 && code <= 3)
                {
                    itemCode(code+281);
                }
                else
                {
                    System.out.println("\tOut of Range");
                }

            }
        }


    }
    void backCatagories()
    {
        System.out.println("\t'1' For back : ");
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

    // Payment Methods start  , Payment Either mobile banking or Card
    public void clearPayment()
    {

        System.out.println("\n\n\tChoice Delivery Option\n");
        System.out.println("\t---------------------------------");
        System.out.println("\n\t1. Self Delivery\t2. Home Delivery\n");
        System.out.print("\tEnter an Option = ");



        try {
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

        }catch (Exception e)
        {
            System.out.println("\tEnter should an Integer Number\n");
        }


    }
    void backClearPayment()
    {

        System.out.println("\n");
        System.out.print("\t'0' for Back\n");
        System.out.print("\tChoice Option = ");

       try {
           int card = input.nextInt();
           if(card == 0)
           {

               catagoriesPart();
           }
           else
           {
               backClearPayment();
           }
       }catch (Exception e)
       {
           System.out.println("\tEnter should an Integer Number \n");
       }


    }

    //Here All transection Occure . Like Payment methods are B-kas , nagad , Visa Card
    void paymentCardOrMobile()
    {
        System.out.println("\n\tFor Payment Choice below one Method");
        System.out.println("\n\t1. card \t2. Mobile Banking\n");
//       System.out.println("\t*********************************\n");
        System.out.println("\t---------------------------------\n");
        System.out.print("\tFor Payment Choice Option = ");
       int card ;

        try {
              card = input.nextInt();

            if(card == 1)
            {
                System.out.println();

                System.out.print("\n\tInsert Your Card Number : ");
                //int visa = input.nextInt();

                try {
                    String visa1 = input.nextLine();

                }catch (Exception e)
                {
                    System.out.println("\n\tCard number should be Int and String \n");
                }

                System.out.println("\n\t--------------------");
                System.out.println("\tPayment Successfull ");
                System.out.println("\t--------------------\n");

                System.out.println("\tThank you for your Payment ");
                totalCost = 0;
            }
            else if(card == 2)
            {
                System.out.println("\n\n");

                System.out.print("\n\t1. B - K A S \n\t2. N A G A D \n\t3. R O C K E T\n");
                System.out.println("\t------------------------------------------------------\n");
                System.out.print("\tFor Payment Choice Option : ");

                int visa = input.nextInt();
                if(visa == 1)
                {
                    System.out.print("\tEnter your B-kas Number = ");
                    // int bkas = input.nextInt();
                    try {
                        int bkas = input.nextInt();

                    }catch (Exception e)
                    {
                        System.out.println("\n\tPhone number should be INTEGER\n");
                    }
                    System.out.print("\tEnter your  PIN  Number = ");
                    //int bkasPin = input.nextInt();
                    try {
                        int bkasPin = input.nextInt();

                    }catch (Exception e)
                    {
                        System.out.println("\n\tPIN  Number should be INTEGER\n");
                    }
                    System.out.println("\n\t--------------------");
                    System.out.println("\tPayment Successfull ");
                    System.out.println("\t--------------------\n");

                    System.out.println("\tThank you for your Payment ");

                    totalCost = 0;

                }
                else if(visa == 2)
                {
                    System.out.print("\tEnter your  Nagad Number =  ");

                    try {
                        int  nagad = input.nextInt();

                    }catch (Exception e)
                    {
                        System.out.println("\n\tPhone number should be INTEGER\n");
                    }

                    System.out.print("\tEnter your  PIN  Number : ");

                    try {
                        int nagadPin = input.nextInt();

                    }catch (Exception e)
                    {
                        System.out.println("\n\tPIN number should be INTEGER\n");
                    }

                    System.out.println("\n\t--------------------");
                    System.out.println("\tPayment Successfull ");
                    System.out.println("\t--------------------\n");

                    System.out.println("\tThank you for your Payment ");
                    totalCost = 0;
                }
                else if(visa == 3)
                {
                    System.out.print("\tEnter your  Rocket Number ");
                    //int bkas = input.nextInt();
                    try {
                        int  nagad = input.nextInt();
                        System.out.println("\n\t--------------------");
                        System.out.println("\tPayment Successfull ");
                        System.out.println("\t--------------------\n");

                        System.out.println("\tThank you for your Payment ");

                    }catch (Exception e)
                    {
                        System.out.println("\n\tPhone number should be INTEGER\n");
                    }


                    System.out.print("\tEnter your  PIN  Number ");
                    //int bkasPin = input.nextInt();

                    try {
                        int rocketPin = input.nextInt();
                        System.out.println("\n\t--------------------");
                        System.out.println("\tPayment Successfull ");
                        System.out.println("\t--------------------\n");

                        System.out.println("\tThank you for your Payment ");

                    }catch (Exception e)
                    {
                        System.out.println("\n\tPIN number should be INTEGER\n");
                    }

                    totalCost = 0;
                }

            }

        }catch (Exception e)
        {
            System.out.println("\tEnter should an Integer Number\n");
        }


    }

}

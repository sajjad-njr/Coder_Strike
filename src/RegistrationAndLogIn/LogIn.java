package RegistrationAndLogIn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.security.PublicKey;
import java.util.Scanner;


public class LogIn extends FilePutUserData {

    Scanner input = new Scanner(System.in);

    public boolean takeDataFromFile() {
        String firstName, lastName, setPass;
        System.out.print("\n\t Enter your Set Up First Name : ");
        firstName = input.nextLine();

        System.out.print("\n\t Enter your Set Up  Last Name : ");
        lastName = input.nextLine();
        System.out.print("\n\t Enter your Set Up  Pass : ");
        setPass = input.nextLine();


         String dataCollect[] = new String[5];
        int ii = 0;
        File myObj = new File(firstName + lastName + ".txt");

        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dataCollect[ii++] = data;
                //System.out.println(data);
            }
        } catch(FileNotFoundException e)
        {
            System.out.println("\n\tData Missing From File ");
        }
//
//        for(int i = 0 ;i < dataCollect.length; i++)
//        {
//            System.out.println(" "+dataCollect[i]);
//        }
        if(firstName.equals(dataCollect[0]) && setPass.equals( dataCollect[4] ))
        {
            System.out.println("\n\n\t*****************************");
            System.out.println("\t       Log in Successful         ");
            System.out.println("\t-----------------------------");
            return true;
        }
        else return false;
    }


    public static void dataKeepFromFile(String firstName, String lastName , String setPassword)
    {
        String arrName[] = new String[5];
        int i = 0;
        File myObj = new File(firstName + lastName + ".txt");
        Scanner input = new Scanner(System.in);
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                arrName[i++] = data;
                //System.out.println(data);
            }

            if(firstName.equals(arrName[0]) && setPassword.equals( arrName[4] ))
            {
                System.out.println("\n\t       Log in Successful         ");
                System.out.println("\t-----------------------------\n");
            }
            else
            {
                //Scanner input = new Scanner(System.in);
                System.out.println("\n\t Password wrong ");
                int a;
                System.out.println("\n\t Enter '1' to show your data ");
                System.out.print("n\t Choice an Option : ");
                a = input.nextInt();
                if(a == 1)
                {

                    File myObj2 = new File(firstName + lastName + ".txt");
                    try (Scanner myReaderData = new Scanner(myObj2)) {
                        while (myReaderData.hasNextLine()) {
                            String data = myReader.nextLine();

                            System.out.println(data);
                        }

                    } catch(
                            FileNotFoundException e)
                    {
                        System.out.println("\n\t Data Missing From File ");
                    }
                }
                else
                {
                    System.out.println("\n\t wrong input");
                }

            }

        } catch(FileNotFoundException e)
        {
            //System.out.println("Data Missing From File ");
            e.printStackTrace();
        }




    }
}

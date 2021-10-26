package RegistrationAndLogIn;
import Main.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FilePutUserData extends UserInformation{

    public FilePutUserData()
    {
        super();
    }

    //file upload data

    @Override
    public void takeInfo()
    {
        ReadDataFroFromFile ob3 = new ReadDataFroFromFile();
        LogIn obj33 = new LogIn();
        Submain obj44 = new Submain();

        try{
            // PrintWriter pw = new PrintWriter(new FileWriter("UserBioData.txt"));


            System.out.print("\n\tEnter your First name : ");
            firstName = input.nextLine();

            System.out.print("\n\tEnter your Last name : ");
            lastName = input.nextLine();

            System.out.print("\n\tEnter your Phone Number : ");
            phoneNumber= input.nextLine();

            System.out.print("\n\tEnter your email id  : ");
            email = input.nextLine();

            System.out.print("\n\tSet your Password : ");
            setPassword = input.nextLine();
            //data show directly from control input
            showInfo( firstName,lastName,phoneNumber , email , setPassword);
            // Set from file
            fileInputUserData(firstName,lastName,phoneNumber , email , setPassword);
            //LogIn.dataKeepFromFile(firstName,lastName,setPassword);
            System.out.println("\n\t'1' for show set up data\n\t'2' for log in ");
            System.out.print("\n\tChoice an Option : ");
            int n;
            n = input.nextInt();
            if(n ==  1)
                ob3.outputDataFromFile(firstName,lastName);//data show direct from file
            else if(n == 2)
            {
                //LogIn.dataKeepFromFile(firstName,lastName,setPassword);
               // System.out.println("Welcome again");
                if(obj33.takeDataFromFile()) //that means true
                {
                    System.out.println("\n\tGo Forward ");
                    obj44.catagoriesPart();

                }
            }
            else
                System.out.println("\n\tWrong Choice ");
            //sucessfully work Alhmadullilah


        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
    //data show direct from console Input

    public void showInfo(String firstName,String lastName,String phoneNumber , String email , String setPassword)
    {
        System.out.println("***************************************************************");
        System.out.println("\n\tYour First name : "+firstName);

        System.out.println("\n\tYour Last name : "+lastName);

        System.out.println("\n\tYour Phone Number : "+phoneNumber);

        System.out.println("\n\tYour email id  : "+email);

        System.out.println("\n\tYour Password : "+setPassword);

        System.out.println("***************************************************************");
    }

    public  void fileInputUserData(String firstName,String lastName,String phoneNumber , String email , String setPassword){

        //here create new file that consist of user first and last name
        try(PrintWriter pw = new PrintWriter(new FileWriter(firstName+lastName+".txt"))) {
            //PrintWriter pw = new PrintWriter(new FileWriter("UserBioData.txt"));
            pw.write(firstName +"\n");
            pw.write(lastName +"\n");
            pw.write(phoneNumber +"\n");
            pw.write(email +"\n");
            pw.write(setPassword +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

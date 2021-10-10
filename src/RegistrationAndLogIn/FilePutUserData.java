package RegistrationAndLogIn;
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

        try{
            // PrintWriter pw = new PrintWriter(new FileWriter("UserBioData.txt"));


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

            //showInfo( firstName,lastName,phoneNumber , email , setPassword);
            // Set from file
            fileInputUserData(firstName,lastName,phoneNumber , email , setPassword);
            System.out.print("Enter '1' for show your set up Data : ");
            int n;
            n = input.nextInt();
            if(n ==  1)
                ob3.outputDataFromFile(firstName,lastName);//data show direct from file
            else
                System.out.println("Wrong Choice ");
            //sucessfully work Alhmadullilah


        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
    //data show direct from console Input
    @Override
    public void showInfo(String firstName,String lastName,String phoneNumber , String email , String setPassword)
    {
        System.out.println("***************************************************************");
        System.out.println("Your First name : "+firstName);

        System.out.println("Your Last name : "+lastName);

        System.out.println("Your Phone Number : "+phoneNumber);

        System.out.println("Your email id  : "+email);

        System.out.println("Your Password : "+setPassword);

        System.out.println("***************************************************************");
    }

    public  void fileInputUserData(String firstName,String lastName,String phoneNumber , String email , String setPassword){

        //here create new file that consist of user first and last name
        try(PrintWriter pw = new PrintWriter(new FileWriter(firstName+lastName+".txt"))) {
            //PrintWriter pw = new PrintWriter(new FileWriter("UserBioData.txt"));
            pw.write("First Name : "+firstName + "\n");
            pw.write("Last Name : "+lastName + "\n");
            pw.write("Phone Number : "+phoneNumber + "\n");
            pw.write("Email : "+email + "\n");
            pw.write("Password: "+setPassword + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

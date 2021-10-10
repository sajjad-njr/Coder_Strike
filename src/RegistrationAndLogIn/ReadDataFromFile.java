package RegistrationAndLogIn;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

class ReadDataFroFromFile implements  ReadDataInterface {
    @Override
    public void outputDataFromFile(String firstName, String lastName) {

        File myObj = new File(firstName + lastName + ".txt");

        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                System.out.println(data);
            }
        } catch(
    FileNotFoundException e)
    {
        System.out.println("Data Missing From File ");
    }
}
}

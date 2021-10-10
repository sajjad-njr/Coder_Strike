package RegistrationAndLogIn;

public class UserRegistration {
    public static void main(String[] args) {

        UserInformation obj = new UserInformation();
        FilePutUserData obj2 = new FilePutUserData();
       // obj2.takeInfo();
        //obj.showInfo();
      // obj2.showInfo();
       // obj2.showInfo("sajjad","sam","da","fas","fd");

        ReadDataFroFromFile ob3 = new ReadDataFroFromFile();
        //sucessfully work Alhmadullilah
        ob3.outputDataFromFile("Md","Sajjad");
    }
}

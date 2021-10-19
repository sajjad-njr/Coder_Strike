 
package electronic_part;

import java.util.Scanner;

 
public class ElectronicsMainByMethod {

    Scanner input = new Scanner(System.in);

    public ElectronicsMainByMethod() {

    }

    /* *************************************
     Computer Main
     ************************************** */
    public void computerMain() {
        // this is for computer main part

        Electronics.showList2(); // this method shows 1. computer sub part like i. laptop, ii. desktop, iii. accessories
        
        System.out.print("\tChoose another Option: ");
        int option3 = input.nextInt();

        if (option3 == 1) {
            laptopInformation();
            BackLaptoTocomputerMain();
        } 
        else if (option3 == 2) {
            desktopInformation();
            BackDesktopTocomputureMain();
        } 
        else if (option3 == 3) {
            accessoriesInformation();
            BackAccessoriesTocomputerMain();
        } 
        else if (option3 == 4) {
            ElectronicsAllMedtod();
        } 
        else {
            computerMain();
        }
    }

    public void BackLaptoTocomputerMain() {
        System.out.println("\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            computerMain(); //
        }
        else {
            BackLaptoTocomputerMain();
        }
    }

    public void laptopInformation() {
        // for Laptop Information

        Laptop laptop1 = new Laptop_subPart();
        laptop1.laptopName();

        Laptop_subPart2 laptop_ob1 = new Laptop_subPart2("1. HP Laptop- HP 15s-du3023TU Core i3 11th Gen 15.6\" FHD Laptop", "15s-du3023TU", "15.6\" FHD (1920 x 1080)", 52000, 4);
        Laptop_subPart2 laptop_ob2 = new Laptop_subPart2("2. Dell Laptop- Dell Vostro 14 5402 Core i5 11th Gen 14\" FHD Laptop", "Vostro 14 5402", "14.0-inch FHD (1920 x 1080)", 73000, 8);
        Laptop_subPart2 laptop_ob3 = new Laptop_subPart2("3. Apple MacBook- Apple MacBook Air 13\" Space Gray with Apple M1 Chip", "Apple M1 chip with 8-core CPU and 7-core GPU", "13.3-inch 2560x1600 LED-backlit Retina ", 10800, 8);
        Laptop_subPart2 laptop_ob4 = new Laptop_subPart2("4. Lenovo- IdeaPad Slim 3", "AMD Ryzen 3 3250U (2.6GHz up to 3.5GHz)", "15.6\" FHD (1920 x 1080)", 43000, 4);

        Laptop_subPart2[] laptopinfo = new Laptop_subPart2[]{laptop_ob1, laptop_ob2, laptop_ob3, laptop_ob4};

        for (int i = 0; i < laptopinfo.length; i++) {

            System.out.println("\tName: " + laptopinfo[i].name);
            System.out.println("\tModel: " + laptopinfo[i].model);
            System.out.println("\tDisply: " + laptopinfo[i].display);
            System.out.println("\tPrice: " + laptopinfo[i].price + "TK");
            System.out.println("\tRam: " + laptopinfo[i].ram + "GB");
            System.out.println("");
        }
    }

    public void BackDesktopTocomputureMain() {
        System.out.println("\tPress '1' For back.");      
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            computerMain(); //
        } else {
            BackDesktopTocomputureMain();
        }
    }

    public void desktopInformation() {
        //for desktop Information

        Desktop_Class1 desktop_name = new Desktop_Class2();
        desktop_name.desktopName(); // desktop name

        Desktop desktop_ob1 = new Desktop("1. Intel-PC- pc: Intel 11th Gen Core i5-11400 Rocket Lake Processor", " ASRock B560M Pro4 11th Gen M-ATX Motherboard", "14\" HD (1366x768) TN Display", 54500, 8);
        Desktop desktop_ob2 = new Desktop("2. Ryzen-PC- pc: AMD Athlon 3000G Processor with Radeon Graphics", " ASRock A320M-HDV R4.0 AMD Motherboard", "14\" (1920 x 1080) FHD Display", 22100, 4);
        Desktop desktop_ob3 = new Desktop("3. Intel Gaming PC- pc: ASRock B560 Pro4 10th and 11th Gen ATX Motherboard", " Intel 10th Gen Core i7-10700 Processor", "15.6\" HD (1366x768)Display", 112500, 8);
        Desktop desktop_ob4 = new Desktop("4. Ryzen Gaming PC- pc: Asrock B450M Pro4-F AMD Motherboard", " AMD Ryzen 7 3700X Processor", "14\" (1920 x 1080) FHD Display", 110500, 8);

        Desktop desktopinfo[] = new Desktop[]{desktop_ob1, desktop_ob2, desktop_ob3, desktop_ob4};

        for (int i = 0; i < desktopinfo.length; i++) {

            System.out.println("\tName: " + desktopinfo[i].name);
            System.out.println("\tModel: " + desktopinfo[i].model);
            System.out.println("\tDisply: " + desktopinfo[i].display);
            System.out.println("\tPrice: " + desktopinfo[i].price + "TK");
            System.out.println("\tRam: " + desktopinfo[i].ram + "GB");
            System.out.println("");
        }

    }

    /* *************************************
     Accessories Information  
     ************************************** */
    public void accessoriesInformation() {
        Accessories accessories = new AccessoriesInfo();
        accessories.displayAccessories();
    }

    public void BackAccessoriesTocomputerMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            computerMain(); 
        } else {
            BackAccessoriesTocomputerMain();
        }
    }

    /* *************************************
     mobile main
     ************************************** */
    public void mobileMain() {
        // this is for mobile main part

        MobileName mobileName = new MobileNameInfo();
        mobileName.mobileName(); //Mobile name such as samsung, xiaomi, i-phone, Google
       
        System.out.print("\tChoose another option: ");
        int choice = input.nextInt();

        if (choice == 1) {

            samsungInformation();
            BackSamsungtoTomobileMain();
        } else if (choice == 2) {

            xiaomiInformation();
            BackXiaomiTomobileMain();
        } else if (choice == 3) {
            iPhoneInformation();
            BackIPhoneTomobileMain();
        } else if (choice == 4) {
            googleInformation();
            BackGoogleTomobileMain();
        } else if (choice == 5) {
            ElectronicsAllMedtod();
        } else {
            mobileMain();
        }
    }

    public void samsungInformation() {
        MobileName samsung = new MobileNameInfo();
        samsung.samSung();

        Mobile samsung_ob1 = new Mobile("\t1. Samsung Galaxy M22", "M22", "6.4\"", 15000, 4);
        samsung_ob1.showDisplay();

        Mobile samsung_ob2 = new Mobile("\t2. Samsung Galaxy  M32 5G", "M32 5G", "6.5\"", 20000, 6);
        samsung_ob2.showDisplay();

        Mobile samsung_ob3 = new Mobile("\t3. Samsung Galaxy  A03s", "A03s", "6.5\"", 18000, 3);
        samsung_ob3.showDisplay();

        Mobile samsung_ob4 = new Mobile("\t4. Samsung Galaxy  A52s 5G", "A52s 5G", "6.5\"", 25000, 8);
        samsung_ob4.showDisplay();
    }

    public void BackSamsungtoTomobileMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        } else {
            BackSamsungtoTomobileMain();
        }
    }

    public void xiaomiInformation() {
        MobileName xiaomi = new MobileNameInfo();
        xiaomi.xiaomi();

        Mobile xiaomi_ob1 = new Mobile("\t1. Xiaomi Pad 5 Pro", "Pad 5 Pro", "6.6\"", 32000, 8);
        xiaomi_ob1.showDisplay();

        Mobile xiaomi_ob2 = new Mobile("\t2. Xiaomi Poco X3 GT", "Poco X3 GT", "6.\"", 32000, 6);
        xiaomi_ob2.showDisplay();

        Mobile xiaomi_ob3 = new Mobile("\t3. Xiaomi Poco M3 Pro 5G", "Poco M3 Pro 5G", "6.5\"", 27000, 6);
        xiaomi_ob3.showDisplay();

        Mobile xiaomi_ob4 = new Mobile("\t4. Redmi Note 10 Pro (China)", "Note 10 Pro (China)", "6.6\"", 34000, 8);
        xiaomi_ob4.showDisplay();
    }

    public void BackXiaomiTomobileMain() {
        System.out.println("\n\tPress '1' For back.");
       
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        } else {
            BackXiaomiTomobileMain();
        }
    }

    public void iPhoneInformation() {
        MobileName iPhone = new MobileNameInfo();
        iPhone.iphone();

        Mobile iPhone_ob1 = new Mobile("\t1. Apple iPhone 13 Pro", "13 Pro", "6.1\"", 82000, 6);
        iPhone_ob1.showDisplay();

        Mobile iPhone_ob2 = new Mobile("\t2. Apple iPad mini (2021)", "mini (2021)", "6.1\"", 42000, 4);
        iPhone_ob2.showDisplay();

        Mobile iPhone_ob3 = new Mobile("\t3. Apple iPad 10.2 (2021)", "10.2 (2021)", "6.2\"", 57000, 6);
        iPhone_ob3.showDisplay();

        Mobile iPhone_ob4 = new Mobile("\t4. Apple iPhone 12 Pro Max", "12 Pro Max", "6.1\"", 72000, 8);
        iPhone_ob4.showDisplay();
    }

    public void BackIPhoneTomobileMain() {
        System.out.println("\n\tPress '1' For back.");
        
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        }
        else {
            BackIPhoneTomobileMain();
        }
    }

    public void googleInformation() {
        MobileName google = new MobileNameInfo();
        google.google();

        Mobile google_ob1 = new Mobile("\t1. Google Pixel 5a 5G", "5a 5G", "6.3\"", 23000, 6);
        google_ob1.showDisplay();

        Mobile google_ob2 = new Mobile("\t2. Google Pixel 4a 5G", "4a 5G", "6.3\"", 21000, 6);
        google_ob2.showDisplay();

        Mobile iPhone_ob3 = new Mobile("\t3.  Google Pixel 3a XL", "3a XL", "6.0\"", 1800, 4);
        iPhone_ob3.showDisplay();

        Mobile google_ob4 = new Mobile("\t4. Google Pixel 4", "Pixel 4", "6.3\"", 26000, 6);
        google_ob4.showDisplay();
    }

    public void BackGoogleTomobileMain() {
        System.out.println("\n\tPress '1' For back.");
        
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        }
        else {
            BackGoogleTomobileMain();
        }
    }

    public void BackToElectronicsAllMedtod() {
        System.out.println("\n\tPress '1' For back.");
    
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            computerMain(); //
        } else {
            BackToElectronicsAllMedtod();
        }
    }

    /* *************************************
     Other Main 
     ************************************** */
    public void otherInfoMain() {
        // this is for other main part

        Other other_ob1 = new OtherInfo();
        other_ob1.othersName();//other parts

        System.out.print("\tChoose another option: ");
        int choice = input.nextInt();

        if (choice == 1) {

            TvInformation();
            BackTvtoOtherInfoMain();
        } else if (choice == 2) {

            AcInformation();
            BackActoOtherInfoMain();
        } else if (choice == 3) {
            cameraInformation();
            BackCameratoOtherInfoMain();
        } else if (choice == 4) {
            smartWatchInformation();
            BackSmartWatchOtherInfoMain();
        } else if (choice == 5) {
            ElectronicsAllMedtod();
        } else {
            otherInfoMain();
        }
    }

    public void TvInformation() {
        System.out.println("\n\tTV Information");
        System.out.println("\t---------------");

        Other tv_ob = new OtherInfo();
        tv_ob.tvInfo();
    }

    public void BackTvtoOtherInfoMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            otherInfoMain(); //
        } else {
            BackTvtoOtherInfoMain();
        }
    }

    public void AcInformation() {
        System.out.println("\n\tAC Information");
        System.out.println("\t---------------");

        Other ac_ob = new OtherInfo();
        ac_ob.acInfo();
    }

    public void BackActoOtherInfoMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            otherInfoMain(); //
        } else {
            BackActoOtherInfoMain();
        }
    }

    public void cameraInformation() {
        System.out.println("\n\tCamera Information");
        System.out.println("\t------------------");

        Other camera_ob = new OtherInfo();
        camera_ob.cameraInfo();
    }

    public void BackCameratoOtherInfoMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            otherInfoMain(); //
        } else {
            BackCameratoOtherInfoMain();
        }
    }

    public void smartWatchInformation() {
        System.out.println("\n\tSmart Watch Information");
        System.out.println("\t-----------------------");

        Other smartWatchInfo_ob = new OtherInfo();
        smartWatchInfo_ob.smartWatchInfo();
    }

    public void BackSmartWatchOtherInfoMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            otherInfoMain(); //
        } else {
            BackSmartWatchOtherInfoMain();
        }
    }

    /* *************************************
     Here I Called All Method 
     ************************************** */
    public void ElectronicsAllMedtod() {

        Electronics.showList(); /// This method shows 3 main parts of electronics. 1. computer, 2. mobile. 3. others 4. exit
  
        System.out.print("\n\tChoose another Option: ");

        int option2 = input.nextInt();

        if (option2 == 1) {
            computerMain();
        } else if (option2 == 2) {
            mobileMain();
        } else if (option2 == 3) {
            otherInfoMain();
        }
        else if(option2 == 4)
        {
            /*System.out.println("\n\t\tSo Far  This Is End Optoion of The Pogram");
            
            System.out.println("\n\t\t*************************************");
            
            System.out.println("\n\t\tTHANKYOU BOSS\n");
            
            System.out.println("\t\t*************************************");
            
            System.out.println("\n\t\texit.....................................");*/
  
                
            System.exit(0);
            
        }
        else
        {
            ElectronicsAllMedtod();
        }
    }   
    
}

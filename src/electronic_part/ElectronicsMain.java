
package electronic_part;

import java.util.Scanner;

public class ElectronicsMain {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("1.hsdjfhsjk\n2. ueiwu\n3. Electronics.\n4. shisd\n");
        
        System.out.print("Choose Option: ");
        int option;
        option = input.nextInt();
        
        if(option == 3){  // Electronics Main part
            
//         Electronics electronics  = new Electronics();
//         electronics.showList();
            
        Electronics.showList(); /// This method shows 3 main parts of electronics. 1. computer, 2. mobile. 3. others
        
        System.out.print("Choose another Option: ");
        int option2 = input.nextInt();
              
        if(option2 == 1){ // this is for computer main part
            
            Electronics.showList2(); // this method shows 1. computer sub part like i. laptop, ii. desktop, iii. accessories
            
            System.out.print("Choose another Option: ");            
            int option3 = input.nextInt();  
            
            if(option3 == 1){ // for Laptop Information
                
            Laptop laptop1 = new Laptop_subPart();
            laptop1.laptopName();
        
            Laptop_subPart2 laptop_ob1 = new Laptop_subPart2("1. HP Laptop- HP 15s-du3023TU Core i3 11th Gen 15.6\" FHD Laptop", "15s-du3023TU", "15.6\" FHD (1920 x 1080)",  52000, 4);                      
            Laptop_subPart2 laptop_ob2 = new Laptop_subPart2("2. Dell Laptop- Dell Vostro 14 5402 Core i5 11th Gen 14\" FHD Laptop", "Vostro 14 5402", "14.0-inch FHD (1920 x 1080)", 73000, 8);
            Laptop_subPart2 laptop_ob3 = new Laptop_subPart2("3. Apple MacBook- Apple MacBook Air 13\" Space Gray with Apple M1 Chip", "Apple M1 chip with 8-core CPU and 7-core GPU", "13.3-inch 2560x1600 LED-backlit Retina ", 10800, 8);       
            Laptop_subPart2 laptop_ob4 = new Laptop_subPart2("4. Lenovo- IdeaPad Slim 3", "AMD Ryzen 3 3250U (2.6GHz up to 3.5GHz)", "15.6\" FHD (1920 x 1080)", 43000, 4);
       
            Laptop_subPart2[] laptopinfo = new Laptop_subPart2[] {laptop_ob1, laptop_ob2, laptop_ob3, laptop_ob4};
         
         for(int i =0; i<laptopinfo.length; i++){
             
            System.out.println("\tName: "+ laptopinfo[i].name);
            System.out.println("\tModel: "+ laptopinfo[i].model);
            System.out.println("\tDisply: "+ laptopinfo[i].display);
            System.out.println("\tPrice: "+ laptopinfo[i].price+"TK");
            System.out.println("\tRam: "+laptopinfo[i].ram+"GB");
             System.out.println("");
        
         }   
        }
            
            
            
            else if(option3 == 2){ //for desktop Information

             Desktop_Class1 desktop_name = new Desktop_Class2();
             desktop_name.desktopName(); // desktop name
             
           Desktop desktop_ob1 = new Desktop("1. Intel-PC- pc: Intel 11th Gen Core i5-11400 Rocket Lake Processor", " ASRock B560M Pro4 11th Gen M-ATX Motherboard", "14\" HD (1366x768) TN Display", 54500, 8);
           Desktop desktop_ob2 = new Desktop("2. Ryzen-PC- pc: AMD Athlon 3000G Processor with Radeon Graphics", " ASRock A320M-HDV R4.0 AMD Motherboard", "14\" (1920 x 1080) FHD Display", 22100, 4);
           Desktop desktop_ob3 = new Desktop("3. Intel Gaming PC- pc: ASRock B560 Pro4 10th and 11th Gen ATX Motherboard", " Intel 10th Gen Core i7-10700 Processor", "15.6\" HD (1366x768)Display", 112500, 8);
           Desktop desktop_ob4 = new Desktop("4. Ryzen Gaming PC- pc: Asrock B450M Pro4-F AMD Motherboard", " AMD Ryzen 7 3700X Processor", "14\" (1920 x 1080) FHD Display", 110500, 8);
           
           Desktop desktopinfo[] = new Desktop[] {desktop_ob1, desktop_ob2, desktop_ob3, desktop_ob4};
           
           for(int i =0; i<desktopinfo.length; i++){
             
            System.out.println("\tName: "+ desktopinfo[i].name);
            System.out.println("\tModel: "+ desktopinfo[i].model);
            System.out.println("\tDisply: "+ desktopinfo[i].display);
            System.out.println("\tPrice: "+ desktopinfo[i].price+"TK");
            System.out.println("\tRam: "+desktopinfo[i].ram+"GB");
             System.out.println("");
        
         } 
        }
            
            else if(option3 == 3){ // accessories Information
                
                Accessories accessories = new AccessoriesInfo();
                accessories.displayAccessories();
            }
            
            
        }    // end of seconf if option2 for computer            
        
        
             else if(option2 == 2){ // this is for mobile main part
                 
                 MobileName mobileName = new MobileNameInfo();
                 mobileName.mobileName(); //Mobile name such as samsung, xiaomi, i-phone, Google
                 
                System.out.print("Choose another option: ");
                  int choice = input.nextInt();
                  
                  if (choice == 1){ // this is for samsung info
                      
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
                  
                  else if (choice == 2){ // this is for xiaomi info
                      
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
                  
                   else if (choice == 3){ // this is for iphone info
                      
                      MobileName iPhone = new MobileNameInfo();
                      iPhone.iphone();
                      
                      
                      Mobile  iPhone_ob1 = new Mobile("\t1. Apple iPhone 13 Pro", "13 Pro", "6.1\"", 82000, 6);
                       iPhone_ob1.showDisplay();
                      
                      Mobile  iPhone_ob2 = new Mobile("\t2. Apple iPad mini (2021)", "mini (2021)", "6.1\"", 42000, 4);
                       iPhone_ob2.showDisplay();
                      
                      Mobile  iPhone_ob3 = new Mobile("\t3. Apple iPad 10.2 (2021)", "10.2 (2021)", "6.2\"", 57000, 6);
                       iPhone_ob3.showDisplay();
                      
                      Mobile  iPhone_ob4 = new Mobile("\t4. Apple iPhone 12 Pro Max", "12 Pro Max", "6.1\"", 72000, 8);
                       iPhone_ob4.showDisplay();
                      
                  }
                  
                  else if (choice == 4){ // this is for google info
                      
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
                  
                  
        } //end of option2 if condition for mobile
        
             else if(option2 == 3){ // this is for Others main part
                 
                  Other other_ob1 = new OtherInfo();
                  other_ob1.othersName();
                  
                 System.out.print("Choose your option:  ");
                 int choose = input.nextInt();
                 
                 if(choose == 1){ // this is for tv info
                     
                     System.out.println("\n\tTV Information");
                     System.out.println("\t---------------");
                     
                    Other tv_ob = new OtherInfo();
                    tv_ob.tvInfo();
                                         
                 } 
                 if(choose == 2){ // this is for ac info
                     
                      System.out.println("\n\tAC Information");
                     System.out.println("\t---------------");
                     
                    Other ac_ob = new OtherInfo();
                    ac_ob.acInfo();
                                         
                 } 
                 
                 
             }
        
        
        
        
        
        }//end of first if conditon for all
        
        
       }
        
    }


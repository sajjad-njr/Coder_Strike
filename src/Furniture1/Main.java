/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Furniture1;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Menu");


        System.out.println("1.Grocery\n2.Clothes\n3.Electronic Devices\n4.Furnitures");
        System.out.println("---------------------------");

        System.out.print("Choose your category: ");

        int category;

        category = input.nextInt();


        if (category == 4) {


            System.out.println("1.Bed\n2.Table\n3.Wardrobe\n4.Dresser\n5.Chair\n6.Sofa\n7.Cabinetry\n8.Ottoman\n9.Stool\n10.Chaise Longue\n");
            System.out.println("---------------------------");
            System.out.print("Choose your subcategory: ");
            int subcategory = input.nextInt();

            if (subcategory == 1) {
                System.out.println("Bed: There are dozens of different types of beds.The price will be varies depends on the different quality.");

                Bed mansionBed = new Bed("Mansion Bed", 34650);
                Bed lakerpolish = new Bed("Laker Polish Foam Box Bed/Khat", 27600);
                Bed stylish = new Bed("Stylish Malaysian Processed Wood Bed.", 62000);
                Bed medicated = new Bed("Medicated & Solid Wood Box Bed", 11074);


                Bed[] beds = new Bed[]{mansionBed, lakerpolish, stylish, medicated};

                for (int i = 0; i < beds.length; i++) {
                    System.out.println("Product Name: " + beds[i].name);
                    System.out.println("Product Price: " + beds[i].price);
                    System.out.println("---------------------------");
                }
            } else if (subcategory == 2) {
                System.out.println("Table: There are dozens of different types of tables.The price will be varies depends on the different quality.");

                Table malaysian = new Table("Malaysian Processed Wood Dinning Table set.", 32499);
                Table RFL = new Table("RFL Dinning Table-Restaurant Table", 2500);
                Table dinning = new Table("Dinning Table With 6 chairs", 31500);
                Table royal = new Table("RFL Royal Coffee Table", 1700);

                Table[] Tables = new Table[]{malaysian, RFL, dinning, royal};

                for (int i = 0; i < Tables.length; i++) {
                    System.out.println("Product Name: " + Tables[i].name);
                    System.out.println("Product Price: " + Tables[i].price);
                    System.out.println("---------------------------");



                }
            }else if (subcategory == 3) {
                System.out.println("Wardrobe: A Wardrobe Or Armoire is a closet usually equipped with a mirror,  drowers and other things used for storing clothes. There are dozens of different types of Wardrobe.The price will be varies depends on the different quality.");

                Wardrobe malaysian = new Wardrobe("Wardrobe Malaysian", 12500);
                Wardrobe platinum = new Wardrobe("Platinum – Crown-5 Step", 8500);
                Wardrobe mini = new Wardrobe("Mini Wooden Wardrobe", 3500);
                Wardrobe rfl = new Wardrobe("RFL Black & Gold Wardrobe", 5600);

                Wardrobe[] wardrobes = new Wardrobe[]{malaysian, platinum,mini,rfl};

                for (int i = 0; i < wardrobes.length; i++) {
                    System.out.println("Product Name: " + wardrobes[i].name);
                    System.out.println("Product Price: " + wardrobes[i].price);
                    System.out.println("---------------------------");



                }
            }else if (subcategory == 4) {
                System.out.println("Dresser: A type of sideboard, often with shelves above drawers for the display of plates.");

                Dresser malaysian = new Dresser("Malaysian  Wood Dressing.", 3500);
                Dresser dressing = new Dresser("Dressing Table slim.", 1100);


                Dresser[] dressers = new Dresser[]{malaysian, dressing};

                for (int i = 0; i < dressers.length; i++) {
                    System.out.println("Product Name: " + dressers[i].name);
                    System.out.println("Product Price: " + dressers[i].price);
                    System.out.println("---------------------------");



                }
            }else if (subcategory == 5) {
                System.out.println("Dresser: A type of sideboard, often with shelves above drawers for the display of plates.");

                Chair regal = new Chair("Regal Metal Rocking Chair ", 6270);
                Chair deko = new Chair("Deko relax Chair", 390);
                Chair caino = new Chair("Caino Armless Chair.", 1125);
                Chair restaurantChair = new Chair("Restaurant chair", 650);


                Chair[] chairs = new Chair[]{regal,deko,caino,restaurantChair};

                for (int i = 0; i < chairs.length; i++) {
                    System.out.println("Product Name: " + chairs[i].name);
                    System.out.println("Product Price: " + chairs[i].price);
                    System.out.println("---------------------------");



                }
            }else if (subcategory == 6) {
                System.out.println("Couch: Couch is a long soft piece of Furniture Also known as a Sofa.");

               Couch nyxi = new Couch("Nyxi Faux Leader white ottoman", 2930);
               Couch foldable= new Couch("Foldable Fabric Ottoman", 3741);
               Couch classic= new Couch("Classic Folding Ottoman", 9013);


                Couch[] couches = new Couch[]{nyxi,foldable,classic};

                for (int i = 0; i < couches.length; i++) {
                    System.out.println("Product Name: " + couches[i].name);
                    System.out.println("Product Price: " + couches[i].price);
                    System.out.println("---------------------------");



                }
            }else if (subcategory == 7) {
                Cabinetry bedroom = new Cabinetry("Bedroom Cabinet", 2930);
                Cabinetry kitchen = new Cabinetry("Kitchen Cabinet", 3741);
                Cabinetry file = new Cabinetry("File Cabinet", 9013);


                Cabinetry [] cabinetries = new Cabinetry []{bedroom,kitchen,file};

                for (int i = 0; i < cabinetries.length; i++) {
                    System.out.println("Product Name: " + cabinetries[i].name);
                    System.out.println("Product Price: " + cabinetries[i].price);
                    System.out.println("---------------------------");



                }
            }else if (subcategory == 8) {
                Ottoman woodAndFabricOttoman = new Ottoman("Wood and Fabric ottoman ", 8000);
                Ottoman nyxiFauxLeaderWhiteOttoman = new Ottoman("Nyxi Faux Leader white ottoman ", 3930);
                Ottoman foldableFabricOttoman = new Ottoman("Foldable Fabric Ottoman", 3741);
                Ottoman classicFoldingOttoman = new Ottoman("Classic Folding Ottoman", 9013);


                Ottoman [] ottomen = new Ottoman []{woodAndFabricOttoman,nyxiFauxLeaderWhiteOttoman,foldableFabricOttoman,classicFoldingOttoman};

                for (int i = 0; i < ottomen.length; i++) {
                    System.out.println("Product Name: " + ottomen[i].name);
                    System.out.println("Product Price: " + ottomen[i].price);
                    System.out.println("---------------------------");



                }
            }else if (subcategory == 9) {
                Stool wooden = new Stool("Wooden Frame & Artificial Cane Woven Stool ", 2450);
                Stool squareShape = new Stool("Square Shape PU Leather Rest Stool ", 800);
                Stool rflEasyStool = new Stool("RFL Easy Stool", 70);



                Stool [] stools = new Stool []{wooden,squareShape,rflEasyStool};

                for (int i = 0; i < stools.length; i++) {
                    System.out.println("Product Name: " + stools[i].name);
                    System.out.println("Product Price: " + stools[i].price);
                    System.out.println("---------------------------");



                }
            }else if (subcategory == 10) {
                ChaiseLongue wood = new ChaiseLongue("Wood Hotel Chaise Longue", 35720);
                ChaiseLongue garden = new ChaiseLongue("Garden Chaise  Longue ", 1153);
                ChaiseLongue living = new ChaiseLongue("Living Room Chaise Longue", 75675);
                ChaiseLongue vip = new ChaiseLongue("VIP waiting  Chaise Longue", 6377);



                ChaiseLongue [] chaiseLongues = new ChaiseLongue []{wood,garden,living,vip};

                for (int i = 0; i < chaiseLongues.length; i++) {
                    System.out.println("Product Name: " + chaiseLongues[i].name);
                    System.out.println("Product Price: " + chaiseLongues[i].price);
                    System.out.println("---------------------------");



                }
            }


        }
    }
}

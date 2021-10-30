package Main;
import electronic_part.*;
import Clothes_part.*;
import Furniture1.*;
import java.util.Scanner;

public class AllMethodsCombine implements ElectronicsMedthods , ClothesMethods , GroceriesMethods , FurnitureMethods{

    Scanner input = new Scanner(System.in);
    public static int[] arr = new int[120];
    public static  int[] collect = new int[120];
    public static  int[] quantity = new int[120];
    public static   int[] price2 = new int[120];
    public static  int add = 0, len = 0;

    public static  int ci = 0, qi = 0, pri = 0;

    public static int itemCount = 0 , item = 0 , totalPrice = 0,totalCost=0;


    public void GroMain(){
        System.out.println("\n\t1. Rice\t\t\t\t\t\t2. Dal\n\n\t3. Salt\t\t\t\t\t\t4. Flour\n\n\t5. Masala\t\t\t\t\t6. Suji\n\n\t7. Egg\t\t\t\t\t\t8. Pea-flour\n\n\t9. Edible Oil\t\t\t\t10. Vinegar\n\n\t11. Tea Bag\t\t\t\t\t12. Tea Poly Bag\n\n\t13. Vermicelli\t\t\t\t14. Peanut\n\n\t15. Biscuit\t\t\t\t\t16. Noodles\n\n\t17. Powder Milk\t\t\t\t18. Soft Drinks\n\n\t\t19. Back\n");
        System.out.print("\n\tChoice an Option : ");
        int num = input.nextInt();
        switch (num){
            case 1:

                riceList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                  item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 12) {
                            itemCode(code);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }

                BackGroMain();
                break;
            case 2:
                dalList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                 item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 12) {
                            itemCode(code+12);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }

                BackGroMain();
                break;
            case 3:
                saltList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 7) {
                            itemCode(code+ 24);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }

                BackGroMain();
                break;
            case 4:
                flourList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 20) {
                            itemCode(code + 31);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }

                BackGroMain();
                break;
            case 5:
                masalaList();
                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 15) {
                            itemCode(code+51);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }

                BackGroMain();
                break;
            case 6:
                sujiList();
                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 8) {
                            itemCode(code+ 66);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 7:
                eggList();
                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 4) {
                            itemCode(code + 74);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 8:
                peaFlourList();
                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 3) {
                            itemCode(code+ 78);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 9:
                edibleOilList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 13) {
                            itemCode(code+81);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 10:
                VinegarList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 8) {
                            itemCode(code+94);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }

                BackGroMain();
                break;
            case 11:
               // teaBagList();
                teaList();
                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 6) {
                            itemCode(code+102);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 12:
                //teaList();
                teaBagList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 4) {
                            itemCode(code+108);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 13:
                vermicelliList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 8) {
                            itemCode(code+112);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 14:
                peanutList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 5) {
                            itemCode(code+120);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }

                BackGroMain();
                break;
            case 15:
                biscuitList();
                System.out.println("\n\t'0' For Back ");
                System.out.print("\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 14) {
                            itemCode(code+125);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 16:
                noodlesList();
                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.println("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 13) {
                            itemCode(code+139);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 17:
                powderMilkList();

                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.print("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 9) {
                            itemCode(code+152);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 18:
                softDrinksList();
                System.out.println("\n\t'0' For Back ");
                System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
                item = input.nextInt();
                //takeItem(item);
                if (item == 0) {
                    BackGroMain();
                } else {
                    for (int k = 0; k < item; k++) {

                        System.out.println("\n\tEnter Code Numnber : ");
                        int code = input.nextInt();
                        if (code >= 1 && code <= 7) {
                            itemCode(code+161);
                        } else {
                            System.out.println("\n\tOut of Range");
                        }
                    }
                }
                BackGroMain();
                break;
            case 19:
                Submain object01 = new Submain();
                object01.catagoriesPart();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void riceList(){
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        R I C E                       ");
        System.out.println("\n\t------------------------------------------------------\n");

        System.out.println("\n\t1.  Shaad Chinigura Aromatic Rice\n\tPer Kg: 130 BDT");
        System.out.print("\n\t2.  Khusboo Premium Kalijira Rice\n\tPer Kg: 135 BDT\n");
        System.out.print("\n\t3.  Chinigura Rice\n\tPer kg: 99 BDT\n");
        System.out.print("\n\t4.  Rupchanda Chinigura Premium Aromatic Rice \n\tPer Kg: 135 BDT\n");
        System.out.print("\n\t5.  Green Grocery Tulshimala Polau Rice\n\tPer Kg: 125 BDT\n");
        System.out.print("\n\t6.  Chinigura Polau Rice\n\tPer Kg: 130 BDT\n");
        System.out.print("\n\t7.  Premium Atash Chal\n\tPer Kg: 60 BDT\n");
        System.out.print("\n\t8.  Katari Jirashail Rice\n\tPer Kg: 66 BDT\n");
        System.out.print("\n\t9.  Supreme Basmati Rice\n\tPer Kg: 250 BDT\n");
        System.out.print("\n\t10. Ispahani Parbon Jirashail Rice\n\tPer Kg: 80 BDT\n");
        System.out.print("\n\t11. Premium Miniket Rice\n\tPer Kg: 65 BDT\n");
        System.out.print("\n\t12. Pran Chinigura Rice\n\tPer Kg: 125 BDT\n\n");
    }
    public void dalList(){
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        D A L                         ");
        System.out.println("\n\t------------------------------------------------------\n");

        System.out.println("\n\t1.  Chola Boot Dal\n\tPer Kg: 70 BDT");
        System.out.print("\n\t2.  Moshur Dal (Deshi)\n\tPer Kg: 109 BDT\n");
        System.out.print("\n\t3.  Moshur Dal (Imported)\n\tPer Kg: 89 BDT\n");
        System.out.print("\n\t4.  Mug Dal\n\tPer Kg: 175 BDT\n");
        System.out.print("\n\t5.  Boot Dal\n\tPer Kg: 80 BDT\n");
        System.out.print("\n\t6.  Dubli Boot Dal\n\tPer Kg: 70 BDT\n");
        System.out.print("\n\t7.  Mixed Dal\n\tPer Kg: 130 BDT\n");
        System.out.print("\n\t8.  Anchor Boot Dal\n\tPer Kg: 80 BDT\n");
        System.out.print("\n\t9.  Garbanzo Peeled (Khosha Charano Chola Boot)\n\tPer Kg: 140 BDT\n");
        System.out.print("\n\t10. Mashkolai Dal Peeled\n\tPer Kg: 200 BDT\n");
        System.out.print("\n\t11. Kheshari Dal\n\tPer Kg: 100 BDT\n");
        System.out.print("\n\t12. Motor Dal\n\tPer Kg: 180 BDT\n\n");
    }
    public void saltList(){
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                         S A L T                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. ACI Pure Salt\n\tPer Kg: 35 BDT");
        System.out.print("\n\t2. Fresh Super Premium (Vacuum) Salt\n\tPer Kg: 32 BDT\n");
        System.out.print("\n\t3. Rongdhanu Salt\n\tPer Kg: 25 BDT\n");
        System.out.print("\n\t4. Muskan Salt\n\tPer Kg: 35 BDT\n");
        System.out.print("\n\t5. Pran Salt\n\tPer Kg: 38 BDT\n");
        System.out.print("\n\t6. Molla Super Salt\n\tPer Kg: 32 BDT\n");
        System.out.print("\n\t7. Sena Salt\n\tPer Kg: 32 BDT\n\n");
    }
    public void flourList(){
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        F L O U R                        ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1.  Teer Atta\n\tPer Kg: 42 BDT");
        System.out.print("\n\t2.  Teer Maida Flour\n\tPer Kg: 50 BDT\n");
        System.out.print("\n\t3.  Bashundhara Atta\n\tPer Kg: 45 BDT\n");
        System.out.print("\n\t4.  Ifad Atta\n\tPer Kg: 40 BDT\n");
        System.out.print("\n\t5.  Fresh Atta\n\tPer Kg: 40 BDT\n");
        System.out.print("\n\t6.  Teer Whole Wheat Atta\n\tPer Kg: 44 BDT\n");
        System.out.print("\n\t7.  Ifad Brown Atta\n\tPer Kg: 45 BDT\n");
        System.out.print("\n\t8.  Rice Flour\n\tPer Kg: 80 BDT\n");
        System.out.print("\n\t9.  Bashundhara Brown Atta\n\tPer Kg: 45 BDT\n");
        System.out.print("\n\t10. Fresh Maida\n\tPer Kg: 50 BDT\n");
        System.out.print("\n\t11. Ifad Maida\n\tPer Kg: 50 BDT\n");
        System.out.print("\n\t12. ACI Pure Maida\n\tPer Kg: 48 BDT\n");
        System.out.print("\n\t13. ACI Pure Brown Atta\n\tPer Kg: 45 BDT\n");
        System.out.print("\n\t14. Shaad Atta\n\tPer Kg: 42 BDT\n");
        System.out.print("\n\t15. Shaad Maida\n\tPer Kg: 50 BDT\n");
        System.out.print("\n\t16. Pusti Atta\n\tPer Kg: 40 BDT\n");
        System.out.print("\n\t17. Shaad Brown Atta\n\tPer Kg: 45 BDT\n");
        System.out.print("\n\t18. Pusti Maida\n\tPer Kg: 49 BDT\n");
        System.out.print("\n\t19. BPM Red Rice Flour\n\tPer Kg: 100 BDT\n");
        System.out.print("\n\t20. Fresh Whole Wheat Atta\n\tPer Kg: 44 BDT\n\n");
    }
    public void masalaList(){
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                     M A S A L A                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.print("\n\t1.  Cumin Seed (Jira)\n\tPer Kg: 390  BDT");
        System.out.print("\n\t2.  Cinnamon (Daruchini)\n\tPer Kg: 790  BDT\n");
        System.out.print("\n\t3.  Cardamom (Elachi)\n\tPer Kg: 2980 BDT\n");
        System.out.print("\n\t4.  Radhuni Turmeric Powder (Holud)\n\tPer Kg: 475  BDT\n");
        System.out.print("\n\t5.  Radhuni Chilli (Morich) Powder\n\tPer Kg: 500  BDT\n");
        System.out.print("\n\t6.  Dried Chillies (Shukna Morich)\n\tPer Kg: 290  BDT\n");
        System.out.print("\n\t7.  Bay Leaves (Tejpata)\n\tPer Kg: 190  BDT\n");
        System.out.print("\n\t8.  Radhuni Cumin (Jeera) Powder\n\tPer Kg: 800  BDT\n");
        System.out.print("\n\t9.  Cloves (Lobongo)\n\tPer Kg: 2580 BDT\n");
        System.out.print("\n\t10. Radhuni Coriander (Dhoniya) Powder\n\tPer Kg: 345  BDT\n");
        System.out.print("\n\t11. Black Cumin (Kalo Jira)\n\tPer Kg: 490  BDT\n");
        System.out.print("\n\t12. Radhuni Garam Masala\n\tPer Kg: 1475 BDT\n");
        System.out.print("\n\t13. Fenugreek Seed (Methi)\n\tPer Kg: 190  BDT\n");
        System.out.print("\n\t14. Radhuni Roast Masala\n\tPer Kg: 1400 BDT\n");
        System.out.print("\n\t15. Mix Spice (Pach Foron)\n\tPer Kg: 290  BDT\n\n");
    }
    public void sujiList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                       S U J I                      ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Ifad Suji\n\tPer Kg: 64 BDT");
        System.out.print("\n\t2. Teer Semolina Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t3. Bashundhara Suji\n\tPer Kg: 66 BDT\n");
        System.out.print("\n\t4. Fresh Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t5. ACI Pure Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t6. Muskaan Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t7. Shaad Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t8. Pusti Suji\n\tPer Kg: 64 BDT\n\n");
    }
    public void eggList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        E G G                          ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Chicken Eggs (Layer)\n\tPer 4 pcs: 36 BDT");
        System.out.print("\n\t2. Quail Eggs\n\tPer 4 pcs: 17 BDT\n");
        System.out.print("\n\t3. Duck Eggs (Deshi)\n\tPer 4 pcs: 60 BDT\n");
        System.out.print("\n\t4. Organic Chicken Eggs (Deshi)\n\tPer 4 pcs: 50 BDT\n\n");
    }
    public void peaFlourList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                     P E A - F L O U R                    ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Booter Beshon\n\tPer Kg: 98  BDT\n");
        System.out.print("\n\t2. Fit Food Beshon\n\tPer Kg: 516 BDT\n");
        System.out.print("\n\t3. BPM Mashkalai Bason\n\tPer Kg: 220 BDT\n\n");
    }
    public void edibleOilList() {
        System.out.println("\n\n\t------------------------------------------------------\n");
        System.out.println("\n\t                         E D I B L E                      ");
        System.out.println("\n\t------------------------------------------------------\n");

        System.out.print("\n\t1.  King's Sunflower Oil\n\tPer litre: 270  BDT");
        System.out.print("\n\t2.  Rupchanda Soyabean Oil\n\tPer litre: 152  BDT\n");
        System.out.print("\n\t3.  Pusti Soyabean Oil\n\tPer litre: 150  BDT\n");
        System.out.print("\n\t4.  Olitalia Sunflower Oil\n\tPer litre: 325  BDT\n");
        System.out.print("\n\t5.  Pran Mustard Oil\n\tPer litre: 270  BDT\n");
        System.out.print("\n\t6.  Dhakaiya Black Seed Oil\n\tPer litre: 1850 BDT\n");
        System.out.print("\n\t7.  Shera Bangla Pure Mustard Oil\n\tPer litre: 225  BDT\n");
        System.out.print("\n\t8. Fresh Mustard Oil\n\tPer litre: 270  BDT\n");
        System.out.print("\n\t9. Sajeeb Mustard Oil\n\tPer litre: 270  BDT\n");
        System.out.print("\n\t10. Shaad Mustard Oil\n\tPer litre: 260  BDT\n");
        System.out.print("\n\t11. Fortune Rice Bran Oil\n\tPer litre: 195  BDT\n");
        System.out.print("\n\t12. Teer Soyabean Oil\n\tPer litre: 145  BDT\n");
        System.out.print("\n\t13. Radhuni Pure Mustard Oil\n\tPer litre: 270  BDT\n\n");
    }
    public void VinegarList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        V I N E G A R                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. BD Vinegar \n\tPer litre: 85  BDT");
        System.out.print("\n\t2. Bragg Apple Cider Vinegar\n\tPer litre: 560 BDT\n");
        System.out.print("\n\t3. Calypso Apple Vinegar\n\tPer litre: 510 BDT\n");
        System.out.print("\n\t4. Heinz Apple Cider Vinegar\n\tPer litre: 425 BDT\n");
        System.out.print("\n\t5. Saporito Red Grape Vinegar\n\tPer litre: 660 BDT\n");
        System.out.print("\n\t6. Ahmed White Vinegar\n\tPer litre: 130 BDT\n");
        System.out.print("\n\t7. Heinz White Vinegar\n\tPer litre: 420 BDT\n");
        System.out.print("\n\t8. Borges Apple Cider Vinegar\nPer litre: 555 BDT\n\n");
    }
    public void teaList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        T E A                         ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Brooke Bond Taaza Black Tea\n\tPer Kg: 500 BDT");
        System.out.print("\n\t2. Ispahani Mirzapore Best Leaf Tea\n\tPer Kg: 475 BDT\n");
        System.out.print("\n\t3. Nestea Iced Tea Lemon\n\tPer Kg: 600 BDT\n");
        System.out.print("\n\t4. Finlay Premium Tea\n\tPer Kg: 520 BDT\n");
        System.out.print("\n\t5. Muskan BOP Tea\n\tPer Kg: 360 BDT\n");
        System.out.print("\n\t6. Ispahani Zareen Premium Tea\n\tPer Kg: 600 BDT\n\n");
    }
    public void teaBagList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        T E A -- B A G                     ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Ispahani Mirzapore Tea Bag\n\tPer 50 pcs: 85  BDT");
        System.out.print("\n\t2. Kazi & Kazi Green Tea\n\tPer 50 pcs: 210 BDT\n");
        System.out.print("\n\t3. Tetley Premium Tea Bags\n\tPer 50 pcs: 75  BDT\n");
        System.out.print("\n\t4. Finlays Pure Green Tea\n\tPer 50 pcs: 110 BDT\n\n");
    }
    public void vermicelliList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        V E R M I C E L L I                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Cock Vermicelli\n\tPer Kg: 175 BDT");
        System.out.print("\n\t2. Dekko Vermicelli Shemai\n\tPer Kg: 145 BDT\n");
        System.out.print("\n\t3. ACI Pure Vermicelli\n\tPer Kg: 145 BDT\n");
        System.out.print("\n\t4. Pran Vermicelli Shemai\n\tPer Kg: 175 BDT\n");
        System.out.print("\n\t5. BD Vermicelli\n\tPer Kg: 175 BDT\n");
        System.out.print("\n\t6. Bashundhara Vermicelli Shemai\n\tPer Kg: 165 BDT\n");
        System.out.print("\n\t7. Banoful Vermicelli Shemai\n\tPer Kg: 175 BDT\n");
        System.out.print("\n\t8. Arku Vermicelli\n\tPer Kg: 160 BDT\n\n");
    }
    public void peanutList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                         P E A N U                     ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Kaju Badam (Cashew Nut)\n\tPer Kg: 1090 BDT");
        System.out.print("\n\t2. Almonds (Kath Badam)\n\tPer Kg: 990  BDT\n");
        System.out.print("\n\t3. Peanut Raw (Kacha Cheena Badam)\n\tPer Kg: 290  BDT\n");
        System.out.print("\n\t4. Peanut Peeled (Vaja Cheena Badam)\n\tPer Kg: 390  BDT\n");
        System.out.print("\n\t5. Pistachios (Pesta Badam)\n\tPer Kg: 2190 BDT\n\n");
    }
    public void biscuitList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                         B I S C U I T                        ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1.  Olympic Premium Energy Plus Biscuit\n\tPer 500 gm: 85  BDT");
        System.out.print("\n\t2.  Belleame Cremo Vanilla Biscuit\n\tPer 500 gm: 165 BDT\n");
        System.out.print("\n\t3.  Haque Milk Chocolate Digestive Biscuit\n\tPer 500 gm: 120 BDT\n");
        System.out.print("\n\t4.  Cocola Champion Chocolate Cream Biscuit\n\tPer 500 gm: 100 BDT\n");
        System.out.print("\n\t5.  Olympic Pineapple Cream Biscuit\n\tPer 500 gm: 90  BDT\n");
        System.out.print("\n\t6.  Pran Potata Spicy Biscuit\n\tPer 500 gm: 125 BDT\n");
        System.out.print("\n\t7.  Olympic Malai Cream Energy Plus Biscuit\n\tPer 500 gm: 88  BDT\n");
        System.out.print("\n\t8.  Olympic Nutty Real Peanut Biscuit\n\tPer 500 gm: 95  BDT\n");
        System.out.print("\n\t9.  Fit Crakers Masala Biscuit\n\tPer 500 gm: 95  BDT\n");
        System.out.print("\n\t10. Danish Doreo Black Chocolate Sandwich Biscuit\n\tPer 500 gm: 180 BDT\n");
        System.out.print("\n\t11. Ifad Choco Delight Biscuit\n\tPer 500 gm: 100 BDT\n");
        System.out.print("\n\t12. Cocola Lexus Vegetable Biscuit\n\tPer 500 gm: 115 BDT\n");
        System.out.print("\n\t13. Olympic Milk Plus Biscuit\n\tPer 500 gm: 75  BDT\n");
        System.out.print("\n\t14. Cadbury Oreo Original Cream Biscuit\n\tPer 500 gm: 230 BDT\n\n");
    }
    public void noodlesList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                       N O O D L E S                      ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1.  Cocola Egg Noodles\n\tPer pack: 18 BDT");
        System.out.print("\n\t2.  Nestle Maggi 2-Minute Masala Instant Noodles\n\tPer pack: 16 BDT\n");
        System.out.print("\n\t3.  Nestle Maggi 2-Minute Masala Blast Noodles\n\tPer pack: 18 BDT\n");
        System.out.print("\n\t4.  Doodles Stick Noodles\n\tPer pack: 18 BDT\n");
        System.out.print("\n\t5.  Doodles Masala Noodles\n\tPer pack: 16 BDT\n");
        System.out.print("\n\t6.  Mr.Noodles Chicken Cup Noodles\n\tPer pack: 30 BDT\n");
        System.out.print("\n\t7.  Cocola Chicken Masala Noodles\n\tPer pack: 20 BDT\n");
        System.out.print("\n\t8.  Ifad Eggy Instant Masala Noodles\n\tPer pack: 22 BDT\n");
        System.out.print("\n\t9.  Cocola Hot & Spicy Cup Noodles\n\tPer pack: 30 BDT\n");
        System.out.print("\n\t10. Mama Noodles Chicken Flavor\n\tPer pack: 16 BDT\n");
        System.out.print("\n\t11. Mama Hot & Spicy Cup Noodles\n\tPer pack: 60 BDT\n");
        System.out.print("\n\t12. Sajeeb Tandoori Chicken Noodles\n\tPer pack: 20 BDT\n");
        System.out.print("\n\t13. Mr.Noodles Magic Masala\n\tPer pack: 16 BDT\n\n");
    }
    public void powderMilkList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                        P O W D E R --  M I L K                        ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.print("\n\t1. Diploma Full Cream Milk Powder\n\tPer Kg: 690 BDT");
        System.out.print("\n\t2. Goalini Full Cream Milk Powder\n\tPer Kg: 540 BDT\n");
        System.out.print("\n\t3. Arla Dano Daily Pusti Milk Powder\n\tPer Kg: 475 BDT\n");
        System.out.print("\n\t4. Danish Full Cream Milk Powder\n\tPer Kg: 609 BDT\n");
        System.out.print("\n\t5. Marks Milk Powder (Poly)\n\tPer Kg: 700 BDT\n");
        System.out.print("\n\t6. Nestle Nido Fortigrow Full Cream Milk Powder\n\tPer Kg: 800 BDT\n");
        System.out.print("\n\t7. Starship Full Cream Milk Powder\n\tPer Kg: 520 BDT\n");
        System.out.print("\n\t8. Aarong Dairy Instant Low Fat Milk Powder\n\tPer Kg: 620 BDT\n");
        System.out.print("\n\t9. Pran Full Cream Milk Powder\n\tPer Kg: 680 BDT\n\n");
    }
    public void softDrinksList() {
        System.out.println("\n\n\t------------------------------------------------------");
        System.out.println("\t                      S O F T -- D R I N K S                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.print("\n\t1. Coca-Cola \n\tPer litre: 50 BDT");
        System.out.print("\n\t2. 7up\n\tPer litre: 50 BDT\n");
        System.out.print("\n\t3. Sprite\n\tPer litre: 50 BDT\n");
        System.out.print("\n\t4. Mountain Dew\n\tPer litre: 50 BDT\n");
        System.out.print("\n\t5. Pran Up\n\tPer litre: 45 BDT\n");
        System.out.print("\n\t6. Clemon\n\tPer litre: 45 BDT\n");
        System.out.print("\n\t7. Miranda Orange\n\tPer litre: 50 BDT\n\n");
    }

    public void BackGroMain(){
        System.out.print("\n\tPress '1' for Back : ");
        int n;

        n = input.nextInt();
        if (n == 1) {
            GroMain();
        }
        else
        {
            BackGroMain();
        }
    }

    /* *************************************
 Computer Main
 ************************************** */
    @Override
    public void computerMain() {
        // this is for computer main part

        Electronics.showList2(); // this method shows 1. computer sub part like i. laptop, ii. desktop, iii. accessories

        System.out.print("\n\tChoose another Option: ");
        int option3 = input.nextInt();

        if (option3 == 1) {
            laptopInformation();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                computerMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+193);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
           // BackLaptoTocomputerMain();
            backToComputerMainMethod();
        } else if (option3 == 2) {
            desktopInformation();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                computerMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+197);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            //BackDesktopTocomputureMain();
            backToComputerMainMethod();
        } else if (option3 == 3) {
            accessoriesInformation();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                computerMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 6) {
                        itemCode(code+ 201);
                    } else {
                        System.out.println("\tOut of Range");
                    }
                }
            }

            //etotuku edit korsi
            //BackAccessoriesTocomputerMain();
            backToComputerMainMethod();
        } else if (option3 == 4) {
            electronicsAllMedtod();
        } else {
            computerMain();
        }
    }

    public void backToComputerMainMethod()
    {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            computerMain(); //
        } else {
            backToComputerMainMethod();
        }
    }

    @Override
    public void BackLaptoTocomputerMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            computerMain(); //
        } else {
            BackLaptoTocomputerMain();
        }
    }

    @Override
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
            System.out.println("\n");
        }
    }

    public void BackDesktopTocomputureMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
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
            System.out.println("\n");
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
        System.out.print("\n\tChoice Option : ");
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
    @Override
    public void mobileMain() {
        // this is for mobile main part

        MobileName mobileName = new MobileNameInfo();
        mobileName.mobileName(); //Mobile name such as samsung, xiaomi, i-phone, Google

        System.out.print("\n\tChoose another option: ");
        int choice = input.nextInt();

        if (choice == 1) {

            samsungInformation();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                backToMobileMainMethod();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+206);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            BackSamsungtoTomobileMain();
        } else if (choice == 2) {

            xiaomiInformation();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                backToMobileMainMethod();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+210);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            BackXiaomiTomobileMain();
        } else if (choice == 3) {
            iPhoneInformation();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                backToMobileMainMethod();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+214);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            BackIPhoneTomobileMain();
        } else if (choice == 4) {
            googleInformation();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                backToMobileMainMethod();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+218);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            BackGoogleTomobileMain();
        } else if (choice == 5) {
            electronicsAllMedtod();
        } else {
            mobileMain();
        }
    }

    @Override
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
        System.out.println("\n");
    }

    @Override
    public void BackSamsungtoTomobileMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        } else {
            BackSamsungtoTomobileMain();
        }
    }

    @Override
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
        System.out.println("\n");
    }

    @Override
    public void BackXiaomiTomobileMain() {
        System.out.println("\n\tPress '1' For back.");

        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        } else {
            BackXiaomiTomobileMain();
        }
    }

    @Override
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
        System.out.println("\n");
    }

    @Override
    public void BackIPhoneTomobileMain() {
        System.out.println("\n\tPress '1' For back.");

        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        } else {
            BackIPhoneTomobileMain();
        }
    }

    @Override
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
        System.out.println("\n");
    }

    @Override
    public void BackGoogleTomobileMain() {
        System.out.println("\n\tPress '1' For back.");

        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        } else {
            BackGoogleTomobileMain();
        }
    }

    @Override
    public void BackToElectronicsAllMedtod() {
        System.out.println("\n\tPress '1' For back.");

        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            computerMain(); //
        } else {
            BackToElectronicsAllMedtod();
        }
    }

    public void backToMobileMainMethod()
    {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            mobileMain(); //
        } else {
            backToMobileMainMethod();
        }
    }

    /* *************************************
     Other Main
     ************************************** */
    @Override
    public void otherInfoMain() {
        // this is for other main part

        Other other_ob1 = new OtherInfo();
        other_ob1.othersName();//other parts

        System.out.print("\n\tChoose another option: ");
        int choice = input.nextInt();

        if (choice == 1) {

            TvInformation();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                otherInfoMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+266);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            BackTvtoOtherInfoMain();
        } else if (choice == 2) {

            AcInformation();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                otherInfoMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+270);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            BackActoOtherInfoMain();
        } else if (choice == 3) {
            cameraInformation();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                otherInfoMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+274);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            BackCameratoOtherInfoMain();
        } else if (choice == 4) {
            smartWatchInformation();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                otherInfoMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+278);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            BackSmartWatchOtherInfoMain();
        } else if (choice == 5) {
            electronicsAllMedtod();
        } else {
            otherInfoMain();
        }
    }

    @Override
    public void TvInformation() {
        System.out.println("\n\tTV Information");
        System.out.println("\t---------------");

        Other tv_ob = new OtherInfo();
        tv_ob.tvInfo();
    }

    @Override
    public void BackTvtoOtherInfoMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            otherInfoMain(); //
        } else {
            BackTvtoOtherInfoMain();
        }
    }

    @Override
    public void AcInformation() {
        System.out.println("\n\tAC Information");
        System.out.println("\t---------------");

        Other ac_ob = new OtherInfo();
        ac_ob.acInfo();
    }

    @Override
    public void BackActoOtherInfoMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            otherInfoMain(); //
        } else {
            BackActoOtherInfoMain();
        }
    }

    @Override
    public void cameraInformation() {
        System.out.println("\n\tCamera Information");
        System.out.println("\t------------------");

        Other camera_ob = new OtherInfo();
        camera_ob.cameraInfo();
    }

    @Override
    public void BackCameratoOtherInfoMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            otherInfoMain(); //
        } else {
            BackCameratoOtherInfoMain();
        }
    }

    @Override
    public void smartWatchInformation() {
        System.out.println("\n\tSmart Watch Information");
        System.out.println("\t-----------------------");

        Other smartWatchInfo_ob = new OtherInfo();
        smartWatchInfo_ob.smartWatchInfo();
    }

    @Override
    public void BackSmartWatchOtherInfoMain() {
        System.out.println("\n\tPress '1' For back.");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            otherInfoMain(); //
        } else {
            BackSmartWatchOtherInfoMain();
        }
    }

    /* *************************************
     Here I Called All Method of Electronics
     ************************************** */
    // Added 4th option is All Main
    @Override
    public void electronicsAllMedtod() {

        Electronics.showList(); /// This method shows 3 main parts of electronics. 1. computer, 2. mobile. 3. others 4. back

        System.out.print("\n\t Choose another Option: ");

        int option2 = input.nextInt();

        if (option2 == 1) {
            computerMain();
        } else if (option2 == 2) {
            mobileMain();
        } else if (option2 == 3) {
            otherInfoMain();
        } else if (option2 == 4) {
            Submain object01 = new Submain();
            object01.catagoriesPart();

        } else {
            electronicsAllMedtod();
        }
    }

    /* ...........
   MALE CLOTHES
   .............. */
    public void maleClothMain() {
        System.out.println("\n\n\tMale Clothes: There are different types of clothes and it's price depends on it's quality.\n");
        Male shirt = new Male("Hawaiian Shirt", 1500);
        Male jeans = new Male("Jeans", 2000);
        Male suit = new Male("Suit", 7000);
        Male tshirt = new Male("T-Shirt", 1000);
        Male jacket = new Male("Jacket", 1000);
        Male jersey = new Male("Jersey", 500);
        Male belt = new Male("Belt", 900);
        Male shoes = new Male("Shoes", 5000);
        Male watch = new Male("Watch", 1200);
        Male tie = new Male("Tie", 1200);

        Male[] male = new Male[]{shirt, jeans, suit, tshirt, jacket, jersey, belt, shoes, watch, tie};
        int var = 1;
        for (int i = 0; i < male.length; i++) {
            System.out.println("\t"+var+". Product Name: " + male[i].name);
            System.out.println("\t Product Price: " + male[i].price);
            System.out.println("\t ---------------------------");
            var++;
        }
        System.out.println("\n");
    }

    public void BackToMaleClothMain() {
        System.out.println("\n\tPress '0' For back :  ");

        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 0) {
            clotheAllMethod();
        } else {

            BackToMaleClothMain();
        }
    }

    /* ...........
    Female clothes
    .............. */

    public void femaleClothMain() {
        System.out.println("\n\n\tFemale Clothes: There are different types of clothes and it's price depends on it's quality.\b");
        Female salwarKamiz = new Female("Salwar Kamiz Three piece", 5000);
        Female saree = new Female("Saree", 35000);
        Female western = new Female("Modern and Western", 5000);
        Female muslimCollection = new Female("Muslim Collection", 4000);
        Female hoodie = new Female("Hoodie", 1400);
        Female girlsJacket = new Female("Girls Jacket", 10000);
        Female kurti = new Female("Kurti", 1500);
        Female tribalTraditionalDresses = new Female("Tribal Traditional Dresses", 2000);
        Female sneakers = new Female("Sneakers, boot, sandal, high-heeled shoes", 1500);
        Female ladiesBag = new Female("Ladies Bag", 1400);

        Female[] female = new Female[]{salwarKamiz, saree, western, muslimCollection, hoodie, girlsJacket, kurti, tribalTraditionalDresses, sneakers, ladiesBag};
            int var = 1;
        for (int i = 0; i < female.length; i++) {
            System.out.println("\t"+var+". Product Name: " + female[i].name);
            System.out.println("\t Product Price: " + female[i].price);
            System.out.println("\t ---------------------------");
            var++;
        }
        System.out.println("\n");
    }

    public void BackToFemaleClothMain() {
        System.out.println("\n\tPress '0' For back   ");
        //System.out.println("Press '11' main part -> : ");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 0) {
            clotheAllMethod();
        } else {

            BackToFemaleClothMain();
        }
    }

    /* ...........
    JEWELLERY
    .............. */
    public void jewelleryMain() {
        System.out.println("\n\n\tJewellery Collection.\n");
        Jewellery earrings = new Jewellery("Earrings", 150);
        Jewellery nosepin = new Jewellery("Nose Pin", 500);
        Jewellery necklaces = new Jewellery("Necklaces", 1000);
        Jewellery curi = new Jewellery("Curi", 40);
        Jewellery hairBand = new Jewellery("Hair Band", 30);
        Jewellery payel = new Jewellery("Payel", 200);

        Jewellery[] jewellery = new Jewellery[]{earrings, nosepin, necklaces, curi, hairBand, payel};
            int var = 1;
        for (int i = 0; i < jewellery.length; i++) {
            System.out.println("\t"+var+". Product Name: " + jewellery[i].name);
            System.out.println("\t Product Price: " + jewellery[i].price);
            System.out.println("\t .............................");
            var++;
        }
        System.out.println("\n");
    }

    public void BackToJewelleryFemale() {
        System.out.println("\n\tPress '0' For back   ");
        //System.out.println("Press '11' main part -> : ");
        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 0) {
            clotheAllMethod();
        } else {
            BackToJewelleryFemale();
        }
    }

    // Added 4th option is All Main
    public void clotheAllMethod() {
        Clothes.showList();
       // System.out.println("\t4.Back Previous ");
        System.out.print("\n\tChoose your subcategory :  ");
        int subcategory = input.nextInt();

        if (subcategory == 1) {
            maleClothMain();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                clotheAllMethod();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 10) {
                        itemCode(code+168);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            BackToMaleClothMain();
        } else if (subcategory == 2) {
            femaleClothMain();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                clotheAllMethod();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 9) {
                        itemCode(code+179);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            BackToFemaleClothMain();
        } else if (subcategory == 3) {
            jewelleryMain();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                clotheAllMethod();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 6) {
                        itemCode(code+187);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            BackToJewelleryFemale();
        } else if (subcategory == 4) {

            Submain object01 = new Submain();
            object01.catagoriesPart();
        } else {
            clotheAllMethod();
        }
    }

    public void furnitureShow() {
        System.out.println("\n\n\t1. Bed\t\t\t\t2. Table\n\n\t3. Wardrobe\t\t\t4. Dresser\n\n\t5. Chair\t\t\t6. Sofa\n\n\t7. Cabinetry\t\t8. Ottoman\n\n\t9. Stool\t\t\t10. Chaise Longue\n\n\t11. Back \n");
        System.out.println("\t---------------------------");
        System.out.print("\n\tChoose your subcategory : ");
        // int subcategory = input.nextInt();
    }

    public void furintureMain() {

        furnitureShow();

        int subcategory = input.nextInt();

        if (subcategory == 1) {
            showBedProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.println("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 3) {
                        itemCode(code+222);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();

        } else if (subcategory == 2) {
            showTableProducts();

            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+225);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }

            backToFurnitureMain();
        } else if (subcategory == 3) {
            showWardrobeProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+239);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();
        } else if (subcategory == 4) {
            showDresserProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 2) {
                        itemCode(code+243);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();
        } else if (subcategory == 5) {
            showChairProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+245);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();
        } else if (subcategory == 6) {
            showCouchProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 3) {
                        itemCode(code+249);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();
        } else if (subcategory == 7) {
            showCabinetryProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 3) {
                        itemCode(code+252);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();
        } else if (subcategory == 8) {
            showOttomanProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 3) {
                        itemCode(code+255);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();
        } else if (subcategory == 9) {
            showStoolProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 3) {
                        itemCode(code+259);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();
        } else if (subcategory == 10) {
            showChaiseLongueProducts();
            System.out.println("\n\t'0' For Back ");
            System.out.print("\n\tEnter Number of Item that You Want to Buy : ");
            item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                furintureMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.print("\n\tEnter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+262);
                    } else {
                        System.out.println("\n\tOut of Range");
                    }
                }
            }
            backToFurnitureMain();
        } else if (subcategory == 11) {

            Submain object01 = new Submain();
            object01.catagoriesPart();

        } else {
            furintureMain();
        }

    }
    public  void showBedProducts() {
        System.out.println("\n\n\tBed: There are dozens of different types of beds.The price will be varies depends on the different quality.\n");

        Bed mansionBed = new Bed("Mansion Bed", 34650);
        Bed lakerpolish = new Bed("Laker Polish Foam Box Bed/Khat", 27600);
        Bed stylish = new Bed("Stylish Malaysian Processed Wood Bed.", 62000);
        Bed medicated = new Bed("Medicated & Solid Wood Box Bed", 11074);

        Bed[] beds = new Bed[]{mansionBed, lakerpolish, stylish, medicated};
        int var = 1;
        for (int i = 0; i < beds.length; i++) {
            System.out.println("\t"+var +". Product Name: " + beds[i].name);
            System.out.println(" \tProduct Price: " + beds[i].price);
            System.out.println(" \t---------------------------\n");
            var++;
        }
        System.out.println("\n");
    }

    public  void showTableProducts() {
        System.out.println("\n\n\tTable: There are dozens of different types of tables.The price will be varies depends on the different quality.\n");

        Table malaysian = new Table("Malaysian Processed Wood Dinning Table set.", 32499);
        Table RFL = new Table("RFL Dinning Table-Restaurant Table", 2500);
        Table dinning = new Table("Dinning Table With 6 chairs", 31500);
        Table royal = new Table("RFL Royal Coffee Table", 1700);

        Table[] Tables = new Table[]{malaysian, RFL, dinning, royal};
        int var = 1;
        for (int i = 0; i < Tables.length; i++) {
            System.out.println("\t"+var+". Product Name: " + Tables[i].name);
            System.out.println(" \tProduct Price: " + Tables[i].price);
            System.out.println("\t---------------------------\n");
            var++;

        }
        System.out.println("\n");
    }

    public  void showWardrobeProducts() {
        System.out.println("\n\n\tWardrobe: A Wardrobe Or Armoire is a closet usually equipped with a mirror,  drowers and other things used for storing clothes. There are dozens of different types of Wardrobe.The price will be varies depends on the different quality.\n");

        Wardrobe malaysian = new Wardrobe("Wardrobe Malaysian", 12500);
        Wardrobe platinum = new Wardrobe("Platinum – Crown-5 Step", 8500);
        Wardrobe mini = new Wardrobe("Mini Wooden Wardrobe", 3500);
        Wardrobe rfl = new Wardrobe("RFL Black & Gold Wardrobe", 5600);

        Wardrobe[] wardrobes = new Wardrobe[]{malaysian, platinum, mini, rfl};
        int var = 1;
        for (int i = 0; i < wardrobes.length; i++) {
            System.out.println("\t"+var+". Product Name: " + wardrobes[i].name);
            System.out.println(" \tProduct Price: " + wardrobes[i].price);
            System.out.println(" \t---------------------------\n");
            var++;
        }
        System.out.println("\n");
    }

    public  void showDresserProducts() {
        System.out.println("\n\n\tDresser: A type of sideboard, often with shelves above drawers for the display of plates.\n");

        Dresser malaysian = new Dresser("Malaysian  Wood Dressing.", 3500);
        Dresser dressing = new Dresser("Dressing Table slim.", 1100);

        Dresser[] dressers = new Dresser[]{malaysian, dressing};
        int var = 1;
        for (int i = 0; i < dressers.length; i++) {
            System.out.println("\t"+var+". Product Name: " + dressers[i].name);
            System.out.println(" \tProduct Price: " + dressers[i].price);
            System.out.println(" \t---------------------------\n");
            var++;
        }
        System.out.println("\n");
    }

    public  void showChairProducts() {
        Chair regal = new Chair("Regal Metal Rocking Chair ", 6270);
        Chair deko = new Chair("Deko relax Chair", 390);
        Chair caino = new Chair("Caino Armless Chair.", 1125);
        Chair restaurantChair = new Chair("Restaurant chair", 650);

        Chair[] chairs = new Chair[]{regal, deko, caino, restaurantChair};
        int var = 1;
        for (int i = 0; i < chairs.length; i++) {
            System.out.println("\t"+var+". Product Name: " + chairs[i].name);
            System.out.println(" \tProduct Price: " + chairs[i].price);
            System.out.println(" \t---------------------------\n");
            var++;
        }
    }

    public  void showCouchProducts() {
        Couch nyxi = new Couch("Nyxi Faux Leader white ottoman", 2930);
        Couch foldable = new Couch("Foldable Fabric Ottoman", 3741);
        Couch classic = new Couch("Classic Folding Ottoman", 9013);

        Couch[] couches = new Couch[]{nyxi, foldable, classic};
        int var = 1;
        for (int i = 0; i < couches.length; i++) {
            System.out.println("\t"+var+". Product Name: " + couches[i].name);
            System.out.println(" \tProduct Price: " + couches[i].price);
            System.out.println(" \t---------------------------\n");
            var++;
        }
        System.out.println("\n");
    }

    public  void showCabinetryProducts() {
        Cabinetry bedroom = new Cabinetry("Bedroom Cabinet", 2930);
        Cabinetry kitchen = new Cabinetry("Kitchen Cabinet", 3741);
        Cabinetry file = new Cabinetry("File Cabinet", 9013);

        Cabinetry[] cabinetries = new Cabinetry[]{bedroom, kitchen, file};
        int var = 1;
        for (int i = 0; i < cabinetries.length; i++) {
            System.out.println("\t"+var+". Product Name: " + cabinetries[i].name);
            System.out.println("\tProduct Price: " + cabinetries[i].price);
            System.out.println("\t---------------------------\n");
            var++;
        }
        System.out.println("\n");
    }

    public  void showOttomanProducts() {
        Ottoman woodAndFabricOttoman = new Ottoman("Wood and Fabric ottoman ", 8000);
        Ottoman nyxiFauxLeaderWhiteOttoman = new Ottoman("Nyxi Faux Leader white ottoman ", 3930);
        Ottoman foldableFabricOttoman = new Ottoman("Foldable Fabric Ottoman", 3741);
        Ottoman classicFoldingOttoman = new Ottoman("Classic Folding Ottoman", 9013);

        Ottoman[] ottomen = new Ottoman[]{woodAndFabricOttoman, nyxiFauxLeaderWhiteOttoman, foldableFabricOttoman, classicFoldingOttoman};
        int var = 1;
        for (int i = 0; i < ottomen.length; i++) {
            System.out.println("\t"+var+". Product Name: " + ottomen[i].name);
            System.out.println("\t Product Price: " + ottomen[i].price);
            System.out.println("\t ---------------------------\n");
            var++;
        }
        System.out.println("\n");
    }

    public  void showStoolProducts() {
        Stool wooden = new Stool("Wooden Frame & Artificial Cane Woven Stool ", 2450);
        Stool squareShape = new Stool("Square Shape PU Leather Rest Stool ", 800);
        Stool rflEasyStool = new Stool("RFL Easy Stool", 70);

        Stool[] stools = new Stool[]{wooden, squareShape, rflEasyStool};
        int var = 1;
        for (int i = 0; i < stools.length; i++) {
            System.out.println("\t"+var+". Product Name: " + stools[i].name);
            System.out.println("\t Product Price: " + stools[i].price);
            System.out.println("\t ---------------------------\n");
            var++;
        }
        System.out.println("\n");
    }

    public  void showChaiseLongueProducts() {
        ChaiseLongue wood = new ChaiseLongue("Wood Hotel Chaise Longue", 35720);
        ChaiseLongue garden = new ChaiseLongue("Garden Chaise  Longue ", 1153);
        ChaiseLongue living = new ChaiseLongue("Living Room Chaise Longue", 75675);
        ChaiseLongue vip = new ChaiseLongue("VIP waiting  Chaise Longue", 6377);

        ChaiseLongue[] chaiseLongues = new ChaiseLongue[]{wood, garden, living, vip};
        int var = 1;
        for (int i = 0; i < chaiseLongues.length; i++) {
            System.out.println("\t"+var+". Product Name: " + chaiseLongues[i].name);
            System.out.println(" \tProduct Price: " + chaiseLongues[i].price);
            System.out.println(" \t---------------------------\n");
            var++;
        }
    }

    public void backToFurnitureMain() {
        System.out.println("\n\tPress '1' For back ");

        System.out.print("\n\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            furintureMain();
        } else {
            backToFurnitureMain();
        }
    }

    //--------void item
    void itemCode(int n) {
        int  data, basePrice ;
        switch (n) {

            case 1:
                System.out.println("\tShaad Chinigura Rice");
                System.out.print("\n\tQuantity : ");
                int data1 = input.nextInt();
                basePrice = 130;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data1;
                price2[pri++] = 130;
                itemCount++;

                break;
            case 2:
                System.out.println("\tKhusboo Kalijira Rice");
                System.out.print("\tQuantity : ");
                int data11 = input.nextInt();
                basePrice = 135;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data11;
                price2[pri++] = 135;
                itemCount++;

                break;
            case 3:
                System.out.println("\tChinigura Rice");
                System.out.print("\tQuantity : ");

                int data111= input.nextInt();
                basePrice = 99;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data111;
                price2[pri++] = 99;
                itemCount++;

                break;
            case 4:
                System.out.println("\tRupchanda Chinigura Rice");
                System.out.print("\tQuantity : ");

                int data12 = input.nextInt();
                basePrice = 135;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data12;
                price2[pri++] = 135;
                itemCount++;

                break;
            case 5:
                System.out.println("\tTulshimala Polau Rice");
                System.out.print("\tQuantity : ");

                int data122 = input.nextInt();
                basePrice = 125;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data122;
                price2[pri++] = 125;
                itemCount++;

                break;
            case 6:
                System.out.println("\tChinigura Polau Rice");
                System.out.print("\tQuantity : ");

                int data13 = input.nextInt();
                basePrice = 130;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data13;
                price2[pri++] = 130;
                itemCount++;
                break;
            case 7:
                System.out.println("\tAtash Chal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 60;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 60;
                itemCount++;
                break;
            case 8:
                System.out.println("\tKatari Jirashail Rice");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 66;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 66;
                itemCount++;
                break;
            case 9:
                System.out.println("\tSupreme Basmati Rice");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 250;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 250;
                itemCount++;
                break;
            case 10:
                System.out.println("\tJirashail Rice");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 80;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 80;
                itemCount++;
                break;
            case 11:
                System.out.println("\tPremium Miniket Rice");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 65;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 65;
                itemCount++;
                break;
            case 12:
                System.out.println("\tPran Chinigura Rice");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 125;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 125;
                itemCount++;
                break;

//Dal List +12
            case 13:
                System.out.println("\tChola Boot Dal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 70;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 70;
                itemCount++;
                break;
            case 14:
                System.out.println("\tMoshur Dal (Deshi)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 109;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 109;
                itemCount++;
                break;
            case 15:
                System.out.println("\tMoshur Dal (Imported)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 89;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 89;
                itemCount++;
                break;
            case 16:
                System.out.println("\tMug Dal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 175;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 175;
                itemCount++;
                break;
            case 17:
                System.out.println("\tBoot Dal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 80;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 80;
                itemCount++;
                break;
            case 18:
                System.out.println("\tDubli Boot Dal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 70;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 70;
                itemCount++;
                break;
            case 19:
                System.out.println("\tMixed Dal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 130;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 130;
                itemCount++;
                break;
            case 20:
                System.out.println("\tAnchor Boot Dal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 80;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 80;
                itemCount++;
                break;
            case 21:
                System.out.println("\tGarbanzo Peeled");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 140;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 140;
                itemCount++;
                break;
            case 22:
                System.out.println("\tMashkolai Dal Peeled");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 200;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 200;
                itemCount++;
                break;

            case 23:
                System.out.println("\tKheshari Dal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 100;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 100;
                itemCount++;
                break;
            case 24:
                System.out.println("\tMotor Dal");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 180;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 180;
                itemCount++;
                break;

//Salt List +24
            case 25:
                System.out.println("\tACI Pure Salt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 35;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 35;
                itemCount++;
                break;
            case 26:
                System.out.println("\tFresh Super Salt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 32;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 32;
                itemCount++;
                break;
            case 27:
                System.out.println("\tRongdhanu Salt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 25;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 25;
                itemCount++;
                break;
            case 28:
                System.out.println("\tMuskan Salt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 35;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 35;
                itemCount++;
                break;
            case 29:
                System.out.println("\tPran Salt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 38;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 38;
                itemCount++;
                break;
            case 30:
                System.out.println("\tMolla Super Salt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 32;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 32;
                itemCount++;
                break;
            case 31:
                System.out.println("\tSena Salt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 32;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 32;
                itemCount++;
                break;

//Flour List +31
            case 32:
                System.out.println("\tTeer Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 42;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 42;
                itemCount++;
                break;
            case 33:
                System.out.println("\tTeer Maida");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;
            case 34:
                System.out.println("\tBashundhara Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 45;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 45;
                itemCount++;
                break;
            case 35:
                System.out.println("\tIfad Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 40;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 40;
                itemCount++;
                break;
            case 36:
                System.out.println("\tFresh Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 40;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 40;
                itemCount++;
                break;
            case 37:
                System.out.println("\tTeer Whole Wheat Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 44;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 44;
                itemCount++;
                break;
            case 38:
                System.out.println("\tIfad Brown Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 45;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 45;
                itemCount++;
                break;
            case 39:
                System.out.println("\tRice Flour");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 80;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 80;
                itemCount++;
                break;
            case 40:
                System.out.println("\tBashundhara Brown Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 45;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 45;
                itemCount++;
                break;
            case 41:
                System.out.println("\tFresh Maida");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;
            case 42:
                System.out.println("\tIfad Maida");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;
            case 43:
                System.out.println("\tACI Pure Maida");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 48;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 48;
                itemCount++;
                break;
            case 44:
                System.out.println("\tACI Pure Brown Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 45;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 45;
                itemCount++;
                break;
            case 45:
                System.out.println("\tShaad Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 42;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 42;
                itemCount++;
                break;
            case 46:
                System.out.println("\tShaad Maida");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;
            case 47:
                System.out.println("\tPusti Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 40;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 40;
                itemCount++;
                break;
            case 48:
                System.out.println("\tShaad Brown Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 45;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 45;
                itemCount++;
                break;
            case 49:
                System.out.println("\tPusti Maida");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 49;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 49;
                itemCount++;
                break;
            case 50:
                System.out.println("\tBPM Red Rice Flour");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 100;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 100;
                itemCount++;
                break;
            case 51:
                System.out.println("\tFresh Whole Wheat Atta");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 44;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 44;
                itemCount++;
                break;

//MasalaList +51
            case 52:
                System.out.println("\tCumin Seed (Jira)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 390;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 390;
                itemCount++;
                break;
            case 53:
                System.out.println("\tCinnamon (Daruchini)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 790;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 790;
                itemCount++;
                break;
            case 54:
                System.out.println("\tCardamom (Elachi)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2980;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2980;
                itemCount++;
                break;
            case 55:
                System.out.println("\tRadhuni Turmeric Powder (Holud)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 475;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 475;
                itemCount++;
                break;
            case 56:
                System.out.println("\tRadhuni Chilli (Morich)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 500;
                itemCount++;
                break;
            case 57:
                System.out.println("\tDried Chillies (Shukna Morich)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 290;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 290;
                itemCount++;
                break;
            case 58:
                System.out.println("\tBay Leaves (Tejpata)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 190;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 190;
                itemCount++;
                break;
            case 59:
                System.out.println("\tRadhuni Cumin (Jeera)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 800;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 800;
                itemCount++;
                break;
            case 60:
                System.out.println("\tCloves (Lobongo)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2580;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2580;
                itemCount++;
                break;
            case 61:
                System.out.println("\tRadhuni Coriander (Dhoniya)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 345;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 345;
                itemCount++;
                break;
            case 62:
                System.out.println("\tBlack Cumin (Kalo Jira)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 490;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 490;
                itemCount++;
                break;

            case 63:
                System.out.println("\tRadhuni Garam Masala");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1475;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1475;
                itemCount++;
                break;

            case 64:
                System.out.println("\tFenugreek Seed (Methi)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 190;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 190;
                itemCount++;
                break;
            case 65:
                System.out.println("\tRadhuni Roast Masala");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1400;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1400;
                itemCount++;
                break;
            case 66:
                System.out.println("\tMix Spice (Pach Foron)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 290;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 290;
                itemCount++;
                break;

//Suji List  +66
            case 67:
                System.out.println("\tIfad Suji");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 64;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 64;
                itemCount++;
                break;

            case 68:
                System.out.println("Teer Semolina Suji");
                System.out.print("Quantity : ");

                data = input.nextInt();
                basePrice = 64;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 64;
                itemCount++;
                break;

            case 69:
                System.out.println("\tBashundhara Suji");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 66;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 66;
                itemCount++;
                break;
            case 70:
                System.out.println("\tFresh Suji");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 64;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 64;
                itemCount++;
                break;
            case 71:
                System.out.println("\tACI Pure Suji");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 64;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 64;
                itemCount++;
                break;
            case 72:
                System.out.println("\tMuskaan Suji");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 64;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 64;
                itemCount++;
                break;
            case 73:
                System.out.println("\tShaad Suji");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 64;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 64;
                itemCount++;
                break;
            case 74:
                System.out.println("\tPusti Suji");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 64;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 64;
                itemCount++;
                break;

//Egg list +74
            case 75:
                System.out.println("\tChicken Eggs (Layer)-4pcs");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 36;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 36;
                itemCount++;
                break;
            case 76:
                System.out.println("\tQuail Eggs-4pcs");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 17;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 17;
                itemCount++;
                break;
            case 77:
                System.out.println("\tDuck Eggs (Deshi)-4pcs");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 60;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 64;
                itemCount++;
                break;
            case 78:
                System.out.println("\tOrganic Chicken Eggs (Deshi)-4pcs");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;

//pea flour list +78
            case 79:
                System.out.println("\tBooter Beshon");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 98;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 98;
                itemCount++;
                break;
            case 80:
                System.out.println("\tFit Food Beshon");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 516;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 516;
                itemCount++;
                break;
            case 81:
                System.out.println("\tBPM Mashkalai Bason");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 220;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 220;
                itemCount++;
                break;

//Edible Oil list +81
            case 82:
                System.out.println("\tKing's Sunflower Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 270;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 270;
                itemCount++;
                break;
            case 83:
                System.out.println("\tRupchanda Soyabean Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 152;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 152;
                itemCount++;
                break;
            case 84:
                System.out.println("\tPusti Soyabean Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 150;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 150;
                itemCount++;
                break;
            case 85:
                System.out.println("\tOlitalia Sunflower Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 325;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 325;
                itemCount++;
                break;
            case 86:
                System.out.println("\tPran Mustard Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 270;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 270;
                itemCount++;
                break;
            case 87:
                System.out.println("\tDhakaiya Black Seed Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1850;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1850;
                itemCount++;
                break;
            case 88:
                System.out.println("\tShera Bangla Pure Mustard Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 225;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 225;
                itemCount++;
                break;
            case 89:
                System.out.println("\tFresh Mustard Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 270;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 270;
                itemCount++;
                break;
            case 90:
                System.out.println("\tSajeeb Mustard Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 270;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 270;
                itemCount++;
                break;
            case 91:
                System.out.println("\tShaad Mustard Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 260;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 260;
                itemCount++;
                break;
            case 92:
                System.out.println("\tFortune Rice Bran Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 195;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 195;
                itemCount++;
                break;
            case 93:
                System.out.println("\tTeer Soyabean Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 145;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 145;
                itemCount++;
                break;
            case 94:
                System.out.println("\tRadhuni Pure Mustard Oil Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 270;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 270;
                itemCount++;
                break;

//Vinegar list +94
            case 95:
                System.out.println("\tBD Vinegar Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 85;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 85;
                itemCount++;
                break;
            case 96:
                System.out.println("\tBragg Apple Cider Vinegar Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 560;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 560;
                itemCount++;
                break;
            case 97:
                System.out.println("\tCalypso Apple Vinegar Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 510;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 510;
                itemCount++;
                break;
            case 98:
                System.out.println("\tHeinz Apple Cider Vinegar Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 425;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 425;
                itemCount++;
                break;
            case 99:
                System.out.println("\tSaporito Red Grape Vinegar Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 660;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 660;
                itemCount++;
                break;
            case 100:
                System.out.println("\tAhmed White Vinegar Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 130;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 130;
                itemCount++;
                break;
            case 101:
                System.out.println("\tHeinz White Vinegar Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 420;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 420;
                itemCount++;
                break;
            case 102:
                System.out.println("\tBorges Apple Cider Vinegar Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 555;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 555;
                itemCount++;
                break;

//Tea Poly list +102
            case 103:
                System.out.println("\tBrooke Bond Taaza Black Tea Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 500;
                itemCount++;
                break;
            case 104:
                System.out.println("\tIspahani Mirzapore Best Leaf Tea Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 475;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 475;
                itemCount++;
                break;
            case 105:
                System.out.println("\tNestea Iced Tea Lemon Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 600;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 600;
                itemCount++;
                break;
            case 106:
                System.out.println("\tFinlay Premium Tea Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 520;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 520;
                itemCount++;
                break;
            case 107:
                System.out.println("\tMuskan BOP Tea Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 360;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 360;
                itemCount++;
                break;
            case 108:
                System.out.println("\tIspahani Zareen Premium Tea Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 600;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 600;
                itemCount++;
                break;

//Tea Bag list +108
            case 109:
                System.out.println("\tIspahani Mirzapore Tea Bag Per 50 pcs");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 85;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 85;
                itemCount++;
                break;
            case 110:
                System.out.println("\tKazi & Kazi Green Tea Per 50 pcs");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 210;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 210;
                itemCount++;
                break;
            case 111:
                System.out.println("\tTetley Premium Tea Bags Per 50 pcs");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 75;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 75;
                itemCount++;
                break;
            case 112:
                System.out.println("\tFinlays Pure Green Tea Per 50 pcs");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 110;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 110;
                itemCount++;
                break;

//Vermicelli list +112
            case 113:
                System.out.println("\tCock Vermicelli Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 175;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 175;
                itemCount++;
                break;
            case 114:
                System.out.println("\tDekko Vermicelli Shemai Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 145;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 145;
                itemCount++;
                break;
            case 115:
                System.out.println("\tACI Pure Vermicelli Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 145;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 145;
                itemCount++;
                break;
            case 116:
                System.out.println("\tPran Vermicelli Shemai Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 175;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 175;
                itemCount++;
                break;
            case 117:
                System.out.println("\tBD Vermicelli Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 175;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 175;
                itemCount++;
                break;
            case 118:
                System.out.println("\tBashundhara Vermicelli Shemai Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 165;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 165;
                itemCount++;
                break;
            case 119:
                System.out.println("\tBanoful Vermicelli Shemai Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 175;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 175;
                itemCount++;
                break;
            case 120:
                System.out.println("\tArku Vermicelli Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 160;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 160;
                itemCount++;
                break;

//Peanut list +120
            case 121:
                System.out.println("\tKaju Badam (Cashew Nut) Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1090;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1090;
                itemCount++;
                break;
            case 122:
                System.out.println("\tAlmonds (Kath Badam) Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 990;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 990;
                itemCount++;
                break;
            case 123:
                System.out.println("\tPeanut Raw (Kacha Cheena Badam) Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 290;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 290;
                itemCount++;
                break;
            case 124:
                System.out.println("\tPeanut Peeled (Vaja Cheena Badam) Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 390;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 390;
                itemCount++;
                break;
            case 125:
                System.out.println("\tPistachios (Pesta Badam) Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2190;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2190;
                itemCount++;
                break;

//Biscuit list +125
            case 126:
                System.out.println("\tOlympic Premium Energy Plus Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 85;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 85;
                itemCount++;
                break;
            case 127:
                System.out.println("\tBelleame Cremo Vanilla Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 165;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 165;
                itemCount++;
                break;
            case 128:
                System.out.println("\tHaque Milk Chocolate Digestive Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 120;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 120;
                itemCount++;
                break;
            case 129:
                System.out.println("\tCocola Champion Chocolate Cream Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 100;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 100;
                itemCount++;
                break;
            case 130:
                System.out.println("\tOlympic Pineapple Cream Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 90;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 90;
                itemCount++;
                break;
            case 131:
                System.out.println("\tPran Potata Spicy Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 125;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 125;
                itemCount++;
                break;
            case 132:
                System.out.println("\tOlympic Malai Cream Energy Plus Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 88;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 88;
                itemCount++;
                break;
            case 133:
                System.out.println("\tOlympic Nutty Real Peanut Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 95;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 95;
                itemCount++;
                break;
            case 134:
                System.out.println("\tFit Crakers Masala Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 95;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 95;
                itemCount++;
                break;
            case 135:
                System.out.println("\tDanish Doreo Black Chocolate Sandwich Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 180;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 180;
                itemCount++;
                break;
            case 136:
                System.out.println("\tIfad Choco Delight Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 100;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 100;
                itemCount++;
                break;
            case 137:
                System.out.println("\tCocola Lexus Vegetable Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 115;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 115;
                itemCount++;
                break;
            case 138:
                System.out.println("\tOlympic Milk Plus Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 75;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 75;
                itemCount++;
                break;
            case 139:
                System.out.println("\tCadbury Oreo Original Cream Biscuit Per 500 gm");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 230;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 230;
                itemCount++;
                break;

//Noodles list +139
            case 140:
                System.out.println("\tCocola Egg Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 18;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 18;
                itemCount++;
                break;
            case 141:
                System.out.println("\tNestle Maggi 2-Minute Masala Instant Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 16;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 16;
                itemCount++;
                break;
            case 142:
                System.out.println("\tNestle Maggi 2-Minute Masala Blast Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 18;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 18;
                itemCount++;
                break;
            case 143:
                System.out.println("\tDoodles Stick Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 18;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 18;
                itemCount++;
                break;
            case 144:
                System.out.println("\tDoodles Masala Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 16;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 16;
                itemCount++;
                break;
            case 145:
                System.out.println("\tMr.Noodles Chicken Cup Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 30;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 30;
                itemCount++;
                break;
            case 146:
                System.out.println("\tCocola Chicken Masala Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 20;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 20;
                itemCount++;
                break;
            case 147:
                System.out.println("\tIfad Eggy Instant Masala Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 22;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 22;
                itemCount++;
                break;
            case 148:
                System.out.println("\tCocola Hot & Spicy Cup Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 30;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 30;
                itemCount++;
                break;
            case 149:
                System.out.println("\tMama Noodles Chicken Flavor Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 16;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 16;
                itemCount++;
                break;
            case 150:
                System.out.println("\tMama Hot & Spicy Cup Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 60;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 60;
                itemCount++;
                break;
            case 151:
                System.out.println("\tSajeeb Tandoori Chicken Noodles Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 20;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 20;
                itemCount++;
                break;
            case 152:
                System.out.println("\tMr.Noodles Magic Masala Per pack");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 16;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 16;
                itemCount++;
                break;

//Powder Milk list +152
            case 153:
                System.out.println("\tDiploma Full Cream Milk Powder Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 690;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 690;
                itemCount++;
                break;
            case 154:
                System.out.println("\tGoalini Full Cream Milk Powder Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 540;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 540;
                itemCount++;
                break;
            case 155:
                System.out.println("\tArla Dano Daily Pusti Milk Powder Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 475;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 475;
                itemCount++;
                break;
            case 156:
                System.out.println("\tDanish Full Cream Milk Powder Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 609;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 609;
                itemCount++;
                break;
            case 157:
                System.out.println("\tMarks Milk Powder (Poly) Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 700;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 700;
                itemCount++;
                break;
            case 158:
                System.out.println("\tNestle Nido Fortigrow Full Cream Milk Powder Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 800;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 800;
                itemCount++;
                break;
            case 159:
                System.out.println("\tStarship Full Cream Milk Powder Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 520;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 520;
                itemCount++;
                break;
            case 160:
                System.out.println("\tAarong Dairy Instant Low Fat Milk Powder Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 620;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 620;
                itemCount++;
                break;
            case 161:
                System.out.println("\tPran Full Cream Milk Powder Per Kg");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 680;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 680;
                itemCount++;
                break;

//Soft Drinks list +161
            case 162:
                System.out.println("\tCoca-Cola Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;
            case 163:
                System.out.println("\t7up Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;
            case 164:
                System.out.println("\tSprite Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;
            case 165:
                System.out.println("\tMountain Dew Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;
            case 166:
                System.out.println("\tPran Up Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 45;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 45;
                itemCount++;
                break;
            case 167:
                System.out.println("\tClemon Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 45;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 45;
                itemCount++;
                break;
            case 168:
                System.out.println("\tMiranda Orange Per litre");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 50;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 50;
                itemCount++;
                break;

//---------------------------------------------//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//Male + 168
            case 169:
                System.out.println("\tShirt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1500;
                itemCount++;
                break;
            case 170:
                System.out.println("\tJeans");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2000;
                itemCount++;
                break;
            case 171:
                System.out.println("\tSuit");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 7000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 7000;
                itemCount++;
                break;
            case 172:
                System.out.println("\tT-shirt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1000;
                itemCount++;
                break;
            case 173:
                System.out.println("\tJacket");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1000;
                itemCount++;
                break;
            case 174:
                System.out.println("\tJersey");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 500;
                itemCount++;
                break;
            case 175:
                System.out.println("\tBelt");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 900;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 900;
                itemCount++;
                break;
            case 176:
                System.out.println("\tShoes");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 5000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 5000;
                itemCount++;
                break;
            case 177:
                System.out.println("\tWatch");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1200;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1200;
                itemCount++;
                break;
            case 178:
                System.out.println("\tTie");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1200;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1200;
                itemCount++;
                break;

//Female = 179
            case 179:
                System.out.println("\tSalwar Kamiz Three piece");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 5000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 5000;
                itemCount++;
                break;
            case 180:
                System.out.println("\tSaree");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 35000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 35000;
                itemCount++;
                break;

            case 181:
                System.out.println("\tModern and Western");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 5000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 5000;
                itemCount++;
                break;
            case 182:
                System.out.println("\tMuslim Collection");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 4000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 4000;
                itemCount++;
                break;
            case 183:
                System.out.println("\tHoodie");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1400;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1400;
                itemCount++;
                break;
            case 184:
                System.out.println("\tGirls Jacket");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 10000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 10000;
                itemCount++;
                break;
            case 185:
                System.out.println("\tKurti");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1500;
                itemCount++;
                break;
            case 186:
                System.out.println("\tTribal Traditional Dresses");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2000;
                itemCount++;
                break;
            case 187:
                System.out.println("Ladies Bag");
                System.out.print("Quantity : ");

                data = input.nextInt();
                basePrice = 1500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1500;
                itemCount++;
                break;

//Jewellery + 187
            case 188:
                System.out.println("\tEarrings");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 150;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 150;
                itemCount++;
                break;
            case 189:
                System.out.println("\tNose Pin");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 500;
                itemCount++;
                break;

            case 190:
                System.out.println("\tNecklaces");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1000;
                itemCount++;
                break;
            case 191:
                System.out.println("\tCuri");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 40;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 40;
                itemCount++;
                break;
            case 192:
                System.out.println("\tHair band");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 30;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 30;
                itemCount++;
                break;
            case 193:
                System.out.println("\tPayel");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 200;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 200;
                itemCount++;
                break;

//Laptop - + 193
//---------------------------------
            case 194:
                System.out.println("\tHP Laptop 15s-du3023TU");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 52000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 52000;
                itemCount++;
                break;

            case 195:
                System.out.println("\tDell Laptop-");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 73000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 73000;
                itemCount++;
                break;
            case 196:
                System.out.println("\tApple MacBook ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 10800;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 5200;
                itemCount++;
                break;

            case 197:
                System.out.println("\tLenovo- IdeaPad Slim 3");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 43000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 43000;
                itemCount++;
                break;
            // Desktop - + 197
//---------------------------------
            case 198:
                System.out.println("\tRyzen-PC AMD Athlon 3000G");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                //add = data * 22100;
                basePrice = 22100;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 22100;
                itemCount++;
                break;
            case 199:
                System.out.println("\tIntel Gaming PC ASRock B560 Pro4 ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 112500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 112500;
                itemCount++;
                break;

            case 200:
                System.out.println("\tRyzen Gaming PC- pc: Asrock B450M");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 110500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 110500;
                itemCount++;
                break;
            case 201:
                System.out.println("\tHP keyboard");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 600;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 600;
                itemCount++;
                break;
                // Accessories + 201
            case 202:
                System.out.println("\tLogitech Keyboard & Mouse ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1750;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 1750;
                itemCount++;
                break;

            case 203:
                System.out.println("\tBluetooth Speaker");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 7500;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 7500;
                itemCount++;
                break;
            case 204:
                System.out.println("\tUSB 3.0 Mobile Disk Drive");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 550;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 550;
                itemCount++;
                break;

            case 205:
                System.out.println("\tHD WebCam ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 2000;
                itemCount++;
                break;
            case 206:
                System.out.println("\tA4TECH N-70FX ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 575;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 575;
                itemCount++;
                break;

            //Sumsung Mobile + 206
            case 207:
                System.out.println("\tSamsung Galaxy M22");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 15000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 15000;
                itemCount++;
                break;
            case 208:
                System.out.println("\tSamsung Galaxy M32 5G");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 20000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 20000;
                itemCount++;
                break;

            case 209:
                System.out.println("\tSamsung Galaxy A03s ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 18000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 18000;
                itemCount++;
                break;
            case 210:
                System.out.println("\tSamsung Galaxy A52s 5G");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 25000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 25000;
                itemCount++;
                break;
            //Sumsung Mobile + 210
            case 211:
                System.out.println("\tXiaomi Pad 5 Pro");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 32000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 32000;
                itemCount++;
                break;

            case 212:
                System.out.println("\tXiaomi Poco X3 GT ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 32000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 32000;
                itemCount++;
                break;
            case 213:
                System.out.println("\tXiaomi Poco M3 Pro 5G");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 27000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 27000;
                itemCount++;
                break;
            case 214:
                System.out.println("\tXiaomi Redmi Note 10 Pro");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 34000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 34000;
                itemCount++;
                break;
                //Apple + 214
            case 215:
                System.out.println("\tApple iPhone 13 Pro");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 82000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 82000;
                itemCount++;
                break;

            case 216:
                System.out.println("\tApple iPad mini (2021)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 42000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 42000;
                itemCount++;
                break;
            case 217:
                System.out.println("\tApple iPad 10.2");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 57000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 57000;
                itemCount++;
                break;
            case 218:
                System.out.println("\tApple iPhone 12");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 72000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 72000;
                itemCount++;
                break;
//google +218
            case 219:
                System.out.println("\tGoogle Pixel 5a 5G");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 23000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 23000;
                itemCount++;
                break;

            case 220:
                System.out.println("\tGoogle Pixel 4a 5G");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 21000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 21000;
                itemCount++;
                break;
            case 221:
                System.out.println("\tGoogle Pixel 3a");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1800;
                totalPrice += add;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 57000;
                itemCount++;
                break;
            case 222:
                System.out.println("\tGoogle Pixel 4");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 26000;
                totalPrice += basePrice;
                collect[itemCount] = n;
                quantity[itemCount] = data;
                price2[itemCount] = 26000;
                itemCount++;
                break;



                //Bed + 223

            case 223:
                System.out.println("\tMansion Bed");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 32650;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 32650;
                itemCount++;
                break;
            case 224:
                System.out.println("\tLaker Polish Foam Box Bed");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 27600;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 27600;
                itemCount++;
                break;

            case 225:
                System.out.println("\tMedicated & Solid Wood Box Bed");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 11074;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 11074;
                itemCount++;
                break;

// Table + 225
            case 226:
                System.out.println("\tMalaysian Processed Wood Dinning Table set");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 32499;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 32499;
                itemCount++;
                break;
            case 227:
                System.out.println("\tRFL Dinning Table-Restaurant Table ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2500;
                itemCount++;
                break;
            case 228:
                System.out.println("\tDinning Table With 6 chairs ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 31500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 31500;
                itemCount++;
                break;
            case 229:
                System.out.println("\tRFL Royal Coffee Table ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1700;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1700;
                itemCount++;
                break;

//Wardrobe + 239
            case 240:
                System.out.println("\tWardrobe Malaysian");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 12500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 12500;
                itemCount++;
                break;
            case 241:
                System.out.println("\tPlatinum – Crown-5 Step");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 8500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 8500;
                itemCount++;
                break;
            case 242:
                System.out.println("\tMini Wooden Wardrobe ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 3500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 3500;
                itemCount++;
                break;
            case 243:
                System.out.println("\tRFL Black & Gold Wardrobe ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 5600;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 5600;
                itemCount++;
                break;
//dressing+243
            case 244:
                System.out.println("\tMalaysian  Wood Dressing");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 3500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 3500;
                itemCount++;
                break;
            case 245:
                System.out.println("\tDressing Table slim)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1100;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1100;
                itemCount++;
                break;
 //Chair + 245
            case 246:
                System.out.println("\tRegal Metal Rocking Chair)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 6270;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 6270;
                itemCount++;
                break;
            case 247:
                System.out.println("\tDeko relax Chair");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 390;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 390;
                itemCount++;
                break;
            case 248:
                System.out.println("\tCaino Armless Chair");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1125;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1125;
                itemCount++;
                break;
            case 249:
                System.out.println("\tRestaurant chair");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 650;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 650;
                itemCount++;
                break;
 //couch +249
            case 250:
                System.out.println("\tNyxi Faux Leader white  couch");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2930;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2930;
                itemCount++;
                break;
            case 251:
                System.out.println("\tFoldable Fabric couch");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 3741;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 3741;
                itemCount++;
                break;
            case 252:
                System.out.println("\tClassic Folding couch");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 9013;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 9013;
                itemCount++;
                break;
                //Cabinet + 252
            case 253:
                System.out.println("\tBedroom Cabinet");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2930;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2930;
                itemCount++;
                break;

            case 254:
                System.out.println("\tKitchen Cabinet");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 3741;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 3741;
                itemCount++;
                break;
            case 255:
                System.out.println("\tFile Cabinet");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 9013;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 9013;
                itemCount++;
                break;
//cabint + 255
            case 256:
                System.out.println("\tWood and Fabric ottoman");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 8000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 8000;
                itemCount++;
                break;
            case 257:
                System.out.println("\tNyxi Faux Leader white ottoman");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 3930;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 3930;
                itemCount++;
                break;
            case 258:
                System.out.println("\tFoldable Fabric Ottoman");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 3741;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 3741;
                itemCount++;
                break;
            case 259:
                System.out.println("\tClassic Folding Ottoman");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 9013;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 9013;
                itemCount++;
                break;
                //stoll + 259
            case 260:
                System.out.println("\tWooden Frame & Artificial Cane Woven Stool");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 2450;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 2450;
                itemCount++;
                break;
            case 261:
                System.out.println("\tSquare Shape PU Leather Rest Stool");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 800;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 800;
                itemCount++;
                break;
            case 262:
                System.out.println("\tRFL Easy Stool");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 70;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 70;
                itemCount++;
                break;
//chaise + 262
            case 263:
                System.out.println("\tWood Hotel Chaise Longue");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 35720;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 35720;
                itemCount++;
                break;

            case 264:
                System.out.println("\tGarden Chaise  Longue");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 1153;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 1153;
                itemCount++;
                break;
            case 265:
                System.out.println("\tLiving Room Chaise Longue");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 75675;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 75675;
                itemCount++;
                break;
            case 266:
                System.out.println("\tVIP waiting  Chaise Longue");
                System.out.print("Quantity : ");

                data = input.nextInt();
                basePrice = 6377;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 6377;
                itemCount++;
                break;

            //tv+266
            case 267:
                System.out.println("\tSamsung N5300 40 FHD Smart TV");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 36000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 36000;
                itemCount++;
                break;
            case 268:
                System.out.println("\tLG 55UM7340PVA 55 IPS UHD 4K Smart LED TV");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 74000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 74000;
                itemCount++;
                break;
            case 269:
                System.out.println("\tLG 49UM7340PVA 49 IPS UHD 4K Smart LED TV");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 60000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 60000;
                itemCount++;
                break;
            case 270:
                System.out.println("\tSamsung 55TU8000 55 Crystal UHD 4K Smart LED TV");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 70000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 70000;
                itemCount++;
                break;

//Ac + 270
            case 271:
                System.out.println("\tGeneral ASGA18FMTB 1.5 Ton Split Air Conditioner");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 72000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 72000;
                itemCount++;
                break;
            case 272:
                System.out.println("\tGree GS24CT410 2 Ton Split Air Conditioner");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 67000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 67000;
                itemCount++;
                break;
            case 273:
                System.out.println("\tGeneral ASGA30AFC 2.5 Ton Split Air Conditioner ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 108000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 108000;
                itemCount++;
                break;
            case 274:
                System.out.println("\tELITE 1.5 Ton Split type Non-Inverter Air Conditioner");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 36000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 36000;
                itemCount++;
                break;

//Camera info + 274
            case 275:
                System.out.println("\tCanon EOS 80D DSLR Camera with 18-135mm IS USM Lens");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 98000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 98000;
                itemCount++;
                break;
            case 276:
                System.out.println("\tNikon D5600 DSLR Camera with 18-55mm Lens");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 61500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 61500;
                itemCount++;
                break;
            case 277:
                System.out.println("\tCANON EOS 2000D 24.1MP WITH 18-55MM KIT LENS FULL HD");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 41500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 41500;
                itemCount++;
                break;
            case 278:
                System.out.println("\tNikon D500 DSLR Camera (only body)");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 145000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 145000;
                itemCount++;
                break;

//samrt + 278
            case 279:
                System.out.println("\tApple Watch SE (MYDM2LL/A) GPS 40mm Sport Band");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 30900;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 30900;
                itemCount++;
                break;
            case 280:
                System.out.println("\tXiaomi Haylou LS02 Touch Screen Square Shape Smart Watch Black");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 25500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 25500;
                itemCount++;
                break;
            case 281:
                System.out.println("\tRealme RMA161 1.4 Square Activity Tracker Smart Watch Black");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 38500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 38500;
                itemCount++;
                break;
//Pre order
            case 282:
                System.out.println("\tHidden Cameras");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 10000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 10000;
                itemCount++;
                break;
            case 283:
                System.out.println("Rainbow Flatware  ");
                System.out.print("Quantity : ");

                data = input.nextInt();
                basePrice = 70000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 70000;
                itemCount++;
                break;
            case 284:
                System.out.println("\tSmart Personal Air Cooler ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 5000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 5000;
                itemCount++;
                break;
            case 285:
                System.out.println("\tReusable Straws");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 4533;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 4533;
                itemCount++;
                break;
            case 286:
                System.out.println("\tWooden Alarm Clock");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 9000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 9000;
                itemCount++;
                break;

            case 287:
                System.out.println("\tBaby Feather Wings");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice =  400;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] =  400;
                itemCount++;
                break;
            case 288:
                System.out.println("\tHair Removal Epilator");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice =  500;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] =  500;
                itemCount++;
                break;
            case 289:
                System.out.println("\tDog Treat Launcher                      ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice = 300;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 300;
                itemCount++;
                break;
            case  290:
                System.out.println("\tM1 Pro and M1 Max MacBook          ");
                System.out.print("\tQuantity : ");

                data = input.nextInt();
                basePrice =  102000;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 102000;
                itemCount++;
                break;
            case  291:
                System.out.println("\tGoogle Pixel 6 Pro    ");
                System.out.print("Quantity : ");

                data = input.nextInt();
                basePrice =  107490;
                totalPrice += basePrice;
                collect[ci++] = n;
                quantity[qi++] = data;
                price2[pri++] = 107490;
                itemCount++;
                break;



        }
    }

    public void takenItemPrint() {

        System.out.println("\n\n\t---------------------------------");
        System.out.println("\tTotal Item Count : " + itemCount);
        System.out.println("\t---------------------------------\n\n");


        System.out.println("\t\t---- Purchase History ----\n");
        System.out.println("\tCode NO. \tQuantity \tPrice\tTotal Price");
        System.out.println("\t--------------------------------------------------\n");

        for (int j = 0; j < itemCount; j++) {

            System.out.print("\t"+collect[j]+"\t\t\t\t"+ quantity[j]+"\t\t"+price2[j]+"\t\t"+quantity[j]*price2[j]+"\n");
            totalCost += (quantity[j]*price2[j]);
            System.out.println("\t--------------------------------------------------");
            }
        System.out.println("\tTotal Cost -------------------------- = "+totalCost);
    }

    public void  preOrder()
    {
        System.out.println("\n\n\tBelow This Product Comming soon \n");
        System.out.println("\t---------------------------------\n");

        System.out.println("\t1. Hidden Cameras                        10000\n"+
                           "\t2. Rainbow Flatware                      70000\n" +
                           "\t3. Smart Personal Air Cooler             5000\n" +
                           "\t4. Reusable Straws                       4533\n" +
                           "\t5. Wooden Alarm Clock                    90000\n" +
                           "\t6. Baby Feather Wings                     400\n" +
                           "\t7. Hair Removal Epilator                  500\n" +
                           "\t8. Dog Treat Launcher                     300\n" +
                           "\t9. M1 Pro and M1 Max MacBook             102000\n" +
                           "\t10. Google Pixel 6 Pro                   107490\n");

          System.out.println("\t------------------------------------------------");

//            System.out.println("\t'0' for back \n");
//            System.out.print("\tEnter Number of Item that You Want to Buy : ");
//            item = input.nextInt();
//
//            if(item == 0)
//            for (int k = 0; k < item; k++) {
//                System.out.println("\tEnter Code Numnber : ");
//                int code = input.nextInt();
//                if (code >= 1 && code <= 3)
//                {
//                    itemCode(code+281);
//                }
//                else
//                {
//                    System.out.println("\tOut of Range");
//                }
//
//            }


    }
}

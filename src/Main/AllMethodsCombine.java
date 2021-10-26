package Main;

import electronic_part.*;

import Clothes_part.*;
import Furniture1.*;
import java.util.Scanner;

public class AllMethodsCombine implements ElectronicsMedthods , ClothesMethods , GroceriesMethods , FurnitureMethods{

    Scanner input = new Scanner(System.in);
    int[] arr = new int[100];
    int[] collect = new int[100];
    int[] quantity = new int[100];
    int[] price2 = new int[100];
    int totalPrice = 0, add = 0, len = 0;
    int ci = 0, qi = 0, pri = 0;

    int itemCount = 0;








    public void GroMain(){
        System.out.println("\n\t1. Rice\t\t\t\t\t\t2. Dal\n\n\t3. Salt\t\t\t\t\t\t4. Flour\n\n\t5. Masala\t\t\t\t\t6. Suji\n\n\t7. Egg\t\t\t\t\t\t8. Pea-flour\n\n\t9. Edible Oil\t\t\t\t10. Vinegar\n\n\t11. Tea Bag\t\t\t\t\t12. Tea Poly Bag\n\n\t13. Vermicelli\t\t\t\t14. Peanut\n\n\t15. Biscuit\t\t\t\t\t16. Noodles\n\n\t17. Powder Milk\t\t\t\t18. Soft Drinks\n\n\t\t\t19. Back\n");
        System.out.print("Choice an Option : ");
        int num = input.nextInt();
        switch (num){
            case 1:

                riceList();

                BackGroMain();
                break;
            case 2:

                dalList();
                BackGroMain();
                break;
            case 3:
                saltList();
                BackGroMain();
                break;
            case 4:
                flourList();
                BackGroMain();
                break;
            case 5:
                masalaList();
                BackGroMain();
                break;
            case 6:
                sujiList();
                BackGroMain();
                break;
            case 7:
                eggList();
                BackGroMain();
                break;
            case 8:
                peaFlourList();
                BackGroMain();
                break;
            case 9:
                edibleOilList();
                BackGroMain();
                break;
            case 10:
                VinegarList();
                BackGroMain();
                break;
            case 11:
                teaBagList();
                BackGroMain();
                break;
            case 12:
                teaList();
                BackGroMain();
                break;
            case 13:
                vermicelliList();
                BackGroMain();
                break;
            case 14:
                peanutList();
                BackGroMain();
                break;
            case 15:
                biscuitList();
                BackGroMain();
                break;
            case 16:
                noodlesList();
                BackGroMain();
                break;
            case 17:
                powderMilkList();
                BackGroMain();
                break;
            case 18:
                softDrinksList();
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
        System.out.println("\n\t------------------------------------------------------");
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
        System.out.print("\n\t12. Pran Chinigura Rice\n\tPer Kg: 125 BDT\n");
    }
    public void dalList(){
        System.out.println("\n\t------------------------------------------------------");
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
        System.out.print("\n\t12. Motor Dal\n\tPer Kg: 180 BDT\n");
    }
    public void saltList(){
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                         S A L T                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. ACI Pure Salt\n\tPer Kg: 35 BDT");
        System.out.print("\n\t2. Fresh Super Premium (Vacuum) Salt\n\tPer Kg: 32 BDT\n");
        System.out.print("\n\t3. Rongdhanu Salt\n\tPer Kg: 25 BDT\n");
        System.out.print("\n\t4. Muskan Salt\n\tPer Kg: 35 BDT\n");
        System.out.print("\n\t5. Pran Salt\n\tPer Kg: 38 BDT\n");
        System.out.print("\n\t6. Molla Super Salt\n\tPer Kg: 32 BDT\n");
        System.out.print("\n\t7. Sena Salt\n\tPer Kg: 32 BDT\n");
    }
    public void flourList(){
        System.out.println("\n\t------------------------------------------------------");
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
        System.out.print("\n\t20. Fresh Whole Wheat Atta\n\tPer Kg: 44 BDT\n");
    }
    public void masalaList(){
        System.out.println("\n\t------------------------------------------------------");
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
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                       S U J I                      ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Ifad Suji\n\tPer Kg: 64 BDT");
        System.out.print("\n\t2. Teer Semolina Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t3. Bashundhara Suji\n\tPer Kg: 66 BDT\n");
        System.out.print("\n\t4. Fresh Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t5. ACI Pure Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t6. Muskaan Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t7. Shaad Suji\n\tPer Kg: 64 BDT\n");
        System.out.print("\n\t8. Pusti Suji\n\tPer Kg: 64 BDT\n");
    }
    public void eggList() {
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                        E G G                          ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Chicken Eggs (Layer)\n\tPer 4 pcs: 36 BDT");
        System.out.print("\n\t2. Quail Eggs\n\tPer 4 pcs: 17 BDT\n");
        System.out.print("\n\t3. Duck Eggs (Deshi)\n\tPer 4 pcs: 60 BDT\n");
        System.out.print("\n\t4. Organic Chicken Eggs (Deshi)\n\tPer 4 pcs: 50 BDT\n\n");
    }
    public void peaFlourList() {
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                     P E A - F L O U R                    ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Booter Beshon\n\tPer Kg: 98  BDT\n");
        System.out.print("\n\t2. Fit Food Beshon\n\tPer Kg: 516 BDT\n");
        System.out.print("\n\t3. BPM Mashkalai Bason\n\tPer Kg: 220 BDT\n");
    }
    public void edibleOilList() {
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t                         E D I B L E                      ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1.  Saffola Active Plus Edible Oil\n\tPer litre: 254  BDT");
        System.out.print("\n\t2.  King's Sunflower Oil\n\tPer litre: 270  BDT\n");
        System.out.print("\n\t3.  Rupchanda Soyabean Oil\n\tPer litre: 152  BDT\n");
        System.out.print("\n\t4.  Pusti Soyabean Oil\n\tPer litre: 150  BDT\n");
        System.out.print("\n\t5.  Olitalia Sunflower Oil\n\tPer litre: 325  BDT\n");
        System.out.print("\n\t6.  Pran Mustard Oil\n\tPer litre: 270  BDT\n");
        System.out.print("\n\t7.  Dhakaiya Black Seed Oil\n\tPer litre: 1850 BDT\n");
        System.out.print("\n\t8.  Shera Bangla Pure Mustard Oil\n\tPer litre: 225  BDT\n");
        System.out.print("\n\t9. Fresh Mustard Oil\n\tPer litre: 270  BDT\n");
        System.out.print("\n\t10. Sajeeb Mustard Oil\n\tPer litre: 270  BDT\n");
        System.out.print("\n\t11. Shaad Mustard Oil\n\tPer litre: 260  BDT\n");
        System.out.print("\n\t12. Fortune Rice Bran Oil\n\tPer litre: 195  BDT\n");
        System.out.print("\n\t13. Teer Soyabean Oil\n\tPer litre: 145  BDT\n");
        System.out.print("\n\t14. Radhuni Pure Mustard Oil\n\tPer litre: 270  BDT\n");
    }
    public void VinegarList() {
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                        V I N E G A R                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. BD Vinegar \n\tPer litre: 85  BDT");
        System.out.print("\n\t2. Bragg Apple Cider Vinegar\n\tPer litre: 560 BDT\n");
        System.out.print("\n\t3. Calypso Apple Vinegar\n\tPer litre: 510 BDT\n");
        System.out.print("\n\t4. Heinz Apple Cider Vinegar\n\tPer litre: 425 BDT\n");
        System.out.print("\n\t5. Saporito Red Grape Vinegar\n\tPer litre: 660 BDT\n");
        System.out.print("\n\t6. Ahmed White Vinegar\n\tPer litre: 130 BDT\n");
        System.out.print("\n\t7. Heinz White Vinegar\n\tPer litre: 420 BDT\n");
        System.out.print("\n\t8. Borges Apple Cider Vinegar\nPer litre: 555 BDT\n");
    }
    public void teaList() {
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                        T E A                         ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Brooke Bond Taaza Black Tea\n\tPer Kg: 500 BDT");
        System.out.print("\n\t2. Ispahani Mirzapore Best Leaf Tea\n\tPer Kg: 475 BDT\n");
        System.out.print("\n\t3. Nestea Iced Tea Lemon\n\tPer Kg: 600 BDT\n");
        System.out.print("\n\t4. Finlay Premium Tea\n\tPer Kg: 520 BDT\n");
        System.out.print("\n\t5. Muskan BOP Tea\n\tPer Kg: 360 BDT\n");
        System.out.print("\n\t6. Ispahani Zareen Premium Tea\n\tPer Kg: 600 BDT\n");
    }
    public void teaBagList() {
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                        T E A -- B A G                     ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Ispahani Mirzapore Tea Bag\n\tPer 50 pcs: 85  BDT");
        System.out.print("\n\t2. Kazi & Kazi Green Tea\n\tPer 50 pcs: 210 BDT\n");
        System.out.print("\n\t3. Tetley Premium Tea Bags\n\tPer 50 pcs: 75  BDT\n");
        System.out.print("\n\t4. Finlays Pure Green Tea\n\tPer 50 pcs: 110 BDT\n");
    }
    public void vermicelliList() {
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                        V E R M I C E L L I                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Cock Vermicelli\n\tPer Kg: 175 BDT");
        System.out.print("\n\t2. Dekko Vermicelli Shemai\n\tPer Kg: 145 BDT\n");
        System.out.print("\n\t3. ACI Pure Vermicelli\n\tPer Kg: 145 BDT\n");
        System.out.print("\n\t4. Pran Vermicelli Shemai\n\tPer Kg: 175 BDT\n");
        System.out.print("\n\t5. BD Vermicelli\n\tPer Kg: 175 BDT\n");
        System.out.print("\n\t6. Bashundhara Vermicelli Shemai\n\tPer Kg: 165 BDT\n");
        System.out.print("\n\t7. Banoful Vermicelli Shemai\n\tPer Kg: 175 BDT\n");
        System.out.print("\n\t8. Arku Vermicelli\n\tPer Kg: 160 BDT\n");
    }
    public void peanutList() {
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                         P E A N U                     ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.println("\n\t1. Kaju Badam (Cashew Nut)\n\tPer Kg: 1090 BDT");
        System.out.print("\n\t2. Almonds (Kath Badam)\n\tPer Kg: 990  BDT\n");
        System.out.print("\n\t3. Peanut Raw (Kacha Cheena Badam)\n\tPer Kg: 290  BDT\n");
        System.out.print("\n\t4. Peanut Peeled (Vaja Cheena Badam)\n\tPer Kg: 390  BDT\n");
        System.out.print("\n\t5. Pistachios (Pesta Badam)\n\tPer Kg: 2190 BDT\n");
    }
    public void biscuitList() {
        System.out.println("\n\t------------------------------------------------------");
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
        System.out.print("\n\t14. Olympic Tip Biscuit\n\tPer 500 gm: 100 BDT\n");
        System.out.print("\n\t15. Cadbury Oreo Original Cream Biscuit\n\tPer 500 gm: 230 BDT\n");
    }
    public void noodlesList() {
        System.out.println("\n\t------------------------------------------------------");
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
        System.out.print("\n\t13. Mr.Noodles Magic Masala\n\tPer pack: 16 BDT\n");
    }
    public void powderMilkList() {
        System.out.println("\n\t------------------------------------------------------");
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
        System.out.print("\n\t9. Pran Full Cream Milk Powder\n\tPer Kg: 680 BDT\n");
    }
    public void softDrinksList() {
        System.out.println("\n\t------------------------------------------------------");
        System.out.println("\t                      S O F T -- D R I N K S                       ");
        System.out.println("\n\t------------------------------------------------------\n");
        System.out.print("\n\t1. Coca-Cola \n\tPer litre: 50 BDT");
        System.out.print("\n\t2. 7up\n\tPer litre: 50 BDT\n");
        System.out.print("\n\t3. Sprite\n\tPer litre: 50 BDT\n");
        System.out.print("\n\t4. Mountain Dew\n\tPer litre: 50 BDT\n");
        System.out.print("\n\t5. Pran Up\n\tPer litre: 45 BDT\n");
        System.out.print("\n\t6. Clemon\n\tPer litre: 45 BDT\n");
        System.out.print("\n\t7. Miranda Orange\n\tPer litre: 50 BDT\n");
    }

    public void BackGroMain(){
        System.out.print("Press '1' for Back : ");
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

        System.out.print("\tChoose another Option: ");
        int option3 = input.nextInt();

        if (option3 == 1) {
            laptopInformation();
            System.out.println("'0' For Back ");
            System.out.print("Enter Number of Item That you want to Buy : ");
            int item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                //BackLaptoTocomputerMain();
                //backToComputerMainMethod();
                computerMain();
                return;
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.println("Enter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code);
                    } else {
                        System.out.println("Out of Range");
                    }
                }
            }

           // BackLaptoTocomputerMain();
            backToComputerMainMethod();
        } else if (option3 == 2) {
            desktopInformation();

            System.out.print("Enter Number of Item That you want to Buy : ");
            int item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                //BackDesktopTocomputureMain();
                //backToComputerMainMethod();
                computerMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.println("Enter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+4);
                    } else {
                        System.out.println("Out of Range");
                    }
                }
            }

            //BackDesktopTocomputureMain();
            backToComputerMainMethod();
        } else if (option3 == 3) {
            accessoriesInformation();

            System.out.print("Enter Number of Item That you want to Buy : ");
            int item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
               // BackDesktopTocomputureMain();
                //backToComputerMainMethod();
                computerMain();
            } else {
                for (int k = 0; k < item; k++) {

                    System.out.println("Enter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code+8);
                    } else {
                        System.out.println("Out of Range");
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
        System.out.println("\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
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
        System.out.println("\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
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
    @Override
    public void mobileMain() {
        // this is for mobile main part

        MobileName mobileName = new MobileNameInfo();
        mobileName.mobileName(); //Mobile name such as samsung, xiaomi, i-phone, Google

        System.out.print("\tChoose another option: ");
        int choice = input.nextInt();

        if (choice == 1) {

            samsungInformation();

            System.out.print("Enter Number of Item That you want to Buy : ");
            int item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                BackSamsungtoTomobileMain();
            } else {
                for (int k = 0; k < item; k++) {
                    System.out.println("Mobile O asi mono samsungInformation");
                    System.out.println("Enter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code);
                    } else {
                        System.out.println("Out of Range");
                    }
                }
            }

            BackSamsungtoTomobileMain();
        } else if (choice == 2) {

            xiaomiInformation();
            System.out.print("Enter Number of Item That you want to Buy : ");
            int item = input.nextInt();
            //takeItem(item);
            if (item == 0) {
                BackXiaomiTomobileMain();
            } else {
                for (int k = 0; k < item; k++) {
                    System.out.println("Mobile O asi mono koro xiaomiInformation");
                    System.out.println("Enter Code Numnber : ");
                    int code = input.nextInt();
                    if (code >= 1 && code <= 4) {
                        itemCode(code);
                    } else {
                        System.out.println("Out of Range");
                    }
                }
            }
            BackXiaomiTomobileMain();
        } else if (choice == 3) {
            iPhoneInformation();
            BackIPhoneTomobileMain();
        } else if (choice == 4) {
            googleInformation();
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
    }

    @Override
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
    }

    @Override
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
    }

    @Override
    public void BackIPhoneTomobileMain() {
        System.out.println("\n\tPress '1' For back.");

        System.out.print("\tChoice Option : ");
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
    }

    @Override
    public void BackGoogleTomobileMain() {
        System.out.println("\n\tPress '1' For back.");

        System.out.print("\tChoice Option : ");
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

        System.out.print("\tChoice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            computerMain(); //
        } else {
            BackToElectronicsAllMedtod();
        }
    }

// Phone use kora baki amar

    public void backToMobileMainMethod()
    {
        System.out.println("\tPress '1' For back.");
        System.out.print("\tChoice Option : ");
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
        System.out.print("\tChoice Option : ");
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
        System.out.print("\tChoice Option : ");
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
        System.out.print("\tChoice Option : ");
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









//************
    //Cloth Start
    //*****************

    /* ...........
   MALE CLOTHES
   .............. */
    public void maleClothMain() {
        System.out.println("Male Clothes: There are different types of clothes and it's price depends on it's quality.");
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

        for (int i = 0; i < male.length; i++) {
            System.out.println("Product Name: " + male[i].name);
            System.out.println("Product Price: " + male[i].price);
            System.out.println("---------------------------");
        }
    }

    public void BackToMaleClothMain() {
        System.out.println("Press '1' For back ->  ");
        //System.out.println("Press '11' main part -> : ");
        System.out.print("Choice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            clotheAllMethod();
        } else {

            BackToMaleClothMain();
        }
    }

    /* ...........
    Female clothes
    .............. */

    public void femaleClothMain() {
        System.out.println("Female Clothes: There are different types of clothes and it's price depends on it's quality.");
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

        for (int i = 0; i < female.length; i++) {
            System.out.println("Product Name: " + female[i].name);
            System.out.println("Product Price: " + female[i].price);
            System.out.println("---------------------------");
        }
    }

    public void BackToFemaleClothMain() {
        System.out.println("Press '1' For back ->  ");
        //System.out.println("Press '11' main part -> : ");
        System.out.print("Choice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            clotheAllMethod();
        } else {

            BackToFemaleClothMain();
        }
    }

    /* ...........
    JEWELLERY
    .............. */
    public void jewelleryMain() {
        System.out.println("Jewellery Collection.");
        Jewellery earrings = new Jewellery("Earrings", 150);
        Jewellery nosepin = new Jewellery("Nose Pin", 500);
        Jewellery necklaces = new Jewellery("Necklaces", 1000);
        Jewellery curi = new Jewellery("Curi", 40);
        Jewellery hairBand = new Jewellery("Hair Band", 30);
        Jewellery payel = new Jewellery("Payel", 200);

        Jewellery[] jewellery = new Jewellery[]{earrings, nosepin, necklaces, curi, hairBand, payel};

        for (int i = 0; i < jewellery.length; i++) {
            System.out.println("Product Name: " + jewellery[i].name);
            System.out.println("Product Price: " + jewellery[i].price);
            System.out.println(".............................");
        }
    }

    public void BackToJewelleryFemale() {
        System.out.println("Press '1' For back ->  ");
        //System.out.println("Press '11' main part -> : ");
        System.out.print("Choice Option : ");
        int data;
        data = input.nextInt();

        if (data == 1) {
            clotheAllMethod();
        } else {
            BackToJewelleryFemale();
        }
    }


    // Added 4th option is All Main
    public void clotheAllMethod() {
        Clothes.showList();
       // System.out.println("\t4.Back Previous ");
        System.out.print("Choose your subcategory :  ");
        int subcategory = input.nextInt();

        if (subcategory == 1) {
            maleClothMain();
            BackToMaleClothMain();
        } else if (subcategory == 2) {
            femaleClothMain();
            BackToFemaleClothMain();
        } else if (subcategory == 3) {
            jewelleryMain();
            BackToJewelleryFemale();
        } else if (subcategory == 4) {

            Submain object01 = new Submain();
            object01.catagoriesPart();
        } else {
            clotheAllMethod();
        }
    }


    public void furnitureShow() {
        System.out.println("\n\t1. Bed\t\t\t\t2. Table\n\n\t3. Wardrobe\t\t\t4. Dresser\n\n\t5. Chair\t\t\t6. Sofa\n\n\t7. Cabinetry\t\t8. Ottoman\n\n\t9. Stool\t\t\t10. Chaise Longue\n\n\t\t11. Back \n");
        System.out.println("\t---------------------------");
        System.out.print("\tChoose your subcategory: ");
        // int subcategory = input.nextInt();
    }

    public void furintureMain() {

        furnitureShow();

        int subcategory = input.nextInt();

        if (subcategory == 1) {
            showBedProducts();
            backToFurnitureMain();

        } else if (subcategory == 2) {
            showTableProducts();
            backToFurnitureMain();
        } else if (subcategory == 3) {
            showWardrobeProducts();
            backToFurnitureMain();
        } else if (subcategory == 4) {
            showDresserProducts();
            backToFurnitureMain();
        } else if (subcategory == 5) {
            showChairProducts();
            backToFurnitureMain();
        } else if (subcategory == 6) {
            showCouchProducts();
            backToFurnitureMain();
        } else if (subcategory == 7) {
            showCabinetryProducts();
            backToFurnitureMain();
        } else if (subcategory == 8) {
            showOttomanProducts();
            backToFurnitureMain();
        } else if (subcategory == 9) {
            showStoolProducts();
            backToFurnitureMain();
        } else if (subcategory == 10) {
            showChaiseLongueProducts();
            backToFurnitureMain();
        } else if (subcategory == 11) {

            Submain object01 = new Submain();
            object01.catagoriesPart();

        } else {
            furintureMain();
        }

    }

    public  void showBedProducts() {
        System.out.println("\n\tBed: There are dozens of different types of beds.The price will be varies depends on the different quality.\n");

        Bed mansionBed = new Bed("Mansion Bed", 34650);
        Bed lakerpolish = new Bed("Laker Polish Foam Box Bed/Khat", 27600);
        Bed stylish = new Bed("Stylish Malaysian Processed Wood Bed.", 62000);
        Bed medicated = new Bed("Medicated & Solid Wood Box Bed", 11074);

        Bed[] beds = new Bed[]{mansionBed, lakerpolish, stylish, medicated};

        for (int i = 0; i < beds.length; i++) {
            System.out.println("\tProduct Name: " + beds[i].name);
            System.out.println("\tProduct Price: " + beds[i].price);
            System.out.println("\t---------------------------");
        }
    }

    public  void showTableProducts() {
        System.out.println("\n\tTable: There are dozens of different types of tables.The price will be varies depends on the different quality.\n");

        Table malaysian = new Table("Malaysian Processed Wood Dinning Table set.", 32499);
        Table RFL = new Table("RFL Dinning Table-Restaurant Table", 2500);
        Table dinning = new Table("Dinning Table With 6 chairs", 31500);
        Table royal = new Table("RFL Royal Coffee Table", 1700);

        Table[] Tables = new Table[]{malaysian, RFL, dinning, royal};

        for (int i = 0; i < Tables.length; i++) {
            System.out.println("\tProduct Name: " + Tables[i].name);
            System.out.println("\tProduct Price: " + Tables[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public  void showWardrobeProducts() {
        System.out.println("\n\tWardrobe: A Wardrobe Or Armoire is a closet usually equipped with a mirror,  drowers and other things used for storing clothes. There are dozens of different types of Wardrobe.The price will be varies depends on the different quality.\n");

        Wardrobe malaysian = new Wardrobe("Wardrobe Malaysian", 12500);
        Wardrobe platinum = new Wardrobe("Platinum – Crown-5 Step", 8500);
        Wardrobe mini = new Wardrobe("Mini Wooden Wardrobe", 3500);
        Wardrobe rfl = new Wardrobe("RFL Black & Gold Wardrobe", 5600);

        Wardrobe[] wardrobes = new Wardrobe[]{malaysian, platinum, mini, rfl};

        for (int i = 0; i < wardrobes.length; i++) {
            System.out.println("\tProduct Name: " + wardrobes[i].name);
            System.out.println("\tProduct Price: " + wardrobes[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public  void showDresserProducts() {
        System.out.println("\n\tDresser: A type of sideboard, often with shelves above drawers for the display of plates.\n");

        Dresser malaysian = new Dresser("Malaysian  Wood Dressing.", 3500);
        Dresser dressing = new Dresser("Dressing Table slim.", 1100);

        Dresser[] dressers = new Dresser[]{malaysian, dressing};

        for (int i = 0; i < dressers.length; i++) {
            System.out.println("\tProduct Name: " + dressers[i].name);
            System.out.println("\tProduct Price: " + dressers[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public  void showChairProducts() {
        Chair regal = new Chair("Regal Metal Rocking Chair ", 6270);
        Chair deko = new Chair("Deko relax Chair", 390);
        Chair caino = new Chair("Caino Armless Chair.", 1125);
        Chair restaurantChair = new Chair("Restaurant chair", 650);

        Chair[] chairs = new Chair[]{regal, deko, caino, restaurantChair};

        for (int i = 0; i < chairs.length; i++) {
            System.out.println("\tProduct Name: " + chairs[i].name);
            System.out.println("\tProduct Price: " + chairs[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public  void showCouchProducts() {
        Couch nyxi = new Couch("Nyxi Faux Leader white ottoman", 2930);
        Couch foldable = new Couch("Foldable Fabric Ottoman", 3741);
        Couch classic = new Couch("Classic Folding Ottoman", 9013);

        Couch[] couches = new Couch[]{nyxi, foldable, classic};

        for (int i = 0; i < couches.length; i++) {
            System.out.println("\tProduct Name: " + couches[i].name);
            System.out.println("\tProduct Price: " + couches[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public  void showCabinetryProducts() {
        Cabinetry bedroom = new Cabinetry("Bedroom Cabinet", 2930);
        Cabinetry kitchen = new Cabinetry("Kitchen Cabinet", 3741);
        Cabinetry file = new Cabinetry("File Cabinet", 9013);

        Cabinetry[] cabinetries = new Cabinetry[]{bedroom, kitchen, file};

        for (int i = 0; i < cabinetries.length; i++) {
            System.out.println("\tProduct Name: " + cabinetries[i].name);
            System.out.println("\tProduct Price: " + cabinetries[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public  void showOttomanProducts() {
        Ottoman woodAndFabricOttoman = new Ottoman("Wood and Fabric ottoman ", 8000);
        Ottoman nyxiFauxLeaderWhiteOttoman = new Ottoman("Nyxi Faux Leader white ottoman ", 3930);
        Ottoman foldableFabricOttoman = new Ottoman("Foldable Fabric Ottoman", 3741);
        Ottoman classicFoldingOttoman = new Ottoman("Classic Folding Ottoman", 9013);

        Ottoman[] ottomen = new Ottoman[]{woodAndFabricOttoman, nyxiFauxLeaderWhiteOttoman, foldableFabricOttoman, classicFoldingOttoman};

        for (int i = 0; i < ottomen.length; i++) {
            System.out.println("\tProduct Name: " + ottomen[i].name);
            System.out.println("\tProduct Price: " + ottomen[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public  void showStoolProducts() {
        Stool wooden = new Stool("Wooden Frame & Artificial Cane Woven Stool ", 2450);
        Stool squareShape = new Stool("Square Shape PU Leather Rest Stool ", 800);
        Stool rflEasyStool = new Stool("RFL Easy Stool", 70);

        Stool[] stools = new Stool[]{wooden, squareShape, rflEasyStool};

        for (int i = 0; i < stools.length; i++) {
            System.out.println("\tProduct Name: " + stools[i].name);
            System.out.println("\tProduct Price: " + stools[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public  void showChaiseLongueProducts() {
        ChaiseLongue wood = new ChaiseLongue("Wood Hotel Chaise Longue", 35720);
        ChaiseLongue garden = new ChaiseLongue("Garden Chaise  Longue ", 1153);
        ChaiseLongue living = new ChaiseLongue("Living Room Chaise Longue", 75675);
        ChaiseLongue vip = new ChaiseLongue("VIP waiting  Chaise Longue", 6377);

        ChaiseLongue[] chaiseLongues = new ChaiseLongue[]{wood, garden, living, vip};

        for (int i = 0; i < chaiseLongues.length; i++) {
            System.out.println("\tProduct Name: " + chaiseLongues[i].name);
            System.out.println("\tProduct Price: " + chaiseLongues[i].price);
            System.out.println("\t---------------------------");

        }
    }

    public void backToFurnitureMain() {
        System.out.println("\tPress '1' For back ");

        System.out.print("\tChoice Option : ");
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
        int data = 0, basePrice = 0;
        switch (n) {


        }
    }
}

package clothes_part;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Grocery\n2.Clothes\n3.Electronics Devices\n4.Furnitures");

        System.out.print("Choose Option: ");
        int option;
        option = input.nextInt();

        if (option == 2) {
            // Clothes clothes  = new Clothes();
            Clothes.showList();
        }
        System.out.print("Choose your subcategory: ");
        int subcategory = input.nextInt();
        if (subcategory == 1) {
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
        if (subcategory == 2) {
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
        if (subcategory == 3) {
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
    }
}

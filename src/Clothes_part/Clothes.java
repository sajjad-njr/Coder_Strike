package Clothes_part;

public class Clothes {
    public String name;
    public double price;

    //Constructor
    public Clothes(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Static Method
    public static void showList(){
        System.out.println("\n\t1. Male\n\t2. Female\n\t3. Jewelry\n\t4. Back");
    }

   /* public void showDisplay(){
        System.out.println("\tName: "+name);
        System.out.println("\tPrice: "+price+"TK");
    }*/
}

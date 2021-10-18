
package electronic_part;

public class Electronics {

    public String name, model, display;
    public double price;
    public int ram;

    //Constructor
    public Electronics(String name, String model, String display, double price, int ram){
        this.name = name;
        this.model = model;
        this.display = display;
        this.price = price;
        this.ram = ram;
    }

    //Static Method
   public static void showList(){
       System.out.println("\n   *** Electronics ***\n\n\t1. COMPUTER\n\t2. MOBILE\n\t3. OTHERS\n\t4. Exit");
    }

   public static void showList2(){
       System.out.println("\n\t1. Laptop\n\t2. Desktop\n\t3. Accessories\n\t4. Back\n");
    }

//   public void showList(){
//       System.out.println("\n*** Electronics ***\n\n\t1. COMPUTER\n\t2. MOBILE\n\t3. OTHERS\n");
//    }

    public void showDisplay(){ // this method for mobile information

        System.out.println("\n");
        System.out.println("\tName: "+name);
        System.out.println("\tModel: "+model);
        System.out.println("\tDisply: "+display);
        System.out.println("\tPrice: "+price+" TK");
        System.out.println("\tRam: "+ram+" GB");

    }
}


package electronic_part;

public class MobileNameInfo implements MobileName {

    @Override
    public void mobileName() {
        
        System.out.println("\n\t1. Samsung\n\t2. Xiaomi\n\t3. i-Phone\n\t4. Google\n\t5. Back\n");
    }

    @Override
    public void samSung() {
        System.out.println("\n\t1. Samsung Galaxy M22\n\t2. Samsung Galaxy M32 5G\n\t3. Samsung Galaxy A03s\n\t4. Samsung Galaxy A52s 5G");
    }

    @Override
    public void xiaomi() {
       System.out.println("\n\t1. Xiaomi Pad 5 Pro\n\t2. Xiaomi Poco X3 GT\n\t3. Xiaomi Poco M3 Pro 5G\n\t4. Xiaomi Redmi Note 10 Pro (China)");
    }

    @Override
    public void iphone() {
        System.out.println("\n\t1. Apple iPhone 13 Pro\n\t2.  Apple iPad mini (2021)\n\t3. Apple iPad 10.2 (2021)\n\t4. Apple iPhone 12 Pro Max");
    }

    @Override
    public void google() {
        System.out.println("\n\t1. Google Pixel 5a 5G\n\t2. Google Pixel 4a 5G\n\t3. Google Pixel 4 XL\n\t4. Google Pixel 3a XL");
    }
    
}

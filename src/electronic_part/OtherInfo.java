
package electronic_part;

public class OtherInfo implements Other{

    @Override
    public void othersName() {
        System.out.println("\n\t1. TV\n\t2. AC\n\t3. Camera\n\t4. Amart Watch\n");
    }

    @Override
    public void tvInfo() {

        System.out.println("\n\tName: 1. Samsung N5300 40\" FHD Smart TV\n\tModel: Samsung N5300\n\tDisplay Type LED\n\tPrice BDT : 36,000");
        System.out.println("\n\tName: 2. LG 55UM7340PVA 55\" IPS UHD 4K Smart LED TV\n\tModel: 55UM7340PVA\n\t55\" 4K UHD (3840 x 2160) IPS Display\n\tPrice BDT :74,000");
        System.out.println("\n\tName: 3. LG 49UM7340PVA 49\" IPS UHD 4K Smart LED TV\n\tModel: 49UM7340PVA\n\t49\" 4K UHD (3840 x 2160) IPS Display\n\tPrice BDT : 60,000");
        System.out.println("\n\tName: 4. Samsung 55TU8000 55\" Crystal UHD 4K Smart LED TV\n\tModel: 55TU8000\n\tCrystal Processor 4K\n\tPrice BDT :70,000");
     
    }

    @Override
    public void acInfo() {
       System.out.println("\n\tName: 1. General ASGA18FMTB 1.5 Ton Split Air Conditioner\n\tModel: ASGA18FMTB\n\tCompressor Type: R410A\n\tPrice BDT : 72,000");
       System.out.println("\n\tName: 2. Gree GS24CT410 2 Ton Split Air Conditioner\n\tModel: GS24CT410\n\tSmart Energy-saving operation\n\tPrice BDT : 67,000");
       System.out.println("\n\tName: 3. General ASGA30AFC 2.5 Ton Split Air Conditioner\n\tModel: General ASGA30AFC\n\tEnergy Rating: 2 Star\n\tPrice BDT : 108,000");
       System.out.println("\n\tName: 4. ELITE 1.5 Ton Split type Non-Inverter Air Conditioner\n\tModel: ELITE 1.5 Ton\n\t40% Energy Saving\n\tPrice BDT : 36,000");
    }

    @Override
    public void cameraInfo() {
       System.out.println("\n\tName: 1. Canon EOS 80D DSLR Camera with 18-135mm IS USM Lens\n\tModel: Canon EOS 80D\n\tDIGIC 6 Image Processor\n\tPrice BDT : 98,000");
       System.out.println("\n\tName: 2. Nikon D5600 DSLR Camera with 18-55mm Lens\n\tModel: Nikon D5600\n\tEXPEED 4 Image Processor\n\tPrice BDT : 61,500");
       System.out.println("\n\tName: 3. CANON EOS 2000D 24.1MP WITH 18-55MM KIT LENS FULL HD\n\tModel: Canon 2000D\n\tType Processor TDIGIC 4+\n\tPrice BDT : 41,500");
       System.out.println("\n\tName: 4. Nikon D500 DSLR Camera (only body)\n\tModel: Nikon D500\n\tEXPEED 5 Image Processor\n\tPrice BDT : 1,45,000");
    }

    @Override
    public void smartWatchInfo() {
       System.out.println("\n\tName: 1. Apple Watch SE (MYDM2LL/A) GPS 40mm Sport Band\n\tModel: Apple Watch SE\n\tDigital Crown with Haptic Feedback\n\tPrice BDT : 30,900");
       System.out.println("\n\tName: 2. Xiaomi Haylou LS02 Touch Screen Square Shape Smart Watch Black\n\tModel:  Xiaomi Haylou LS02\n\t20 days of endurance\n\tPrice BDT : 25,50");
       System.out.println("\n\tName: 3. Realme RMA161 1.4\" Square Activity Tracker Smart Watch Black\n\tModel: Realme RMA161\n\tUp to 9 Day Battery Life\n\tPrice BDT : 38,500");
    }    
    
}

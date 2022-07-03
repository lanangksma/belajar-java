public class tipeDataNumber {
    
    public static void main(String[] args) {
        
        byte iniByte = 100;
        System.out.println("byte: "+iniByte);
        short iniShort = 1000;
        System.out.println("short: "+iniShort);
        int iniInt = 10000000; //1000000000
        System.out.println("int: "+iniInt);
        long iniLong = 1000000000;
        System.out.println("long: "+iniLong); 
        long iniLong2 = 1000000000000000000L; //BisaTambah L UntukMenandakanItuLong
        System.out.println("long2: "+iniLong2);

        float IniFloat = 10.10F; //Akhiri dengan F / f
        System.out.println("Float: "+IniFloat);
        double iniDouble = 10.10;
        System.out.println("Double: "+iniDouble);
        
        // Literals num
        int decimalInt = 32;
        System.out.println("Decimal: "+decimalInt);
        int hexaInt = 0xFFFFFF;
        System.out.println("HexaInt: "+hexaInt);
        int binaryInt = 0b10101010;
        System.out.println("Binary: "+binaryInt);

        // Underscore
        long balance = 1_000_000_000;
        System.out.println("Balance: "+balance);
        int amount = 1_000_000;
        System.out.println("Amount: "+amount);

        // Konversi tipe data number
        byte thisByte = 10;
        short thisShort = thisByte;
        int thisInt = thisShort;
        long thisLong = thisInt;
        float thisFloat = thisLong;
        double thisDouble = thisFloat;
        System.out.println("Sebelum konversi(byte): "+thisByte);
        System.out.println("Sesudah konversi(double): "+thisDouble);

        // Konversi sebaliknya
        float thisFloat2 = (float) thisDouble;
        long thisLong2 = (long) thisFloat2;
        int thisInt2 = (int) thisLong2;
        short thisShort2 = (short) thisInt2;
        System.out.println("KonversiManual: "+thisShort2);
    }

}

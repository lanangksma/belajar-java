public class tipeDataObject {
// Tipe data Object / tipe data bukan primitif merupakan tipe data yang tidak berisi nilai default, atau nilai awalnya null. beberapa contohnya:
    
    public static void main(String[] args) {

        Integer thisInteger = 100;
        System.out.println(thisInteger);

        Character thisCharacter = 'A';
        System.out.println(thisCharacter);

        Double thisDouble = 2.2;
        System.out.println(thisDouble);

        Float thisfloat = null;
        System.out.println(thisfloat);

        // Konversi Dari tipe Primitif
        int iniInt = 70;
        Integer intObj = iniInt;

        int thisAgein = intObj;
        System.out.println(thisAgein);

        short thisShort = intObj.shortValue();
        System.out.println(thisShort);

        byte thisByte = intObj.byteValue();
        System.out.println(thisByte);
        
    }

}

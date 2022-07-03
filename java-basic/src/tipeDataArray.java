public class tipeDataArray {
    public static void main(String[] args) {
        
        String[] myArray;
        myArray = new String[3];

        myArray[0] = "Lala";
        myArray[1] = "Rara";
        myArray[2] = "Vivi";

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);

        // Array initializer
        int[] thisArray = new int[] {
            11, 12, 13, 14, 15
        };
        System.out.println(thisArray[1]);

        String[] strArray = new String[] {
            "Agus", "Asep", "Supri"
        };
        System.out.println(strArray[2]);

        char[] charArray = {
            'M', 'L', 'A', 'K'
        };
        System.out.println(charArray);

        // Array operation
        long[] longArray = {
            12, 32, 43, 45, 55
        };

        longArray[0] = 289;

        System.out.println(longArray[0]);
        System.out.println(longArray[1]);
        System.out.println(longArray.length);

        // Array di dalam array
        String[][] members = {
            {"Muhamad", "Lanang", "Abid", "Kusuma"},
            {"Rifialdi", "Faturrochman"},
            {"Jimmy", "Hidayat"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[0][1]);
        System.out.println(members[2][0]);

    }
}

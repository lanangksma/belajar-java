public class switchStatement {
    
    public static void main(String[] args) {
        
        var nilai = "B";

        switch(nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Selamat Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // Switch Lambda
        switch(nilai){
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Selamat Anda lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }
        
        String ucapan, Ucapan;
        switch(nilai){
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Selamat Anda lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);

        // Switch dengan yield
        Ucapan = switch(nilai) {
            case "A" : yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C" : yield "Selamat Anda lulus";
            case "D" : yield "Anda Tidak Lulus";
            default : yield "Mungkin Anda Salah Jurusan";           
        }; // Jagan lupa kasi titik koma setelah switchStatement jika menggunakan yield
        System.out.println(Ucapan);
    }

}

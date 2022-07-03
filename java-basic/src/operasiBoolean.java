public class operasiBoolean {
    
    public static void main(String[] args) {
        
        var absen = 100;
        var nilaiAkhir = 88;

        var lulusabsen = absen >= 75;
        var lulusnilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusabsen && lulusnilaiAkhir;
        System.out.println(lulus);

    }

}

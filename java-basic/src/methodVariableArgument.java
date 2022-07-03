public class methodVariableArgument {
    
    public static void main(String[] args) {
        
        sayCongrats("lanang", 80, 80, 80, 80, 80);
        sayCongrats("Ian", 80, 90, 70, 40, 90);

    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values){
            total +=value;
        }
        var finalValue = total/values.length;

        if(finalValue >= 75){
            System.out.println("Selamat "+name+", Anda Lulus");
        } else {
            System.out.println("Maaf "+name+", Anda Tidak Lulus");
        }
    }

}

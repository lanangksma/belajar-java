public class methodOverLoading {

    public static void main(String[] args) {
        
        sayHello();
        sayHello("M Lanang Abid K");
        sayHello("Lanang", "Kusuma");

    }
    
    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello"+name);
    }

    static void sayHello(String firstname, String lastname){
        System.out.println("Hello"+firstname+" "+lastname);
    }

}

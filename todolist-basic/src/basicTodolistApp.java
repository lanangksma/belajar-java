public class basicTodolistApp {

    public static String[] model = new String[10];
    public static java.util.Scanner input = new java.util.Scanner(System.in);
    
    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * Menampilkan Todolist
     */
    public static void showTodoList(){
        System.out.println("\n\tTODOLIST\n");
        for(var i=0;i < model.length;i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no+". "+todo);
            }
        }
    }

    /**
     * Test todolist
     */
    public static void testShowTodoList(){
        model[0] = "Belajar Java";
        model[1] = "Belajar Javascript";
        model[2] = "Belajar PHP";
        showTodoList();
    }

    /**
     * Menambah Todo ke list
     */
    public static void addTodoList(String todo){
        // cek apakah model sudah isFull
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if(model[i] == null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, resize ukuran array 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        } 
        
        // tambahkan ke posisi yang data array nya NULL
        for(var i = 0;i < model.length;i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * test add todo lisf
     */
    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo ke."+i);
        }
        
        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number){
        if((number - 1) > model.length){
            return false;
        } else if(model[number - 1] == null){
            return false;
        } else{
            for(int i = (number - 1);i < model.length;i++){
                if(i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    /**
     * Test menghapus todolist
     */
    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(9);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    /**
     * Input data todo list
     */
    public static String input(String info){
        System.out.print(info+" : ");
        String data = input.nextLine();
        return data;
    }
    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi "+name);
    }

    /**
     * Menampilkan view show todo list
     */
    public static void viewShowTodoList(){
        while (true) {
            showTodoList();

            System.out.println("\n\tMENU : \n");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            } else if(input.equals("2")) {
                viewRemoveTodoList();
            } else if(input.equals("x")) {
                break;
            } else {
                System.out.println("\nPilihan tidak dimengerti");
            }
        }
    }
    public static void testViewTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();
    }

    /**
     * Menampilkan view Menambahkan todo list
     */
    public static void viewAddTodoList(){
        System.out.println("\n\tMENAMBAH TODOLIST\n");
        var todo = input("Todo (x jika batal)");

        if(todo.equals("x")){
            // Batal
        }else{
            addTodoList(todo);
        }
    }
    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        viewAddTodoList();

        showTodoList();
    }

    /**
     * Menampilkan view Menghapus todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("\n\tMENGHAPUS TODOLIST");
        var number = input("Nomor yang dihapus (x jika batal)");

        if(number.equals("x")){
            // Batal
        }else{
            Boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todolist : "+number);
            }
        }
    }
    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }

}

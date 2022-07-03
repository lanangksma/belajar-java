class Person {
    String name, address;
    final String country = "Indonesia\n";

    /**
     * @param paramName
     * @param paramAddress
     * Constructor bisa juga dibuat overloading seperti method/fungsi
     * Constructor bisa memanggil constructor lainnya dengna menggunakan this(your param)
     */

    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    void sayHello(String paramName){
        System.out.println("Hello "+paramName+", My name is "+name);
    }
}

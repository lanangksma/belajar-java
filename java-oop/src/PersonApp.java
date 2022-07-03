public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Lanang", "Purwakarta");
        person1.sayHello("Kusnandar");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person("Iwan", "Purwokerto");
        person2.sayHello("Nurwahyudi");

        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        
        Person person3;
        person3 = new Person("Nasir", "Lamongan");
        person3.sayHello("Ridwan");

        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);
    }
}

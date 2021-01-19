public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(3, "Philip", "N", "35342678543", "Bank1");
        Customer customer2 = new Customer(2, "Jacob", "T", "353429867587", "Bank2");
        Customer customer3 = new Customer(1, "Kit", "L", "35342689765", "Bank3");
        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setAddress("aaaaa");
        customer4.setBank("bbb");
        customer4.setName("Alberto");
        customer4.setCard("1234567890");
        Massive massive = new Massive(customer1, customer2, customer3, customer4);
        System.out.println(massive.toString());
        massive.sortByName();
        System.out.println(massive.toString());
        String n = "2", m = "50000000000";
        System.out.println();
        massive.findCard(n, m);
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Massive {
    int s;
    public ArrayList<Customer> customers = new ArrayList<>(s);

    Massive(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    Massive(Customer... customer) {
        s = customer.length;
        for (int i = 0; i < s; i++) {
            this.customers.add(customer[i]);
        }
    }

    public ArrayList<Customer> sortByName() {
        Collections.sort(customers, Customer::compare);
        return customers;
    }

    public void findCard(String n, String m) {
        for (int i = 0; i < s; i++) {
            if (Long.parseLong(customers.get(i).getCard()) >= Long.parseLong(n) && Long.parseLong(customers.get(i).getCard()) <= Long.parseLong(m)) {
                System.out.println(customers.get(i).toString());
            }
        }
    }

    @Override
    public String toString() {
        return customers.toString();
    }
}

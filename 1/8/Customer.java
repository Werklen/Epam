8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer {
    private int id;
    private String name;
    private String address;
    private String card;
    private String bank;

    Customer() {
        this.id = 0;
        this.name = "0";
        this.address = "0";
        this.card = "0";
        this.bank = "0";
    }

    Customer(int id, String name, String address, String card, String bank) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.card = card;
        this.bank = bank;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCard() {
        return card;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getBank() {
        return bank;
    }

    public int compare(Customer a) {
        return this.name.compareTo(a.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", card=" + card +
                ", bank='" + bank + '\'' +
                '}';
    }
}

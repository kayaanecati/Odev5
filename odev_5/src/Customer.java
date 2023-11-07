public class Customer extends Person {
    Customer(int id, String name, String surname, int telNum, int age) {
        super(id, name, surname, telNum, age);
    }
    @Override
    public void printPerson() {
        System.out.print("Customer Info  ");
        super.printPerson();
    }

}

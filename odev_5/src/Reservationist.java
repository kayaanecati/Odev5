public class Reservationist extends Person{
    Reservationist(int id, String name, String surname, int telNum, int age) {
        super(id, name, surname, telNum, age);
}
    @Override
    public void printPerson() {
        System.out.print("Reservationist Info  ");
        super.printPerson();
    }
}

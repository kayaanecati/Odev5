public class Receptionist extends Person{
    Receptionist(int id, String name, String surname, int telNum, int age) {
        super(id, name, surname, telNum, age);
    }
    @Override
    public void printPerson() {
        System.out.print("Receptionist Info  ");
        super.printPerson();
    }
}

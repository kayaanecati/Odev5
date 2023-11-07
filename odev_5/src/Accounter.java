public class  Accounter extends Person {
    Accounter(int id, String name, String surname, int telNum, int age) {
        super(id, name, surname, telNum, age);
    }
    @Override
    public void printPerson() {
        System.out.print("Accounter Info  ");
        super.printPerson();
}
}


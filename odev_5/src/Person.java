public class Person {
    int id;
    String name;
    String surname;
    int telNum;
    int age;

    Person(int id, String name, String surname, int telNum, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.telNum = telNum;
        this.age = age;
    }

    public void printPerson() {
        System.out.println(id + " " + name + " " + surname + " " + telNum + " " + age);
    }

    }



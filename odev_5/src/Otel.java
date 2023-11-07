import java.util.ArrayList;

public class Otel {

    int resNum = 0;
    String otelName;
    ArrayList<Customer> customerList = new ArrayList<>();
    ArrayList<Receptionist> receptionistList = new ArrayList<>();
    ArrayList<Reservationist> reservationistList = new ArrayList<>();
    ArrayList<Accounter> accounterList = new ArrayList<>();
    ArrayList<Reservation> reservationList = new ArrayList<>();

    Otel(String otelName) {
        this.otelName = otelName;
    }

    public void makeRes(int customerID, int reservationistID, int receptionistID, String resType) {
        Reservation reservation = new Reservation(resNum, customerID, reservationistID, receptionistID, resType);
        reservationList.add(reservation);

        resNum++;
    }

    public Reservation findRes(int id) {
        for (int i = 0; i < reservationList.size(); i++) {
            if (id == reservationList.get(i).resNum)
                return reservationList.get(i);
        }
        return null;
    }

    public void cancelRes(int id) {
        findRes(id).activeRes = false;
    }
    public void deleteRes(int id){
        for (int i = 0; i < reservationList.size(); i++) {
            if (id == reservationList.get(i).resNum)
                 reservationList.remove(reservationList.get(i));
        }

    }
    public Customer findCustomer(int id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (id == customerList.get(i).id)
                return customerList.get(i);
        }
        return null;
    }

    public void addCustomer(int id, String name, String surName, int telNo, int age) {
        if (findCustomer(id) == null) {
            Customer customer = new Customer(id, name, surName, telNo, age);
            customerList.add(customer);
        }

    }

    public Receptionist findReceptionist(int id) {
        for (int i = 0; i < receptionistList.size(); i++) {
            if (id == receptionistList.get(i).id)
                return receptionistList.get(i);
        }
        return null;
    }

    public void addReceptionist(int id, String name, String surName, int telNo, int age) {
        if (findCustomer(id) == null) {
            Receptionist receptionist = new Receptionist(id, name, surName, telNo, age);
            receptionistList.add(receptionist);
        }

    }

    public Reservationist findReservationist(int id) {
        for (int i = 0; i < reservationistList.size(); i++) {
            if (id == reservationistList.get(i).id)
                return reservationistList.get(i);
        }
        return null;
    }

    public void addReservationist(int id, String name, String surName, int telNo, int age) {
        if (findReservationist(id) == null) {
            Reservationist reservationist = new Reservationist(id, name, surName, telNo, age);
            reservationistList.add(reservationist);
        }

    }

    public Accounter findAccounter(int id) {
        for (int i = 0; i < accounterList.size(); i++) {
            if (id == accounterList.get(i).id)
                return accounterList.get(i);
        }
        return null;
    }

    public void addAccounter(int id, String name, String surName, int telNo, int age) {
        if (findAccounter(id) == null) {
            Accounter accounter = new Accounter(id, name, surName, telNo, age);
            accounterList.add(accounter);
        }

    }

    public void print(int id) {
        System.out.print("Otel Name: "+otelName );
        System.out.println();
        for (int i = 0; i < reservationList.size(); i++) {
            if (id == reservationList.get(i).resNum) {
                reservationList.get(i).printRes();
                findCustomer(reservationList.get(i).customerID).printPerson();
                findReservationist(reservationList.get(i).reservationistID).printPerson();
                findReceptionist(reservationList.get(i).receptionistID).printPerson();
            }
        }
    }
}












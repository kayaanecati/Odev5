import java.util.ArrayList;

public class Reservation  {
    int resNum;
    int customerID;
    int reservationistID;
    int receptionistID;
    String resType;
    boolean activeRes;

    Reservation(int resNum, int customerID, int reservationistID, int receptionistID, String resType) {
        this.resNum = resNum;
        this.customerID = customerID;
        this.reservationistID = reservationistID;
        this.receptionistID = receptionistID;
        this.resType = resType;
        this.activeRes = true;

    }

    public void printRes() {
        System.out.println("Reservation Info Res ID: "+resNum + " Customer ID: " + customerID + " Reservationist ID: " + reservationistID + " Receptionist ID: " + receptionistID + " Res Type: " + resType + " ");
    }



}



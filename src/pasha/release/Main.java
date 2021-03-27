package pasha.release;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Shcololo pasha = new Shcololo();
        pasha.setFirstName("Pavel");
        pasha.setLastName("Vortan");
        pasha.setMidName("Olehovich");
        pasha.setMomFirstName("Elena");
        pasha.setLastName("Vortan");
        pasha.setMomLastName("Vortan");
        pasha.setMomMidName("Vladimirovna");
        pasha.setCity("Chernivtsi");
        pasha.setStreet("Chekhov");
        pasha.setHouseNumber("1b");
        pasha.setApartment("3");
        pasha.setMomPhoneNumber("+380505551382");
        pasha.setDateOfBirth(LocalDate.of(2007 , Month.AUGUST , 19));
        System.out.println(pasha);
    }
}


import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hps = new Hospital();
        Patient[] kolejka = new Patient[10];

        kolejka[0] = new Patient("Jan", "Kowal", "929292");
        kolejka[1] = new Patient("Koza", "Waclaw", "9988776655");

        System.out.println("Wybierz opcje" +
                "\n0 - zamknij program" +
                "\n1 - dodaj pacjenta(do pacjenta przypisz nr z kolejki)" +
                "\n2 - pokaz liste pacjentow");
        int a = 1;

        while (a != 0) {
            switch (sc.nextInt()) {

                case 0 -> a = 0;
                case 1 -> hps.addPatient(kolejka);
                case 2 -> hps.printPatients();

            }
        }
        System.out.println("papa");
    }
}

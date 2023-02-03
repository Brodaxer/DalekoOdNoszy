import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hps = new Hospital();
        int a = sc.nextInt();
        do {
            switch (a) {
                case 0 -> System.out.println("papa");
                case 1 -> hps.addPatient();
                case 2 -> hps.printPatients();
            }
        } while (a !=0) ;
        sc.close();
    }
}

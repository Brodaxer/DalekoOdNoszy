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
//              halp za duzo skanera ?


//
//Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:943)
//        at java.base/java.util.Scanner.next(Scanner.java:1598)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
//        at HospitalApp.main(HospitalApp.java:8)
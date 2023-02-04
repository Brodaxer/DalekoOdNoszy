import java.util.Scanner;

public class Hospital {
    Scanner sc = new Scanner(System.in);
    private final int maxPatintsNum = 10;
    private Patient[] patients = new Patient[maxPatintsNum];
    private int currPatients = 0;



    public void addPatient(Patient[] kolejka) {
       if (currPatients<maxPatintsNum){
           patients[currPatients] = kolejka[sc.nextInt()];
           currPatients++;
       }else System.out.println("Szpital jest pelny ");
    }

    public void printPatients() {
        for (int i = 0; i < currPatients; i++) {

            System.out.println(patients[i].getInfoPatient());
        }

    }

}

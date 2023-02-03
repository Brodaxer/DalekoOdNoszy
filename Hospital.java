

public class Hospital {

    private final int maxPatintsNum = 10;
    private Patient[] patients = new Patient[maxPatintsNum];
    private int currPatients = 0;

    public void addPatient() {
       if (currPatients<maxPatintsNum){
           patients[currPatients] = new Patient();
           currPatients++;
       }else System.out.println("Szpital jest pelny ");
    }

    public void printPatients() {
        for (int i = 0; i < currPatients; i++) {

            System.out.println(patients[i].getInfoPatient());
        }

    }

}

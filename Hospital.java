public class Hospital {
    private final int maxPatintsNum = 10;
    private Patient[] patients = new Patient[maxPatintsNum];
    private int currPatients = 0;

    public void addPatient(Patient patient) {
        patients[currPatients] = new Patient(patient.getFirstName(), patient.getLastName(), patient.getPESEL());
        currPatients++;
    }                               // dodac ograniczenie max pacjentow

    public void printPatients() {
        for (int i = 0; i < currPatients; i++) {

            System.out.println(patients[i].getInfoPatient());
        }

    }

}

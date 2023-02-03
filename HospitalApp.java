public class HospitalApp {
    public static void main(String[] args) {
        Hospital hps= new Hospital();
        Patient pa1= new Patient("JAn","kal","fafaf");
        Patient pa2= new Patient("JAn","kal","fafaf");

        hps.addPatient(pa1);
        hps.addPatient(pa2);
        hps.printPatients();
    }
}

public class Patient {
    private String firstName;
    private String lastName;
    private String PESEL;   // dodac ograniczenie znakow do 11

    public Patient(String firstName,String lastName,String PESEL){
        this.firstName=firstName;
        this.lastName=lastName;
        this.PESEL=PESEL;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }
    public String getInfoPatient(){
        return getFirstName() +" "+ getLastName()+ " "+ getPESEL();

    }
}

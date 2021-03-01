

public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";


    public Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }


/*
    public Patient(String, String, String) {
        this.diagnosis = diagnosis;
    }
*/



    public String getDiagnosis() {
        return diagnosis;
    }

    //TODO: check
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public void setDiagnose() {

    }

    //TODO: toString
}

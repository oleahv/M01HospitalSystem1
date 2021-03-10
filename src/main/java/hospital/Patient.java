package hospital;

public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";


    //TODO: this has protected access. Try without it
    public Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);

    }

    protected String getDiagnosis() {
        return diagnosis;
    }


    //TODO: check
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


//TODO: toString
    //Social security number is NOT hidden here
    @Override
    public String toString() {
        return "Patient{ "  + getFullName()+ "\n" +
                getSocialSecurityNumber() + "\n" +
                "diagnosis='" + diagnosis + '\'' +
                '}';
    }

    @Override
    public void setDiagnose(String diagnose) {

    }



}

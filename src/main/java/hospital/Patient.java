package hospital;


/**
 * The type Patient.
 */
public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";





    /**
     * Instantiates a new Patient.
     * Note that this had originally PROTECTED access.
     *
     * @param firstName            the first name of the patient
     * @param lastName             the last name name of the patient
     * @param socialSecurityNumber the social security number name of the patient
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);

    }

    /**
     * Gets diagnosis.
     *
     * @return the diagnosis of the patient
     */
    protected String getDiagnosis() {
        return diagnosis;
    }


    /**
     * Sets diagnosis.
     *
     * @param diagnosis the diagnosis of the patient
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


    //Social security number is NOT hidden here. Recommend making changes to how a employee or patient is ID-ed to account for this.
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

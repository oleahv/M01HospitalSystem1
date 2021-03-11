package hospital.healthpersonal.doctor;

import hospital.Patient;

/**
 * The type Surgeon.
 */
public class Surgeon extends Doctor {
    /**
     * Instantiates a new Surgeon.
     *
     * @param firstName            the first name of the surgeon
     * @param lastName             the last name of the surgeon
     * @param socialSecurityNumber the social security number of the surgeon
     */
    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }


    // Surgeon can set patient diagnose.
    @Override
    public void setDiagnosis(Patient patient, String diagnose) {

    }
}

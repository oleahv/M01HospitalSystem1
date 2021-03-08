package hospital.healthpersonal.doctor;

import hospital.Patient;

public class Surgeon extends Doctor {
    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnose) {

    }


// Can set patient diagnose


}

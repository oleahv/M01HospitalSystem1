package hospital.healthpersonal.doctor;

import hospital.Patient;

public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnose) {

    }


//Can set patient diagnose



}

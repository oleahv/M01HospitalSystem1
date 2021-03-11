package hospital.healthpersonal;

import hospital.Employee;

/**
 * The type Nurse.
 */
public class Nurse extends Employee {


    /**
     * Instantiates a new Nurse.
     *
     * @param firstName            the first name of the nurse
     * @param lastName             the last name of the nurse
     * @param socialSecurityNumber the social security number of the nurse
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Nurse{}";
    }
}

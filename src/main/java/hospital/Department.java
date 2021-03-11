package hospital;

import hospital.exception.RemoveException;
import java.util.HashMap;
import java.util.Objects;

/**
 * The type Department.
 */
public class Department {

    private String departmentName;
    private String departmentNumberUnique;


    /**
     * The Employee hashmap.
     */
//Hashmaps to hold the employee and patient objects respectively.
    HashMap<String, Employee> employeeHashMap = new HashMap<>();
    /**
     * The Patient hashmap.
     */
    HashMap<String, Patient> patientHashMap = new HashMap<>();


    /**
     *
     * The Person. Creates a personObjective to use in other methods.
     */
    Person person = new Person("", "", "") {
        @Override
        public String getFullName() {
            return super.getFullName();
        }

        @Override
        public String getSocialSecurityNumber() {
            return super.getSocialSecurityNumber();
        }
    };

    /**
     * Instantiates a new Department.
     *
     * @param departmentName         the department name of the department belonging to the hospital
     * @param departmentNumberUnique the departmentNumberUnique works as the key to identify if a department is already in the map
     */
    public Department(String departmentName, String departmentNumberUnique) {
        this.departmentName = departmentName;
        this.departmentNumberUnique = departmentNumberUnique;
    }

    /**
     * Gets department number unique.
     *
     * @return the departmentNumberUnique works as the key to identify if a department is already in the map
     */
    public String getDepartmentNumberUnique() {
        return departmentNumberUnique;
    }


    /**
     * Sets department number unique.
     * Keeping this because departments change names often enough to warrant it.
     *
     * @param departmentNumberUnique the departmentNumberUnique works as the key to identify if a department is already in the map
     */
    public void setDepartmentNumberUnique(String departmentNumberUnique) {
        this.departmentNumberUnique = departmentNumberUnique;
    }


    /**
     * Gets department name.
     *
     * @return the department name of the department belonging to the hospital
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets department name.
     *
     * @param departmentName the department name of the department belonging to the hospital
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * Gets employee hashmap.
     *
     * @return the employee hashmap the holds all the emplyees in a specified department
     */
    public HashMap<String, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }

    /**
     * Gets patient hashmap.
     *
     * @return the patient hashmap the holds all the patients in a specified department
     */
    public HashMap<String, Patient> getPatientHashMap() {
        return patientHashMap;
    }



    /**
     * Adds employee if the socialSecurityNumber is 8 digits long, and the employee is not in the map prior
     *
     * @param employeeID the employee id  is a placeholder for socialSecurityNumber. It will not impact anything about
     *      *                 the employee and should be overwritten to the employees socialSecurityNumber.
     * @param employee   the employee to be added
     */
    public void addEmployee(String employeeID, Employee employee) {



        // checks if the social security number is 8 digits.
        try {
            int intCheck = Integer.parseInt(employee.getSocialSecurityNumber());
            if (!(employee.getSocialSecurityNumber().length() == 8)) {
                System.out.println("The social security number inputted is not 8 digits");
            }
            else {
                if (!employeeHashMap.containsKey(employee.getSocialSecurityNumber())) {
                    employeeHashMap.put(employee.getSocialSecurityNumber(), employee);
                } else {
                    System.out.println("The employee you wanted to add is already in the list");
                }
            }
        }
        catch (NumberFormatException numberFormatException) {
            System.out.println("It seems you have not inputted a number for the social security number, or left it blank");
        }
    }


    /**
     * Adds patient if the socialSecurityNumber is 8 digits long, and the patient is not in the map prior
     *
     * @param patientID the patient id  is a placeholder for socialSecurityNumber. It will not impact anything about
     *      *                 the patient and should be overwritten to the patients socialSecurityNumber.
     * @param patient   the patient to be added
     */
    public void addPatient(String patientID, Patient patient) {
            // check if the social security number is 8 digits.
        try {

            int intCheck = Integer.parseInt(patient.getSocialSecurityNumber());
            if (!(patient.getSocialSecurityNumber().length() == 8)) {
                System.out.println("The social security number inputted is not 8 digits");
            }
            else {
                if (!patientHashMap.containsKey(patient.getSocialSecurityNumber())) {
                    patientHashMap.put(patient.getSocialSecurityNumber(), patient);
                } else {
                    System.out.println("The patient you wanted to add is already in the list");
                }
            }
        }
        catch (NumberFormatException numberFormatException) {
            System.out.println("It seems you have not inputted a number for the social security number, or left it blank");
        }
    }


    // Since the code uses exclusivly hashMaps to map objects, this + hashCode will not do 'anything'.
    // If changing departmentlist to a arrayList it could be useful, so leaving this in the code.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(departmentNumberUnique, that.departmentNumberUnique) &&
                Objects.equals(employeeHashMap, that.employeeHashMap) &&
                Objects.equals(patientHashMap, that.patientHashMap) &&
                Objects.equals(person, that.person);
    }

    // Since the code uses exclusivly hashMaps to map objects, this + equals will not do 'anything'.
    // If changing departmentlist to a arrayList it could be useful, so leaving this in the code.
    @Override
    public int hashCode() {
        return Objects.hash(departmentName, departmentNumberUnique, employeeHashMap, patientHashMap, person);
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentNumberUnique='" + departmentNumberUnique + '\'' +
                ", employeeHashMap=" + employeeHashMap +
                ", patientHashMap=" + patientHashMap +
                ", person=" + person +
                '}';
    }


    /**
     * Remove.
     *
     * @param personID the person id is a placeholder for socialSecurityNumber. It will not impact anything about
     *                 the person and should be overwritten to the persons socialSecurityNumber.
     * @param person   the person that should be removed
     * @throws RemoveException the remove exception will handle all errors were it is called.
     */
    public void remove(String personID, Person person) throws RemoveException {


             if (patientHashMap.containsKey(person.getSocialSecurityNumber()))  {

             // Assumes that the patient will not get transferred to a patent list if they get sick/hurt.
                 patientHashMap.remove(person.getSocialSecurityNumber());

             }
             else if (employeeHashMap.containsKey(person.getSocialSecurityNumber())){

                 // Assumes that the employee will not get transferred to a patent list if they get sick/hurt.
                 employeeHashMap.remove(person.getSocialSecurityNumber());
             }


     else {
                 throw new RemoveException("The person is not in the employee list or patient list");

             }
         }
         }


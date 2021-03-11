package hospital;


import hospital.exception.RemoveException;

import java.util.*;


public class Department {

    private String departmentName;
    private String departmentNumberUnique;


    //Lists to hold the employee and patient objects respectively.
    //Recommend using HashMap with key as social security number to allow one to search after a patient or employee

//TODO:
    HashMap<String, Employee> employeeHashMap = new HashMap<>();
    HashMap<String, Patient> patientHashMap = new HashMap<>();


   // List<Employee> employeeList = new ArrayList<>();

    //List<Patient> patientList = new ArrayList<>();



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

    public Department(String departmentName, String departmentNumberUnique) {
        this.departmentName = departmentName;
        this.departmentNumberUnique = departmentNumberUnique;
    }

    public String getDepartmentNumberUnique() {
        return departmentNumberUnique;
    }


    public void setDepartmentNumberUnique(String departmentNumberUnique) {
        this.departmentNumberUnique = departmentNumberUnique;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public HashMap<String, Employee> getEmployeeHashMap() {
        return employeeHashMap;
    }

    public HashMap<String, Patient> getPatientHashMap() {
        return patientHashMap;
    }


    public void addEmployee(String employeeID, Employee employee) {

        //TODO: check

        // check if the social security number is 8 digits.
        try {
            //TODO: check
            int intCheck = Integer.parseInt(employee.getSocialSecurityNumber());
            if (!(employee.getSocialSecurityNumber().length() == 8)) {
                System.out.println("The social security number inputted is not 8 digits");

            }

            else {
                //TODO:
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


    public void addPatient(String patientID, Patient patient) {
        //TODO: check


        // check if the social security number is 8 digits.
        try {
            //TODO: check
            int intCheck = Integer.parseInt(patient.getSocialSecurityNumber());
            if (!(patient.getSocialSecurityNumber().length() == 8)) {
                System.out.println("The social security number inputted is not 8 digits");

            }

            else {
                //TODO:
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

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, departmentNumberUnique, employeeHashMap, patientHashMap, person);
    }

    //TODO: hashcode
//TODO: change to match when needed

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





/*
Dersom objektet som sendes inn ikke finnes i registrene (pasienter eller ansatte), skal det kastes et
unntak. Lag en exception‐klasse kalt RemoveException som blir kastet av metoden remove. Unntaket
skal være av typen “checked”. Klassen som kaller remove‐metoden skal fange opp dette og vise
feilmeldingen.
 */

    //an employee or patient belongs to a dept.

     public void remove(String personID, Person person) throws RemoveException {

//TODO:
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


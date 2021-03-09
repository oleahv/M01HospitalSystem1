package hospital;


import hospital.exception.RemoveException;

import java.util.*;

public class Department {

    private String departmentName;


    List<Employee> employeeList = new ArrayList<>();
    List<Patient> patientList = new ArrayList<>();

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




    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    Scanner scanner = new Scanner(System.in);
    String userInputFirstName  = null;
    String userInputLastName  = null;
    String userInputSocialSecurityNumber  = null;

    public List<Employee> getEmployees() {
        return employeeList;
        //TODO:
    }

    public void addEmployee(Employee employee) {

    this.employeeList.add(employee);
    }




    public List<Patient> getPatients() {
        return patientList;
        //TODO:
    }






    public void addPatient(Patient patient) {
        this.patientList.add(patient);
    }

/*
    public void addPatient() {


        System.out.println("Please input the first name of the patient: ");

        if (scanner.hasNext()) {
            userInputFirstName = scanner.nextLine();
        }
        System.out.println("Please input the last name of the patient: ");

        if (scanner.hasNext()) {
            userInputLastName = scanner.nextLine();
        }
        System.out.println("Please input the social security number of the patient: ");

        if (scanner.hasNext()) {
            userInputSocialSecurityNumber = scanner.nextLine();
        }


        Patient newPatientBasedOnInput = new Patient(userInputFirstName, userInputLastName, userInputSocialSecurityNumber);

//TODO: if check does not work. Suspect it checks an object against a String.
                if(!patientList.contains(getPatients().equals(userInputSocialSecurityNumber)))
              {

                 this.patientList.add(newPatientBasedOnInput);
            }
                else{
                    System.out.println("social security number matches when it should not");
                }

    }
*/




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName);
    }



    @Override
    public int hashCode() {
        return Objects.hash(departmentName);
    }
//TODO: hashcode

    
/*
Dersom objektet som sendes inn ikke finnes i registrene (pasienter eller ansatte), skal det kastes et
unntak. Lag en exception‐klasse kalt RemoveException som blir kastet av metoden remove. Unntaket
skal være av typen “checked”. Klassen som kaller remove‐metoden skal fange opp dette og vise
feilmeldingen.
 */

    //an employee or patient belongs to a dept.

     public void remove(Person person){


             if (patientList.contains(person) || employeeList.contains(person)) {
                 //TODO: make sure to account for dual member in lists (can be employee and patient)
                 //can get an error if the person is only in 1 list.
                 patientList.remove(person);
                 employeeList.remove(person);
             } else {
                 System.out.println("The person is not in the employee list or patient list");
             }
         }
         }




    //test


    //TODO: Tostring ++

package hospital;


import hospital.exception.RemoveException;

import java.util.*;
import java.util.stream.Collectors;


public class Department {

    private String departmentName;


    //Lists to hold the employee and patient objects respectively.
    //Recommend using HashMap with key as social security number to allow one to search after a patient or employee

//TODO:
    HashMap<Employee, Integer> employeeHashMap = new HashMap<>();
    HashMap<Employee, Integer> patientHashMap = new HashMap<>();


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


    public List<Employee> getEmployees() {
        return employeeList;
        //TODO:
    }


    public void addEmployee(Employee employee) {

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
                /*
                    int index=0;
                for (Employee employeeSSN: employeeList) {
                   */ if (!employeeList.contains(employee)) {
                        employeeList.add(employee);
                        System.out.println("added once");
                    }

             /*   }

                    if (index>0){
                        employeeList.add(employee);
                        System.out.println("++");
                    }*/
                    else {
                        System.out.println("You have tried to add a person already in the list");
                    }


            }
        }
        catch (NumberFormatException numberFormatException) {
            System.out.println("It seems you have not inputted a number for the social security number, or left it blank");
        }
    }



    public List<Patient> getPatients() {
        return patientList;
        //TODO:
    }






    public void addPatient(Patient patient) {
        //TODO: check


        try {
            // check if the social security number is 8 digits. If not, will cause an exception.
            int intCheck = Integer.parseInt(patient.getSocialSecurityNumber());

            //add a person if the string length is 8 characters
            if (!(patient.getSocialSecurityNumber().length() == 8)) {
                System.out.println("The social security number inputted is not 8 digits");

            }
            else {
                for (Patient patientSSN: this.patientList) {
                    if (!patientList.contains(patientSSN)) {
                        this.patientList.add(patient);
                    }
                    else {
                        System.out.println("You have tried to add a person already in the list");
                    }
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
                Objects.equals(employeeList, that.employeeList) &&
                Objects.equals(patientList, that.patientList) &&
                Objects.equals(person, that.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, employeeList, patientList, person);
    }
//TODO: hashcode
//TODO: change to match when needed

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employeeList=" + employeeList +
                ", patientList=" + patientList +
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

     public void remove(Person person) throws RemoveException {


             if (patientList.contains(person) || employeeList.contains(person)) {

             // Assumes that the employee will not get transferred to a patent list if they get sick/hurt.
                 patientList.remove(person);
                 employeeList.remove(person);
             } else {
                 throw new RemoveException("The person is not in the employee list or patient list");

             }
         }
         }


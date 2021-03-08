package hospital;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Department {

    private String departmentName;


    List<Employee> employeeList = new ArrayList<>();
    List<Patient> patientList = new ArrayList<>();




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

    public void addEmployee(Employee){

    }

    public List<Patient> getPatients() {
        return patientList;
        //TODO:
    }

    public void addPatient(Patient) {
        if (patientList.contains(getPatients())){
            patientList.add;
    }

    }



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

    


    //an employee or patient belongs to a dept.

    public void remove(){
        //remove a patient or employee object
    }




    //test


    //TODO: Tostring ++
}

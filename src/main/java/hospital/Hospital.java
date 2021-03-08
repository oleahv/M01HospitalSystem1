package hospital;

import java.util.*;

public class Hospital {

    private final String hospitalName;


    List<Department> departmentList = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }




    public List<Department> getDepartments(){
        return departmentList;

        //TODO: make a arraylist with departmentarraylist name
    }


    public void addDepartment(Department) {
        System.out.println("test");

    }



    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                '}';
    }

    //TODO: Tostring












}

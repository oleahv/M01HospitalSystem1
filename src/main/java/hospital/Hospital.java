package hospital;

import java.util.*;

/**
 * The type Hospital.
 */
public class Hospital {

    private final String hospitalName;

    /**
     *  List which holds all Department objects.
     * The Department list.
     */

    HashMap<String, Department> departmentHashMap = new HashMap<>();

    //List<Department> departmentList = new ArrayList<>();

    /**
     * Instantiates a new Hospital.
     *
     * @param hospitalName the hospital name
     */
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * Gets hospital name.
     *
     * @return the hospital name
     */
    public String getHospitalName() {
        return hospitalName;
    }


    public HashMap<String, Department> getDepartmentHashMap() {
        return departmentHashMap;
    }


    public void addDepartment(String departmentID, Department department) {
        if (!departmentHashMap.containsKey(department.getDepartmentNumberUnique())){

            departmentHashMap.put(department.getDepartmentNumberUnique(), department);
            System.out.println("test");
        }
        else{
            System.out.println("A department is already using that name");
        }

    }



    @Override
    public String toString() {
        return "Hospital: " + hospitalName + '\'';
    }














}

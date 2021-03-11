package hospital;

import java.util.HashMap;

/**
 * The type Hospital.
 */
public class Hospital {

    private final String hospitalName;


    /**
     * The Department hash map.
     */
    HashMap<String, Department> departmentHashMap = new HashMap<>();



    /**
     * Instantiates a new Hospital.
     *
     * @param hospitalName the name of the hospital
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


    /**
     * Gets department hashmap.
     *
     * @return the department hashmap which holds the departments
     */
    public HashMap<String, Department> getDepartmentHashMap() {
        return departmentHashMap;
    }


    /**
     * Add department to the departmentHashMap as long as the departmentNumberUnique is unique and not in the hashmap.
     *
     * @param departmentID the department id is a placeholder number for the departmentNumberUnique.
     * @param department   the department belonging to the hospital.
     */
    public void addDepartment(String departmentID, Department department) {
        if (!departmentHashMap.containsKey(department.getDepartmentNumberUnique())){

            departmentHashMap.put(department.getDepartmentNumberUnique(), department);
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

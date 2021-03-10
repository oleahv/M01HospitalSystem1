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
//TODO: check if Arrays.toList() can be better option
    HashMap<Department, Integer> departmentHashMap = new HashMap<>();

    List<Department> departmentList = new ArrayList<>();

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


    /**
     * Get departments list.
     *
     * @return the list
     */
    public List<Department> getDepartments(){
        return departmentList;
    }


    /**
     * Add
     *
     * @param department the department to be added
     */
    public void addDepartment(Department department) {
        if (!departmentList.contains(department)){
            departmentList.add(department);
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

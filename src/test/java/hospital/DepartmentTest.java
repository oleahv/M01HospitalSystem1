package hospital;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {







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

    Hospital hospital = new Hospital("Olav");
    @BeforeEach
    void fillRegisterWithTestDataTest() {

        // Add some departments and persons.


        hospital.Department emergency = new hospital.Department("Akutten", "111");
        emergency.getEmployeeHashMap().put("12345671", new hospital.Employee("Odd Even", "Primtallet", "12345671"));
        emergency.getEmployeeHashMap().put("12345672", new hospital.Employee("Huppasahn", "DelFinito", "12345672"));
        emergency.getEmployeeHashMap().put("12345673", new hospital.Employee("Rigmor", "Mortis", "12345673"));
        emergency.getEmployeeHashMap().put("12345674", new hospital.healthpersonal.doctor.GeneralPractitioner("Inco", "Gnito", "12345674"));
        emergency.getEmployeeHashMap().put("12345675", new hospital.healthpersonal.doctor.Surgeon("Inco", "Gnito", "12345675"));
        emergency.getEmployeeHashMap().put("12345676", new hospital.healthpersonal.Nurse("Nina", "Teknologi", "12345676"));
        emergency.getEmployeeHashMap().put("12345677", new hospital.healthpersonal.Nurse("Ove", "Ralt", "12345677"));
        emergency.getPatientHashMap().put("12345678", new hospital.Patient("Inga", "Lykke", "12345678"));
        emergency.getPatientHashMap().put("12345679", new hospital.Patient("Ulrik", "Smål", "12345679"));
        hospital.getDepartmentHashMap().put("111", emergency);
        hospital.Department childrenPolyclinic = new hospital.Department("Barn poliklinikk", "222");
        childrenPolyclinic.getEmployeeHashMap().put("22345671", new hospital.Employee("Salti", "Kaffen", "22345671"));
        childrenPolyclinic.getEmployeeHashMap().put("22345672", new hospital.Employee("Nidel V.", "Elvefølger", "22345672"));
        childrenPolyclinic.getEmployeeHashMap().put("22345673", new hospital.Employee("Anton", "Nym", "22345673"));
        childrenPolyclinic.getEmployeeHashMap().put("22345674", new hospital.healthpersonal.doctor.GeneralPractitioner("Gene", "Sis", "22345674"));
        childrenPolyclinic.getEmployeeHashMap().put("22345675", new hospital.healthpersonal.doctor.Surgeon("Nanna", "Na", "22345675"));
        childrenPolyclinic.getEmployeeHashMap().put("22345676", new hospital.healthpersonal.Nurse("Nora", "Toriet", "22345676"));
        childrenPolyclinic.getPatientHashMap().put("22345677", new hospital.Patient("Hans", "Omvar", "22345677"));
        childrenPolyclinic.getPatientHashMap().put("22345678", new hospital.Patient("Laila", "La", "22345678"));
        childrenPolyclinic.getPatientHashMap().put("22345679", new hospital.Patient ("Jøran", "Drebli", "22345679"));
        hospital.getDepartmentHashMap().put("222", childrenPolyclinic);

    }


    @Test
    void getHospitalNamePositive() {

        System.out.println(hospital.getHospitalName());
        assertTrue(hospital.getHospitalName().equals("Olav"));

    }
    /*
    @Test
    void getHospitalNameNegative() {


       try {
           fail("The name of the hospital is Olav");
           assert(!hospital.getHospitalName().equals("Olav"));
       }
       catch (AssertionError assertionError){

       }
}
*/

    @Test
    void getDepartmentName() {

        System.out.println(hospital.departmentHashMap.get(0).getDepartmentName());
        assertTrue(hospital.departmentHashMap.get(0).getDepartmentName().equals("Akutten"));


    }
/*
    @Test
    void testGetEmployees() {
    }
@Test
    void getPatients() {
    }
    */

/*
    @Test
    void addEmployee() {

        System.out.println(hospital.getDepartmentHashMap().get(0).employeeList.size());

        hospital.getDepartmentHashMap().get(0).addEmployee(new Employee("abc", "æøå","12233445"));


        assertTrue(hospital.getDepartmentHashMap().get(0).employeeList.size() == 8);

    }

    @Test
    void addPatient() {
    }




    @Test
    void removePositiveTest() {
        fillRegisterWithTestDataTest();


      //  fillRegisterWithTestData();

        if (hospital.getDepartments().get(0).patientList.contains(person) || hospital.getDepartments().get(0).employeeList.contains(person)) {


        }
        System.out.println(hospital.getDepartments().get(0).patientList.size());

          //  assertTrue(patientList.size() == 8);
        assert(hospital.getDepartments().get(0).patientList.isEmpty());

    }
    @Test
    void removeNegativeTest() {

        if (hospital.getDepartments().get(0).patientList.contains(person) || hospital.getDepartments().get(0).employeeList.contains(person)) {


        //    employeeList.remove(99);
        }

    //    assertTrue(patientList.size() == 8);


    }


*/

    @AfterEach
    void clearTestData()
    {


                hospital.departmentHashMap.clear();

    }


}

/*
      hospital.addDepartment("333", emergency2);
            hospital.addDepartment("333", emergency3);


            System.out.println(hospital.getDepartmentHashMap().size());
 */
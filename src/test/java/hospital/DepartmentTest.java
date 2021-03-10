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


        hospital.Department emergency = new hospital.Department("Akutten");

        emergency.getEmployees().add(new hospital.Employee("Odd Even", "Primtallet", "12345671"));
        emergency.getEmployees().add(new hospital.Employee("Huppasahn", "DelFinito", "12345672"));
        emergency.getEmployees().add(new hospital.Employee("Rigmor", "Mortis", "12345673"));
        emergency.getEmployees().add(new hospital.healthpersonal.doctor.GeneralPractitioner("Inco", "Gnito", "12345674"));
        emergency.getEmployees().add(new hospital.healthpersonal.doctor.Surgeon("Inco", "Gnito", "12345675"));
        emergency.getEmployees().add(new hospital.healthpersonal.Nurse("Nina", "Teknologi", "12345676"));
        emergency.getEmployees().add(new hospital.healthpersonal.Nurse("Ove", "Ralt", "12345677"));
        emergency.getPatients().add(new hospital.Patient("Inga", "Lykke", "12345678"));
        emergency.getPatients().add(new hospital.Patient("Ulrik", "Smål", "12345679"));
        hospital.getDepartments().add(emergency);

        hospital.Department childrenPolyclinic = new hospital.Department("Barn poliklinikk");
        childrenPolyclinic.getEmployees().add(new hospital.Employee("Salti", "Kaffen", "22345671"));
        childrenPolyclinic.getEmployees().add(new hospital.Employee("Nidel V.", "Elvefølger", "22345672"));
        childrenPolyclinic.getEmployees().add(new hospital.Employee("Anton", "Nym", "22345673"));
        childrenPolyclinic.getEmployees().add(new hospital.healthpersonal.doctor.GeneralPractitioner("Gene", "Sis", "22345674"));
        childrenPolyclinic.getEmployees().add(new hospital.healthpersonal.doctor.Surgeon("Nanna", "Na", "22345675"));
        childrenPolyclinic.getEmployees().add(new hospital.healthpersonal.Nurse("Nora", "Toriet", "22345676"));
        childrenPolyclinic.getPatients().add(new hospital.Patient("Hans", "Omvar", "22345677"));
        childrenPolyclinic.getPatients().add(new hospital.Patient("Laila", "La", "22345678"));
        childrenPolyclinic.getPatients().add(new hospital.Patient("Jøran", "Drebli", "22345679"));
        hospital.getDepartments().add(childrenPolyclinic);
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

        System.out.println(hospital.departmentList.get(0).getDepartmentName());
        assertTrue(hospital.departmentList.get(0).getDepartmentName().equals("Akutten"));


    }
/*
    @Test
    void testGetEmployees() {
    }
@Test
    void getPatients() {
    }
    */


    @Test
    void addEmployee() {

        System.out.println(hospital.getDepartments().get(0).employeeList.size());

        hospital.getDepartments().get(0).addEmployee(new Employee("abc", "æøå","12233445"));


        assertTrue(hospital.getDepartments().get(0).employeeList.size() == 8);

    }
/*
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


                hospital.departmentList.clear();

    }


}
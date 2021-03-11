package hospital;

import hospital.exception.RemoveException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {


    HashMap<String, Employee> employeeHashMap = new HashMap<>();
    HashMap<String, Patient> patientHashMap = new HashMap<>();


    Person person = new Person("", "", "") {
    };

        Hospital hospital = new Hospital("Olav");
    hospital.Department emergency = new hospital.Department("Akutten", "111");
    hospital.Department childrenPolyclinic = new hospital.Department("Barn poliklinikk", "222");


    @BeforeEach
    @DisplayName("fills the hashmaps with testdata")
        void fillRegisterWithTestDataTest() {


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
        @DisplayName("getter test for hospitalName")
        void getHospitalNamePositive() {

            System.out.println(hospital.getHospitalName());
            assertTrue(hospital.getHospitalName().equals("Olav"));

        }


        @Test
        @DisplayName("getter test for departmentName")
        void getDepartmentName() {

            System.out.println(hospital.departmentHashMap.get("111").getDepartmentName());
            assertTrue(hospital.departmentHashMap.get("111").getDepartmentName().equals("Akutten"));

        }


        @Test
        @DisplayName("Removes persons from the hashmaps")
        void removePositiveTest() throws RemoveException {

            emergency.getEmployeeHashMap().put("12345677", new hospital.healthpersonal.Nurse("Ove", "Ralt", "12345677"));
            emergency.getPatientHashMap().put("12345678", new hospital.Patient("Inga", "Lykke", "12345678"));

            System.out.println(hospital.departmentHashMap.get("111").getEmployeeHashMap().size());
            System.out.println(hospital.departmentHashMap.get("111").getPatientHashMap().size());

            hospital.getDepartmentHashMap().get("111").remove("12345677", new hospital.healthpersonal.Nurse("Ove", "Ralt", "12345677"));
            hospital.getDepartmentHashMap().get("111").remove("12345678", new hospital.Patient("Inga", "Lykke", "12345678"));




            System.out.println(hospital.departmentHashMap.get("111").getEmployeeHashMap().size());
            System.out.println(hospital.departmentHashMap.get("111").getPatientHashMap().size());


            assertEquals(6, hospital.departmentHashMap.get("111").getEmployeeHashMap().size());
           assertEquals(1, hospital.departmentHashMap.get("111").getPatientHashMap().size());

        }


    @Test
    @DisplayName("Removes persons from the hashmaps that is out of bounds (crashes")
    void removeNegativeTest() throws RemoveException {


            //TODO:

            try {
                emergency.getEmployeeHashMap().put("1234567700", new hospital.healthpersonal.Nurse("Ove", "Ralt", "1234567700"));
                emergency.getPatientHashMap().put("1234567800", new hospital.Patient("Inga", "Lykke", "1234567800"));

                System.out.println(hospital.departmentHashMap.get("111").getEmployeeHashMap().size());
                System.out.println(hospital.departmentHashMap.get("111").getPatientHashMap().size());

                hospital.getDepartmentHashMap().get("111").remove("12345600", new hospital.healthpersonal.Nurse("Ove", "Ralt", "12345600"));
                hospital.getDepartmentHashMap().get("111").remove("12345600", new hospital.Patient("Inga", "Lykke", "12345600"));


            fail("tried to create a object with wrong social security number format");

            }
            catch (IndexOutOfBoundsException | RemoveException exceptionFound){
                System.out.println(exceptionFound);

                assert (true);
            }
            }

        @AfterEach
        @DisplayName("Clear the hashmaps")
        void clearTestData() {
            hospital.departmentHashMap.clear();
        }
}

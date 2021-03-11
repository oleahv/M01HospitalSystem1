import hospital.Department;
import hospital.Employee;
import hospital.Hospital;
import hospital.Patient;
import hospital.exception.RemoveException;

import java.util.ArrayList;
import java.util.List;


public class HospitalClient {


/*
//TODO: make the old one again
    Lag klienten HospitalClient som bruker HospitalTestData.fillRegisterWithTestData(hospital) til å
fylle registrene med data (metoden fillRegisterWithTestData er gjengitt under).
 Kall remove metoden på hospital.Department for å fjerne en ansatt
 Kall remove metoden på hospital.Department for å fjerne en pasient som ikke finnes i listen. Bruk try‐
catch exception blokk for å håndtere situasjonen.

    * */

    public static void main(String[] args) {


        try {

            //TODO: hospital name is constant (sort of)
            Hospital hospital = new Hospital("Olav");
            HospitalTestData.fillRegisterWithTestData(hospital);

            hospital.Department emergency2 = new hospital.Department("Akutten1", "555");


            hospital.addDepartment("555",emergency2);


            System.out.println(emergency2.getPatientHashMap().size());

            //emergency2.getEmployeeHashMap().put("12122121", new hospital.Employee("Inga", "Lykke", "12122121"));
emergency2.addPatient("12122129", new hospital.Patient("Inga", "Lykke", "12122121"));
            System.out.println(emergency2.getPatientHashMap().size());

            System.out.println(emergency2.getPatientHashMap().size());


            /*
        hospital.getDepartments().get(0).addEmployee((new Employee("testFirstName1", "testLastName1","11223344")));

            //There are 7 employees in that department
            hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getEmployees().get(0));

            //There are 7 patients in that department
           //    hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getPatients().get(99));
*/

        }

        catch (IndexOutOfBoundsException e){ //| RemoveException exceptionFound){


            System.out.println(e.getMessage());
            System.out.println(e);


        }


        //not needed, but give clarity that something has happend
        System.out.println("#######");
        System.out.println("main done running");
        System.out.println("#######");
    }
}
/*
//addDepartment fungerer

add employee og patient fungerer
 System.out.println(emergency2.getEmployeeHashMap().size());



*/
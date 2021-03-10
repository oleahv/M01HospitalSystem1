import hospital.Department;
import hospital.Employee;
import hospital.Hospital;
import hospital.exception.RemoveException;

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

            hospital.Department emergency2 = new hospital.Department("Akutten1");
            hospital.Department emergency3 = new hospital.Department("Akutten1");
            hospital.Department emergency4 = new hospital.Department("Akutten1");
            hospital.getDepartments().add(emergency2);
            hospital.getDepartments().add(emergency3);
            hospital.getDepartments().add(emergency4);

            System.out.println(hospital.getDepartments().size());

            hospital.getDepartments().get(0).addEmployee((new Employee("testFirstName1", "testLastName1","11223344")));
            System.out.println("RRRR");

            //TODO: fix that you can add it twice.
                        hospital.getDepartments().get(0).addEmployee((new Employee("testFirstName1", "testLastName1","11223344")));

            //There are 7 employees in that department
            hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getEmployees().get(0));

            //There are 7 patients in that department
           //    hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getPatients().get(99));


        }
        catch (IndexOutOfBoundsException | RemoveException exceptionFound){


            System.out.println(exceptionFound.getMessage());
            System.out.println(exceptionFound);


        }


        //not needed, but give clarity that something has happend
        System.out.println("#######");
        System.out.println("main done running");
        System.out.println("#######");
    }
}




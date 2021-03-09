import hospital.Department;
import hospital.Employee;
import hospital.Hospital;
import hospital.exception.RemoveException;



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


            //There are 7 employees in that department
            hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getEmployees().get(0));

            //There are 7 patients in that department
            hospital.getDepartments().get(0).remove(hospital.getDepartments().get(0).getPatients().get(99));

        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException){

            RemoveException removeException = new RemoveException();

        }
    }
}

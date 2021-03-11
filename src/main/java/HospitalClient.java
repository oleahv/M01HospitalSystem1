import hospital.Hospital;
import hospital.exception.RemoveException;


/**
 * The type Hospital client.
 */
public class HospitalClient {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {


        try {
            Hospital hospital = new Hospital("Olav");
            HospitalTestData.fillRegisterWithTestData(hospital);
            hospital.Department emergency2 = new hospital.Department("Akutten1", "555");
            hospital.addDepartment("555",emergency2);
            System.out.println(emergency2.getPatientHashMap().size());
            emergency2.addPatient("12122129", new hospital.Patient("Inga", "Lykke", "12122121"));
            System.out.println(emergency2.getPatientHashMap().size());


            //a person in the lists is removed
            hospital.getDepartmentHashMap().get("555").remove("12122129", new hospital.Patient("Inga", "Lykke", "12122121"));
            System.out.println(emergency2.getPatientHashMap().size());

            //person not in the lists is removed
            hospital.getDepartmentHashMap().get("555").remove("12122129", new hospital.Patient("Inga", "Lykke", "90000001"));
        }

        catch (IndexOutOfBoundsException | RemoveException exceptionFound){

            System.out.println(exceptionFound);

        }
    }
}
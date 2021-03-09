
/*
import mappe.del1.hospital.hospital.healthpersonal.hospital.healthpersonal.Nurse;
import mappe.del1.hospital.hospital.healthpersonal.hospital.healthpersonal.doctor.hospital.healthpersonal.doctor.GeneralPractitioner;
import mappe.del1.hospital.hospital.healthpersonal.hospital.healthpersonal.doctor.hospital.healthpersonal.doctor.Surgeon;
public final class HospitalTestData {
    private HospitalTestData() {
        // not called
    }*/


import hospital.Department;
import hospital.Employee;
import hospital.Hospital;
import hospital.Person;
import hospital.healthpersonal.Nurse;
import hospital.healthpersonal.doctor.GeneralPractitioner;
import hospital.healthpersonal.doctor.Surgeon;

import javax.net.ssl.HostnameVerifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class HospitalTestData {
    private HospitalTestData() {
        // not called
    }

    /**
     * @param hospital
     */

    public static void fillRegisterWithTestData(final hospital.Hospital hospital) {
        // Add some departments

        hospital.Department emergency = new hospital.Department("Akutten");
        emergency.getEmployees().add(new hospital.Employee("Odd Even", "Primtallet", ""));
        emergency.getEmployees().add(new hospital.Employee("Huppasahn", "DelFinito", ""));
        emergency.getEmployees().add(new hospital.Employee("Rigmor", "Mortis", ""));
        emergency.getEmployees().add(new hospital.healthpersonal.doctor.GeneralPractitioner("Inco", "Gnito", ""));
        emergency.getEmployees().add(new hospital.healthpersonal.doctor.Surgeon("Inco", "Gnito", ""));
        emergency.getEmployees().add(new hospital.healthpersonal.Nurse("Nina", "Teknologi", ""));
        emergency.getEmployees().add(new hospital.healthpersonal.Nurse("Ove", "Ralt", ""));
        emergency.getPatients().add(new hospital.Patient("Inga", "Lykke", ""));
        emergency.getPatients().add(new hospital.Patient("Ulrik", "Smål", ""));
        hospital.getDepartments().add(emergency);
        hospital.Department childrenPolyclinic = new hospital.Department("Barn poliklinikk");
        childrenPolyclinic.getEmployees().add(new hospital.Employee("Salti", "Kaffen", ""));
        childrenPolyclinic.getEmployees().add(new hospital.Employee("Nidel V.", "Elvefølger", ""));
        childrenPolyclinic.getEmployees().add(new hospital.Employee("Anton", "Nym", ""));
        childrenPolyclinic.getEmployees().add(new hospital.healthpersonal.doctor.GeneralPractitioner("Gene", "Sis", ""));
        childrenPolyclinic.getEmployees().add(new hospital.healthpersonal.doctor.Surgeon("Nanna", "Na", ""));
        childrenPolyclinic.getEmployees().add(new hospital.healthpersonal.Nurse("Nora", "Toriet", ""));
        childrenPolyclinic.getPatients().add(new hospital.Patient("Hans", "Omvar", ""));
        childrenPolyclinic.getPatients().add(new hospital.Patient("Laila", "La", ""));
        childrenPolyclinic.getPatients().add(new hospital.Patient("Jøran", "Drebli", ""));
        hospital.getDepartments().add(childrenPolyclinic);




/*
        //how to remove by index (need a way to find or, or change it

        emergency.remove(emergency.getPatients().get(1));
        emergency.remove(emergency.getPatients().get(0));
*/

    }
}

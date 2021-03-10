
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
}


/*
import mappe.del1.hospital.hospital.healthpersonal.hospital.healthpersonal.Nurse;
import mappe.del1.hospital.hospital.healthpersonal.hospital.healthpersonal.doctor.hospital.healthpersonal.doctor.GeneralPractitioner;
import mappe.del1.hospital.hospital.healthpersonal.hospital.healthpersonal.doctor.hospital.healthpersonal.doctor.Surgeon;
public final class HospitalTestData {
    private HospitalTestData() {
        // not called
    }*/


import hospital.*;
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
}

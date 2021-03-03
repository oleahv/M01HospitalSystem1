

public class Employee extends Person {


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Employee{}";
    }
/*
    public Nurse(String, String, String) {
    }
    TODO: toString*/
}

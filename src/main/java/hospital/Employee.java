package hospital;

public class Employee extends Person {


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    //TODO: easy to implement if allowed.
    //Recommend overriding the toString to each class to assert if a person is a doctor, surgeon,
    // general practitioner or a "regular" employee.
    @Override
    public String toString() {
        return "Employee{}";
    }
}

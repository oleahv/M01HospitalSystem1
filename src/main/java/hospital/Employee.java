package hospital;

public class Employee extends Person {


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }


    //Recommend overriding the toString and making some changes to some classes to assert if a person is a doctor, surgeon,
    // general practitioner or a regular employee.
       @Override
    public String toString() {
        return "Employee{}";
    }
}
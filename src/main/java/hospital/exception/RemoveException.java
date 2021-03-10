package hospital.exception;

public class RemoveException extends Exception {



    public RemoveException(String stringExceptionMessage) {

                super(stringExceptionMessage);

        System.out.println("It seems you have tried to remove a patient or" +
                " an employee with a index not belonging to anyone");


    }
}

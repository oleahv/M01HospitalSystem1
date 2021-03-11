package hospital.exception;

/**
 * The type Remove exception.
 */
public class RemoveException extends Exception {


    /**
     * Instantiates a new Remove exception.
     *
     * @param stringExceptionMessage the string exception message
     */
    public RemoveException(String stringExceptionMessage) {

                super(stringExceptionMessage);

        System.out.println("It seems you have tried to remove a patient or" +
                " an employee with a index not belonging to anyone");


    }
}

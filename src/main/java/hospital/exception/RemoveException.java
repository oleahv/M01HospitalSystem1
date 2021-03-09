package hospital.exception;

public class RemoveException {

    //private final static long serialVersionUID  =1L;    This can be removed. C++/C#

    public RemoveException() {

        System.out.println("It seems you have tried to remove a patient or" +
                " employee with a index not belonging to anyone");


    }
}

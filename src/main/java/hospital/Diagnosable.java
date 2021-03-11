package hospital;

/**
 *
 * The interface Diagnosable.
 */
public interface Diagnosable {


    /**
     * Sets diagnose.
     * Only surgeons and general practitioners can set diagnose.
     *
     * @param diagnose the diagnose that can be set
     */
    public void setDiagnose(String diagnose);
}

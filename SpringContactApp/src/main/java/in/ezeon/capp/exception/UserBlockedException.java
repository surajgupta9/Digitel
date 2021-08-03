package in.ezeon.capp.exception;

/**
 *
 * @author Suraj
 */
public class UserBlockedException extends Exception{
    /**
     * Creates User object without error description.
     */
    public UserBlockedException() {
    }
    /**
     * Creates User object with error description.
     */
    public UserBlockedException(String errDesc) {
        super(errDesc);
    }    
}

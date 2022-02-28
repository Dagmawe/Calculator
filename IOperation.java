/**
 *@author Dagmawe Legesse
 *@Description interface for the operations 
 *
 */


package Calculator;

public interface IOperation {
    /**
     * get the operation that this object holds
     * @return
     */
    public String getOperation ();
    /**
     * set the operation string to use for this operation
     * @param opName
     */
    public void setOperation(String opName);
    /**
     * check to see if the object is set.
     * @return
     */
    public boolean isSet();
}

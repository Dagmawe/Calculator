/**
 *@author Dagmawe Legesse
 *@Description IcalulatorAnswer interface built to supply answers 
 *
 */


package Calculator;
/**
 * a simple answer for a math problem interface
 */
public interface ICalculatorAnswer {
    /**
     * set the type of the answer to the problem
     * @param typeName int or double
     * @param answer the result
     */
    public void setAnswer(String typeName, IOperand answer);
    public IOperand getAnswer();
}

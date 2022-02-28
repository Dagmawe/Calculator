/**
 * @author Dagmawe Legesse
 * @Description Gets and sets the operations
 */
package Calculator;

public class CalculatorOperation implements IOperation {
    private String m_operation;
    @Override
    public String getOperation() {
        // TODO Auto-generated method stub
        return m_operation;
    }

    @Override
    public void setOperation(String opName) {
        // TODO Auto-generated method stub
        m_operation = opName;
        
    }

    @Override
    public boolean isSet() {
        // TODO Auto-generated method stub
        String ops = "+-/*";
        return ops.contains(m_operation);

    }
    
}

/**
 * @author Dagmawe Legesse
 * @Description sets the operation types
 */
package Calculator;

public class CalculatorOperand implements IOperand {
    private String m_operandType;
    private double m_doubleValue;
    private int m_intValue;
    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return m_operandType;
    }
    @Override
    public void setType(String opTypeName) {
        // TODO Auto-generated method stub
        m_operandType = opTypeName;
        
    }
    @Override
    public double getDouble() {
        // TODO Auto-generated method stub
        return m_doubleValue;
    }
    @Override
    public int getInt() {
        // TODO Auto-generated method stub
        return m_intValue;
    }
    @Override
    public void setValue(String typeName, double valueD, int valueI) {
        // TODO Auto-generated method stub
        switch (typeName) {
            case ("int"): {
                m_operandType = typeName;
                m_intValue = valueI;
                break;
            }
            case ("double"): {
                m_operandType = typeName;
                m_doubleValue = valueD;
                break;
            }
            case ("string"): {
                m_operandType = typeName;
                try {
                    m_intValue = valueI;
                }
                catch(NumberFormatException e) {
                    m_intValue = 0;
                }
                break;
            }
        }
        
    }

    public String toString() {
        if(m_operandType.equals("double"))
            return Double.toString(m_doubleValue);
        else if (m_operandType.equals("int"))
            return Integer.toString(m_intValue);
        return "NULL";

    }

    @Override
    public boolean isSet() {
        // TODO Auto-generated method stub
        return true;
    }
    
}

/**
 * @author Dagmawe Legesse
 * @Description Implements ICalculatorAnswers
 */
package Calculator;

public class CalculatorAnswer implements ICalculatorAnswer {
    private String m_typeName;
    private IOperand m_answer;
    @Override
    public void setAnswer(String typeName, IOperand answer) {
        // TODO Auto-generated method stub
        m_answer = answer;
        m_typeName = typeName;
    }

    public String getType() {
        return m_typeName;
    }


    @Override
    public IOperand getAnswer() {
        // TODO Auto-generated method stub 
        return m_answer;
    }
    
}

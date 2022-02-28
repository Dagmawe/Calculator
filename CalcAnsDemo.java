/**
 * @author Dagmawe Legesse
 * @Description Implents ICalculatorAnswers 
 */
package Calculator;

public class CalcAnsDemo implements ICalculatorAnswer {
    public String m_typeName;
    IOperand m_answer;
    @Override
    public void setAnswer(String typeName, IOperand answer) {
        // TODO Auto-generated method stub
        m_answer = answer;
        m_typeName = typeName;
        
    }

    @Override
    public IOperand getAnswer() {
        // TODO Auto-generated method stub
        return m_answer;
    }
    
    
}

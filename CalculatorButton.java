/**
 * @author Dagmawe Legesse
 * @Description Implmemtns the number buttons to pass the values to the text field
 */
package Calculator;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;

import Calculator.CalculatorOperand;
import Calculator.CalculatorOperation;
import Calculator.ICalculatorAnswer;
import Calculator.IOperand;

public class CalculatorButton extends JButton {
    private int m_value;
    private CalculatorNumberPanel m_parent;
    private static final long serialVersionUID = 1L;
    /**
     * The constructor.  it implements the actionlistener
     * as a lambda function.
     * @param parent
     * @param value
     */
    public CalculatorButton(CalculatorNumberPanel parent,int value) {
        m_value = value;
        m_parent = parent;
        
        setFont(new Font(getFont().getName(),getFont().getStyle(),getFont().getSize()*3));
        if(value == -1)
            this.setText("C");
        else if(value == -2)
            this.setText("=");
        else
            this.setText(String.valueOf(value));

        this.addActionListener(e -> {
            CalculatorButton btn = (CalculatorButton) e.getSource();
            // get the parent and call the reset.
            System.out.println("hit button value is " + btn.getValue());
            String btnValue = btn.getText();
            if(btnValue.equals("C")){
                m_parent.getParentCalculatorFrame().getMemory().clearRegister("1");;
                m_parent.getParentCalculatorFrame().setDisplayValue("");
                m_parent.getParentCalculatorFrame().clearDisplay();
            } 
            else if (btnValue.equals("=")){
                String valOne = m_parent.getParentCalculatorFrame().getMemory().getRegisterTwo();
                String valTwo = m_parent.getParentCalculatorFrame().getMemory().getRegisterOne();
                String opname = m_parent.getParentCalculatorFrame().getMemory().getOperation().getOperation();
                
                CalculatorOperation oper = new CalculatorOperation();
                oper.setOperation(opname);

                CalculatorOperand oprnd = new CalculatorOperand();
                ArrayList<IOperand> operands = new ArrayList<IOperand>();
                oprnd.setValue("int", 0, Integer.parseInt(valOne));
                operands.add(oprnd);
                oprnd = new CalculatorOperand();
                oprnd.setValue("int", 0, Integer.parseInt(valTwo));
                operands.add(oprnd);
                
                ICalculatorAnswer ans = m_parent.getParentCalculatorFrame().getEngine().doOperation(oper,operands);
                
                String ansString = String.valueOf(ans.getAnswer().getInt());
                m_parent.getParentCalculatorFrame().getMemory().clearRegister("1");
                m_parent.getParentCalculatorFrame().getMemory().setRegisterOne(ansString);
                m_parent.getParentCalculatorFrame().setDisplayValue(ansString);
            }
            else {
            m_parent.getParentCalculatorFrame().getMemory().setRegisterOne(String.valueOf(btn.getValue()));
            String val = m_parent.getParentCalculatorFrame().getMemory().getRegisterOne();
            m_parent.getParentCalculatorFrame().setDisplayValue(val);
            }
        });
    }
    /**
     * get the value attached to the button.
     * @return
     */
    public int getValue() {
        return m_value;
    }
}

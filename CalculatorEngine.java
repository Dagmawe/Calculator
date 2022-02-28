/**
 * @author Dagmawe Legesse
 * @Description Does the operation of the calculator
 */
package Calculator;

import java.util.ArrayList;

public class CalculatorEngine implements ICalculator {
    ArrayList<IOperation> m_operations;
    public CalculatorEngine() {
        m_operations = new ArrayList<IOperation>();
        IOperation op = new CalculatorOperation();
        op.setOperation("+");
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("-");
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("*");
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("/");
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("^");
        m_operations.add(op);

        op = new CalculatorOperation();
        op.setOperation("%");
        m_operations.add(op);
    }
    @Override
    public ArrayList<IOperation> getOperations() {
        // TODO Auto-generated method stub
        if( (null == m_operations) || ( 0 == m_operations.size())) {
            setOperations();
        }
        return m_operations;
    }
    private void setOperations() {

    }

    @Override
    public ICalculatorAnswer doOperation(IOperation op, ArrayList<IOperand> operands) {
        // TODO Auto-generated method stub
        IOperand ans = new CalculatorOperand();
        ICalculatorAnswer calcAns = new CalculatorAnswer();
        switch(op.getOperation()) {
            case "+":
            case "add": {
                ans = add((operands.get(0)), operands.get(1));
                break;
            }
            case "-":
            case "subtract": {
                ans = sub((operands.get(0)), operands.get(1));
                break;
            }
            case "/":
            case "divide": {
                ans = divide((operands.get(0)), operands.get(1));
                break;
            }
            case "*":
            case "multiply": {
                ans = multiply((operands.get(0)), operands.get(1));
                break;
            }
            case "^":
            case "pow": {
                ans = power((operands.get(0)), operands.get(1));
                break;
            }
            case "%":
            case "mod": {
                ans = modulus((operands.get(0)), operands.get(1));
            }
        }
        calcAns.setAnswer(ans.getType(), ans);
        return calcAns;
    }
    private IOperand add(IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"): {
                opAnswer.setValue("int", 0.0,op1.getInt() + op2.getInt());
                break;
            }
            case ("double"): {
                opAnswer.setValue("double", op1.getDouble() + op2.getDouble(), 0);
                break;
            }
        }
        return opAnswer;
    }
    private IOperand sub(IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"): {
                opAnswer.setValue("int", 0.0,op1.getInt() - op2.getInt());
                break;
            }
            case ("double"): {
                opAnswer.setValue("double", op1.getDouble() - op2.getDouble(), 0);
                break;
            }
        }
        return opAnswer;
    }
    private IOperand divide(IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"): {
                opAnswer.setValue("int", 0.0, op1.getInt() / op2.getInt());
                break;
            }
            case ("double"): {
                opAnswer.setValue("double", op1.getDouble() / op2.getDouble(), 0);
                break;
            }
        }
        return opAnswer;
    }
    private IOperand multiply(IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"): {
                opAnswer.setValue("int", 0.0,op1.getInt() * op2.getInt());
                break;
            }
            case ("double"): {
                opAnswer.setValue("double", op1.getDouble() * op2.getDouble(), 0);
                break;
            }
        }
        return opAnswer;
    }
    private IOperand power(IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"): {
                double a = Math.pow(op1.getInt(), op2.getInt());
                opAnswer.setValue("int", 0.0, (int) a);
                break;
            }
            case ("double"): {
                double a = Math.pow(op1.getDouble(), op2.getDouble());
                opAnswer.setValue("double", a, 0);
                break;
            }
        }
        return opAnswer;
    }
    private IOperand modulus(IOperand op1, IOperand op2) {
        IOperand opAnswer = new CalculatorOperand();
        switch(op1.getType()) {
            case ("int"): {
                opAnswer.setValue("int", 0.0,op1.getInt() % op2.getInt());
                break;
            }
            case ("double"): {
                opAnswer.setValue("double", op1.getDouble() % op2.getDouble(), 0);
                break;
            }
        }
        return opAnswer;
    }
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("The operations are : \n");
        for(IOperation iOperation : m_operations) {
            sb.append(iOperation.getOperation() + "\n");
        }
        return sb.toString();
    }
    
}

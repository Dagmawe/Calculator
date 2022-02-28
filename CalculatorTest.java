/**
 * @author Dagmawe Legesse 
 * @Description Implments calcEngine and calcFrame to operate the calculator 
 */
package Calculator;

//import java.util.ArrayList;
//import java.util.Scanner;

//import CSC1052.Projects.Calculator.interfaces.ICalculator;

public class CalculatorTest {
    //private static void ListOperations(ICalculator calcEngine) {
       // System.out.println(calcEngine.toString());
    //}
    public static void main (String[] args) {
        ICalculator calc = new CalculatorEngine();
        CalculatorFrame calculator = new CalculatorFrame(calc);
/*        
        Scanner ioOps = new Scanner(System.in);
        String op = "";
        ArrayList<IOperand> operands = new ArrayList<IOperand>();
        IOperand operand = new CalculatorOperand();
        IOperation operation = new CalculatorOperation();
        do {
            System.out.print("enter operation L for list of available: ");
            op = ioOps.nextLine();
            switch(op) {
                case "L": {
                    ListOperations(calc);
                    break;
                }
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                case "%": {
                    operation.setOperation(op);
                    break;
                }
                case "=": {
                    if((operands.size() == 2) && (operand.isSet())) {
                        ICalculatorAnswer a = calc.doOperation(operation, operands);
                        System.out.println ("the answer is :" + a.getAnswer().toString());
                        operands = new ArrayList<IOperand>();
                    }
                }
                default: {
                    try {
                        int x = Integer.parseInt(op);
                        operand = new CalculatorOperand();
                        operand.setValue("int", 0, x);
                        operands.add(operand);
                    }
                    catch (NumberFormatException e) {
                        try {
                            double d = Double.parseDouble(op);
                            operand = new CalculatorOperand();
                            operand.setValue("double", d, 0);
                        }
                        catch (NumberFormatException ne) {

                        }
                    }
                }

            }

        }
        while (!op.equalsIgnoreCase("Q"));
        ioOps.close();
*/
    }

    
}

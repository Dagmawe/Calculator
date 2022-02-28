/**
 * @author Dagmawe Legesse
 * @Description created to acts as a fomate holder 
 */
package Calculator;
import java.awt.*;
import javax.swing.JPanel;

public class CalculatorRightSidePanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private CalculatorFrame m_parent;
    private CalculatorOperationPanel m_opsPanel;
    /**
     * the constructor for the panel that holds the panel
     * of buttons.
     * @param parent
     */
    protected CalculatorRightSidePanel (CalculatorFrame parent){
        m_parent = parent;
        setLayout(new BorderLayout());
        m_opsPanel = new CalculatorOperationPanel(m_parent);
        add(m_opsPanel,BorderLayout.CENTER);
    } 

}

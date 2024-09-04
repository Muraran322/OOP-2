
package joption_pane;
import java.awt.*;
import javax.swing.*;


public class JOption_pane {
    
    public static void main(String[] args) {
        String x =JOptionPane.showInputDialog("Entert area ");
        int r =Integer.parseInt(x);
        double area =3.142*r*r;
        JOptionPane.showMessageDialog(null,area);
        
        
    }
    
}


package joption_implementation;

import java.awt.*;
import javax.swing.*;


public class JOption_implementation {
    int r;
    int h;
    double volume;
  
    public static void main(String[] args) {
        String x =JOptionPane.showInputDialog("Enter Radius ");
        int r =Integer.parseInt(x);
        String y =JOptionPane.showInputDialog("Enter Height ");
        int h =Integer.parseInt(x);
        double volume =3.142*r*h + 3.142*r*r;
        JOptionPane.showMessageDialog(null,volume);
        
    }
    
}


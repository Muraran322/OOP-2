
package joption_sarea;

import java.awt.*;
import javax.swing.*;


public class JOption_SArea {
    int r;
    int h;
    double volume;
  
    public static void main(String[] args) {
        
        String x =JOptionPane.showInputDialog("Enter radius to Calulate volume ");
        int r =Integer.parseInt(x);
        String y =JOptionPane.showInputDialog("Enter height to Calulate volume");
        int h =Integer.parseInt(x);
        double volume =2*3.142*r*h + 2*3.142*r*r;
        JOptionPane.showMessageDialog(null,volume);
        
        String w =JOptionPane.showInputDialog("Enter Radius to Calulate surface Area ");
        String t =JOptionPane.showInputDialog("Enter Height to Calulate surface Area");
        double SArea =3.142*r*h + 3.142*r*r;
        JOptionPane.showMessageDialog(null,"The SArea is " +SArea);
        
        
    }
    
}
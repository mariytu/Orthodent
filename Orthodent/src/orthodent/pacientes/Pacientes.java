/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orthodent.pacientes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mary
 */
public class Pacientes extends JPanel{
    
    public Pacientes(){
        //Introducir código aquí
        this.setBackground(new Color(243,242,243));
        this.setPreferredSize(new Dimension(1073, 561));
        
        JLabel mensaje = new JLabel("Pacientes... No disponible aún");
        this.add(mensaje);
    }
    
}

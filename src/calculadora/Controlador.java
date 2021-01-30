/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.*;

public class Controlador {
    VistaCal vc;
    
    public Controlador(){
        vc = new VistaCal();
        
        
    }
    
    public class EscuchaNum implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            
        }
    }
}

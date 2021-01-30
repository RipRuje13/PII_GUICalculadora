/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.*;
import javax.swing.*;
public class VistaCal extends JFrame{
    JTextField res;
    JButton uno;
    JButton dos;
    JButton tres;
    JButton cuatro;
    JButton cinco;
    JButton seis;
    JButton siete;
    JButton ocho;
    JButton nueve;
    JButton cero;
    JButton mas;
    JButton menos;
    JButton mul;
    JButton div;
    JButton igual;
    JButton punto;
    JButton C;
    JPanel numeros, cuenta, mostrar;
    
    public VistaCal(){
        res = new JTextField("",20);
        uno = new JButton("1");
        dos = new JButton("2");
        tres = new JButton("3");
        cuatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        siete= new JButton("7");
        ocho = new JButton("8");
        nueve = new JButton("9");
        cero = new JButton("0");
        mas = new JButton("+");
        menos = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        igual = new JButton("=");
        punto = new JButton(".");
        C = new JButton("C");
        
        numeros = new JPanel();
        cuenta = new JPanel();
        mostrar = new JPanel();
        
        setDiseño();
        addComponentes();
        setComponentes();
        setVentana();
    }
    
    public void setComponentes(){
        res.setEditable(false);
        uno.setVerticalAlignment(JButton.CENTER);
        dos.setVerticalAlignment(JButton.CENTER);
        tres.setVerticalAlignment(JButton.CENTER);
        cuatro.setVerticalAlignment(JButton.CENTER);
        cinco.setVerticalAlignment(JButton.CENTER);
        seis.setVerticalAlignment(JButton.CENTER);
        siete.setVerticalAlignment(JButton.CENTER);
        ocho.setVerticalAlignment(JButton.CENTER);
        nueve.setVerticalAlignment(JButton.CENTER);
        cero.setVerticalAlignment(JButton.CENTER);
        punto.setVerticalAlignment(JButton.CENTER);
        igual.setVerticalAlignment(JButton.CENTER);
        
        C.setVerticalAlignment(JButton.CENTER);
        div.setVerticalAlignment(JButton.CENTER);
        mul.setVerticalAlignment(JButton.CENTER);
        menos.setVerticalAlignment(JButton.CENTER);
        mas.setVerticalAlignment(JButton.CENTER);
        
    }
    
    public void setDiseño(){
        numeros.setLayout(new GridLayout(4,3));
        cuenta.setLayout(new GridLayout(6,1));
        mostrar.setLayout(new FlowLayout());
        this.setLayout(new BorderLayout());
    }
    
    public void addComponentes(){
        mostrar.add(res);
        numeros.add(siete);
        numeros.add(ocho);
        numeros.add(nueve);
        numeros.add(cuatro);
        numeros.add(cinco);
        numeros.add(seis);
        numeros.add(uno);
        numeros.add(dos);
        numeros.add(tres);
        numeros.add(cero);
        numeros.add(punto);
        numeros.add(igual);
        cuenta.add(C);
        cuenta.add(div);
        cuenta.add(mul);
        cuenta.add(menos);
        cuenta.add(mas);
        this.add(mostrar,BorderLayout.NORTH);
        this.add(numeros,BorderLayout.CENTER);
        this.add(cuenta,BorderLayout.EAST);
    }
    
    public void setVentana(){
        this.setTitle("calculadora");
        this.setSize(350,450);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Daniela Davila
 */
public class VentanaBoton implements ActionListener{
       
    //declaracion de los atributos
    JFrame jfVentanaBoton;
    JButton jbBoton, jbBoton2;
    ImageIcon imgIcono, imgIcono2;

    public VentanaBoton() {
        //iniciando el objeto de tipo imgIcono
        imgIcono = new ImageIcon("imagenes" + File.separator + "idea.png"); //File.separator sirve para no estar viendo cual es el separadopr de cada S.O
        //iniciando el objeto de tipo imgIcono2
        imgIcono2 = new ImageIcon("imagenes" + File.separator + "add.png"); //File.separator sirve para no estar viendo cual es el separadopr de cada S.O
        
        //iniciando el objeto tipo jbButton
        jbBoton = new JButton("Oprime", imgIcono);
        //coordenadas del boton y el tamaño **se uso porque en el metodo jfVentanaBoton.setLayout es nulo, si fuera true no tiene razon de ser 
        //jbBoton.setBounds(10, 100, 180, 60);
        
        //iniciando el objeto tipo jframe
        jfVentanaBoton = new JFrame("Ventana con botón");
        jfVentanaBoton.setLayout(null);
        jfVentanaBoton.setLayout(new FlowLayout(FlowLayout.LEFT));// se crea un objeto FloeLayout para poder acceder a un atributo estatico
        //getContetPane()devuelve un objeto, color de fondo con Background
        jfVentanaBoton.getContentPane().setBackground(Color.BLUE);
        //tamaño ancho/altura
        jfVentanaBoton.setSize(600, 400);
        jfVentanaBoton.setResizable(true);//cambiar el tamaño de la ventana si es false la ventana tendra un tamaño especifico
        jfVentanaBoton.setLocationRelativeTo(null);//localizacion de la ventana apartir de que cosa usara de referencia 
        
        //iniciando el objeto tipo jbbutton
        //ImplementadorBoton ib = new ImplementadorBoton();
        //escucha el evento de cuando se oprima el boton, la accion va despues del evento
        //jbBoton.addActionListener(this);//add añade el objeto a la ventana, add es un metodo de JFrame
        jbBoton.addActionListener(
            //se crea una clase anónima
            new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    System.out.println("Soy el boton que acabas de oprimir desde una clase anónima");
                    JOptionPane.showMessageDialog(null, "Soy el boton que acabas de oprimir desde una clase anónima", "Hola",JOptionPane.INFORMATION_MESSAGE);
                }
      
            }
        
        );
        
        //iniciando el objeto tipo jbButton
        jbBoton2 = new JButton("Aprietame", imgIcono2);
        //jbBoton2.setBounds(10, 180, 180, 60);
        

        
        //este codigo debe ir despues de todo lo anterior para que pueda ser visible la ventana
        jfVentanaBoton.setVisible(true);
        //add añade los objetos Botones a la ventana, add es un metodo de JFrame
        jfVentanaBoton.add(jbBoton); 
        jfVentanaBoton.add(jbBoton2);
        jbBoton2.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    System.out.println("Soy el boton que acabas de apretar desde una clase anónima");
                    JOptionPane.showMessageDialog(null, "Soy el boton que acabas de apretar desde una clase anónima", "Hola",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        
        );
        
    }//fin del constructor
    
    public static void main(String[] args) {
        
        new VentanaBoton();
        
    }//finde metodo main

    @Override
    //se implementa el ActionPerformed dentro de ella misma, debido a que el boton hace lo mismo
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("Soy el boton que acabas de oprimir");
        JOptionPane.showMessageDialog(null, "Soy el boton que acabas de oprimir", "Hola",JOptionPane.INFORMATION_MESSAGE);
        
    }//fin de metodo actionPerformed
    
    
    
    
}//fin de la clase VentanaBoton

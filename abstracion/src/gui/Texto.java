/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Texto extends WindowAdapter{
    
    JFrame jf;
    JTextField jtF1, jtF2;

    public Texto() {
        initComponents();
    }
    
    public void initComponents(){
        jf = new JFrame("ejemplo de campos de texto");
        jf.setLayout(null);
        jf.setSize(600, 400);
        jf.setResizable(true);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jf.addWindowListener(this);
        
        jtF1 = new JTextField();
        jtF2 = new JTextField();
        //asignando tamaños
        jtF1.setBounds(20, 20, 100, 30);
        jtF2.setBounds(20, 60, 100, 30);
        //agregando JTextField
        jf.add(jtF1);
        jf.add(jtF2);
        
        jtF1.addFocusListener(
            new FocusListener(){
                @Override
                public void focusGained(FocusEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    jtF1.setBackground(Color.GREEN);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    jtF1.setBackground(Color.WHITE);
                }
                
            }   
                
        );
        
        jtF1.addKeyListener(
            new KeyAdapter(){
                @Override
                public void keyTyped(KeyEvent e){
                    //Se le asigna a k el valor de la tecla presionada
                    int k = e.getKeyChar();

                    if(k >= 32 && k <=47 || k >= 58 && k<= 255){
                        e.setKeyChar((char)KeyEvent.VK_CLEAR);
                    }

                    if(jtF1.getText().length() >= 9 ){

                        e.consume();
                    }
                }
            }
        );
        
        jtF2.addFocusListener(
            new FocusListener(){
                @Override
                public void focusGained(FocusEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    jtF2.setBackground(Color.GREEN);
                }

                @Override
                public void focusLost(FocusEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    jtF2.setBackground(Color.WHITE);
                }
                
            }   
                
        );
        
        jtF2.addKeyListener(
            new KeyListener(){
                @Override
                public void keyTyped(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    //Se le asigna a k el valor de la tecla presionada
                    int k = e.getKeyChar();

                    if(k >= 32 && k <=47 || k >= 58 && k<= 255){
                        e.setKeyChar((char)KeyEvent.VK_CLEAR);
                    }

                    if(jtF1.getText().length() >= 9 ){

                        e.consume();
                    }
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            }
        );
        
        jf.setVisible(true);
    }//fin de initcomponents
    
    @Override
    public void windowClosing(WindowEvent evt){
        if(JOptionPane.showConfirmDialog(null, "¿Seguro de salir?", "Confirmacion de salida", 
                JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
           jf.dispose();
           System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new Texto();
    }
    
    
}//fin de la clase

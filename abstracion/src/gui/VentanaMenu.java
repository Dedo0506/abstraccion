/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaMenu extends WindowAdapter{
    
    JFrame jfVentanaMenu;
    JMenuBar jmbMenuBar;
    JMenu jmArchivo, jmEdicion, jmAyuda;
    JMenuItem jmiAbrir, jmiGuardar, jmiImportar, jmiSalir, 
              jmiCortar, jmiCopiar, jmiPegar, jmiAcercaDe, jmiNuevo;
    ImageIcon imgAbrir, imgGuardar, imgImportar, imgSalir, 
              imgCortar, imgCopiar, imgPegar, imgAcercaDe,
              imgArchivo, imgEdicion, imgAyuda, imgNuevo;

    public VentanaMenu() {
        
        //iniciando la ventan del menu
        jfVentanaMenu = new JFrame("Menú principal");
        jfVentanaMenu.setLayout(null);
        jfVentanaMenu.setSize(600, 400);
        jfVentanaMenu.setResizable(true);
        jfVentanaMenu.getContentPane().setBackground(Color.BLUE);
        jfVentanaMenu.setLocationRelativeTo(null);
        
        jfVentanaMenu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jfVentanaMenu.addWindowListener(this);
         
        
        //iniciando iconos para los items        
        imgAbrir = new ImageIcon("imagenes" + File.separator + "add.png");
        imgGuardar = new ImageIcon("imagenes" + File.separator + "add.png");
        imgImportar = new ImageIcon("imagenes" + File.separator + "add.png");
        imgSalir = new ImageIcon("imagenes" + File.separator + "add.png");
        imgCortar = new ImageIcon("imagenes" + File.separator + "add.png");
        imgCopiar = new ImageIcon("imagenes" + File.separator + "add.png");
        imgPegar = new ImageIcon("imagenes" + File.separator + "add.png");
        imgAcercaDe = new ImageIcon("imagenes" + File.separator + "add.png");
        imgArchivo = new ImageIcon("imagenes" + File.separator + "add.png");
        imgEdicion = new ImageIcon("imagenes" + File.separator + "add.png");
        imgAyuda = new ImageIcon("imagenes" + File.separator + "add.png");
        imgNuevo = new ImageIcon("imagenes" + File.separator + "add.png");
        //iniciando barra de menu
        jmbMenuBar = new JMenuBar();
        jmbMenuBar.setVisible(true);
        
        //iniaciando menu
        jmArchivo = new JMenu("Archivo");
        jmArchivo.setIcon(imgArchivo);
        jmArchivo.setMnemonic('A');
        
        jmEdicion = new JMenu("Edicion"); 
        jmEdicion.setIcon(imgEdicion);
        jmEdicion.setMnemonic('E');
        
        jmAyuda = new JMenu("Ayuda");
        jmAyuda.setIcon(imgAyuda);
        jmAyuda.setMnemonic('y');
        
        //inciando items
        jmiAbrir = new JMenuItem("Abrir", imgAbrir); 
        jmiAbrir.setMnemonic('b');
        jmiAbrir.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    JFileChooser jfc = new JFileChooser();
                    jfc.setCurrentDirectory(new java.io.File("."));
                    jfc.setDialogTitle("Seleccione su archivo por favor");
                }
            }
        
        );
        
        
        jmiGuardar = new JMenuItem("Guardar", imgGuardar); 
        jmiGuardar.setMnemonic('G');
        
        jmiImportar = new JMenuItem("Importar", imgImportar); 
        jmiImportar.setMnemonic('I');
                
        jmiSalir = new JMenuItem("Salir", imgSalir); 
        jmiSalir.setMnemonic('S');
        jmiSalir.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                  
                    if(JOptionPane.showConfirmDialog(null, "¿Seguro de salir?", "Confirmacion de salida", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION, imgSalir) == JOptionPane.YES_OPTION){
                       jfVentanaMenu.dispose();
                       System.exit(0);
                    }
                }                
            }
        );
        
        jmiCortar = new JMenuItem("Cortar", imgCortar); 
        jmiCortar.setMnemonic('C');
        
        jmiCopiar = new JMenuItem("Copiar", imgCopiar); 
        jmiCopiar.setMnemonic('o');
        
        jmiPegar = new JMenuItem("Pegar", imgPegar); 
        jmiPegar.setMnemonic('P');
        
        jmiAcercaDe = new JMenuItem("Acerca de...", imgAcercaDe); 
        jmiAcercaDe.setMnemonic('e');
        jmiAcercaDe.addActionListener(
            
            new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    JOptionPane.showMessageDialog(null, "Dávila Olivares Daniela Elizabeth", "Hola",JOptionPane.INFORMATION_MESSAGE);
                }
      
            }
        
        );
        jmiNuevo = new JMenuItem("nuevo", imgNuevo); 
        jmiNuevo.setMnemonic('n');
        jmiNuevo.addActionListener(
            
            new ActionListener(){
            
                @Override
                public void actionPerformed(ActionEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    new Texto();
                }
      
            }
        
        );

        
        /*Agregar items a menu*/
        jmArchivo.add(jmiAbrir);
        jmArchivo.add(jmiGuardar);
        jmArchivo.add(jmiImportar);
        jmArchivo.add(jmiNuevo);
        jmArchivo.addSeparator();
        jmArchivo.add(jmiSalir);
        
        
        jmEdicion.add(jmiCortar);
        jmEdicion.add(jmiCopiar);
        jmEdicion.add(jmiPegar);
        
        jmAyuda.add(jmiAcercaDe);
        
        //Agregar menus a la barra
        jmbMenuBar.add(jmArchivo);
        jmbMenuBar.add(jmEdicion);
        jmbMenuBar.add(jmAyuda);
        
        
        //agregar barra al menu
        jfVentanaMenu.setJMenuBar(jmbMenuBar);
        jfVentanaMenu.setVisible(true);
        
    }   
    @Override
    public void windowClosing(WindowEvent evt){
        if(JOptionPane.showConfirmDialog(null, "¿Seguro de salir?", "Confirmacion de salida", 
                JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION, imgSalir) == JOptionPane.YES_OPTION){
           jfVentanaMenu.dispose();
           System.exit(0);
        }
    }

    
  public static void main(String[] args) {
        new VentanaMenu();
    }  
    
}

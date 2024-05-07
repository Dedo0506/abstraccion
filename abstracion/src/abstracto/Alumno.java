/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracto;

/**
 *
 * @author Daniela Davila
 */
public abstract class Alumno {
    
    private String nombre;
    private String noCuenta;
    private String carrera;
    private String status;
    private String generacion;
    
    public void estudiar(){
        System.out.println("Soy alumno y estudio");
    }
    
    public abstract void reprobar();
    
    public static void main(String args[]){
    
        AlumnoLicenciatura  alumno1 = new AlumnoLicenciatura();
        AlumnoPosgrado  alumno2 = new AlumnoPosgrado();
    
    }
}

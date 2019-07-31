/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo_web_240719;

/**
 * @author felipe
 * @since 47/07/2019
 * @version 1.0
 *
 */




public class Leon extends Carnivoro{
    
    private int edad;
    private int tamaño;
    private static final String ACCION = "ruge";
    private String collar;
/**
 * @param edad
 * @param tamaño
 * @param accion 
 */
    
    public Leon(int edad, int tamaño) { // constructor
        this.edad = edad;
        this.tamaño = tamaño;

    }
/**
 * 
 * @return
 */
    public int getEdad() {
        return edad;
    }
/**
 * 
 * @param edad 
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    public static String getAccion() {
        return ACCION;
    }

    @Override
    public void instinto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Leon{" + "edad=" + edad + ", tama\u00f1o=" + tamaño;
    }
    
    
    

   
}

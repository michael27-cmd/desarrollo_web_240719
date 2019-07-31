/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo_web_240719;

/**
 *
 * @author s214e12
 */
public class perro  extends Carnivoro{
    private  int edad;
    private int tamaño;
    private static final String ACCION = "ladra";
    private String collar;
/**
 * 
 * @param edad
 * @param tamaño 
 */
    public perro(int edad, int tamaño) {
        this.edad = edad;
        this.tamaño = tamaño;

}

    public int getEdad() {
        return edad;
    }

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

    public static String getACCION() {
        return ACCION;
    }

    @Override
    public void instinto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "perro{" + "edad=" + edad + ", tama\u00f1o=" + tamaño;
    }
    
    
    

}

    


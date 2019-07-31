/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo_web_240719;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author s214e12
 */
public class Desarrollo_web_240719 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Carnivoro> arranimal = new ArrayList(); // el List es la padre y la mas general.


        // ME AHORRO LAS INSTANCIACIONES
        
        arranimal.add(new Gato(2, 100)); // me ahorro instanciacion para mejorar MEMORIA 
        arranimal.add(new Gato(2, 100));
        arranimal.add(new perro(4, 120));
        arranimal.add(new perro(18, 110));
        arranimal.add(new Leon(8, 150));
        arranimal.add(new Leon(5, 130));

        for (Carnivoro a : arranimal) {

            System.out.println(a);

        }
 

    }

}

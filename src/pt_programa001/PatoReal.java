/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt_programa001;

/**
 *
 * @author Reyes Lulichac Walter Adrian
 */
public class PatoReal extends Pato {
    public PatoReal(){
        volable=new VuelaConAlas();
        cuaqueable=new Cuaqueo();
    }
    @Override
    public void mostrar() {
        System.out.println("Yo soy un verdadero PATO REAL");
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt_programa001;

/**
 *
 * @author sistemas
 */
public class PatoSeñuelo extends Pato {

    public PatoSeñuelo(){
        volable=new NoVuela();
        cuaqueable= new CuaqueoMudo();
    }
    @Override
    public void mostrar() {
        System.out.println("Yo soy PATO SEÑUELO");    }

 
    
}

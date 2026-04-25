/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt_programa001;

/**
 *
 * @author sistemas
 */
public class PatoSeñuelo extends Pato implements Cuaqueable,Volable{

    @Override
    public void mostrar() {
        System.out.println("Yo soy PATO SEÑUELO");    }

    @Override
    public void cuaquear() {
        System.out.println("<<Silencio>>");    }

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR");    }
    
}

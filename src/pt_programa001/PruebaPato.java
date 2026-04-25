/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt_programa001;

/**
 *
 * @author sistemas
 */
public class PruebaPato {

    public static void main(String[] args) {
        PatoReal p1 = new PatoReal();
        PatoCabezaRoja pcr1 = new PatoCabezaRoja();
        PatoDeGoma pg1 = new PatoDeGoma();
        PatoSeñuelo ps1 = new PatoSeñuelo();
        
        p1.mostrar();
        p1.RealizarCuaqueo();
        p1.RealizarVuelo();
        p1.nadar();
                
        System.out.println("");
        
        pg1.mostrar();
        pg1.RealizarCuaqueo();
        pg1.RealizarVuelo();
        pg1.nadar();
        
        System.out.println("");
        
        ps1.mostrar();
        ps1.RealizarCuaqueo();
        ps1.RealizarVuelo();
        ps1.nadar();
        
        System.out.println("");
        
        pcr1.mostrar();
        pcr1.RealizarCuaqueo();
        pcr1.RealizarVuelo();
        pcr1.nadar();
        
        
    }
    
}

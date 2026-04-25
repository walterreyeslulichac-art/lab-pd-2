
package pt_programa001;

public abstract class Pato{
    protected Volable volable;
    protected Cuaqueable cuaqueable;
    
    
    public void setVolable(Volable v) {
        this.volable = v;
    }

    public void setCuaqueable(Cuaqueable c) {
        this.cuaqueable = c;
    }
    
    public abstract void  mostrar();
    public void RealizarVuelo(){
        volable.volar();
    }
    public void RealizarCuaqueo(){
        cuaqueable.cuaquear();
    }
    
    public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
}

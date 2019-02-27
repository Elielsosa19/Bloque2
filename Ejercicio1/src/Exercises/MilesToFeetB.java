
package Exercises;


public class MilesToFeetB {
    public static final int PIES = 5280;
    private float distancia;
    public MilesToFeetB(float distancia){
        this.distancia = distancia;
    }
    public MilesToFeetB(){
        
    }
    public float getDistancia() {
        return distancia;
    }
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    @Override
    public String toString(){
        return String.format("La distancia de mi casa a la de mi tio es: %.2f",distancia*PIES);
    } 

    
}

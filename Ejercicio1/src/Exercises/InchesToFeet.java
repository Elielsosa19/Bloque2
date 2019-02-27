
package Exercises;


public class InchesToFeet { 
     private static Integer PIES=12;
    private Integer pulgadas;
    
    public InchesToFeet(){
        this.pulgadas=86;
    }

    public String conver(){
        return String.format("%d pulgadas se convierten %d pies  y %d pulgadas",this.getPulgadas(),this.getPulgadas()/PIES,this.getPulgadas()%PIES);
    }
  
    public static Integer getPIES() {
        return PIES;
    }

    
    public static void setPIES(Integer aPIES) {
        PIES = aPIES;
    }

   
    public Integer getPulgadas() {
        return pulgadas;
    }

   
    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }
     
}

    


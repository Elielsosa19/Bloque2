
package Exercises;


public class InchesToFeetB {
   private static Integer PIES=12;
    private Integer pulgadas;
    
    public InchesToFeetB(Integer pulgadas){
        this.pulgadas=pulgadas;
    }

    public String conver(){
        return String.format("%d pulgadas se convierten en %d pies y %d pulgadas",this.getPulgadas(),this.getPulgadas()/PIES,this.getPulgadas()%PIES);
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



  
    


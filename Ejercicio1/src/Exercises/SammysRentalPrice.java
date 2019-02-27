
package Exercises;
public class SammysRentalPrice {
    private Integer Minutos;
    private static Integer HORAS=40;
    private static Integer ADDI=1;
    
    public SammysRentalPrice(Integer minutos){
        this.Minutos=minutos;
    }

    public Integer Trash(){
        return this.getMinutos()/60;
    }
    
    public Integer Trasm(){
        return this.getMinutos()%60;
    }
    
    public String toString(){
        if(this.Trash()<1){
           return String.format("Horas: %d\nMinutos: %d\nTotal: %d",this.Trash(),this.Trasm(),this.Trasm()*ADDI);
        }else{
            if(this.Trash()>=2){
                return String.format("Horas: %d\nMinutos: %d\nTotal: %d",this.Trash(),this.Trasm(),(((this.Trash()-1)*60)*ADDI)+HORAS+this.Trasm()*ADDI);
            }else{
                return String.format("Horas: %d\nMinutos: %d\nTotal: %d",this.Trash(),this.Trasm(),HORAS+this.Trasm()*ADDI);
            }
        }
    }
       public Integer getMinutos() {
        return Minutos;
    }

}

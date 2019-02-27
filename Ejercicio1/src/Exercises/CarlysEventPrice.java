
package Exercises;
public class CarlysEventPrice {
private Integer invitados;
    public static final Integer PERSONA=35;
    public CarlysEventPrice(Integer invitados){
        this.invitados=invitados;
    }
    public Integer getInvitados() {
        return invitados;
    }
    public void setInvitados(Integer invitados) {
        this.invitados = invitados;
    }
    public String lema(){
        return "********************************************************\n* Carly hace la comida  en una fiesta *\n********************************************************";
    }           
    public Integer totalPrice(){
        return this.getInvitados()*PERSONA;
    }
    @Override
    public String toString(){
        return String.format("N° Invitados: %d\nPrecio por huésped: %d\nPrecio total: %d",this.getInvitados(),PERSONA,this.totalPrice());
    }
    public Boolean taman(){
        return this.getInvitados()>= 50;
    }
    
}


package Exercises;
public class TicketNumber {
 private Integer ticket;
   
   public TicketNumber(Integer ticket){
       this.ticket=ticket;
   }

   public Integer ultnum(){
       return (this.getTicket()%10);
   }
   
   public boolean desicion(){
       if((this.getTicket()/10-((getTicket()/10)/7)*7)==this.ultnum()){
           return true;
       }else{
           return false;
       }
   }
   
     
    public Integer getTicket() {
        return ticket;
    }
   
    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }   
    
}

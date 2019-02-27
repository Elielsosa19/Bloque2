
package Exercises;

public class ProjectedSales {
public static final float INCREMENT=(float) 0.10;
    private int salesN, salesS;
    public ProjectedSales(){
        this.salesN = 4000;
        this.salesS = 5500;
    }
    public int getSalesN() {
        return salesN;
    }
    public void setSalesN(int salesN) {
        this.salesN = salesN;
    }
    public int getSalesS() {
        return salesS;
    }
    public void setSalesS(int salesS) {
        this.salesS = salesS;
    }
    @Override
    public String toString(){
        return String.format("La venta total Norte es de : %.2f, Sur es de: %.2f ",(this.getSalesN()*INCREMENT)+this.getSalesN(),(this.getSalesS()*INCREMENT)+this.getSalesS());
    }
    
}


package Exercises;


public class ProjectedSalesB {
    public static final float increment=(float) 0.10;
    private int salesN, salesS;
    public ProjectedSalesB(int salesN, int salesS){
        this.salesN = salesN;
        this.salesS = salesS;
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
        return String.format("La venta total Norte es de : %.2f, Sur es de: %.2f ",(this.getSalesN()*increment)+this.getSalesN(),(this.getSalesS()*increment)+this.getSalesS());
    }

    
}

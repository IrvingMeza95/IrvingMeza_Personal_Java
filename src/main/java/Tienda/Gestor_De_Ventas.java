
package Tienda;

public class Gestor_De_Ventas {
    private int totalVentas;
    private int totClientes;
    private float sueldos;

    public Gestor_De_Ventas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return "Total Ventas = " + totalVentas;
    }
    
    public int totalVentasSuperioresA200(int[] totVentas){
        int ventasSuperioresA200=0;
        for(int ventas:totVentas){
            if(ventas>1999){
                ventasSuperioresA200++;
            }
        }
        return ventasSuperioresA200;
    }
    
    public void mostrarVentas(int[] totVentas,int precio){
        for(int ventas:totVentas){
            if(ventas>precio){
                System.out.println("Venta por: $"+ventas);
            }
        }
    }
    
}

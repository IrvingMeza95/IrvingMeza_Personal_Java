
package Tienda;

import javax.swing.JOptionPane;

public class main {
    
    public static void main(String[] args) {
        Gestor_De_Ventas Gestor = new Gestor_De_Ventas(0);
        int totVentas[] = new int[30];
        
        for(int i=0;i<30;i++){
            for(int j=0;j<(int)(Math.random()*10);j++){
                totVentas[i] += (int)(Math.random()*1000);
            }
        }
        
        Gestor.setTotalVentas(Gestor.totalVentasSuperioresA200(totVentas));
        JOptionPane.showMessageDialog(null,Gestor.toString());
        Gestor.mostrarVentas(totVentas,2000);
        
    }

}

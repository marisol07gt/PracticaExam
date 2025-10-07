/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexam;

/**
 *
 * @author M. Tovar
 */
public class PracticaExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        
        TarjetaCredito tc = new TarjetaCredito(1000);
        tc.retirar(500);
        tc.sumaInteres();
        System.out.println("Tarjeta Credito: " + tc.getMontoActual());

        
        TarjetaDebito td = new TarjetaDebito(1000);
        td.retirar(500);
        System.out.println("Tarjeta Débito: " + td.getMontoActual());

        
        CuentaAhorro ca = new CuentaAhorro(1000);
        ca.invertir();
        System.out.println("Cuenta Ahorro: " + ca.getMontoActual());
    }
}
    
    


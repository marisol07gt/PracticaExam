/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexam;

/**
 *
 * @author M. Tovar
 */
public class TarjetaDebito extends Cuenta{

    public TarjetaDebito(double apertura) {
        super(apertura);
    }
@Override
    public void depositar(double cantidad) {
        setMontoActual(getMontoActual() + cantidad);
    }
    
    @Override
    public void retirar(double cantidad){
        if (cantidad <= getMontoActual()) {
            setMontoActual(getMontoActual()- cantidad);

        }else{
            System.out.println("Fondos suficinetes");            
        }
        
    }
}

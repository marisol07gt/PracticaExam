/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexam;

/**
 *
 * @author M. Tovar
 */
public class TarjetaCredito extends Cuenta {

    public TarjetaCredito(double apertura) {
        super(apertura);
    }
@Override
    public void depositar(double cantidad) {
        setMontoActual(getMontoActual() + cantidad);
    }

    @Override
    public void retirar(double cantidad) {
        setMontoActual(getMontoActual() - cantidad);
    }

    public void sumaInteres() {
        double interes = getMontoActual() * 0.15;
        setMontoActual(getMontoActual() + interes);
    }    
    
}

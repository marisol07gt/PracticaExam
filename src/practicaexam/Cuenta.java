/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexam;

/**
 *
 * @author M. Tovar
 */
public  abstract class Cuenta {
    private double montoActual;
    
    public Cuenta(double apertura){
        this.montoActual=apertura;
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
    
    public abstract void depositar(double cantidad);
    public abstract void retirar(double cantidad);
        
    }
    


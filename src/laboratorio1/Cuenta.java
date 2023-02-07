/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package laboratorio1;

/**
 *
 * @author ricardo toledo
 */
public class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void depositar(double montoDeposito){
        this.saldo += montoDeposito;
    }
    
}

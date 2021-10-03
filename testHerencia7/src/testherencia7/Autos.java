/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia7;

/**
 *
 * @author PC
 */
public class Autos {
    private int numeroSerieMotor;
    private String marca;
    private int año;
    private int precio;
    
    public Autos(int numeroSerieMotor, String marca, int año, int precio) {
        this.numeroSerieMotor = numeroSerieMotor;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public int getNumeroSerieMotor() {
        return numeroSerieMotor;
    }

    public void setNumeroSerieMotor(int numeroSerieMotor) {
        this.numeroSerieMotor = numeroSerieMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
       return "Serie del Motor: "+this.numeroSerieMotor+" "+
               "Marca: "+this.marca+" "+
               "Año: "+this.año+" "+
               "Precio: "+this.precio;
    }
}

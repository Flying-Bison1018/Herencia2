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
public class AutosCompactos extends Autos {
    private int cantidadPasajero;
    
   public AutosCompactos(int numeroSerieMotor, String marca, int año, int precio,int cantidadPasajero){
       super(numeroSerieMotor,marca,año,precio);
       this.cantidadPasajero=cantidadPasajero;
   }

    public int getCantidadPasajero() {
        return cantidadPasajero;
    }

    public void setCantidadPasajero(int cantidadPasajero) {
        this.cantidadPasajero = cantidadPasajero;
    }
    
    @Override
    public String toString(){
        return super.toString()+
          "Cantidad de pasajeros(Kg): "+this.cantidadPasajero;
    }
}

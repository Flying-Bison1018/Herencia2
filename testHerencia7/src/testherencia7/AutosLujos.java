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
public class AutosLujos extends Autos {
    private int canitidadPasajeros;
    public AutosLujos(int numeroSerieMotor,String marca, int año, int precio,int cantidadPasajeros){
        super(numeroSerieMotor,marca,año,precio);
        this.canitidadPasajeros=cantidadPasajeros;
    }

    public int getCanitidadPasajeros() {
        return canitidadPasajeros;
    }

    public void setCanitidadPasajeros(int canitidadPasajeros) {
        this.canitidadPasajeros = canitidadPasajeros;
    }
    
    public String toString(){
        return super.toString()+" "+
              "Cantidad de pasajeros(KG): "+this.canitidadPasajeros;
    }
}

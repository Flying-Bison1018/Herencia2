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
public class Camionetas extends Autos {
    private float capacidadCarga;
    private int cantidadEjes;
    private int rodadas;
    
  public Camionetas(int numeroSerieMotor,String marca,int año,int precio,float cantidadCarga, int cantidadEjes,int rodadas){
      super(numeroSerieMotor,marca,año,precio);
      this.capacidadCarga= cantidadCarga;
      this.cantidadEjes=cantidadEjes;
      this.rodadas=rodadas;
  }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }
    
    
    @Override
    public String toString(){
        return super.toString()+
                "Capacidad Carga(KG): "+this.capacidadCarga+" "+
                "Cantidad de ejes: "+this.cantidadEjes+" "+
                "Cantidad Rodadas: "+this.rodadas;
    }
}

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
public class TestHerencia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autos a = new Autos(11234,"LETTER",2020,200000);
        System.out.println(a.toString());
        AutosCompactos ac=new AutosCompactos(23445,"MAZDA",2019,3400000,3);
        System.out.println(ac.toString());
        AutosLujos al = new AutosLujos(3564,"LEON",2010,600000,2);
        System.out.println(al.toString());
        Camionetas cm=new Camionetas(27685,"KILL",2011,500000,20,2,3);
        System.out.println(cm.toString());
    }
    
}

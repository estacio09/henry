/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author usuario
 */
public class buseta {
     String placa;
     int capacidadPasajeros;
     int precioPasaje = 3000;
     int pasajerosActuales;
     int totalPasajeros;
     int dineroAcomulado;
     int totalPajeros;

    public buseta(String placa, int capacidadPasajeros, int precioPasaje, int pasajerosActuales) {
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioPasaje = precioPasaje;
        this.pasajerosActuales = pasajerosActuales;
    }

   
    
    public String getPlaca() {
        return placa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getPrecioPasaje() {
        return precioPasaje;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public int getDineroAcomulado() {
        return dineroAcomulado;
    }
    

public void subirPasajeros (int pasajeros) {
  
    if (pasajeros > 10){
        System.out.println("hay sobrecupo");
    }else {
        pasajerosActuales = pasajeros + pasajerosActuales;
        totalPasajeros = totalPasajeros + pasajeros;
        System.out.println("actuales " + pasajerosActuales);
        
    }
    
}
public void bajarPasajeros ( int pasajeros) {
    
    if (pasajerosActuales < pasajeros){
        System.out.println("error, se bajaron mas de los que hay");
        System.out.println("actual " + pasajerosActuales);
    }else{
        pasajerosActuales = pasajerosActuales - pasajeros; 
        System.out.println("los numeros de pasajeros actulaes son: " + pasajerosActuales);
       
        
    }
    

}
public void dineroAcomulado (){
    
    dineroAcomulado = precioPasaje * totalPasajeros;
    System.out.println("el dinero total es " + dineroAcomulado);
    
    
}
    
}


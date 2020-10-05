/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Bus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entra1 = new Scanner (System.in);
        Scanner entra2 = new Scanner (System.in);
        Scanner entra3 = new Scanner (System.in);
        int pasajeros,pasajerosv,opcion;
        buseta bus1 = new buseta ("pdg_123", 10, 3000,0);
      
        int i=0;
        while (i !=9){
        System.out.println("1: subir pasajeros");
        System.out.println("2: bajar pasajeros");
        System.out.println("3: cuanto dinero hay");
        System.out.println("4: obtener placa");
        System.out.println("5: capacidad de pasajeros");
        System.out.println("6: precio de pasajero");
        System.out.println("7: pasajeos actuales");
        System.out.println("8: total de pasajeros");
        System.out.println("9: salir del programa");
        
        
            
        opcion = entra3.nextInt();
        i = opcion;
        switch (opcion) {
            
            case 1:
                System.out.println("ingrese cuantos pasajeros se subiran");
                pasajeros = entra1.nextInt();
                bus1.subirPasajeros(pasajeros);
                break;
            case 2:
                System.out.println("ingrese cuantos pasajeros se bajaron");
                pasajerosv = entra2.nextInt();
                bus1.bajarPasajeros(pasajerosv);
                break;
                
            case 3:
              bus1.dineroAcomulado();
              break;
              
            case 4:
                System.out.println("placa " + bus1.getPlaca());
                break;
                
            case 5:
                System.out.println("capacidadPasajeros " + bus1.getCapacidadPasajeros());
                break;
                
            case 6:
                System.out.println("precioPasaje " + bus1.getPrecioPasaje());
                break;
                
            case 7:
                System.out.println("pasajerosActuales " + bus1.getPasajerosActuales());
                break;
                
            case 8:
                System.out.println("totalPasajeros " + bus1.getTotalPasajeros());
                break;
                
                
                
                
                
                
                 
                    
        }
        }
            
        
        
    }
    
        
                
                
}

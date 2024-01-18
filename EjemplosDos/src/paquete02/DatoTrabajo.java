/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    // método que permita preguntar al usuario el nombre de la empresa
    public static String recopiladorDatosTrabajo(){
        Scanner entrada = new Scanner(System.in);
        String nombreEmpresa;
        
        System.out.println("Ingrese el nombre de la empresa");
        nombreEmpresa = entrada.nextLine();
        
        return nombreEmpresa;
    }
    
    // método que permita preguntar al usuario la dirección de la empresa
    public static String recopiladorDireccion(String empresa){
        Scanner entrada = new Scanner(System.in);
        String direccion;
        
        System.out.printf("Ingrese la dirección de la empresa llamada %s\n"
                , empresa);
        direccion = entrada.nextLine();
        
        return direccion;
    }
    
}

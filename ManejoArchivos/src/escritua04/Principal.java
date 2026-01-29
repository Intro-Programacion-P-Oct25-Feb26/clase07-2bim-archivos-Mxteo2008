/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritua04;

import escritura01.CrearArchivoTexto;
import java.util.Scanner;

/**
 *
 * @author msjim
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        String cedula = "";
        boolean bandera = true;

        while (bandera) {

            

                System.out.println("Ingrese su cedula");
                cedula = entrada.nextLine();
                System.out.println("Ingrese su nombre");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese su correo");
                String correo = entrada.nextLine();

                cadenaFinal = String.format("%s%s %s %s\n", cadenaFinal,
                        cedula,
                        nombre, correo);
                CrearArchivo.creacion(cadenaFinal, cedula);
                cadenaFinal = "";
                String opcion;
                System.out.println("Desea continuar? si/no");
                opcion = entrada.nextLine();
                if(opcion.equals("no")){
                    bandera = false;
                    
                }
            
        }

    }

}

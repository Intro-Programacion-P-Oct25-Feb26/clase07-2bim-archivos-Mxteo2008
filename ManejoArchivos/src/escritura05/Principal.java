/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritura05;

import escritua04.CrearArchivo;
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

        boolean bandera = true;
        String placa = "";

        while (bandera) {

            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su marca de vehículo");
            String marca = entrada.nextLine();
            System.out.println("Ingrese su placa");
            placa = entrada.nextLine();
            String asignar1 = placa.toUpperCase();

            cadenaFinal = String.format("%s%s %s %s %s\n", cadenaFinal,
                    nombre,
                    cedula, marca, asignar1);

            String asignar2 = asignar1.substring(0, 1);
            if (asignar2.equals("L")) {
                Placas.loja(cadenaFinal);

            } else {
                if (asignar2.equals("P")) {
                    Placas.pichincha(cadenaFinal);

                } else {
                    if (asignar2.equals("G")) {
                        Placas.guayas(cadenaFinal);

                    } else {
                        Placas.varios(cadenaFinal);

                    }
                }

            }
            
            cadenaFinal = "";
            String opcion;
            System.out.println("Desea continuar? si/no");
            opcion = entrada.nextLine();
            if (opcion.equals("no")) {
                bandera = false;

            }

        }

    }
}

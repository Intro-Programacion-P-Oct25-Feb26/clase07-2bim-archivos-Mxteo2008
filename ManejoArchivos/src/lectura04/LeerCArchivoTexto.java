/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author msjim
 */
public class LeerCArchivoTexto {

    public static void leerArchivo() {
        double suma = 0;
        double prom = 0;
        double contador = 0;

        try (Scanner entrada = new Scanner(new File("data/datosDos.txt"))) {

            while (entrada.hasNext()) {
                String leer = entrada.nextLine();
                List<String> hola = Arrays.asList(leer.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(hola);
                System.out.println(linea_partes.get(3));
                String linea = linea_partes.get(3);
                
                double valor = Double.parseDouble(linea);
                suma = suma + valor;
                contador = contador + 1;
            }
            prom = suma / contador;
            
            
            
            entrada.close();

        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        System.out.printf("Promedio: %.2f\n", prom);

    }

}

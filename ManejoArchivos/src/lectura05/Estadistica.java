/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

/**
 *
 * @author msjim
 */
public class Estadistica {

    public static double promedio() {
        double suma = 0;
        double prom = 0;
        int contador = 0;
        try (Scanner entrada = new Scanner(new File("data/sucursales.txt"))) {
            while (entrada.hasNext()) {
                String leer = entrada.nextLine();
                try {
                    List<String> hola = Arrays.asList(leer.split("\\|"));
                    ArrayList<String> linea_partes = new ArrayList<>(hola);

                    
                    if (linea_partes.size() <= 4) {
                        throw new Exception("Línea incompleta o formato incorrecto: " + leer);
                    }

                    String datoEmpleados = linea_partes.get(2);

                   
                    double valor = Double.parseDouble(datoEmpleados);

                    suma = suma + valor;
                    contador = contador + 1;

                } catch (Exception e) {
                   
                    System.err.println("Error ignorado en un registro: " + e.getMessage());
                    
                }
            }

        } catch (Exception e) {

        }
        prom = suma / contador;
       
            return prom;
      
        
    }

}

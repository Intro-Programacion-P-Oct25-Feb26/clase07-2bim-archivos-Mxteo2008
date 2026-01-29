/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritua04;

import java.util.Formatter;

/**
 *
 * @author msjim
 */
public class CrearArchivo {

    public static void creacion(String mensaje, String cedula) {
        String ruta = String.format("data/%s.txt", cedula);

        try (Formatter salida = new Formatter(ruta)) {
            salida.format("%s", mensaje);
        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import Utilidades.PedirDatos;
import excepcion.foraDeRangoExcepcion;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author ecollazodominguez
 */
public class Cinema {

    public static int Ncola = 1;

    public void generarCola(Queue<Persoas> Cola) throws foraDeRangoExcepcion {
        int tamañoCola = PedirDatos.enteiro("Tamaño da cola");
        if (tamañoCola < 0 || tamañoCola > 50) {
            throw new foraDeRangoExcepcion("Fora de rango, elixa entre 0 e 50");
        } else {
            for (int i = 0; i < tamañoCola; i++) {
                Cola.add(new Persoas());
            }
        }
    }

    public float recaudacion(Queue<Persoas> Cola) {
        int edad;
        float sump = 0;
        float sumj = 0;
        float suma = 0;
            Persoas p = Cola.poll();
            while (p != null) {
                edad = p.getEdade();
                if (edad >= 5 && edad <= 10) {
                    sump = sump + 1;
                } else if (edad > 10 && edad <= 17) {
                    sumj = sumj + 2.50f;
                } else {
                    suma = suma + 3.50f;
                }
                p = Cola.poll();
            }

        return sump + sumj + suma;
    }
}

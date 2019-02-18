/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23_1;

import Utilidades.PedirDatos;
import cine.Cinema;
import cine.Persoas;
import excepcion.*;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.swing.JOptionPane;


/**
 *
 * @author ecollazodominguez
 */
public class Boletin23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws foraDeRangoExcepcion {
       Queue<Persoas> Cola = new ArrayDeque<>();
       Cinema cine = new Cinema();
       try{
       cine.generarCola(Cola);
       }catch (foraDeRangoExcepcion ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }finally{
           cine.generarCola(Cola);
       }
       System.out.println(Cola);
       System.out.println("\nRecaudado:" + cine.recaudacion(Cola) +"€");
        System.out.println(Cola);
    }
    
}

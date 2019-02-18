/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Random;

/**
 *
 * @author ecollazodominguez
 */
public class Persoas {
    private int edade;
    private int cola;


    public Persoas() {
        Random rand = new Random();
        this.edade = 5+rand.nextInt(56);
        this.cola = Cinema.Ncola;
        Cinema.Ncola++;
    }


    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "\nEdade: " + edade + " Cola: " + cola;
    }
    
    
}

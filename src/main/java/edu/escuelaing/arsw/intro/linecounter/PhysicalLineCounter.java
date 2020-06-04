/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.intro.linecounter;

/**
 * Clase encargada de leer todas las líneas de un archivo.
 * @author Eduard Jimenez.
 */
public class PhysicalLineCounter implements LineCounter{
    
    private int contador=0;
    
    @Override
    public void count(String linea){
        contador++;
    }
    
    @Override
    public int getCount(){
        return contador;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.intro.linecounter;

/**
 * Interface que maneja el conteo de líneas de codigo.
 * @author Eduard Jimenez.
 */
public interface LineCounter {
    
    public void count(String linea);
    
    public int getCount();
        
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.intro.linecounter;

/**
 * Clase que lee únicamente líneas de código de un archivo excluyendo comentarios y lineas en blanco.
 * @author Eduard Jimenez
 */
public class LOCLineCounter implements LineCounter {

    private int contador = 0;

    public LOCLineCounter() {
    }

    @Override
    public void count(String linea) {
        linea = linea.trim();
        if (linea.length() > 0) {
            if (!isAComment(linea)) {
                increment();
            }
        }

    }

    
    private boolean isAComment(String linea) {
        boolean band = false;
        if (linea.length() > 1) {
            if (linea.substring(0, 2).equals("/*")) {
                band = true;
            }
            else if(linea.substring(0,2).equals("//")){
                band = true;
            }
        
        } else {
            if (linea.charAt(0) != '*') {
                band = true;
            }
        }
        return band;
    }

    private void increment() {
        contador++;
    }

    @Override
    public int getCount() {
        return contador;
    }

}

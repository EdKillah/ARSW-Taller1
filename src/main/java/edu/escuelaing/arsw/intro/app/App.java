package edu.escuelaing.arsw.intro.app;

import edu.escuelaing.arsw.intro.linecounter.LOCLineCounter;
import edu.escuelaing.arsw.intro.linecounter.LectorArchivo;
import edu.escuelaing.arsw.intro.linecounter.LineCounter;
import edu.escuelaing.arsw.intro.linecounter.PhysicalLineCounter;
import java.io.IOException;

/**
 * Clase principal para el arranque del programa.
 * @author Eduard Jimenez
 */
public class App {

    /**
     * Metodo main que hace el llamado correspondiente a las clases LectorArchivo y la interfaz LineCounter
     * @param args donde se recibe el tipo de lectura y el archivo que se va a leer.
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        String tipo = args[0];
        String archivo = args[1];
        LectorArchivo lector = new LectorArchivo();
        LineCounter lc = null;
        switch (tipo.toLowerCase()) {
            case "phy":
                lc = new PhysicalLineCounter();
                break;
            case "loc":
                lc = new LOCLineCounter();
                break;
            default:
                break;
        }
        
        lector.leerArchivo(archivo, lc);

    }
}

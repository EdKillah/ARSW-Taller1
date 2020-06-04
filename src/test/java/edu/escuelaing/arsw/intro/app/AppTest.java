package edu.escuelaing.arsw.intro.app;

import edu.escuelaing.arsw.intro.linecounter.LOCLineCounter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import edu.escuelaing.arsw.intro.linecounter.LectorArchivo;
import edu.escuelaing.arsw.intro.linecounter.LineCounter;
import edu.escuelaing.arsw.intro.linecounter.PhysicalLineCounter;
import java.io.IOException;

public class AppTest {

    @Test
    public void deberiaCargarArchivo() {

        try {
            String[] args = {"phy", "Voto.java"};
            App.main(args);
            assertTrue(true);
        } catch (IOException e) {
            assertTrue(false);
        }

    }

    @Test
    public void noDeberiaCargarArchivo() {
        try {
            String[] args = {"phy", "src/main/java/edu/escuelaing/arsw/intro/app/Apps.java"};
            App.main(args);
            assertTrue(false);
        } catch (IOException e) {
            assertTrue(true);
        }
    }

    @Test
    public void deberiaContarPHY() {

        LectorArchivo lector = new LectorArchivo();
        LineCounter lc = new PhysicalLineCounter();
        try {
            lector.leerArchivo("Voto.java", lc);
            assertEquals(46, lc.getCount());

        } catch (IOException ex) {
            fail();
        }
    }

    @Test
    public void noDeberiaContarPHY() {

        LectorArchivo lector = new LectorArchivo();
        LineCounter lc = new PhysicalLineCounter();
        try {
            lector.leerArchivo("Voto.java", lc);
            assertNotEquals(-1, lc.getCount());

        } catch (IOException ex) {
            fail();
        }
    }

    @Test
    public void deberiaContarLOC() {

        LectorArchivo lector = new LectorArchivo();
        LineCounter lc = new LOCLineCounter();
        try {
            lector.leerArchivo("Voto.java", lc);
            assertEquals(27, lc.getCount());

        } catch (IOException ex) {
            fail();
        }
    }

    @Test
    public void noDeberiaContarLOC() {

        LectorArchivo lector = new LectorArchivo();
        LineCounter lc = new LOCLineCounter();
        try {
            lector.leerArchivo("Voto.java", lc);
            if (lc.getCount() != 27) {
                assertTrue(false);
            } else {
                assertTrue(true);
            }

        } catch (IOException ex) {
            fail();
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvaro Duran <adurama436@g.educaand.es>
 */
public class CribaEratostenesTest {
    
    public CribaEratostenesTest() {
    }

    /**
     * Test del método generarPrimos, de la clase CribaEratostenes.
     * Método de prueba para posteriores ramas del método generarPrimos().
     */
    @Test
    public void testGenerarPrimos() {
        System.out.println("generarPrimos");
        int valorMax = 3;
        int[] expResult = {2,3};
        int[] result = CribaEratostenes.generarPrimos(valorMax);
        assertArrayEquals(expResult, result);
    }
    
}

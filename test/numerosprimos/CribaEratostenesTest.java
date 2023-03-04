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
     * Test of generarPrimos method, of class CribaEratostenes.
     */
    @Test
    public void testGenerarPrimos() {
        System.out.println("generarPrimos");
        int max = 0;
        int[] expResult = new int[0];
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
    }
    
}

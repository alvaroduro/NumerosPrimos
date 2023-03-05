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
     */
    @Test
    public void testGenerarPrimos() {
        System.out.println("generarPrimos");
        int max = 3;
        
        //Resultado esperado(array con los número 2 y 3
        int[] expResult = {2,3};
        
        //Introducimos el parámetros
        int[] result = CribaEratostenes.generarPrimos(max);
        
        //Compara el resultado esperado con el resultado
        assertArrayEquals(expResult, result);
    }
    
}

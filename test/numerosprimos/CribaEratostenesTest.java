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
     * Test del método generarPrimos , de la clase CribaEratostenes.
     */
    @Test
    public void testGenerarPrimos() {
        System.out.println("generarPrimos");
        int valorMax = 100;
        
        //Resultado esperado (array con los primos del número 100)
        int[] expResult = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,
            47,53,59,61,67,71,73,79,83,89,97};
        
        //Introducimos el parámetro
        int[] result = CribaEratostenes.generarPrimos(valorMax);
        
        //Comprara el resultado esperado con el resultado
        assertArrayEquals(expResult, result);
    }
    
}

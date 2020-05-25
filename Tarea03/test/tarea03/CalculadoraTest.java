/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class CalculadoraModificada.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = null;
        instance = new Calculadora(5,8);
        int expResult = 13;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class CalculadoraModificada.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = null;
        instance = new Calculadora(5,8);
        int expResult = 3;
        int result = instance.resta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta2 method, of class CalculadoraModificada.
     */
    @Test
    public void testResta2() {
        System.out.println("resta2");
        Calculadora instance = null;
        instance = new Calculadora(8,5);
        boolean expResult = false;
        boolean result = instance.resta2();
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide2 method, of class CalculadoraModificada.
     */
    @Test
    public void testDivide2() {
        System.out.println("divide2");
        Calculadora instance = null;
        instance = new Calculadora(40,8);
        Integer expResult = 5;
        Integer result = instance.divide2();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class CalculadoraModificada.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = null;
        instance = new Calculadora(5,8);
        int expResult = 40;
        int result = instance.multiplica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class CalculadoraModificada.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = null;
        instance = new Calculadora(40,8);
        int expResult = 5;
        int result = instance.divide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

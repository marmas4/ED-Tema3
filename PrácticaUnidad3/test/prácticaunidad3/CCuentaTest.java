/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

import junit.framework.Assert;
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
public class CCuentaTest {
    
    public CCuentaTest() {
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
     * Test of ingresar method, of class CCuenta.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("*** Test Ingresar ***");
        double cantidad = 2000;
        CCuenta instance = new CCuenta("Prueba Ingresar","",1000,0);
        instance.ingresar(cantidad);
        double expResult = 3000;
        assertEquals(expResult, instance.estado(),0);
        //assertTrue(instance.estado() == expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of retirar method, of class CCuenta.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("*** Test Retirar ***");
        double cantidad = 900;
        CCuenta instance = new CCuenta("Prueba Retirar","",1000,0);
        instance.retirar(cantidad);
        double expResult = 100;
        assertEquals(expResult, instance.estado(),0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ingresar and retirar method, of class CCuenta.
     */
    @Test
    public void testIngresarRetirar() throws Exception {
        System.out.println("*** Test Ingresar y retirar ***");
        CCuenta instance = new CCuenta();
        double cantidad = 2000;
        instance.ingresar(cantidad);
        cantidad = 1800;
        instance.retirar(cantidad);
        double expResult = 200;
        assertTrue(instance.estado() == expResult);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

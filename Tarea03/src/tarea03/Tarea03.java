/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author inesm
 */
public class Tarea03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraOriginal cal = new CalculadoraOriginal(30,20);
        int resultado = cal.suma();
        System.out.println(" El resultado de la suma es:" + resultado);
        resultado = cal.multiplica();
        System.out.println("El resultado de la multiplicación es: " + resultado);
        resultado = cal.resta();
        System.out.println("El resultado de la resta es: " + resultado);
        resultado = cal.divide();
        System.out.println("El resultado de la división es: " + resultado);
    }
    
}

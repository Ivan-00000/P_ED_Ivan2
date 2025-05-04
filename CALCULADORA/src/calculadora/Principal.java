/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Alumno Tarde
 */
public class Principal {

    public static void main(String[] args) {
        CALCULADORA calc = new CALCULADORA();
        
        int resultado = calc.sumar(5, 3);
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
}

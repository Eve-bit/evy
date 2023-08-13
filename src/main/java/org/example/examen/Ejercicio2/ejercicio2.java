//Ejercicio 2
package org.example.examen.Ejercicio2;

import org.example.examen.Ejercicio1.Calculadora;

import java.util.Scanner;

public class ejercicio2{
    public static void main(String[] args){

        int result= 0;
        boolean valid_oper= true;

        org.example.examen.Ejercicio1.Calculadora calc = new Calculadora();
        Scanner sc = new Scanner (System.in);
        Scanner scanner = new Scanner (System.in);

        while (valid_oper) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Introduzca el primer valor");
            int numero1 = sc.nextInt(); //Invocamos un método sobre un objeto Scanner

            System.out.println("Ahora el segundo valor :");
            int numero2 = sc.nextInt();

            System.out.println("Ingrese la operación :");
            //String operacion = st.nextLine();
            char operacion = scanner.next().charAt(0);

            switch (operacion) {
                case '+':
                    result = calc.suma(numero1, numero2);
                    if (result < 0) {
                        System.out.println(" El resultado es negativo, tene cuidado! - Resultado: " + result);
                    } else if (result > 1000) {
                        System.out.println("El resultado es un número grande --> Resultado:" + result);
                    } else {
                        System.out.println("El resultado es:  " + result);
                    }
                    break;

                case '-':
                    result = calc.resta(numero1, numero2);
                    if (result < 0) {
                        System.out.println(" El resultado es negativo, tene cuidado! - Resultado: " + result);
                    } else if (result > 1000) {
                        System.out.println("El resultado es un número grande --> Resultado:" + result);
                    } else {
                        System.out.println("El resultado es:  " + result);
                    }
                    break;

                case '*':
                    result = calc.multiplicacion(numero1, numero2);
                    if (result < 0) {
                        System.out.println(" El resultado es negativo, tene cuidado! - Resultado: " + result);
                    } else if (result > 1000) {
                        System.out.println("El resultado es un número grande - Resultado:" + result);
                    } else {
                        System.out.println("El resultado es:  " + result);
                    }
                    break;

                case '/':
                    result = calc.division(numero1, numero2);
                    if (result < 0) {
                        System.out.println(" El resultado es negativo, tene cuidado! - Resultado: " + result);
                    } else if (result > 1000) {
                        System.out.println("El resultado es un número grande - Resultado:" + result);
                    } else {
                        System.out.println("El resultado es:  " + result);
                    }
                    break;

                default:
                    System.out.println(operacion + " No es una operación valida");
                    valid_oper=false;
                    break;

            }


        }


    }
}

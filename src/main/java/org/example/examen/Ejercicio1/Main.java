//Ejercicio 1
package org.example.examen.Ejercicio1;
import org.example.examen.Ejercicio1.Calculadora;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int result= 0;

        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner (System.in);
        Scanner scanner = new Scanner (System.in);

        for (int i=0; i<5; i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Introduzca el primer valor:");
            int numero1 = sc.nextInt(); //Invocamos un método sobre un objeto Scanner

            System.out.println("Ahora el segundo valor:");
            int numero2 = sc.nextInt();

            System.out.println("Ingrese la operación:");
            //String operacion = st.nextLine();
            char operacion = scanner.next().charAt(0);

            switch (operacion) {
                case '+':
                    result = calc.suma(numero1, numero2);
                    if (result < 0) {
                        System.out.println(" El resultado es negativo, tene cuidado! -> Resultado: " + result);
                    } else if (result > 1000) {
                        System.out.println("El resultado es un número grande -> Resultado:" + result);
                    } else {
                        System.out.println("El resultado es:  " + result);
                    }
                    break;
                case '-':
                    result = calc.resta(numero1, numero2);
                    if (result < 0) {
                        System.out.println(" El resultado es negativo, tene cuidado! -> Resultado: " + result);
                    } else if (result > 1000) {
                        System.out.println("El resultado es un número grande -> Resultado:" + result);
                    } else {
                        System.out.println("El resultado es:  " + result);
                    }
                    break;
                case '*':
                    result = calc.multiplicacion(numero1, numero2);
                    if (result < 0) {
                        System.out.println(" El resultado es negativo, tene cuidado! -> Resultado: " + result);
                    } else if (result > 1000) {
                        System.out.println("El resultado es un número grande -> Resultado:" + result);
                    } else {
                        System.out.println("El resultado es:  " + result);
                    }
                    break;
                case '/':
                    result = calc.division(numero1, numero2);
                    if (result < 0) {
                        System.out.println(" El resultado es negativo, tene cuidado! -> Resultado: " + result);
                    } else if (result > 1000) {
                        System.out.println("El resultado es un número grande -> Resultado:" + result);
                    } else {
                        System.out.println("El resultado es:  " + result);
                    }
                    break;
                default:
                    System.out.println(operacion + " No es una operación valida");
                    break;
            }

        }

    }
}
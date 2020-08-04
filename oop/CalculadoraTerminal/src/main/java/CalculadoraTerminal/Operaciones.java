/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraTerminal;

/**
 *
 * @author fnico
 */

import java.io.IOException;

public class Operaciones {

    static double suma(double num1, double num2) throws IOException {
        return num1 + num2;
    }

    static double resta(double num1, double num2) throws IOException {
        return num1 + (-num2);
    }

    static double multiplicacion(double num1, double num2) throws IOException {
        double j = 0;
        for (int i = 1; (double)i <= num1; i++) {
            j += num2;
        }
        return j;
    }

    static double division(double num1, double num2) throws IOException {
        double m;
        for (m = 0; num1 >= num2; m++) {
            num1 += (-num2);
        }
        return m;
    }

    static double potencia(double num1, double num2) throws IOException {
        double b = 0;
        double c = 1;
        for (double i = num2; i > 0; i--) {
            b = 0;
            for (double x = 0; x < num1; x++) {
                b += c;
            }
            c = b;
        }
        return b;
    }

    static double raiz(double n) {
        return Math.sqrt(n);
    }

    static double factorial(double num1, double num2) {
        double b = 0;
        double c = 1;
        for (double i = num1; i > 0; i--) {
            b = 0;
            for (double x = 0; x < num1; x++) {
                b += c;
            }
            c = b;
            num1--;
        }
        return b;
    }
}

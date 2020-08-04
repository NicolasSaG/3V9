package CalculadoraTerminal;

/**
 *
 * @author fnico
 */
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    Scanner sc;
    public Principal() {
         sc = new Scanner(System.in);
    }

    void menuPrincipal() throws IOException {
        int opcion = 0;
        do {
            System.out.println("---Menu de la Calculadora 1.1---");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            System.out.println("5) Potencia");
            System.out.println("6) Raiz");
            System.out.println("7) Factorial");
            System.out.println("8) Salir de la Calculadora :(");
            System.out.println("Ingresa el numero de tu opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Escogiste la Suma:");
                    System.out.println("Ingresa un numero:");
                    double x = sc.nextDouble();
                    System.out.println("Ingresa otro numero:");
                    double y = sc.nextDouble();
                    double resultadodsuma = Operaciones.suma(x, y);
                    System.out.println("Resultado: " + resultadodsuma);
                }

                case 2 -> {
                    System.out.println("Escogiste la Resta:");
                    System.out.println("Ingresa un numero:");
                    double resta1 = sc.nextDouble();
                    System.out.println("Ingresa otro numero:");
                    double resta2 = sc.nextDouble();
                    double resultadodresta = Operaciones.resta(resta1, resta2);
                    System.out.println("Resultado: " + resultadodresta);
                }

                case 3 -> {
                    System.out.println("Escogiste la Multiplicacion:");
                    System.out.println("Ingresa un numero:");
                    double multi1 = sc.nextDouble();
                    System.out.println("Ingresa otro numero:");
                    double multi2 = sc.nextDouble();
                    double resultadomulti = Operaciones.multiplicacion(multi1, multi2);
                    System.out.println("Resultado: " + resultadomulti);
                }

                case 4 -> {
                    System.out.println("Escogiste la Division:");
                    System.out.println("Introduce el primer numero:");
                    double div1 = sc.nextDouble();
                    System.out.println("Introduce el numero con el que vas a dividir al primero:");
                    double div2 = sc.nextDouble();
                    double resultadodiv = Operaciones.division(div1, div2);
                    System.out.println("Resultado: " + resultadodiv);
                }

                case 5 -> {                    
                    System.out.println("Escogiste la Potencia:");
                    System.out.println("Introduce el primer numero:");
                    double pot1 = sc.nextDouble();
                    System.out.println("Introduce la potencia:");
                    double pot2 = sc.nextDouble();
                    double resultadopot = Operaciones.potencia(pot1, pot2);
                    System.out.println("Resultado: " + resultadopot);
                }

                case 6 -> {
                    System.out.println("Escogiste la Raiz:");
                    System.out.println("Introduce el numero:");
                    double ra = sc.nextDouble();
                    double resultadora = Operaciones.raiz(ra);
                    System.out.println("Resultado: " + resultadora);
                }
                
                case 7 -> {
                    System.out.println("Escogiste Factorial:");
                    System.out.println("Introduce el numero:");
                    double fact1 = sc.nextDouble();
                    double resultadofact = Operaciones.factorial(fact1, 1);
                    System.out.println("Resultado: " + resultadofact);
                }

                case 8 -> System.out.println("Adioooos :'(");

                default -> System.out.println("Errooooor :v Intentalo otra vez XD");
            }
        } while (opcion != 8);
    }
}

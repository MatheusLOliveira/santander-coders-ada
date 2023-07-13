/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).*/

import java.util.Scanner;

public class Main {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return 5 * ((fahrenheit - 32) / 9);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");

        double fahrenheit = sc.nextDouble();

        double celsius = fahrenheitToCelsius(fahrenheit);

        System.out.printf("A temperatura em graus Celsius é de: %.2f ºC", celsius);

        sc.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author diogog
 */
public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Enter the rectangle width and height: ");

        calc.width = sc.nextDouble();
        calc.height = sc.nextDouble();

        double a = calc.area();
        double p = calc.perimeter();
        double d = calc.diagonal();

        System.out.printf("AREA = %.4f%n", a);
        System.out.printf("PERIMETER: %.4f%n", p);
        System.out.printf("DIAGONAL: %.4f%n", d);

        sc.close();
    }
}

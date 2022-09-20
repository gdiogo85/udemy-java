/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import Util.CurrencyConverter;

/**
 *
 * @author Diogo
 */
public class ProgramAula73 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.printf("How many dollars will be bought? ");
        double dollarQuantity = sc.nextDouble();

        double a = CurrencyConverter.totalTransaction(dollarPrice,dollarQuantity);
        
        System.out.printf("Amount to be paid in Reais: %.4f%n", a);

        sc.close();
    }
}

package com.senai.java.exercicios.aula;
import java.util.Scanner;


//- Faça um algoritmo que receba 2 números e mostre a soma, subtração, multiplicação e a divisão dos números lidos.


public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º número:");
        double num01 = scanner.nextDouble();
        System.out.println("Digite o 2º número:");
        double num02 = scanner.nextDouble();

        double soma = num01 + num02;
        double sub = num01 - num02;
        double mult = num01 * num02;
        double div = num01 / num02;

        System.out.println(num01 + " + " + num02 + " = " + soma);
        System.out.println(num01 + " - " + num02 + " = " + sub);
        System.out.println(num01 + " x " + num02 + " = " + mult);
        System.out.println(num01 + " / " + num02 + " = " + div);
    }
}

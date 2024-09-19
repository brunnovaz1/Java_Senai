package com.senai.java.exercicios.aula;

import java.util.Scanner;

// Faça um algoritmo que receba dois números e exiba o resultado da sua soma.

public class Ex01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
        double num01 = scanner.nextDouble();
        System.out.println("Digite o 2º número:");
        double num02 = scanner.nextDouble();

        double soma = num01 + num02;

        System.out.println(num01 + " + " + num02 + " = " + soma);
    }
}

package com.senai.java.formulasmatematicas;
import java.util.Scanner;
/*
    Escreva um programa que calcule e exiba a média aritmética de dois números informados pelo usuário
*/
public class _2_MediaAritmetica {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
            double num1 = scanner.nextDouble();

        System.out.println("Digite o 2º numero:");
            double num2 = scanner.nextDouble();

        double media = (num1+num2)/2;

        System.out.println("Média: "+ media);

        scanner.close();
    }
}

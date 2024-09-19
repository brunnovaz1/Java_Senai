package com.senai.java.formulasmatematicas;

import java.util.Scanner;

/*
    Crie um programa que calcule e exiba a média aritmética de três notas informadas pelo usuário
*/
public class _3_MediaAritmeticaNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Nota 01:");
        double nota01 = scanner.nextDouble();
        System.out.println("Digite a Nota 02:");
        double nota02 = scanner.nextDouble();
        System.out.println("Digite a Nota 03:");
        double nota03 = scanner.nextDouble();

        double media = (nota01 + nota02 + nota03)/3;

        System.out.println("Sua média é: "+ media);
    }

}

package com.senai.java.formulasmatematicas;

import java.util.Scanner;

/*
    Escreva um programa que calcule e exiba a média geométrica de três números informados pelo usuário
*/
public class _4_MediaGeometrica {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite o 1º número:");
     double num01 = scanner.nextDouble();
     System.out.println("Digite o 2º número:");
     double num02 = scanner.nextDouble();
     System.out.println("Digite o 3º número");
     double num03 = scanner.nextDouble();

     double a = (num01 * num02 * num03);
        System.out.println(Math.cbrt(a));


    }
}


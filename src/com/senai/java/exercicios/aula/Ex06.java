package com.senai.java.exercicios.aula;

//Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores.


import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();

        double x = a;
        a = b;
        b = x;

        System.out.println("A:" + a + " B:" + b);
    }
}

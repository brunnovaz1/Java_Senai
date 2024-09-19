package com.senai.java.exercicios.aula;

//Algoritmo que converta em real (R$) um valor em dólar (US$).
//Ler cotação Dolar.


import java.util.Scanner;

public class Ex08 {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cotação Dolar US$ -> R$");
    double cotacao = scanner.nextDouble();
    System.out.println("Valor em Dólar US$:");
    double dolar = scanner.nextDouble();

    double real;

    real = cotacao * dolar;

    System.out.println("Valor convertido: R$" + real);
    }
}

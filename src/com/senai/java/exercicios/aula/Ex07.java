package com.senai.java.exercicios.aula;

//Ler uma temperatura em Celsius e converter em Fahrenheit. F=(9*C+160) / 5

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Temperatura ºC:");
    double celsius = scanner.nextDouble();
    double f;

    f=(9*celsius + 160)/5;

    System.out.println("Temperatura: " + f + "ºF");

    }
}

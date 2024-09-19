package com.senai.java.exercicios.aula;

//Algoritmo recebe o preço de custo e mostra o valor de venda. O custo receberá um acréscimo informado pelo usuário(%).

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preço de Custo:");
        double custo = scanner.nextDouble();
        System.out.println("Lucro (%):");
        double lucro = scanner.nextDouble();

        lucro = (lucro/100) + 1;

        double valorFinal = custo * lucro;

        System.out.println("O valor final é: R$" + valorFinal);
    }
}

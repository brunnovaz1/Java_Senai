package com.senai.java.exercicios.aula;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a distancia percorrida(Km):");
        double distancia = scanner.nextDouble();
        System.out.println("Informe o consumo (L):");
        double consumo = scanner.nextDouble();

        double media = distancia/consumo;

        System.out.println("O consumo médio do veículo é: " + media + "Km/l");
    }
}

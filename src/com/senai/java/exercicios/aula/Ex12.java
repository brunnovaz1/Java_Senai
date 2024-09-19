package com.senai.java.exercicios.aula;

//solicite um número positivo. Caso o usuário insira um número negativo, o programa deve continuar solicitando


import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        do {
            System.out.println("Digite um numero positivo:");
            num = scanner.nextDouble();

        }while(num <= 0);


    }
}


//Do...While (Repita enquanto...)
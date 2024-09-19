package com.senai.java.exercicios.aula;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números quer comparar?");
        int N = scanner.nextInt();


        int somaIguais = 0;
        int somaDiferentes = 0;
        boolean iguais = true;


        System.out.println("Digite o 1ª numero:");
        int num01 = scanner.nextInt();
        int maior = num01;
        somaIguais = num01;    //ganha valor enquanto somaDiferente permanece zerado


        for(int i = 2; i <= N; i++) {
            System.out.println("Digite o " + i + "º número");
            int num = scanner.nextInt();

            if(num != num01) {
                iguais = false;
                somaDiferentes = somaDiferentes + num;
            }else {
                somaIguais = somaIguais + num;
            }

            if(num > maior ){
                maior = num;
            }


        }


        System.out.println("- - - - - - - - - - - -  - - - - - - - -");


        if(iguais) {
            System.out.println("Todos numeros são iguais, quantidade: " + N);
            System.out.println("Soma dos iguais: " + somaIguais);
        }else {
            System.out.println("Numeros diferentes!");
            System.out.println("Numero maior: " + maior);
            System.out.println("Soma diferentes: " + (somaDiferentes+num01));
        }
    }
}

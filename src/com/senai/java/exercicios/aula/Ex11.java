package com.senai.java.exercicios.aula;
//programa que some os primeiros N números inteiros e exiba o resultado.


import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Até que número deseja somar?");
        int N = scanner.nextInt();
        int soma = 0;

        for (int i=0; i<=N; i++){
            soma =  soma + i;
        }
        System.out.println("- - - -");
        System.out.println(soma);
    }
}

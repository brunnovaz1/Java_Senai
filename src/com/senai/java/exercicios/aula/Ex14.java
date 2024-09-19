package com.senai.java.exercicios.aula;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.println("Escolha um número de 1 a 10:");
            num = scanner.nextInt();
        }while(num < 1 || num > 10);
        System.out.println("- - - - - - - - - - - - -");
        if(num == 1){
            System.out.println("Numero Digitado: Um");
        }else if(num == 2){
            System.out.println("Numero Digitado: Dois");
        }else if(num == 3){
            System.out.println("Numero Digitado: Três");
        }else if(num == 4){
            System.out.println("Numero Digitado: Quatro");
        }else if(num == 5){
            System.out.println("Numero Digitado: Cinco");
        }else if(num == 6){
            System.out.println("Numero Digitado: Seis");
        }else if(num == 7){
            System.out.println("Numero Digitado: Sete");
        }else if(num == 8){
            System.out.println("Numero Digitado: Oito");
        }else if(num == 9){
            System.out.println("Numero Digitado: Nove");
        }else{
            System.out.println("Numero Digitado: Dez");
        }
    }
}

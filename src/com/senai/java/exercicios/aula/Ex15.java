package com.senai.java.exercicios.aula;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do mês:");
        int num = scanner.nextInt();
        String resultado = "mes";
        int sair = 0;

    do {
        switch (num) {
            case 1:
                resultado = "Janeiro";
                break;
            case 2:
                resultado = "Fevereiro";
                break;
            case 3:
                resultado = "Março";
                break;
            case 4:
                resultado = "Abril";
                break;
            case 5:
                resultado = "Maio";
                break;
            case 6:
                resultado = "Junho";
                break;
            case 7:
                resultado = "Julho";
                break;
            case 8:
                resultado = "Agosto";
                break;
            case 9:
                resultado = "Setembto";
                break;
            case 10:
                resultado = "Outubro";
                break;
            case 11:
                resultado = "Novembro";
                break;
            case 12:
                resultado = "Dezembro";
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        System.out.println("Mês escolhido: " + resultado);
        System.out.println(" - - - - - - - - - - - -");

        System.out.println(("Escolha outro mes ou '0' para sair."));
        sair = scanner.nextInt();
        if(sair !=0){
            num = sair;
        }
    }while(sair != 0);
    scanner.close();
    }

}

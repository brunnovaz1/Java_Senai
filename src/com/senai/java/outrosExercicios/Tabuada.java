package com.senai.java.outrosExercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Tabuada {
    float num01, num02, resultado;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        int sair = 0;


        do {
            System.out.println(" - -  - - - - - - - - - - - - - ");
            System.out.println(" - - - - - TABUADA - - - - - - - ");
            System.out.println(" - -  - - - - - - - - - - - - - ");
            System.out.println(
                    """
                            1 - Adição
                            2 - Subtração
                            3 - Divisão
                            4 - Multiplicação
                             - - - - - - - - - - - - - - -
                            """);
            System.out.println("Escolha uma opção:");
            operacao = scanner.nextInt();
            if (operacao == 1) {
                System.out.println("+ + + ADIÇÃO + + +");
            } else if (operacao == 2) {
                System.out.println(" - - SUBTRAÇÃO - - ");
            } else if (operacao == 3) {
                System.out.println("/ / / DIVISÃO / / / ");
            } else {
                System.out.println(" x x MULTIPLICAÇÃO  x x");
            }


            Tabuada tabuada = new Tabuada();

            switch (operacao) {
                case 1:
                    tabuada.somar();
                    break;
                case 2:
                    tabuada.subtrair();
                    break;
                case 3:
                    tabuada.dividir();
                    break;
                case 4:
                    tabuada.multiplicar();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println(" - - - -  - - -  - -");
            System.out.println("(1)continuar (0)sair");
            sair = scanner.nextInt();
            if(sair != 0) {
            operacao = sair;
            }
        }while(sair != 0);
}

    public Tabuada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1º numero:");
        this.num01 = scanner.nextInt();
        System.out.println("Digite o 2º número:");
        this.num02 = scanner.nextInt();
        System.out.println(" - - - -  - - -  - -");

    }


    public void somar(){
        this.resultado = num01 + num02;
        System.out.println(num01 + " + " + num02 + " = " + resultado);
    }

    public void subtrair(){
        this.resultado = num01 - num02;
        System.out.println(num01 + " - " + num02 + " = " + resultado);
    }

    public void dividir(){
        this.resultado = num01 / num02;
        System.out.println(num01 + " / " + num02 + " = " + resultado);
    }

    public void multiplicar(){
        this.resultado = num01 * num02;
        System.out.println(num01 + " x " + num02 + " = " + resultado);
    }
}



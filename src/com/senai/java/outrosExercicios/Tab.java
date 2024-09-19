package com.senai.java.outrosExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tab {

    public static void main(String[] args) {
        int operacao;
        int sair;
        float result = 0;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        do {
            System.out.println(
                    """
                                1 - Soma
                                2 - Subtracao
                                3 - Multiplicação
                                4 - Divisão
                            """);
            System.out.println("Operação desejada:");
            operacao = scanner.nextInt();
            if (operacao < 1 || operacao > 4) {
                System.out.println("Opção inválida!");
                System.out.println("Operação selecionada: SOMA");
                operacao = 1;
            }
            System.out.println(" - - - - - - - - - - - - -");


            System.out.println("Tabuada de qual número?");
            int num = scanner.nextInt();


            switch (operacao) {
                case 1:
                    for (int i = 0; i <= 10; i++) {
                        result = num + i;
                        System.out.println(num + "+" + i + " = " + result);
                    }
                    break;

                case 2:
                    for (int i = 0; i <= 10; i++) {
                        result = num - i;
                        System.out.println(num + "-" + i + " = " + result);
                    }
                    break;

                case 3:
                    for (int i = 0; i <= 10; i++) {
                        result = num * i;
                        System.out.println(num + "*" + i + " = " + result);
                    }
                    break;

                case 4:
                    for (int i = 1; i <= 10; i++) {
                        result = (float) num / i;
                        System.out.println(num + "/" + i + " = " + df.format(result));
                    }
                    break;

                default:
                    System.out.println("Operação inválida!!!");

            }
            System.out.println(" - - - - - - - - - ");
            System.out.println("(1)sair (2)continuar");
            sair = scanner.nextInt();
            if(sair !=1){
                sair = operacao;
            }
        } while (sair != 1);

    }
}

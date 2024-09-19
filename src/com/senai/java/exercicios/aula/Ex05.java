package com.senai.java.exercicios.aula;
import java.util.Scanner;

//Leia o nome de um vendedor, seu salário fixo e o total de vendas. Ele ganha uma comissão de 15%.
//Se vendas for superior a R$ 20.000,00,ele recebe  uma bonificação adicional de R$ 1.000,00.
//Deve ser informado o nome, o salário fixo, comissão, se ele recebeu ou não a bonificação e o salário final no mês.



public class Ex05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scanner.nextLine();
        System.out.println("Salário Fixo:");
        double salario = scanner.nextDouble();
        System.out.println("Vendas (mês):");
        double vendas = scanner.nextDouble();

        double comissao = vendas * 0.15;

        System.out.println("Vendedor: "+ nome + " - Salário: " + salario + " - Comissão: " + comissao );

        if(vendas > 20000) {
            salario = salario + 1000;
            System.out.println("Receberá Bonus!");

        }else {
            System.out.println("Não receberá Bonus!");
        }

        double salarioFinal = salario + comissao;

        System.out.println(" - - - - - - - - - - - - - -  -");
        System.out.println("Salário Final: R$" + salarioFinal);

    }
}

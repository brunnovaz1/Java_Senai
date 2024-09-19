package com.senai.java.exercicios.aula;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vendedor: ");
        String nome = scanner.nextLine();
        System.out.println("Salario fixo:");
        double salario = scanner.nextDouble();
        System.out.println("Total de vendas/mês:");
        double vendas = scanner.nextDouble();

        double comissao = vendas*0.15;

        double salarioFinal = salario + comissao;

        System.out.println(nome + ", seu salario final é: R$" + salarioFinal);



    }
}

package com.senai.java.exercicios.aula;

//Leia o nome, seu salário fixo, o total de vendas e horas extras trabalhadas. Comissão:15% das vendas realizadas.
//vendas superior a R$20.000,00, bonus de R$ 1.000,00 e se forem superiores a R$ 50.000,00, bonus: R$ 2.000,00.
//adicional de R$ 50,00 por hora extra trabalhada, SE vendeu mais de R$ 10.000,00 no mês.
//Se vendas forem menor que R$5.000,00  vendedor recebe uma penalidade de 10% sobre o salário fixo.
//Nome, Salário fixo, Comissão, se recebeu ou não bonus, horas extras, Penalidade (se houver), Salário final no mês.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Salário Fixo:");
        double salario = scanner.nextDouble();
        System.out.println("Total de vendas:");
        double vendas = scanner.nextDouble();
        System.out.println("Horas Extras:");
        double extras = scanner.nextDouble();

        double comissao = 0.15*vendas;
        System.out.println("Comissao R$: " + comissao);

        double bonus = 0;
        if(vendas > 50000) {
            bonus = 2000;
            System.out.println("Recebeu Bonus: R$" + bonus);
        }else if(vendas < 50000 && vendas > 20000){
            bonus = 1000;
            System.out.println("Recebeu Bonus: R$" + bonus);
        }

        if(vendas > 10000){
            extras = extras*50;
            System.out.println("Recebeu Hora Extra: R$" + extras);
        }

        double multa = 0;
        if(vendas < 5000){
        multa = salario*0.1;
        System.out.println("Recebeu multa: R$" + multa);
        }

        double salarioFinal = salario + comissao + bonus + extras - multa;
        System.out.println(" - - - - - - - - - - - - - -");
        System.out.println("Salário Final: R$" + salarioFinal);
    }
}

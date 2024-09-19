package com.senai.java.outrosExercicios.finTech;

import com.senai.java.outrosExercicios.finTech.Acoes;
import com.senai.java.outrosExercicios.finTech.FundosImobiliarios;
import com.senai.java.outrosExercicios.finTech.Investimentos;
import com.senai.java.outrosExercicios.finTech.RendaFixa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ControleInvestimentos {
    Scanner sc = new Scanner(System.in);
    Investimentos investimentos = new Investimentos();
    RendaFixa rendaFixa = new RendaFixa();
    Acoes acoes = new Acoes();
    FundosImobiliarios imobiliarios = new FundosImobiliarios();
    ArrayList<Double> valores = new ArrayList<>();
    ArrayList<String> tipoInvestimentos = new ArrayList<>();
    //ArrayList<List>

    public void exibirMenu(){
        System.out.println("******MarVaz Investimentos******");
        var opcao = -1;
        while (opcao != 0){
            System.out.println(" ");
            var menu = """
                    Variação é a chave da riqueza. Qual será o seu investimento hoje?
                    1 - Cadastrar novo investimento
                    2 - Exibir relatório da carteira
                    0 - Sair do Programa
                    
                    """;
            System.out.println(menu);
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de investimento");
                    System.out.println("""
                            1 - Renda Fixa
                            2 - Acoes
                            3 - Fundos imboliarios
                            """);
                    var tipoInvestimento = sc.nextInt();
                    sc.nextLine();

                    switch (tipoInvestimento){
                        case 1:
                            rendaFixa();
                            break;
                        case 2:
                            investimentoAcoes();
                            break;
                        case 3:
                            fundosImobiliarios();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;
                case 2:
                    relatorio();
                    break;
                case 0:
                    System.out.println("Foi bom ter você por aqui.");
                    System.out.println("Programa finalizado");

            }

        }
    }

    private void rendaFixa() {
        tipoInvestimentos.add(rendaFixa.setNomeInvestimento("Renda Fixa"));

        System.out.println("Valor a investir: ");
        var valor = sc.nextDouble();
        rendaFixa.setValorInvestido(valor);
        valores.add(valor);

        System.out.println(" ");
        System.out.println("Retorno com  10a.a: " + (valor + rendaFixa.rendimento()));
    }

    private void investimentoAcoes() {
        tipoInvestimentos.add(acoes.setNomeInvestimento("Ações"));

        System.out.println("Valor a investir: ");
        var valor = sc.nextDouble();
        acoes.setValorInvestido(valor);
        valores.add(valor);

        System.out.println(" ");
        System.out.println("Retorno com 20a.a: " + (valor + acoes.rendimento()));
    }

    private void fundosImobiliarios() {
        tipoInvestimentos.add(imobiliarios.setNomeInvestimento("Fundos Imboliários"));

        System.out.println("Valor a investir: ");
        var valor = sc.nextDouble();
        imobiliarios.setValorInvestido(valor);
        valores.add(valor);

        System.out.println(" ");
        System.out.println(" Valor com retorno de 13a.a: " + (valor + imobiliarios.rendimento()));
    }

    private void relatorio(){
        System.out.println("Relatório de investimentos");
        System.out.println(" ");
        ArrayList<String> relatorio = new ArrayList<>();
        relatorio.add(rendaFixa.toString() +  "\n"  + imobiliarios.toString() +
                "\n" + acoes.toString());

        relatorio.forEach(System.out::println);
    }



}

package com.senai.java.outrosExercicios.agroCompras;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;



public class logicaAgro {

    String grao;
    double quantidade;
    double preco;
    double precoFinal;


    Scanner scanner = new Scanner(System.in);


    ArrayList<String> graos = new ArrayList<>();
    ArrayList<Double> quantidades = new ArrayList<>();
    ArrayList<Double> precos = new ArrayList<>();
    ArrayList<Double> precosFinais = new ArrayList<>();


    public logicaAgro() {
        menu();
    }




    private void menu() {
        int opcao;
        do {
            System.out.println("""
                    Escolha qual grão deseja comprar:
                    1 - Soja
                    2 - Milho
                    3 - Trigo
                    4 - Faturamento

                    0 - Sair.
                    """);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    setGrao("soja");
                    graos.add("soja");
                    processamento();
                    break;
                case 2:
                    setGrao("milho");
                    graos.add("milho");
                    processamento();
                    break;
                case 3:
                    setGrao("trigo");
                    graos.add("trigo");
                    processamento();
                    break;
                case 4:
                    mostrarFaturamento();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    System.out.println(" - - - - - - - - - - - - ");

            }
        } while (opcao != 0);

    }


                private void processamento() {
                    System.out.println("Quantidade (Toneladas)?");
                    quantidade = scanner.nextDouble();
                    quantidades.add(quantidade);

                    System.out.println(("Preco por Tonelada?"));
                    preco = scanner.nextDouble();
                    precos.add(preco);

                    precoFinal = quantidade * preco;
                    precosFinais.add(precoFinal);

                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    System.out.println("Compra registrada: " + getGrao() + ", Quantidade: " + getQuantidade() + " toneladas, Preço por tonelada: R$" + getPreco() + " e Preço Final: R$ " + getPrecoFinal());
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");



        }

    private void mostrarFaturamento() {
        double totalFaturamento = 0;

        System.out.println("                               Faturamento Detalhado");
        for (int i = 0; i < graos.size(); i++) {
            String graoAtual = graos.get(i);
            double quantidadeAtual = quantidades.get(i);
            double precoAtual = precos.get(i);
            double precoFinalAtual = precosFinais.get(i);

            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.printf("Grão: %s, Quantidade: %.2f toneladas, Preço por tonelada: R$%.2f, Total: R$%.2f%n",
                    graoAtual, quantidadeAtual, precoAtual, precoFinalAtual);

            totalFaturamento += precoFinalAtual;
        }
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.printf(" Faturamento Total: R$%.2f%n", totalFaturamento);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
    }



        public String getGrao() {
            return grao;
        }

        public void setGrao(String grao) {
            this.grao = grao;
        }

        public double getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(double quantidade) {
            this.quantidade = quantidade;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
}

























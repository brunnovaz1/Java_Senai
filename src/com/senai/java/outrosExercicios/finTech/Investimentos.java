package com.senai.java.outrosExercicios.finTech;

public class Investimentos {
    private String nomeInvestimento;
    private double valorInvestido;
    private double taxaRetornoAno;
    //public static double  = 1.10;

    public String getNomeInvestimento() {
        return nomeInvestimento;
    }

    public String setNomeInvestimento(String nomeInvestimento) {
        this.nomeInvestimento = nomeInvestimento;
        return nomeInvestimento;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getTaxaRetornoAno() {
        return taxaRetornoAno;
    }

    public void setTaxaRetornoAno(double taxaRetornoAno) {
        this.taxaRetornoAno = taxaRetornoAno;
    }

    public double rendimento(){
        double rendimento =  getValorInvestido() *(getTaxaRetornoAno()/100);
        return rendimento;
    }

    @Override
    public String toString() {
        return "Investimento: " + nomeInvestimento +
                "\nValor investido: R$" + valorInvestido +
                //"\nTaxa de Retorno: R$" + taxaRetornoAno +
                "\nRendimento anual: R$ " + rendimento() +
        "\n- - - - - - - - - - - - - - - - - - - - - ";
    }
}

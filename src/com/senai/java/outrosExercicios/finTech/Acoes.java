package com.senai.java.outrosExercicios.finTech;

public class Acoes extends Investimentos{
    public static double rendimentoAcoes = 20;


    public double rendimento() {
        double rendimento =  getValorInvestido() *(rendimentoAcoes/100);
        return rendimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de retorno anual " + rendimentoAcoes + "%";
    }
}

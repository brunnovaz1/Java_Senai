package com.senai.java.outrosExercicios.finTech;

public class FundosImobiliarios extends Investimentos{
    public static double rendimentoFnudos = 13;

    @Override
    public double rendimento() {
        double rendimento =  getValorInvestido() *(rendimentoFnudos/100);
        return rendimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de retorno anual " + rendimentoFnudos + "%";
    }
}

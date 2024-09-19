package com.senai.java.outrosExercicios.finTech;

public class RendaFixa extends Investimentos{
    public static double rendimentoRenda = 10;

    @Override
    public double rendimento() {
        double rendimento =  getValorInvestido() *(rendimentoRenda/100);
        return rendimento;
    }


    @Override
    public String toString() {
        return  super.toString() + "\nTaxa de retorno anual: "+ rendimentoRenda + "%";
    }
}

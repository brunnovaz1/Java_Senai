package br.com.aulaAlex.br.com;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Instaciar uma classe = criar um objeto

        Aula1Carro fusca = new Aula1Carro();
        fusca.fabricante = "Volks";
        fusca.modelo = "fusca";
        fusca.ano = "1973";
        fusca.cor = "preto";

        Aula1Carro ferrari = new Aula1Carro();
        fusca.fabricante = "ferrari";
        fusca.modelo = "F50";
        fusca.ano = "2024";
        fusca.cor = "vermelha";




        System.out.println("Carro: " + fusca.modelo);
        System.out.println("Fabricante: " + fusca.fabricante);

        System.out.println(ferrari.fabricante);

        System.out.println(ferrari.fabricante);
        ferrari.acelerar(false);


        sc.close();
    }
}

package br.com.aulaAlex.br.com;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args){

//instanciar a classe
        Aula2Pessoa usuario = new Aula2Pessoa();
        Scanner scanner = new Scanner(System.in);


//setando os valores
        System.out.println("Informe o nome: ");
        usuario.setNome(scanner.nextLine());
        System.out.println("Informe o email: ");
        usuario.setEmail(scanner.nextLine());
        System.out.println("Informe a idade: ");
        usuario.setIdade(scanner.nextInt());

        System.out.println("Nome : " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Idade: " + usuario.getIdade() + " anos");

    }
}

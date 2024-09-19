package br.com.aulaAlex.br.com;

import java.util.Scanner;

public class RepDoWhile1 {


    public static void main(String[] args) {

            RepDoWhile usuario = new RepDoWhile();
            int sair;
            double imc;
            Scanner scanner = new Scanner(System.in);


            do {
                System.out.println("Informe o nome: ");
                usuario.setNome(scanner.nextLine());
                System.out.println("Informe o peso: ");
                usuario.setPeso(scanner.nextDouble());
                System.out.println("Informe a altura: ");
                usuario.setAltura(scanner.nextDouble());

                imc = usuario.getPeso() / usuario.getAltura() * usuario.getAltura();

                System.out.println("IMC do usuario:" + String.format("%.2f", imc));
                scanner.nextLine();


                if(imc < 16.9)      System.out.println("Voce esta Anorexo!");
                else if(imc < 18.5) System.out.println("Voce esta abaixo do peso");
                else if(imc < 25)   System.out.println("Você esta no peso ideal!");
                else if(imc < 30)   System.out.println("Você esta acima do peso");
                else                System.out.println("Você esta obeso!");




                System.out.println("Deseja continuar? (1 sair - 2 continuar)");
                sair = scanner.nextInt();
scanner.nextLine();

            } while (sair == 2);
        }
    }


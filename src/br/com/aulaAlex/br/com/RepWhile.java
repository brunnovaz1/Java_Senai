package br.com.aulaAlex.br.com;

import java.util.Scanner;

public class RepWhile {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int n;

        System.out.println("Informar um numero inteiro positivo:");
        n = scanner.nextInt();

        while (n >= 0) {
            System.out.println(n);
        n--;

        }
    }
}

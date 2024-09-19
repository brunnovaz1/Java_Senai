package com.senai.java.outrosExercicios.CadastroFuncionario;
import java.util.ArrayList;
import java.util.Scanner;



public class Cadastro {
    String nome;
    String cargo;
    double salario;

    Scanner scanner = new Scanner(System.in);

    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<String> cargos = new ArrayList<>();
    ArrayList<Double> salarios = new ArrayList<>();


    public Cadastro(){
        menu();
    }


    private void menu() {
        System.out.println("""
                - - - - - - - - - - - - - -
                ==-- RECURSOS HUMANOS --==
                Selecione a opção desejada:
                0. sair
                1. Cadastrar Funcionário
                2. Consultar cadastros
                """);
        int opcao = scanner.nextInt();
        scanner.nextLine();


        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 2:
                consultar();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida, tente novamente!");
                menu();
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private void cadastrar(){

        System.out.print("Nome: ");
        setNome(scanner.nextLine());
        nomes.add(getNome());

        System.out.print("Cargo: ");
        setCargo((scanner.nextLine()));
        cargos.add(getCargo());

        System.out.print("Salário: R$");
        setSalario(scanner.nextDouble());
        scanner.nextLine();
        salarios.add(getSalario());

        System.out.println(" - - - - - - - - - - - - - -");
        menu();
    }

    private void consultar() {
        System.out.println("FUNCIONÁRIOS");
        for(int i = 0; i < nomes.size(); i++ ) {
            System.out.println("Nome: " + nomes.get(i) + " - Cargo: " +  cargos.get(i) + " - Salário R$: " +  salarios.get(i));
        }
        System.out.println("Funcionarios cadastrados: " + nomes.size());
        menu();
    }
}

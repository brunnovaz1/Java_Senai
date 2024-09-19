package br.com.aulaAlex.br.com;

//metodos void executam acao, nao tem retorno.
//this: acessa atributo dentro da propria classe.


public class Aula2Pessoa {

//atributos
   private String nome;
   private String email;
   private int idade;


//metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

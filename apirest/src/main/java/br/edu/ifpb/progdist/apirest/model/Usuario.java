package br.edu.ifpb.progdist.apirest.model;

public class Usuario {
    private int codigo;
    private String nome;
    private int idade;

    public Usuario(int cod, String nome, int idade) {
        this.codigo = cod;
        this.nome = nome;
        this.idade = idade;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

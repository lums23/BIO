package com.example.bio;
public class BioModel {
    private String nome;
    private String idade;
    private String profissao;
    private String resumo;

    public BioModel() {
        this.nome = "";
        this.idade = "";
        this.profissao = "";
        this.resumo = "";
    }

    public BioModel(String nome, String idade, String profissao, String resumo) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
package br.edu.infnet.cruddepessoa.model;

import java.util.Objects;

public class Pessoa {

    private Integer id;
    private String nome;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidadee;
    private String uf;

    public void copíarValoresDe (Pessoa p){
        this.nome = p.getNome();
        this.cep = p.getCep();
        this.logradouro = p.getLogradouro();
        this.complemento = p.getComplemento();
        this.bairro = p.getBairro();
        this.localidadee = p.getLocalidadee();
        this.uf = p.getUf();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidadee() {
        return localidadee;
    }

    public void setLocalidadee(String localidadee) {
        this.localidadee = localidadee;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

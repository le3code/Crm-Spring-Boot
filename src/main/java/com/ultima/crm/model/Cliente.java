package com.ultima.crm.model;

import jakarta.persistence.*;

@Entity
//@Table(name ="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name ="nomeCompleto")
    private String nomeCompleto;
    @Column(name ="primeiroNome")
    private String primeiroNome;
    @Column(name ="nomeDoMeio")
    private String nomeDoMeio;
    @Column(name ="sobrenome")
    private String sobrenome;
    @Column(name ="cpf")
    private String cpf;
    @Column(name ="dataDeNascimento")
    private String dataDeNascimento;
    @Column(name ="idadeAtual")
    private Integer idadeAtual;
    @Column(name ="genero")
    private Character genero;
    @Column(name ="email")
    private String email;
    @Column(name ="telefone")
    private String telefone;

    public Cliente() {} // construtor padrao

    public Cliente(int id, String nomeCompleto, String primeiroNome, String nomeDoMeio,
                   String sobrenome, String cpf,
                   String dataDeNascimento, Integer idadeatual, Character genero,
                   String email, String telefone) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.primeiroNome = primeiroNome;
        this.nomeDoMeio = nomeDoMeio;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.idadeAtual = idadeatual;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getNomeDoMeio() {
        return nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getIdadeatual() {
        return idadeAtual;
    }

    public void setIdadeatual(Integer idadeatual) {
        this.idadeAtual = idadeatual;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", primeiroNome='" + primeiroNome + '\'' +
                ", nomeDoMeio='" + nomeDoMeio + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", idadeatual=" + idadeAtual +
                ", genero=" + genero +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}

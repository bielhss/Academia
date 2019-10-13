/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alunos implements Serializable{
    
     public Integer getIdAluno() {
        return idaluno;
    }

    public void setIdAluno(Integer idaluno) {
        this.idaluno = idaluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public String getSexo() {
        return sexo;
    }
     
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
      public String getAltura() {
        return altura;
    }
      
     public void setAltura(String altura) {
        this.altura = altura;
    }
     
      public String getIdade() {
        return idade;
    }
      
     public void setIdade(String idade) {
        this.idade = idade;
    }
     
      public String getEndereco() {
        return endereco;
    }
      
     public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
     
     public String getNumero() {
        return numero;
    }
     
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getBairro() {
        return bairro;
    }
    
     public void setBairro(String bairro) {
        this.bairro = bairro;
    }
     public String getCidade() {
        return cidade;
    }
     
     public void setCidade(String cidade) {
        this.cidade = cidade;
    }
     
     public String getTelefone() {
        return telefone;
    }
     public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getAtividades() {
        return atividades;
    }
    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
   
 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idaluno;
    private String nome;
    @Column(unique = true)
    private String sexo;
    private String altura;
    private String idade;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String telefone;
    private String cep;
    private String atividades;
    private String periodo;
    private boolean disponibilidade;
    
    
   

   

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

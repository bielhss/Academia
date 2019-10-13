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
public class Personal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpersonal;
    private String nome;
    @Column(unique = true)
    private String idade;
    private String endereco;
    private String bairro;
    private String cidade;
    private String telefone;
    private String cep;
    private String sexo;
    private String atividades;
    private String periodo;
    private String cref;
    private boolean disponibilidade;
   
    
    public Integer getIdPersonal() {
        return idpersonal;
    }

    public void setIdPersonal(Integer idpersonal) {
        this.idpersonal = idpersonal;
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
    public void setPeriodo(String cref) {
        this.periodo = periodo;
    
    }
    public String getCref() {
        return cref;
    }
    public void setCref(String cref) {
        this.cref = cref;
    }
    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    

    
    
    
  @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
    


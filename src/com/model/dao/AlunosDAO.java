/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.bean.Alunos;
import com.connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


public class AlunosDAO {
     public Alunos save(Alunos alunos) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(alunos);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return alunos;
    }

    public Alunos update(Alunos alunos) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.merge(alunos);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return alunos;
    }

    public Alunos findByID(Integer id) { //BUSCA OS USUARIOS CADASTRADOS

        EntityManager em = new ConnectionFactory().getConnection();
        Alunos alunos = null;

        try {
            alunos = em.find(Alunos.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar " + e);
        } finally {
            em.close();
        }

        return alunos;

    }

    public List<Alunos> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Alunos> alunos = null;

        try {
            alunos = em.createQuery("from Alunos v").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
        } finally {
            em.close();
        }

        return alunos;
    }

    public Alunos remove(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Alunos alunos = null;
        try {
            alunos = em.find(Alunos.class, id);
            em.getTransaction().begin();
            em.remove(alunos);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return alunos;
    }
}

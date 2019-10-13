
package com.model.dao;

import com.connection.ConnectionFactory;
import com.model.bean.Atividade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


public class AtividadeDAO {
        public Atividade save(Atividade atividade) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(atividade);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return atividade;
    }

    public List<Atividade> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Atividade> atividade = null;

        try {
            atividade = em.createQuery("from Atividade ATIVIDADE").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
        } finally {
            em.close();
        }

        return atividade;
    }

    public Atividade findByID(Integer id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Atividade atividade = null;

        try {
            atividade = em.find(Atividade.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar " + e);
        } finally {
            em.close();
        }

        return atividade;

    }
}

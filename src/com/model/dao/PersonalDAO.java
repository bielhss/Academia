

package com.model.dao;

import com.connection.ConnectionFactory;
import com.model.bean.Personal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class PersonalDAO {
    
     public Personal save(Personal personal) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(personal);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return personal;
    }

    public Personal update(Personal personal) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.merge(personal);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return personal;
    }

    public Personal findByID(Integer id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Personal personal = null;

        try {
            personal = em.find(Personal.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar " + e);
        } finally {
            em.close();
        }

        return personal;

    }

    public List<Personal> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Personal> personal = null;

        try {
            personal = em.createQuery("from Personal p").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
        } finally {
            em.close();
        }

        return personal;
    }

    public Personal remove(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Personal personal = null;
        try {
            personal = em.find(Personal.class, id);
            em.getTransaction().begin();
            em.remove(personal);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return personal;
    }
}
    
  

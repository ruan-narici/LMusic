package dao;


import javax.persistence.EntityManager;

import model.Usuario;
import util.JPAUtil;

public class UsuarioDAO {
	
	private EntityManager em;

	public void inserir(Usuario usuario) {
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		this.em.persist(usuario);
		this.em.getTransaction().commit();
		this.em.close();
	}
	
	public boolean autenticar(String nome,  String senha) {
		this.em = JPAUtil.getEntityManager();
		String jpql = "SELECT u FROM Usuario u WHERE u.nome = :nome AND u.senha = :senha";
		em.getTransaction().begin();
		try {
			this.em.createQuery(jpql, Usuario.class)
			.setParameter("nome", nome)
			.setParameter("senha", senha)
			.getSingleResult();
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			em.close();
		}

	}

}

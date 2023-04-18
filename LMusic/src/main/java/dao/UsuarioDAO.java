package dao;

import java.util.List;

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

	public boolean autenticar(String nome, String senha) {
		this.em = JPAUtil.getEntityManager();
		String jpql = "SELECT u FROM Usuario u WHERE u.nome = :nome AND u.senha = :senha";
		em.getTransaction().begin();
		try {
			this.em.createQuery(jpql, Usuario.class).setParameter("nome", nome).setParameter("senha", senha)
					.getSingleResult();
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			em.close();
		}
	}
	
	public List<Usuario> listar() {
		String jpql = "SELECT u FROM Usuario u";
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		List<Usuario> lista = this.em.createQuery(jpql, Usuario.class).getResultList();
		this.em.getTransaction().commit();
		this.em.close();
		return lista;
	}

	public Usuario buscarPorId(Long id) {
		String jpql = "SELECT u FROM Usuario u WHERE u.id = :id";
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		Usuario usuario = this.em.createQuery(jpql, Usuario.class).setParameter("id", id).getSingleResult();
		this.em.getTransaction().commit();
		this.em.close();
		return usuario;
	}
	
	public Usuario buscarPorCredenciais(String nome, String senha) {
		String jpql = "SELECT u FROM Usuario u WHERE u.nome = :nome AND u.senha = :senha";
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		Usuario usuario = this.em.createQuery(jpql, Usuario.class)
				.setParameter("nome", nome)
				.setParameter("senha", senha)
				.getSingleResult();
		this.em.getTransaction().commit();
		this.em.close();
		return usuario;
	}

	public void alterar(Long id, String nome, String senha) {
		String jpql = "UPDATE Usuario SET nome = :nome, senha = :senha WHERE id = :id";
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		this.em.createQuery(jpql).setParameter("id", id).setParameter("nome", nome).setParameter("senha", senha)
				.executeUpdate();
		this.em.getTransaction().commit();
		this.em.close();
	}

	public void excluir(Long id) {
		String jpql = "DELETE FROM Usuario WHERE id = :id";
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		this.em.createQuery(jpql).setParameter("id", id).executeUpdate();
		this.em.getTransaction().commit();
		this.em.close();
	}

}

package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Musica;
import util.JPAUtil;

public class MusicaDAO {
	
	private EntityManager em;
	
	public void inserir(Musica musica) {
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		this.em.persist(musica);
		this.em.getTransaction().commit();
		this.em.close();
	}

	public List<Musica> listar() {
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		String jpql = "SELECT m FROM Musica m";
		List<Musica> lista = this.em.createQuery(jpql, Musica.class).getResultList();
		this.em.getTransaction().commit();
		this.em.close();
		return lista;
	}
	
	public Musica buscarPorId(Long id) {
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		String jpql = "SELECT m FROM Musica m WHERE m.id = :id";
		Musica musica = this.em.createQuery(jpql, Musica.class)
		.setParameter("id", id)
		.getSingleResult();
		this.em.getTransaction().commit();
		this.em.close();
		return musica;
	}
	
	public void alterar(Long id, String nome, String artista, String data, String genero, String link) {
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		String jpql = "UPDATE Musica SET nome = :nome, artista = :artista, dataLancamento = :data, genero = :genero, link = :link WHERE id = :id";
		this.em.createQuery(jpql)
		.setParameter("id", id)
		.setParameter("nome", nome)
		.setParameter("artista", artista)
		.setParameter("data", data)
		.setParameter("genero", genero)
		.setParameter("link", link)
		.executeUpdate();
		this.em.getTransaction().commit();
		this.em.close();
	}
	
	public void excluir(Long id) {
		this.em = JPAUtil.getEntityManager();
		this.em.getTransaction().begin();
		String jpql = "DELETE FROM Musica WHERE id = :id";
		this.em.createQuery(jpql)
		.setParameter("id", id)
		.executeUpdate();
		this.em.getTransaction().commit();
		this.em.close();
	}
}

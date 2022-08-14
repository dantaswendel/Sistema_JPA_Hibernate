package br.com.wendel.loja.dao;

import javax.persistence.EntityManager;

import br.com.wendel.loja.Produto;
import br.com.wendel.loja.modelo.Categoria;

public class CategoriaDao {

	private EntityManager em;
	
	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar (Categoria categoria) {
		this.em.persist(categoria);
	}
	
	public void remover (Categoria categoria) {
		categoria = em.merge (categoria);
		this.em.remove(categoria);
	}
}

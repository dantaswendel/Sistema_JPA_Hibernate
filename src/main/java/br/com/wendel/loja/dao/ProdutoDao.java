package br.com.wendel.loja.dao;

import javax.persistence.EntityManager;

import br.com.wendel.loja.Produto;

public class ProdutoDao {

	private EntityManager em;
	
	public ProdutoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar (Produto produto) {
		this.em.persist(produto);
	}
	
	public void remove (Produto produto) {
		produto = em.merge (produto);
		this.em.remove(produto);
	}

public Produto buscarPorTd (Long id) {
	return em.find(Produto.class, id);
}
}


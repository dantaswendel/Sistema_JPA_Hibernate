package br.com.wendel.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.wendel.loja.Produto;
import br.com.wendel.loja.dao.CategoriaDao;
import br.com.wendel.loja.dao.ProdutoDao;
import br.com.wendel.loja.modelo.Categoria;
import br.com.wendel.loja.util.JPAUtil;

public class CadastroDeProduto {

	
	public static void main(String[] args) {
		cadastrarProduto();
			}
	
private static void cadastrarProduto() {
			
		
		Categoria cama = new Categoria ("CAMA");
		Produto lencol = new Produto("lençol de casal", "Doller",new BigDecimal ("49"), cama);
		lencol.setNome("lencol casal");
		lencol.setMarca("Doller");
		lencol.setPreco( new BigDecimal ("49"));
		
			EntityManager em = JPAUtil.getEntityManager();
			ProdutoDao produtoDao = new ProdutoDao(em);
			CategoriaDao categoriaDao = new CategoriaDao(em);

		em.getTransaction().begin(); 
		em.getTransaction().commit();
		em.close();
		}
}

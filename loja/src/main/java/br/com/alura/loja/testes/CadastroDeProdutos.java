package br.com.alura.loja.testes;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import util.JPAUtil;

public class CadastroDeProdutos {

	public static void main(String[] args) {
		Categoria periferico = new Categoria("PERIFERICOS");
		Produto produto = new Produto("Cloud Aplha 2", "Hyperx", 799, periferico);
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		
		categoriaDao.cadastrar(periferico);
		produtoDao.cadastrar(produto);
		
		em.getTransaction().commit();
		em.close();
	}

}

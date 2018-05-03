package br.com.comercial.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.comercial.domain.Pais;
import br.com.comercial.util.PersisteceUtil;

public class PaisDao implements GenericDao<Pais>{

	EntityManager em = PersisteceUtil.getEntityManager();
	
	@Override
	public boolean salvar(Pais pais) {
		em.persist(pais);
		return true;
	}

	@Override
	public Pais buscar(Long id) {
		Pais p = em.find(Pais.class,id);
		return p;
	}

	@Override
	public boolean excluir(Pais p) {
		em.remove(p);
		return true;
	}

	@Override
	public List<Pais> listar() {

		return null;
	}
	
	
}

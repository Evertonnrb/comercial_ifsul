package br.com.comercial.dao;

import java.util.List;

public interface GenericDao<T> {
	
	public boolean salvar(T t);
	
	public T buscar(Long id);
	
	public boolean excluir(T t);
	
	public List<T> listar();
}

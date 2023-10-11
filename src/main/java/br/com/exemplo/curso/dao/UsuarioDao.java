package br.com.exemplo.curso.dao;

import java.util.List;

import br.com.exemplo.curso.model.Usuario;

public interface UsuarioDao {

	
	void salvar (Usuario usuario);
	
	void editar(Usuario usuario);
	
	void deletar(Long id);
	
	Usuario getId(Long id);
	
	List<Usuario> getTodos();
	
	
	
}

package br.com.exemplo.curso.dao;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.exemplo.curso.model.TipoSexo;
import br.com.exemplo.curso.model.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
	
	private static List<Usuario> tabela;
	
	public UsuarioDaoImpl() {
		createUserList();
	}
	
	private List<Usuario> createUserList(){ 
	if(tabela == null) {
	tabela = new LinkedList<>();
	tabela.add(new Usuario(System.currentTimeMillis()+1L, "Matheus", "Chagas", LocalDate.of(2000, 11, 24), TipoSexo.MASCULINO));
	tabela.add(new Usuario(System.currentTimeMillis()+2L, "Gabriel", "Mota", LocalDate.of(2001, 01, 24), TipoSexo.MASCULINO));
	tabela.add(new Usuario(System.currentTimeMillis()+3L, "Leonardo", "Vieira", LocalDate.of(1999, 10, 01), TipoSexo.MASCULINO));
	tabela.add(new Usuario(System.currentTimeMillis()+4L, "Gabriel", "Vieira", null));
	tabela.add(new Usuario(System.currentTimeMillis()+5L, "Gabriel", "Sousa", null));
	}
	return tabela;
	}
	
	@Override
	public void salvar(Usuario usuario) {
		usuario.setId(System.currentTimeMillis());
		tabela.add(usuario);
	}
	
	@Override
	public void editar(Usuario usuario) {
		tabela.stream()
		.filter((u) -> u.getId().equals(usuario.getId()))
		.forEach((u) -> {
			u.setNome(usuario.getNome());
			u.setSobrenome(usuario.getSobrenome());
			u.setDtNascimento(usuario.getDtNascimento());
			u.setSexo(usuario.getSexo());
	
		});
	
	}
	@Override
	public void deletar(Long id) { 
		tabela.removeIf((u) -> u.getId().equals(id));
	}
	
	@Override
	public Usuario getId(Long id) {
		return tabela.stream()
				.filter((u) -> u.getId().equals(id))
				.collect(Collectors.toList()).get(0);
	}
	
	@Override
	public List<Usuario> getTodos(){
		return tabela;
	}
	
	
	
	
}

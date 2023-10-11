package br.com.exemplo.curso.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Usuario {
		
		private Long id;
		private String nome;
		private String sobrenome;
		@DateTimeFormat(iso = ISO.DATE)
		private LocalDate dtNascimento;
		private TipoSexo sexo; 
		
		public Usuario() {
			super();
		}
		
		
		public Usuario(Long id, String nome, String sobrenome) {
			super();
			this.id = id;
			this.nome = nome;
			this.sobrenome = sobrenome;
		}
		
		
		
		
		public Usuario(Long id, String nome, String sobrenome, LocalDate dtNascimento) {
			super();
			this.id = id;
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.dtNascimento = dtNascimento;
		}
		
	
	
		public Usuario(Long id, String nome, String sobrenome, LocalDate dtNascimento, TipoSexo sexo) {
			super();
			this.id = id;
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.dtNascimento = dtNascimento;
			this.sexo = sexo;
		}



		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getSobrenome() {
			return sobrenome;
		}
		
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		
		public LocalDate getDtNascimento() {
			return dtNascimento;
		}

		public void setDtNascimento(LocalDate dtNascimento) {
			this.dtNascimento = dtNascimento;
		}
		
		

		public TipoSexo getSexo() {
			return sexo;
		}



		public void setSexo(TipoSexo sexo) {
			this.sexo = sexo;
		}



		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
		}
		
		
		
		
}

package br.com.exemplo.curso.model;

public enum TipoSexo {
	FEMININO('F'), MASCULINO('M');
	
	private char desc;

	
	
	TipoSexo(char desc) {
		this.desc = desc;
	}

	public char getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}

package br.com.exemplo.curso.web.conversor;

import org.springframework.core.convert.converter.Converter;

import br.com.exemplo.curso.model.TipoSexo;

public class TipoSexoConverter implements Converter<String, TipoSexo>{

	@Override
	public TipoSexo convert(String texto) {
		char tipo = texto.charAt(0);
		return tipo == TipoSexo.MASCULINO.getDesc() ? TipoSexo.MASCULINO : TipoSexo.FEMININO;
	}

	
	

}

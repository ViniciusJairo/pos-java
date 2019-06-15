package br.com.unipe.AgendaEventos.model.vo;

import br.com.unipe.AgendaEventos.model.enumerator.Tipo;

public class Item {
	
	private String id;

	private String alimento;
	

	private Integer quantidade;
	

	private Tipo tipo;


	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}

package br.com.unipe.AgendaEventos.model.enumerator;

public enum Tipo {
	
	ALIMENTO("Alimento"),
	ELETRODOMESTICO("Eletrodoméstico"),
	ELETROPORTATEIS("Eletroportáteis"),
	INFORMATICA("Informática");
	
	private String label;

	private Tipo(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}

package br.com.unipe.AgendaEventos.model.enumerator;

public enum Tipo {
	
	ALIMENTO("Alimento"),
	ELETRODOMESTICO("Eletrodom�stico"),
	ELETROPORTATEIS("Eletroport�teis"),
	INFORMATICA("Inform�tica");
	
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

package br.com.unipe.AgendaEventos.model.enumerator;

public enum PessoaTipo {
	PF("Pessoa Física"), 
	PJ("Pessoa Jurídica");
	
	private String label;

	private PessoaTipo(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}

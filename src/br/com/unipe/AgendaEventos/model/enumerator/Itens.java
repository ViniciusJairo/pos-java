package br.com.unipe.AgendaEventos.model.enumerator;
import java.util.ArrayList;
import java.util.List;

import br.com.unipe.AgendaEventos.model.vo.Item;
public enum Itens {
	
	INSTANCE;
	
	private List<Item> listItem; 
	
	private Itens() {
		listItem = new ArrayList<>();
	}
	
	public void addEndereco(Item u) {
		listItem.add(u);
	}

	public List<Item> allItens() {
		return listItem;
	}
	public void removeItem(Item u) {
		listItem.remove(u);
		
	}
	
	public void editarItem(Item u) {
		for(int i = 0; i < listItem.size(); i++ ) {
			if(listItem.get(i).getId().contains(u.getId())) {
				listItem.set(i, u);
				
			}
		}

	}
	
	

}

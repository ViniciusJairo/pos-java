package br.com.unipe.AgendaEventos.controller.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import java.util.ArrayList;
import java.util.List;

import br.com.unipe.AgendaEventos.model.enumerator.Itens;
import br.com.unipe.AgendaEventos.model.enumerator.Tipo;
import br.com.unipe.AgendaEventos.model.vo.Item;
import javax.faces.model.SelectItem;

@ManagedBean(name = "itemBean")
@SessionScoped
public class ItemBean {
	
	public Item item;
	
	private List<Item> listItem; 
	
	private List<SelectItem> listTipos;
	private Tipo selectTipo;
	
	
	private String filtro;
	
	public ItemBean() {
		item = new Item();
		
	}
	
	@PostConstruct
	public void initSexo() {


		listTipos = new ArrayList<>();
		for (Tipo s : Tipo.values()) {
			listTipos.add(new SelectItem(s, s.getLabel()));
		}
		
	}
	
	public String prepararCadastro() {
		item = new Item();
		return "cadastroItem";
	}
	
	public String prepararList() {
		return "";
	}
	
	public String adicionarItem() {
		Itens.INSTANCE.addEndereco(item);
		listItem = Itens.INSTANCE.allItens();
		return "listarItens"; 
	}
	
	public void filtrarTabela() {
		listItem = new ArrayList<>();
		for (Item u : Itens.INSTANCE.allItens()) {
			if (u.getAlimento().contains(filtro)) {
				listItem.add(u);
			}
		}
	}
	public String deletar(Item item2) {
		Itens.INSTANCE.removeItem(item2);
		 FacesContext context = FacesContext.getCurrentInstance();
		    return context.getViewRoot().getViewId() + "?faces-redirect=true";
	}
	
	public String editar(Item item3) {
		Itens.INSTANCE.removeItem(item3);
		FacesContext context = FacesContext.getCurrentInstance();
	    return context.getViewRoot().getViewId() + "?faces-redirect=true";
		
	}
	
	public String carregarDetalhes(Item item) {
		this.item = item;
		return "detalhesUsuario";
	}

	public void carregarDetalhes2(Item item) {
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public void setListItem(List<Item> listItem) {
		this.listItem = listItem;
	}

	public List<SelectItem> getListTipos() {
		return listTipos;
	}

	public void setListTipos(List<SelectItem> listTipos) {
		this.listTipos = listTipos;
	}

	public Tipo getSelectTipo() {
		return selectTipo;
	}

	public void setSelectTipo(Tipo selectTipo) {
		this.selectTipo = selectTipo;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	
	

}

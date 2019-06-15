package br.com.unipe.AgendaEventos.controller.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.unipe.AgendaEventos.model.enumerator.Tipo;

@FacesConverter("tipoConverter")

public class TipoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2 != null && !arg2.equals("")) {
			for (Tipo s : Tipo.values()) {
				if (arg2.equals(s.getLabel())) {
					return s;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 != null && !arg2.equals("")) {
			Tipo s = (Tipo) arg2;
			return s.getLabel();
		}
		return "";
	}

}

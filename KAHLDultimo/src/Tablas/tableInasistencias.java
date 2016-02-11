package org.esc.model.Tablas;

import javafx.beans.property.SimpleStringProperty;

public class tableInasistencias {

	public SimpleStringProperty fecha = new SimpleStringProperty();
	public SimpleStringProperty tipo = new SimpleStringProperty();
	public SimpleStringProperty justificada = new SimpleStringProperty();
	
	public String getFecha(){
		return fecha.get();
	}
	
	public String getTipo(){
		return tipo.get();
	}
	
	public String getJustificada(){
		return justificada.get();
	}
}

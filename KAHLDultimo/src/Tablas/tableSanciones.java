package org.esc.model.Tablas;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class tableSanciones {

	
	public SimpleStringProperty fecha = new SimpleStringProperty();
	public SimpleStringProperty tipo = new SimpleStringProperty();
	public SimpleIntegerProperty cantidad = new SimpleIntegerProperty();
	public SimpleStringProperty observacion = new SimpleStringProperty();
	
	public String getFecha(){
		return fecha.get();
	}
	
	public String getTipo(){
		return tipo.get();
	}
	
	public Integer getCantidad(){
		return cantidad.get();
	}
	
	public String getObservacion(){
		return observacion.get();
	}
}

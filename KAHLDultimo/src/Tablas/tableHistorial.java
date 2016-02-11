package org.esc.model.Tablas;

import java.text.SimpleDateFormat;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class tableHistorial {

	public SimpleStringProperty materia = new SimpleStringProperty();
	public SimpleIntegerProperty nota = new SimpleIntegerProperty();
	public SimpleStringProperty fecha = new SimpleStringProperty();
	public SimpleStringProperty tipoExamen = new SimpleStringProperty();
	
	public String getMateria() {
		return materia.get();
	}
	public Integer getNota() {
		return nota.get();
	}
	public String getFecha() {
		return fecha.get();
	}
	public String getTipoExamen(){
		return tipoExamen.get();
	}
	
}

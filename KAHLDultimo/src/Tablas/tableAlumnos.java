package org.esc.model.Tablas;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class tableAlumnos {

	public SimpleIntegerProperty documento = new SimpleIntegerProperty();
	public SimpleStringProperty nombre = new SimpleStringProperty();
	public SimpleStringProperty apellido = new SimpleStringProperty();

	public Integer getDocumento() {
		return documento.get();
	}
	public String getNombre() {
		return nombre.get();
	}
	public String getApellido() {
		return apellido.get();
	}

}

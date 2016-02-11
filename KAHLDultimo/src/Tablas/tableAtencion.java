package org.esc.model.Tablas;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

public class tableAtencion {

	public SimpleStringProperty materia = new SimpleStringProperty();
	public SimpleFloatProperty promedio = new SimpleFloatProperty();
	
	public String getMateria(){
		return materia.get();
	}
	public float getPromedio(){
		return promedio.get();
	}
}

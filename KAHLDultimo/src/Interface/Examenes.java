package org.esc.model.Interface;

import java.time.LocalDate;
import java.util.Date;

public interface Examenes {

	Integer getMesa();

	void setMesa(Integer mesa);

	LocalDate getFecha();

	void setFecha(LocalDate fecha);

	String getObs();

	void setObs(String obs);

	Integer getCodExamen();

	void setCodExamen(Integer codExamen);

	String getExamen();

	void setExamen(String examen);

	public Integer getNota();
	
	public void setNota(Integer nota);
}
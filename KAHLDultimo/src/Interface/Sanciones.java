package org.esc.model.Interface;

import java.time.LocalDate;
import java.util.Date;

public interface Sanciones {

	String getIdSanciones();

	void setIdSanciones(String idSanciones);

	LocalDate getFecha();

	void setFecha(LocalDate date);

	String getObservacion();

	void setObservacion(String observacion);

	Integer getNroSanciones();

	void setNroSanciones(Integer nroSanciones);

	Integer getTotal();

	void setTotal(Integer total);

	Integer getCodSancion();

	void setCodSancion(Integer codSancion);

	String getSancion();

	void setSancion(String sancion);

}
package org.esc.model.Interface;

import java.time.LocalDate;
import java.util.Date;

public interface Inasistencias {

	Integer getIdInasistencia();

	void setIdInasistencia(Integer idInasistencia);

	LocalDate getFecha();

	void setFecha(LocalDate fecha);

	Integer getTrimestre1();

	void setTrimestre1(Integer trimestre1);

	Integer getTrimestre2();

	void setTrimestre2(Integer trimestre2);

	Integer getTrimestre3();

	void setTrimestre3(Integer trimestre3);

	Integer getTotal();

	void setTotal(Integer total);

	Integer getLlegadasTarde();

	void setLlegadasTarde(Integer llegadasTarde);
	
	public Boolean getJustificada();
	
	public void setJustificada(Boolean justificada);
	

}
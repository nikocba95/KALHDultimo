package org.esc.model.Interface;

import java.time.LocalDate;
import java.util.Date;

public interface Alumnos extends Person{

	Integer getMatricula();

	void setMatricula(Integer matricula);

	String getEstablecimientoAnterior();

	void setEstablecimientoAnterior(String establecimientoAnterior);

	public Boolean getEstado();
	
	public void setEstado(Boolean estado);
	
	public String getConstanciaSexto();
	
	public void setConstanciaSexto(String constanciaSexto);
	
	public LocalDate getFechaEmision();
	
	public void setFechaEmision(LocalDate fechaEmision);
	
	public String getNombreMadre();
	
	public void setNombreMadre(String nombreMadre);
	
	public String getApellidoMadre() ;
	
	public void setApellidoMadre(String apellidoMadre) ;
	
	public String getNombrePadre() ;
	
	public void setNombrePadre(String nombrePadre); 
	
	public String getApellidoPadre();
	
	public void setApellidoPadre(String apellidoPadre);
	
	public String getObservacion();
	
	public void setObservacion(String observacion);
	

}
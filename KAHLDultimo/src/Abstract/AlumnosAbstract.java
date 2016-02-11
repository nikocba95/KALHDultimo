package org.esc.model.Abstract;

import java.time.LocalDate;
import java.util.Date;

import org.esc.model.Interface.Alumnos;

public abstract class AlumnosAbstract extends PersonAbstract implements Alumnos{
	
	private Integer matricula = null;
	private String establecimientoAnterior = null;
	private Boolean estado = false;
	private String constanciaSexto = null;
	private LocalDate fechaEmision = null;
	private String nombreMadre = null;
	private String apellidoMadre = null;
	private String nombrePadre = null;
	private String apellidoPadre = null;
	private String observacion = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Alumnos#getMatricula()
	 */
	@Override
	public Integer getMatricula() {
		return matricula;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Alumnos#setMatricula(java.lang.Integer)
	 */
	@Override
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Alumnos#getEstablecimientoAnterior()
	 */
	@Override
	public String getEstablecimientoAnterior() {
		return establecimientoAnterior;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Alumnos#setEstablecimientoAnterior(java.lang.String)
	 */
	@Override
	public void setEstablecimientoAnterior(String establecimientoAnterior) {
		this.establecimientoAnterior = establecimientoAnterior;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String getConstanciaSexto() {
		return constanciaSexto;
	}
	public void setConstanciaSexto(String constanciaSexto) {
		this.constanciaSexto = constanciaSexto;
	}
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	public String getApellidoMadre() {
		return apellidoMadre;
	}
	public void setApellidoMadre(String apellidoMadre) {
		this.apellidoMadre = apellidoMadre;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getApellidoPadre() {
		return apellidoPadre;
	}
	public void setApellidoPadre(String apellidoPadre) {
		this.apellidoPadre = apellidoPadre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
	

}

package org.esc.model.Abstract;

import java.time.LocalDate;

import org.esc.model.Interface.Inscripcion;

public abstract class InscripcionAbstract implements Inscripcion{

	
	private Integer cicloLectivo = null;
	private LocalDate fechaInscripcion = null;
	private Boolean ingresoDirecto = false;
	private Boolean ingresoConPase = false;
	private Integer codCurso = null;
	private Integer dni= null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#getCicloLectivo()
	 */
	@Override
	public Integer getCicloLectivo() {
		return cicloLectivo;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#setCicloLectivo(java.lang.Integer)
	 */
	@Override
	public void setCicloLectivo(Integer cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#getFechaInscripcion()
	 */
	@Override
	public LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#setFechaInscripcion(java.time.LocalDate)
	 */
	@Override
	public void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#isIngresoDirecto()
	 */
	@Override
	public boolean isIngresoDirecto() {
		return ingresoDirecto;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#setIngresoDirecto(boolean)
	 */
	@Override
	public void setIngresoDirecto(boolean ingresoDirecto) {
		this.ingresoDirecto = ingresoDirecto;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#isIngresoConPase()
	 */
	@Override
	public boolean isIngresoConPase() {
		return ingresoConPase;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#setIngresoConPase(boolean)
	 */
	@Override
	public void setIngresoConPase(boolean ingresoConPase) {
		this.ingresoConPase = ingresoConPase;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#getCodCurso()
	 */
	@Override
	public Integer getCodCurso() {
		return codCurso;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#setCodCurso(java.lang.Integer)
	 */
	@Override
	public void setCodCurso(Integer codCurso) {
		this.codCurso = codCurso;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#getDni()
	 */
	@Override
	public Integer getDni() {
		return dni;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inscripcion#setDni(java.lang.Integer)
	 */
	@Override
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	

	
	
}

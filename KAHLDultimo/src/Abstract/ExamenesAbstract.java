package org.esc.model.Abstract;

import java.time.LocalDate;
import java.util.Date;

import org.esc.model.Interface.Examenes;

public abstract class ExamenesAbstract implements Examenes {
	
	private Integer mesa = null;
	private LocalDate fecha = null;
	private String obs = null;
	private Integer codExamen = null;
	private String examen = null;
	private Integer nota = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#getMesa()
	 */
	@Override
	public Integer getMesa() {
		return mesa;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#setMesa(java.lang.Integer)
	 */
	@Override
	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#getFecha()
	 */
	@Override
	public LocalDate getFecha() {
		return fecha;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#setFecha(java.util.Date)
	 */
	@Override
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#getObs()
	 */
	@Override
	public String getObs() {
		return obs;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#setObs(java.lang.String)
	 */
	@Override
	public void setObs(String obs) {
		this.obs = obs;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#getCodExamen()
	 */
	@Override
	public Integer getCodExamen() {
		return codExamen;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#setCodExamen(java.lang.Integer)
	 */
	@Override
	public void setCodExamen(Integer codExamen) {
		this.codExamen = codExamen;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#getExamen()
	 */
	@Override
	public String getExamen() {
		return examen;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Examenes#setExamen(java.lang.String)
	 */
	@Override
	public void setExamen(String examen) {
		this.examen = examen;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
	

}

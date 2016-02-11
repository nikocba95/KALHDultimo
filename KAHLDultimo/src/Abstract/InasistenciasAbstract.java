package org.esc.model.Abstract;

import java.time.LocalDate;
import java.util.Date;

import org.esc.model.Interface.Inasistencias;

public abstract class InasistenciasAbstract implements Inasistencias {
	
	private Integer idInasistencia = null;
	private LocalDate fecha = null;
	private Boolean Justificada = null;
	private Integer trimestre1 = null;
	private Integer trimestre2 = null;
	private Integer trimestre3 = null;
	private Integer total = null;
	private Integer llegadasTarde = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#getIdInasistencia()
	 */
	@Override
	public Integer getIdInasistencia() {
		return idInasistencia;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#setIdInasistencia(java.lang.Integer)
	 */
	@Override
	public void setIdInasistencia(Integer idInasistencia) {
		this.idInasistencia = idInasistencia;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#getFecha()
	 */
	@Override
	public LocalDate getFecha() {
		return fecha;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#setFecha(java.util.Date)
	 */
	@Override
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#getTrimestre1()
	 */
	@Override
	public Integer getTrimestre1() {
		return trimestre1;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#setTrimestre1(java.lang.Integer)
	 */
	@Override
	public void setTrimestre1(Integer trimestre1) {
		this.trimestre1 = trimestre1;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#getTrimestre2()
	 */
	@Override
	public Integer getTrimestre2() {
		return trimestre2;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#setTrimestre2(java.lang.Integer)
	 */
	@Override
	public void setTrimestre2(Integer trimestre2) {
		this.trimestre2 = trimestre2;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#getTrimestre3()
	 */
	@Override
	public Integer getTrimestre3() {
		return trimestre3;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#setTrimestre3(java.lang.Integer)
	 */
	@Override
	public void setTrimestre3(Integer trimestre3) {
		this.trimestre3 = trimestre3;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#getTotal()
	 */
	@Override
	public Integer getTotal() {
		return total;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#setTotal(java.lang.Integer)
	 */
	@Override
	public void setTotal(Integer total) {
		this.total = total;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#getLlegadasTarde()
	 */
	@Override
	public Integer getLlegadasTarde() {
		return llegadasTarde;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Inasistencias#setLlegadasTarde(java.lang.Integer)
	 */
	@Override
	public void setLlegadasTarde(Integer llegadasTarde) {
		this.llegadasTarde = llegadasTarde;
	}
	public Boolean getJustificada() {
		return Justificada;
	}
	public void setJustificada(Boolean justificada) {
		Justificada = justificada;
	}
	
	
	

}

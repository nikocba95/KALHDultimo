package org.esc.model.Abstract;

import java.time.LocalDate;
import java.util.Date;

import org.esc.model.Interface.Sanciones;

public abstract class SancionesAbstract implements Sanciones {
	
	private String idSanciones = null;
	private LocalDate fecha = null;
	private String observacion = null;
	private Integer nroSanciones = null;
	private Integer total = null;
	private Integer codSancion = null;
	private String sancion = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#getIdSanciones()
	 */
	@Override
	public String getIdSanciones() {
		return idSanciones;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#setIdSanciones(java.lang.Integer)
	 */
	@Override
	public void setIdSanciones(String idSanciones) {
		this.idSanciones = idSanciones;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#getFecha()
	 */
	@Override
	public LocalDate getFecha() {
		return fecha;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#setFecha(java.util.Date)
	 */
	@Override
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#getObservacion()
	 */
	@Override
	public String getObservacion() {
		return observacion;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#setObservacion(java.lang.String)
	 */
	@Override
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#getNroSanciones()
	 */
	@Override
	public Integer getNroSanciones() {
		return nroSanciones;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#setNroSanciones(java.lang.Integer)
	 */
	@Override
	public void setNroSanciones(Integer nroSanciones) {
		this.nroSanciones = nroSanciones;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#getTotal()
	 */
	@Override
	public Integer getTotal() {
		return total;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#setTotal(java.lang.Integer)
	 */
	@Override
	public void setTotal(Integer total) {
		this.total = total;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#getCodSancion()
	 */
	@Override
	public Integer getCodSancion() {
		return codSancion;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#setCodSancion(java.lang.Integer)
	 */
	@Override
	public void setCodSancion(Integer codSancion) {
		this.codSancion = codSancion;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#getSancion()
	 */
	@Override
	public String getSancion() {
		return sancion;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Sanciones#setSancion(java.lang.String)
	 */
	@Override
	public void setSancion(String sancion) {
		this.sancion = sancion;
	}
	
	
	
	

}

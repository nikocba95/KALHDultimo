package org.esc.model.Abstract;

import org.esc.model.Interface.Empleados;

public abstract class EmpleadosAbstract extends PersonAbstract implements Empleados{
	
	private Integer legajo = null;
	private Boolean estado = false;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Empleados#getLegajo()
	 */
	@Override
	public Integer getLegajo() {
		return legajo;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Empleados#setLegajo(java.lang.Integer)
	 */
	@Override
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Empleados#getEstado()
	 */
	@Override
	public Boolean getEstado() {
		return estado;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Empleados#setEstado(java.lang.Boolean)
	 */
	@Override
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	

}

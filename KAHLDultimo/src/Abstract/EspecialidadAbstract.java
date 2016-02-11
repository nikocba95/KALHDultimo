package org.esc.model.Abstract;

import org.esc.model.Interface.Especialidad;

public abstract class EspecialidadAbstract implements Especialidad {
	
	private Integer codEspecialidad = null;
	private String especialidad = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Especialidad#getCodEspecialidad()
	 */
	@Override
	public Integer getCodEspecialidad() {
		return codEspecialidad;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Especialidad#setCodEspecialidad(java.lang.Integer)
	 */
	@Override
	public void setCodEspecialidad(Integer codEspecialidad) {
		this.codEspecialidad = codEspecialidad;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Especialidad#getEspecialidad()
	 */
	@Override
	public String getEspecialidad() {
		return especialidad;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Especialidad#setEspecialidad(java.lang.String)
	 */
	@Override
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	

}

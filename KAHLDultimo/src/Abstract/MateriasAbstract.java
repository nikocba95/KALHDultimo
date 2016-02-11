package org.esc.model.Abstract;

import org.esc.model.Interface.Materias;

public abstract class MateriasAbstract implements Materias {
	
	private Integer codMateria = null;
	private String materia = null;
	private Boolean materiaOptativa = false;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Materias#getCodMateria()
	 */
	@Override
	public Integer getCodMateria() {
		return codMateria;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Materias#setCodMateria(java.lang.Integer)
	 */
	@Override
	public void setCodMateria(Integer codMateria) {
		this.codMateria = codMateria;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Materias#getMateria()
	 */
	@Override
	public String getMateria() {
		return materia;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Materias#setMateria(java.lang.String)
	 */
	@Override
	public void setMateria(String materia) {
		this.materia = materia;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Materias#getMateriaOptativa()
	 */
	@Override
	public Boolean getMateriaOptativa() {
		return materiaOptativa;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Materias#setMateriaOptativa(java.lang.Boolean)
	 */
	@Override
	public void setMateriaOptativa(Boolean materiaOptativa) {
		this.materiaOptativa = materiaOptativa;
	}
	
	

}

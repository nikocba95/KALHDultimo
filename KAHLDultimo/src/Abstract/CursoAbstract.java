package org.esc.model.Abstract;

import org.esc.model.Interface.Curso;

public abstract class CursoAbstract implements Curso {
	
	private Integer codCurso = null;
	private Integer anio = null;
	private String division = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Curso#getCodCurso()
	 */
	@Override
	public Integer getCodCurso() {
		return codCurso;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Curso#setCodCurso(java.lang.Integer)
	 */
	@Override
	public void setCodCurso(Integer codCurso) {
		this.codCurso = codCurso;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Curso#getAnio()
	 */
	@Override
	public Integer getAnio() {
		return anio;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Curso#setAnio(java.lang.Integer)
	 */
	@Override
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Curso#getDivision()
	 */
	@Override
	public String getDivision() {
		return division;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Curso#setDivision(java.lang.String)
	 */
	@Override
	public void setDivision(String division) {
		this.division = division;
	}
	
	

}

package org.esc.model.Abstract;

import org.esc.model.Interface.Docentes;

public abstract class DocentesAbstract extends EmpleadosAbstract implements Docentes{
	
	private String titulo = null;

	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Docentes#getTitulo()
	 */
	@Override
	public String getTitulo() {
		return titulo;
	}

	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Docentes#setTitulo(java.lang.String)
	 */
	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

}

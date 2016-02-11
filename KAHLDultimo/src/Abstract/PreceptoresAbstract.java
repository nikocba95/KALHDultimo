package org.esc.model.Abstract;

import org.esc.model.Interface.Preceptores;

public abstract class PreceptoresAbstract extends EmpleadosAbstract implements Preceptores{
	
	private String turno = null;

	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Preceptores#getTurno()
	 */
	@Override
	public String getTurno() {
		return turno;
	}

	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Preceptores#setTurno(java.lang.String)
	 */
	@Override
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	
	

}

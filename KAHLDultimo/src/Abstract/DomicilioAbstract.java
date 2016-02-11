package org.esc.model.Abstract;

import org.esc.model.Interface.Domicilio;

public abstract class DomicilioAbstract implements Domicilio {
	
	private Integer codDomicilio = null;
	private String barrio = null;
	private String calle = null;
	private Integer numero = null;
	private Integer piso = null;
	private String dpto = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#getCodDomicilio()
	 */
	@Override
	public Integer getCodDomicilio() {
		return codDomicilio;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#setCodDomicilio(java.lang.Integer)
	 */
	@Override
	public void setCodDomicilio(Integer codDomicilio) {
		this.codDomicilio = codDomicilio;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#getBarrio()
	 */
	@Override
	public String getBarrio() {
		return barrio;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#setBarrio(java.lang.String)
	 */
	@Override
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#getCalle()
	 */
	@Override
	public String getCalle() {
		return calle;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#setCalle(java.lang.String)
	 */
	@Override
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#getNumero()
	 */
	@Override
	public Integer getNumero() {
		return numero;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#setNumero(java.lang.Integer)
	 */
	@Override
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#getPiso()
	 */
	@Override
	public Integer getPiso() {
		return piso;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#setPiso(java.lang.Integer)
	 */
	@Override
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#getDpto()
	 */
	@Override
	public String getDpto() {
		return dpto;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Domicilio#setDpto(java.lang.String)
	 */
	@Override
	public void setDpto(String dpto) {
		this.dpto = dpto;
	}
	
	

}

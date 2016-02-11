package org.esc.model.Abstract;

import org.esc.model.Interface.Nacionalidad;

public abstract class NacionalidadAbstract implements Nacionalidad {
	
	private Integer codPais  = null;
	private String pais = null;
	private String nacionalidad = null;
	private Integer codProvincia  = null;
	private String provincia = null;
	private Integer codLocalidad  = null ;
	private String localidad = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#getCodPais()
	 */
	@Override
	public Integer getCodPais() {
		return codPais;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#setCodPais(java.lang.Integer)
	 */
	@Override
	public void setCodPais(Integer codPais) {
		this.codPais = codPais;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#getPais()
	 */
	@Override
	public String getPais() {
		return pais;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#setPais(java.lang.String)
	 */
	@Override
	public void setPais(String pais) {
		this.pais = pais;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#getNacionalidad()
	 */
	@Override
	public String getNacionalidad() {
		return nacionalidad;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#setNacionalidad(java.lang.String)
	 */
	@Override
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#getCodProvincia()
	 */
	@Override
	public Integer getCodProvincia() {
		return codProvincia;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#setCodProvincia(java.lang.Integer)
	 */
	@Override
	public void setCodProvincia(Integer codProvincia) {
		this.codProvincia = codProvincia;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#getProvincia()
	 */
	@Override
	public String getProvincia() {
		return provincia;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#setProvincia(java.lang.String)
	 */
	@Override
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#getCodLocalidad()
	 */
	@Override
	public Integer getCodLocalidad() {
		return codLocalidad;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#setCodLocalidad(java.lang.Integer)
	 */
	@Override
	public void setCodLocalidad(Integer codLocalidad) {
		this.codLocalidad = codLocalidad;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#getLocalidad()
	 */
	@Override
	public String getLocalidad() {
		return localidad;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Nacionalidad#setLocalidad(java.lang.String)
	 */
	@Override
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	

}

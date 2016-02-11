package org.esc.model.Abstract;

import org.esc.model.Interface.usuarios;

public abstract class  usuariosAbstract implements usuarios {

	private String user;
	private String password;
	private String tipoUser;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.usuarios#getUser()
	 */
	@Override
	public String getUser() {
		return user;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.usuarios#setUser(java.lang.String)
	 */
	@Override
	public void setUser(String user) {
		this.user = user;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.usuarios#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.usuarios#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipoUser() {
		return tipoUser;
	}
	public void setTipoUser(String tipoUser) {
		this.tipoUser = tipoUser;
	}
	
	
	
}

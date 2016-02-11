package org.esc.model.Abstract;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.Date;

import org.esc.model.Interface.Person;

public abstract class PersonAbstract implements Person {
	
	protected Integer dni  = null;
	protected Integer cuil = null;
	protected String nombre = null;
	protected String apellido = null;
	protected String sexo = null;
	protected LocalDate fechaNacimiento = null;
	protected Integer telefono = null;
	protected String correo = null;
	protected FileInputStream foto = null;
	
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getDni()
	 */
	@Override
	public Integer getDni() {
		return dni;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setDni(java.lang.Integer)
	 */
	@Override
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getCuil()
	 */
	@Override
	public Integer getCuil() {
		return cuil;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setCuil(java.lang.Integer)
	 */
	@Override
	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getNombre()
	 */
	@Override
	public String getNombre() {
		return nombre;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setNombre(java.lang.String)
	 */
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getApellido()
	 */
	@Override
	public String getApellido() {
		return apellido;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setApellido(java.lang.String)
	 */
	@Override
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getSexo()
	 */
	@Override
	public String getSexo() {
		return sexo;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setSexo(java.lang.Boolean)
	 */
	@Override
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getFechaNacimiento()
	 */
	@Override
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setFechaNacimiento(java.util.Date)
	 */
	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getTelefono()
	 */
	@Override
	public Integer getTelefono() {
		return telefono;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setTelefono(java.lang.Integer)
	 */
	@Override
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getCorreo()
	 */
	@Override
	public String getCorreo() {
		return correo;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setCorreo(java.lang.String)
	 */
	@Override
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#getFoto()
	 */
	@Override
	public FileInputStream getFoto() {
		return foto;
	}
	/* (non-Javadoc)
	 * @see org.esc.model.Abstract.Person#setFoto(java.io.FileInputStream)
	 */
	@Override
	public void setFoto(FileInputStream foto) {
		this.foto = foto;
	}

	
	

}

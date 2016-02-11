package org.esc.model.Interface;


import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.Date;

public interface Person {

	Integer getDni();

	void setDni(Integer dni);

	Integer getCuil();

	void setCuil(Integer cuil);

	String getNombre();

	void setNombre(String nombre);

	String getApellido();

	void setApellido(String apellido);

	String getSexo();

	void setSexo(String sexo);

	LocalDate getFechaNacimiento();

	void setFechaNacimiento(LocalDate fechaNacimiento);

	Integer getTelefono();

	void setTelefono(Integer telefono);

	String getCorreo();

	void setCorreo(String correo);

	FileInputStream getFoto();

	void setFoto(FileInputStream foto);

}
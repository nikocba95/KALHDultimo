package org.esc.model.Interface;

import java.time.LocalDate;

public interface Inscripcion {

	Integer getCicloLectivo();

	void setCicloLectivo(Integer cicloLectivo);

	LocalDate getFechaInscripcion();

	void setFechaInscripcion(LocalDate fechaInscripcion);

	boolean isIngresoDirecto();

	void setIngresoDirecto(boolean ingresoDirecto);

	boolean isIngresoConPase();

	void setIngresoConPase(boolean ingresoConPase);

	Integer getCodCurso();

	void setCodCurso(Integer codCurso);

	Integer getDni();

	void setDni(Integer dni);

}
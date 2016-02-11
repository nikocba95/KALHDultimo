package org.esc.BO.SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Domicilio;
import org.esc.model.Interface.Nacionalidad;

public class AlumnoSQL {

	connectionSQL cc = new connectionSQL();
	
	public void nuevoAlumno(Alumnos al,Domicilio d,Nacionalidad n){
		
		//Ingreso datos del Pais;
		cc.conectar();
		cc.ejecutar("INSERT INTO paises (codPais,pais,nacionalidad) VALUES (null,'"+n.getPais()+"','"+n.getNacionalidad()+"')");
		obtieneCodPais(n);
			//Ingreso datos de la provincia
		cc.ejecutar("INSERT INTO provincias (codProvincia,codPais,provincia) VALUES ("+n.getCodProvincia()+","+n.getCodPais()+",'"+n.getProvincia()+"')");
		obtieneCodProvincia(n);
		//Ingreso datos de la localidad
		cc.ejecutar("INSERT INTO localidades (codLocalidad,codProvincia,localidad) VALUES ("+n.getCodLocalidad()+","+n.getCodProvincia()+",'"+n.getLocalidad()+"')");
		obtieneCodLocalidad(n);
		//Ingreso datos  del domicilio;
		cc.ejecutar("INSERT INTO domicilios (codDomicilio,codLocalidad,codProvincia,Barrio,calle,numero,piso,dpto) "
				+ "VALUES ("+d.getCodDomicilio()+","+n.getCodLocalidad()+","+n.getCodProvincia()+",'"+d.getBarrio()+"','"+d.getCalle()+"',"+d.getNumero()+","+d.getPiso()+",'"+d.getDpto()+"')");
		obtieneCodDomicilio(d);
		//Ingreso personas
		cc.ejecutar("INSERT INTO personas (DNI,nombre,apellido,sexo,fechaNac,codProvinciaNac,codDomicilio,telefono,correo,foto,cuil) "
				+ "VALUES ("+al.getDni()+",'"+al.getNombre()+"','"+al.getApellido()+"','"+al.getSexo()+"','"+al.getFechaNacimiento()+"',"
						+ ""+n.getCodProvincia()+","+d.getCodDomicilio()+","+al.getTelefono()+",'"+al.getCorreo()+"',"+al.getFoto()+","+al.getCuil()+")");
			
		//Ingreso Nacionalidad
		cc.ejecutar("INSERT INTO nacionalidad (codPais,DNI) VALUES ("+n.getCodPais()+","+al.getDni()+")");

			
		//Ingreso Alumno
		cc.ejecutar("INSERT INTO alumnos (DNI,DNITutor,legajoTutor,codCurso,matricula,establecimientoAnterior,estado,constanciaSexto,FechaEmision,nombreMadre,apellidoMadre,nombrePadre,apellidoPadre,observacion) "
				+ "VALUES ("+al.getDni()+",null,null,null,"+al.getMatricula()+",'"+al.getEstablecimientoAnterior()+"',"+al.getEstado()+",'"+al.getConstanciaSexto()+"','"+al.getFechaEmision()+"','"+al.getNombreMadre()+"','"+al.getApellidoMadre()+"','"+al.getNombrePadre()+"','"+al.getApellidoPadre()+"','"+al.getObservacion()+"')");

	}
	
	public void obtieneCodPais(Nacionalidad n){
		
		cc.conectar();
		ResultSet rs = cc.consultar("SELECT MAX(codPais) from paises");
		try {
			while(rs.next()){
				n.setCodPais(rs.getInt("MAX(codPais)"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void obtieneCodProvincia(Nacionalidad n){
		
		cc.conectar();
		ResultSet rs = cc.consultar("SELECT MAX(codProvincia) from provincias");
		try {
			while(rs.next()){
			n.setCodProvincia(rs.getInt("MAX(codProvincia)"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void obtieneCodLocalidad(Nacionalidad n){
		
		cc.conectar();
		ResultSet rs = cc.consultar("SELECT MAX(codLocalidad) from localidades");
		try {
			while(rs.next()){
			n.setCodLocalidad(rs.getInt("MAX(codLocalidad)"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void obtieneCodDomicilio(Domicilio d){
		
		cc.conectar();
		ResultSet rs = cc.consultar("SELECT MAX(codDomicilio) from domicilios");
		try {
			while(rs.next()){
			d.setCodDomicilio(rs.getInt("MAX(codDomicilio)"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

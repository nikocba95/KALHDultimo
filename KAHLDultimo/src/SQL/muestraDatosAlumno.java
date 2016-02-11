package SQL;

import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.esc.GUI.nuevoAlumno;
import org.esc.model.Factory.AlumnosFactory;
import org.esc.model.Factory.DomiciliosFactory;
import org.esc.model.Factory.NacionalidadFactory;
import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Domicilio;
import org.esc.model.Interface.Nacionalidad;

public class muestraDatosAlumno {
	
	
	private String sentenciaBuscar = ("SELECT a.DNI,nombre,apellido,sexo,fechaNac,telefono,correo,foto,cuil,matricula,establecimientoAnterior,"
			+" estado,constanciaSexto,fechaEmision,nombreMadre,nombrePadre,apellidoMadre,apellidoPadre,observacion,"
			+" Barrio,calle,numero,piso,dpto,localidad,pais,nacionalidad,provincia"
			+" FROM paises pai,provincias pro, localidades l ,domicilios d,personas p,nacionalidad n,alumnos a"
			+" WHERE pai.codPais = pro.codPais"
			+	" AND pro.codProvincia = l.codProvincia"
			+	" AND l.codLocalidad = d.codLocalidad"
			+	" AND d.codDomicilio = p.codDomicilio"
			+	" AND p.DNI = n.DNI"
			+	" AND n.DNI = a.DNI");
	
	MySQLBD sql = new MySQLBD();
	
	
	public muestraDatosAlumno(int indiceDNI){
		
		sql.conectar();
		Alumnos al = AlumnosFactory.buildAlumnos();
		Domicilio d = DomiciliosFactory.buildDomicilio();
		Nacionalidad n = NacionalidadFactory.buildNacionalidad();
		ResultSet consulta = sql.consultar(sentenciaBuscar);
		
		try {
			while(consulta.next()){
				if(consulta.getInt("DNI") == indiceDNI){
					al.setDni(consulta.getInt("DNI"));
					al.setApellido(consulta.getString("apellido"));
					al.setNombre(consulta.getString("nombre"));
					al.setSexo(consulta.getString("sexo"));
					al.setFechaNacimiento(consulta.getDate("fechaNac").toLocalDate());
					al.setTelefono(consulta.getInt("telefono"));
					al.setCorreo(consulta.getString("correo"));
					al.setCuil(consulta.getInt("cuil"));
					al.setMatricula(consulta.getInt("matricula"));
					al.setEstablecimientoAnterior(consulta.getString("establecimientoAnterior"));
					if(consulta.getBoolean("estado"))
						al.setEstado(true);
					al.setConstanciaSexto(consulta.getString("constanciaSexto"));
					al.setFechaEmision(consulta.getDate("fechaEmision").toLocalDate());
					al.setNombreMadre(consulta.getString("nombreMadre"));
					al.setNombrePadre(consulta.getString("nombrePadre"));
					al.setApellidoMadre(consulta.getString("apellidoMadre"));
					al.setApellidoPadre(consulta.getString("apellidoPadre"));
					al.setObservacion(consulta.getString("observacion"));
					d.setBarrio(consulta.getString("Barrio"));
					d.setCalle(consulta.getString("calle"));
					d.setNumero(consulta.getInt("numero"));
					d.setPiso(consulta.getInt("piso"));
					d.setDpto(consulta.getString("dpto"));
					n.setLocalidad(consulta.getString("localidad"));
					n.setPais(consulta.getString("pais"));
					n.setNacionalidad(consulta.getString("nacionalidad"));
					n.setProvincia(consulta.getString("provincia"));
					
					nuevoAlumno na = new nuevoAlumno();
					na.datosAlumno(al, d, n);
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

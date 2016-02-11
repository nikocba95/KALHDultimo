package SQL;

import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.esc.GUI.nuevoAlumno;
import org.esc.GUI.nuevoPersonal;
import org.esc.model.Factory.AlumnosFactory;
import org.esc.model.Factory.DomiciliosFactory;
import org.esc.model.Factory.NacionalidadFactory;
import org.esc.model.Implementacion.DocentesImpl;
import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Docentes;
import org.esc.model.Interface.Domicilio;
import org.esc.model.Interface.Nacionalidad;

public class muestraDatosDocente {
	
	
	private String sentenciaBuscar = ("SELECT doc.DNI,nombre,apellido,sexo,fechaNac,telefono,correo,foto,cuil,titulo,estado,"
			+" Barrio,calle,numero,piso,dpto,localidad,pais,nacionalidad,provincia,doc.legajo"
			+" FROM paises pai,provincias pro, localidades l ,domicilios d,personas p,nacionalidad n,empleados emp,docentes doc"
			+" WHERE pai.codPais = pro.codPais"
			+" AND pro.codProvincia = l.codProvincia"
			+" AND l.codLocalidad = d.codLocalidad"
			+" AND d.codDomicilio = p.codDomicilio"
			+" AND p.DNI = n.DNI"
			+" AND n.DNI = emp.DNI"
			+" AND emp.legajo = doc.legajo");
	
	MySQLBD sql = new MySQLBD();
	
	
	public muestraDatosDocente(int indiceDNI){
		
		sql.conectar();
		Docentes al = new DocentesImpl();
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
					if(consulta.getBoolean("estado"))
						al.setEstado(true);
					d.setBarrio(consulta.getString("Barrio"));
					d.setCalle(consulta.getString("calle"));
					d.setNumero(consulta.getInt("numero"));
					d.setPiso(consulta.getInt("piso"));
					d.setDpto(consulta.getString("dpto"));
					n.setLocalidad(consulta.getString("localidad"));
					n.setPais(consulta.getString("pais"));
					n.setNacionalidad(consulta.getString("nacionalidad"));
					n.setProvincia(consulta.getString("provincia"));
					al.setTitulo(consulta.getString("titulo"));
					al.setLegajo(Integer.parseInt(consulta.getString("legajo")));
					
					nuevoPersonal np = new nuevoPersonal();
					np.Docente();
					np.datosDocente(al, d, n);
					
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

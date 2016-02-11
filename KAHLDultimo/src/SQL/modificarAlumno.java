package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Domicilio;
import org.esc.model.Interface.Nacionalidad;

public class modificarAlumno {


	MySQLBD cc = new MySQLBD();

	public modificarAlumno(Alumnos al,Domicilio d,Nacionalidad n){
		
		cc.conectar();
		
		buscaCodPais(n);
		buscaCodProvincia(n);
		buscaCodLocalidad(n);
		buscaCodBario(d);
		
		//Ingreso datos del Pais;
		if(cc.ejecutar("UPDATE paises SET  pais = '"+n.getPais()+"',nacionalidad = '"+n.getNacionalidad()+"' WHERE codPais = "+n.getCodPais()+""))
			JOptionPane.showMessageDialog(null, "Si se pudo introducir Paises");
		else
			JOptionPane.showMessageDialog(null, "No se pudo introducir Paises");
			
		//Ingreso datos de la provincia
		if(cc.ejecutar("UPDATE provincias SET codPais = "+n.getCodPais()+",provincia = '"+n.getProvincia()+"' WHERE codProvincia = "+n.getCodProvincia()+""))
			JOptionPane.showMessageDialog(null, "Si se pudo introducir provincias");
		else
			JOptionPane.showMessageDialog(null, "No se pudo introducir provincias");
			
		//Ingreso datos de la localidad
		if(cc.ejecutar("UPDATE localidades SET codProvincia = "+n.getCodProvincia()+",localidad = '"+n.getLocalidad()+"' WHERE codLocalidad = "+n.getCodLocalidad()+""))
			JOptionPane.showMessageDialog(null, "localidad guardado");
		else
			JOptionPane.showMessageDialog(null, "Localidad no guardada");
			
		//Ingreso datos  del domicilio;
		if(cc.ejecutar("UPDATE domicilios"
				+ " SET codLocalidad = "+n.getCodLocalidad()+",codProvincia = "+n.getCodProvincia()+",Barrio = '"+d.getBarrio()+"',calle = '"+d.getCalle()+"',numero = "+d.getNumero()+",piso = "+d.getPiso()+",dpto = '"+d.getDpto()+"'"
				+ " WHERE codDomicilio = "+d.getCodDomicilio()))
			JOptionPane.showMessageDialog(null, "Domicilio  guardado");
		else
			JOptionPane.showMessageDialog(null, "Domicilio  no guardado");
			
		//Ingreso personas
		JOptionPane.showMessageDialog(null, al.getDni()+","+al.getNombre()+","+al.getSexo()+","+al.getFechaNacimiento()+","+n.getCodProvincia()+","+d.getCodDomicilio()+","+al.getTelefono()+","+al.getCuil()+","+al.getFoto());
		if(cc.ejecutar("UPDATE personas"
				+ " SET nombre = '"+al.getNombre()+"',apellido = '"+al.getApellido()+"',sexo = '"+al.getSexo()+"',fechaNac = '"+al.getFechaNacimiento()+"',"
				+ " codProvinciaNac = "+n.getCodProvincia()+",codDomicilio = "+d.getCodDomicilio()+",telefono = "+al.getTelefono()+",correo = '"+al.getCorreo()+"',cuil = "+al.getCuil()+""
				+ " WHERE DNI = "+al.getDni()))
			JOptionPane.showMessageDialog(null, "Persona guardada");
		else
			JOptionPane.showMessageDialog(null, "Persona  no guardado");
			
		//Ingreso Alumno
		if(cc.ejecutar("UPDATE alumnos"
				+ " SET  matricula = "+al.getMatricula()+",establecimientoAnterior = '"+al.getEstablecimientoAnterior()+"',estado = "+al.getEstado()+",constanciaSexto = '"+al.getConstanciaSexto()+"',fechaEmision = '"+al.getFechaEmision()+"',nombreMadre = '"+al.getNombreMadre()+"',apellidoMadre = '"+al.getApellidoMadre()+"',nombrePadre = '"+al.getNombrePadre()+"',apellidoPadre = '"+al.getApellidoPadre()+"',observacion = '"+al.getObservacion()+"'"
				+ " WHERE DNI = "+al.getDni()))
			JOptionPane.showMessageDialog(null, "Alumno guardado");
		else
			JOptionPane.showMessageDialog(null, "Alumno  no guardado");
			
	}
	
	public void buscaCodPais(Nacionalidad n){
		
		cc.conectar();
		ResultSet rs = cc.consultar("SELECT codPais FROM paises"
				+" WHERE pais = '"+n.getPais()+"' AND nacionalidad = '"+n.getNacionalidad()+"'");
		try {
			while(rs.next())
			{
				n.setCodPais(rs.getInt("codPais"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void buscaCodProvincia(Nacionalidad n){
		
		cc.conectar();
		ResultSet rs = cc.consultar("SELECT codProvincia,codPais,provincia FROM provincias");
		try {
			while(rs.next())
			{
				if(n.getCodPais().equals(rs.getInt("codPais")) && n.getProvincia().equals(rs.getString("provincia"))){
					n.setCodProvincia(rs.getInt("codProvincia"));
				}
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void buscaCodLocalidad(Nacionalidad n){
		
		cc.conectar();
		ResultSet rs = cc.consultar("SELECT codLocalidad,codProvincia,localidad FROM localidades");
		try {
			while(rs.next())
			{
				if(n.getCodProvincia().equals(rs.getInt("codProvincia")) && n.getLocalidad().equals(rs.getString("localidad"))){
					n.setCodLocalidad(rs.getInt("codLocalidad"));
				}
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void buscaCodBario(Domicilio d){
		
		cc.conectar();
		ResultSet rs = cc.consultar("SELECT codDomicilio,Barrio,calle,numero FROM domicilios");
		try {
			while(rs.next())
			{
				if(d.getBarrio().equals(rs.getString("Barrio")) && d.getCalle().equals(rs.getString("calle"))
						&& d.getNumero().equals(rs.getInt("numero"))){
					d.setCodDomicilio(rs.getInt("codDomicilio"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

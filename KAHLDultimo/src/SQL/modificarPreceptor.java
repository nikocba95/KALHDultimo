package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Docentes;
import org.esc.model.Interface.Domicilio;
import org.esc.model.Interface.Nacionalidad;
import org.esc.model.Interface.Preceptores;

public class modificarPreceptor {


	MySQLBD cc = new MySQLBD();

	public modificarPreceptor(Preceptores doc,Domicilio d,Nacionalidad n){
		
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
		JOptionPane.showMessageDialog(null, doc.getDni()+","+doc.getNombre()+","+doc.getSexo()+","+doc.getFechaNacimiento()+","+n.getCodProvincia()+","+d.getCodDomicilio()+","+doc.getTelefono()+","+doc.getCuil()+","+doc.getFoto());
		if(cc.ejecutar("UPDATE personas"
				+ " SET nombre = '"+doc.getNombre()+"',apellido = '"+doc.getApellido()+"',sexo = '"+doc.getSexo()+"',fechaNac = '"+doc.getFechaNacimiento()+"',"
				+ " codProvinciaNac = "+n.getCodProvincia()+",codDomicilio = "+d.getCodDomicilio()+",telefono = "+doc.getTelefono()+",correo = '"+doc.getCorreo()+"',cuil = "+doc.getCuil()+""
				+ " WHERE DNI = "+doc.getDni()))
			JOptionPane.showMessageDialog(null, "Persona guardada");
		else
			JOptionPane.showMessageDialog(null, "Persona  no guardado");
			
		//ingreso EMpleados
		cc.ejecutar("UPDATE empleados SET legajo = '"+doc.getLegajo()+"',estado = "+doc.getEstado()+""
				+ " WHERE DNI = "+doc.getDni()+"");
		
		//Ingreso Preceptor
		cc.ejecutar("UPDATE preceptores SET turno = '"+doc.getTurno()+"' WHERE DNI = "+doc.getDni()+"");
			
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

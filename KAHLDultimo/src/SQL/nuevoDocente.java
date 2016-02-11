package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.esc.model.Interface.Docentes;
import org.esc.model.Interface.Domicilio;
import org.esc.model.Interface.Nacionalidad;

import com.mysql.jdbc.PreparedStatement;

public class nuevoDocente {
	
	
	MySQLBD cc = new MySQLBD();
	
	public nuevoDocente(Docentes doc,Nacionalidad n ,Domicilio d){
		
				//Ingreso datos del Pais;
				cc.conectar();
				System.out.println(n.getCodPais());
				if(cc.ejecutar("INSERT INTO paises (codPais,pais,nacionalidad) VALUES ("+n.getCodPais()+",'"+n.getPais()+"','"+n.getNacionalidad()+"')"))
					JOptionPane.showMessageDialog(null, "Si se pudo introducir Paises");
				else
					JOptionPane.showMessageDialog(null, "No se pudo introducir Paises");
					
				obtieneCodPais(n);
				//Ingreso datos de la provincia
				if(cc.ejecutar("INSERT INTO provincias (codProvincia,codPais,provincia) VALUES ("+n.getCodProvincia()+","+n.getCodPais()+",'"+n.getProvincia()+"')"))
					JOptionPane.showMessageDialog(null, "Si se pudo introducir provincias");
				else
					JOptionPane.showMessageDialog(null, "No se pudo introducir provincias");
					
				obtieneCodProvincia(n);
				//Ingreso datos de la localidad
				if(cc.ejecutar("INSERT INTO localidades (codLocalidad,codProvincia,localidad) VALUES ("+n.getCodLocalidad()+","+n.getCodProvincia()+",'"+n.getLocalidad()+"')"))
					JOptionPane.showMessageDialog(null, "localidad guardado");
				else
					JOptionPane.showMessageDialog(null, "Localidad no guardada");
					
				obtieneCodLocalidad(n);
				//Ingreso datos  del domicilio;
				if(cc.ejecutar("INSERT INTO domicilios (codDomicilio,codLocalidad,codProvincia,Barrio,calle,numero,piso,dpto) "
						+ "VALUES ("+d.getCodDomicilio()+","+n.getCodLocalidad()+","+n.getCodProvincia()+",'"+d.getBarrio()+"','"+d.getCalle()+"',"+d.getNumero()+","+d.getPiso()+",'"+d.getDpto()+"')"))
					JOptionPane.showMessageDialog(null, "Domicilio  guardado");
				else
					JOptionPane.showMessageDialog(null, "Domicilio  no guardado");
					
				obtieneCodDomicilio(d);
				//Ingreso personas
				JOptionPane.showMessageDialog(null, doc.getDni()+","+doc.getNombre()+","+doc.getSexo()+","+doc.getFechaNacimiento()+","+n.getCodProvincia()+","+d.getCodDomicilio()+","+doc.getTelefono()+","+doc.getCuil()+","+doc.getFoto());
				if(cc.ejecutar("INSERT INTO personas (DNI,nombre,apellido,sexo,fechaNac,codProvinciaNac,codDomicilio,telefono,correo,foto,cuil) "
						+ "VALUES ("+doc.getDni()+",'"+doc.getNombre()+"','"+doc.getApellido()+"','"+doc.getSexo()+"','"+doc.getFechaNacimiento()+"',"
								+ ""+n.getCodProvincia()+","+d.getCodDomicilio()+","+doc.getTelefono()+",'"+doc.getCorreo()+"',null,"+doc.getCuil()+")"))
					JOptionPane.showMessageDialog(null, "Persona guardada");
				else
					JOptionPane.showMessageDialog(null, "Persona  no guardado");
					
				//Ingreso Nacionalidad
				if(cc.ejecutar("INSERT INTO nacionalidad (codPais,DNI) VALUES ("+n.getCodPais()+","+doc.getDni()+")"))
					JOptionPane.showMessageDialog(null, "Nacionalidad guardada");
				else
					JOptionPane.showMessageDialog(null, "Nacionalidad  no guardado");
				
				//INGRESO EMPLEADOS
				cc.ejecutar("INSERT INTO empleados (DNI,legajo,estado) VALUES ("+doc.getDni()+","+doc.getLegajo()+","+doc.getEstado()+")");
				
				//INGERSO DOCENTE
				cc.ejecutar("INSERT INTO docentes (DNI,legajo,titulo) VALUES ("+doc.getDni()+",'"+doc.getLegajo()+"','"+doc.getTitulo()+"')");
		
		
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

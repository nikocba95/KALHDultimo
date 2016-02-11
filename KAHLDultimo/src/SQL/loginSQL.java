package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.esc.model.Implementacion.usuariosImpl;
import org.esc.model.Interface.usuarios;

public class loginSQL {
	
	usuariosBD sql = new usuariosBD();

	
	public loginSQL(usuarios user){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT userType FROM usuarios WHERE user = '"+user.getUser()+"' AND pass = '"+user.getPassword()+"'");
		
		try {
			if(rs.getRow() == 0)
				user.setTipoUser("no");
			while(rs.next()){
						user.setTipoUser(rs.getString("userType"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

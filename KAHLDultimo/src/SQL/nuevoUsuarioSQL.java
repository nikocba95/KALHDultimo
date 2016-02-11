package SQL;

import org.esc.model.Interface.usuarios;

public class nuevoUsuarioSQL {

	
	usuariosBD sql  = new usuariosBD();
	
	public nuevoUsuarioSQL(usuarios user){
		
		sql.conectar();
		sql.ejecutar("INSERT INTO usuarios (user,pass,userType) VALUES ('"+user.getUser()+"','"+user.getPassword()+"','"+user.getTipoUser()+"')");
	}
}

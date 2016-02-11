package SQL;

import java.sql.*;;

public class MySQLBD {
	
	private Connection conexion;

	public Connection getConexion() {
	    return conexion;
	}    
	public void setConexion(Connection conexion) {
	        this.conexion = conexion;
	}    
	
	public MySQLBD conectar(){
		
		try{
			
			  Class.forName("com.mysql.jdbc.Driver");
			  String BaseDeDatos = "jdbc:mysql://localhost/secundariabd?user=root&password=root";
			  setConexion(DriverManager.getConnection(BaseDeDatos));
	            if(getConexion() != null){
	                System.out.println("Conexion Exitosa!");
	            }else{
	                System.out.println("Conexion Fallida!");                
	            }
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	
	public boolean ejecutar(String sql) {
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            sentencia.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }        return true;
    }
	
	public ResultSet consultar(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }        return resultado;
    }
	
	

}

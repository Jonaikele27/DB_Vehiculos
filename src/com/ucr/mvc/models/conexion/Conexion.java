package com.ucr.mvc.models.conexion;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Conexion {

	private String host, user, pass, db, url;

	public Conexion() {
		host = "localhost";
		user = "root";
		pass = "";

		db = "db_vehiculos";
		url = "jdbc:mysql://" + host + "/" + db;
	}

	public Connection conectar() {

		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Connection");
			con = (Connection) DriverManager.getConnection(url, user, pass);
			//System.out.println("Se ha conectado con exito");
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error" + e.getMessage());
		}

		return con;

	}

	public void desconectar(Connection con) {
		
		try {
			con.close();
			//System.out.println("Se ha desconectado con exito");
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error" + e.getMessage());
		}

	}

}

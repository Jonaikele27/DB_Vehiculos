package com.ucr.mvc.models.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.ucr.mvc.models.VO.Propietario;
import com.ucr.mvc.models.conexion.Conexion;

public class DAOPropietario extends Conexion implements DAO {

	@Override
	public boolean store(Object o) {

		Connection con = conectar();
		String sql = "INSERT INTO propietarios (nombre, telefono, edad) VALUES (?, ?, ?);";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			Propietario item = (Propietario) o;

			ps.setString(1, item.getNombre());
			ps.setString(2, item.getTelefono());
			ps.setInt(3, item.getEdad());

			ps.execute();
			return true;

		} catch (Exception e) {
			return false;
		} finally {
			desconectar(con);
		}
	}

	@Override
	public boolean update(Object o, int id) {
		Connection con = conectar();
		String sql = "UPDATE propietarios SET nombre = ? ,  telefono = ? , edad = ? WHERE id_propietario = ? ;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			Propietario item = (Propietario) o;

			ps.setString(1, item.getNombre());
			ps.setString(2, item.getTelefono());
			ps.setInt(3, item.getEdad());
			ps.setInt(4, id);

			ps.execute();
			return true;

		} catch (Exception e) {
			return false;
		} finally {
			desconectar(con);
		}
	}

	@Override
	public boolean destroy(int id) {
		Connection con = conectar();
		String sql = "DELETE FROM propietarios WHERE id_propietario = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ps.execute();
			return true;

		} catch (Exception e) {
			return false;
		} finally {
			desconectar(con);
		}
	}

	@Override
	public Object getItem(int id) {

		Object item = null;

		Connection con = conectar();
		String sql = "SELECT * FROM propietarios WHERE id_propietario = ?;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				item = new Propietario(
						rs.getInt("id_propietario"),
						rs.getInt("edad"),
						rs.getString("nombre"),
						rs.getString("telefono"));

			}
			ps.execute();

		} catch (Exception e) {
			System.err.println("Ha ocurrido un error: " + e.getMessage());
		} finally {
			desconectar(con);
		}

		return item;
	}

	@Override
	public ArrayList<Object> getList() {
		ArrayList<Object> list = new ArrayList<Object>();

		Connection con = conectar();
		String sql = "SELECT * FROM propietarios;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Propietario p = new Propietario(
						rs.getInt("id_propietario"),
						rs.getInt("edad"),
						rs.getString("nombre"),
						rs.getString("telefono"));

				list.add(p);

			}
			ps.execute();

		} catch (Exception e) {
			System.err.println("Ha ocurrido un error: " + e.getMessage());
		} finally {
			desconectar(con);
		}

		return list;
	}

}

package com.ucr.mvc.models.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.ucr.mvc.models.VO.Propietario;
import com.ucr.mvc.models.VO.Vehiculo;
import com.ucr.mvc.models.conexion.Conexion;

public class DAOVehiculos extends Conexion implements DAO {

	@Override
	public boolean store(Object o) {

		Connection con = conectar();
		String sql = "INSERT INTO vehiculos (`placa`, `id_propietario`) VALUES (?, ?);";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			Vehiculo item = (Vehiculo) o;

			ps.setString(1, item.getPlaca());
			ps.setInt(2, item.getIdPropietario());

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
		String sql = "UPDATE vehiculos` SET placa = ?, id_propietario = ? WHERE id_vehiculo = ?;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			Vehiculo item = (Vehiculo) o;

			ps.setString(1, item.getPlaca());
			ps.setInt(2, item.getIdPropietario());
			ps.setInt(3, id);

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
		String sql = "DELETE FROM Vehiculos WHERE id_vehiculo = ?";

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
		String sql = "SELECT * FROM Vehiculos WHERE id_vehiculo = ?;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				item = new Vehiculo(
						rs.getInt("id_vehiculo"),
						rs.getInt("id_propietario"),
						rs.getString("placa"));

			}
			ps.execute();

		} catch (Exception e) {
			System.err.println("Ha ocurrido un error: " + e.getMessage());
		} finally {
			desconectar(con);
		}

		return item;
	}
	
	public Object getItemNombre(int id) {

		Object item = null;

		Connection con = conectar();
		String sql = "SELECT * FROM Vehiculos WHERE id_vehiculo = ?;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				item = new Vehiculo(
						rs.getInt("id_vehiculo"),
						rs.getInt("id_propietario"),
						rs.getString("placa"));

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
		String sql = "SELECT * FROM Vehiculos;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Vehiculo v = new Vehiculo(
						rs.getInt("id_vehiculo"),
						rs.getInt("id_propietario"),
						rs.getString("placa"));
				
				Object prop = new DAOPropietario().getItem(rs.getInt("id_propietario"));
				v.setPropietario((Propietario) prop);

				list.add(v);

			}
			ps.execute();

		} catch (Exception e) {
			System.err.println("Ha ocurrido un error: " + e.getMessage());
		} finally {
			desconectar(con);
		}

		return list;
	}
	
	public ArrayList<Object> getListP() {
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

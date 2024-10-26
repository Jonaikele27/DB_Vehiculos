package com.ucr.mvc.controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.ucr.mvc.models.DAO.DAOVehiculos;
import com.ucr.mvc.models.VO.Propietario;
import com.ucr.mvc.models.VO.Vehiculo;
import com.ucr.mvc.views.ViewPrincipal;
import com.ucr.mvc.views.general.Index;
import com.ucr.mvc.views.vehiculos.Create;
import com.ucr.mvc.views.vehiculos.Edit;

public class ControllerVehiculos extends Funciones implements Controller {

	private DAOVehiculos dao;
	private ViewPrincipal vp;

	public ControllerVehiculos(ViewPrincipal vp) {

		dao = new DAOVehiculos();
		this.vp = vp;
	}

	@Override
	public void index() {
		Index v = new Index();
		vp.setContenido(v, "Vehiculos");
		v.modelo.setDataVector(getData(), getColumns());
		
		v.btnNuevo.addActionListener(e -> {

			create();

		});

		v.btnEditar.addActionListener(e -> {

			//int id = getSelectedID(v.table);
			
				int row = v.table.getSelectedRow();
				int id = (int) v.table.getValueAt(row, 0);
				edit(id);

		});

		v.btnEliminar.addActionListener(e -> {

			int row = v.table.getSelectedRow();
			int id = (int) v.table.getValueAt(row, 0);
			int seguro = JOptionPane.showConfirmDialog(null, "Seguro que desea relaizar esta operacion");
			if (seguro == 0) {
				destroy(id);
				JOptionPane.showInternalMessageDialog(null, "Se ha elinado con exito");
				index();
			} else {
				JOptionPane.showInternalMessageDialog(null, "Todos cometemos errores");
				index();
			}

		});

		v.txtBuscar.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				buscar(v.table, v.txtBuscar.getText(), 1, 2, 3, 4);

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void create() {
		Create v = new Create();
		
		vp.setContenido(v, "Nuevo");
	
		ArrayList<Object> propietarios = dao.getListP();
		
		for (Object o : propietarios) {
			Propietario p = (Propietario) o;
			v.comboBox.addItem(p);
		}
		
		v.btnCancelar.addActionListener(e -> {

			index();

		});

		v.btnRegistar.addActionListener(e -> {

			String placa = v.tPlaca.getText();
			Propietario p = (Propietario) v.comboBox.getSelectedItem();
			int idPropietario = p.getId();
			
			Vehiculo item = new Vehiculo(idPropietario, placa);
			store(item);

		});

	}

	@Override
	public void edit(int id) {

		Edit v = new Edit();
		vp.setContenido(v, "Editar");
		Vehiculo ve = (Vehiculo) dao.getItem(id);

		v.placa.setText(ve.getPlaca());
		
		ArrayList<Object> propietarios = dao.getListP();
		
		for (Object o : propietarios) {
			Propietario p = (Propietario) o;
			v.comboBox.addItem(p);
		}
		

		v.btnCancelar.addActionListener(e -> {

			index();

		});

		v.btnEditar.addActionListener(e -> {

			String placa = v.placa.getText();
			//int id_propietario = v.comboBox.
			//Vehiculo item = new Vehiculo(id, id_propietario, placa);
			//update(item, id);

		});

	}

	@Override
	public Object[][] getData() {
		ArrayList<Object> list = dao.getList();
		Object[][] data = new Object[list.size()][getColumns().length];
		int i = 0;
		for (Object o : list) {
			Vehiculo item = (Vehiculo) o;
			data[i][0] = item.getIdVehiculo();
			data[i][1] = item.getPlaca();
			data[i][2] = item.getPropietario().getNombre();
			i++;
		}
		return data;
	}

	@Override
	public String[] getColumns() {
		return new String[] { "ID", "Placa", "Propietario"};
	}

	@Override
	public void store(Object o) {
		Create c = new Create();
		if (dao.store(o)) {
			JOptionPane.showMessageDialog(null, "Se ha agregado correctamente");
			c.tPlaca.setText("");
			c.comboBox.addItem(null);
			index();
		} else {
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error :(");
		}

	}

	@Override
	public void update(Object o, int id) {
		if (validar(o)) {
			boolean result = dao.update(o, id);
			if (result) {
				index();
			} else {
				JOptionPane.showMessageDialog(null, "Ocurrió un error, intente nuevamente.");
			}
		}
	}

	@Override
	public void destroy(int id) {
		int result = JOptionPane.showConfirmDialog(null, "¿Desea eliminar e registro?");
		if (result == 0) {
			dao.destroy(id);
			index();
		}

	}
	public boolean validar(Object item) {

		Propietario p = (Propietario) item;

		boolean continuar = true;

		if (p.getNombre().isEmpty()) {
			continuar = false;
			JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
		}

		if (p.getTelefono().isEmpty()) {
			continuar = false;
			JOptionPane.showMessageDialog(null, "El teléfono es obligatorio");
		}

		return continuar;
	}
	
	

}

package com.ucr.mvc.views.general;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Index extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTable table;
	
	public JButton btnNuevo;
	public JButton btnEditar;
	public JButton btnEliminar;
	
	public DefaultTableModel modelo;
	private JPanel panel_1;
	private JLabel lblBuscar;
	public JTextField txtBuscar;

	/**
	 * Create the panel.
	 */
	public Index() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setPreferredSize(new Dimension(30, 40));
		add(panelBotones, BorderLayout.SOUTH);
		
		btnNuevo = new JButton("Nuevo");
		panelBotones.add(btnNuevo);
		
		btnEditar = new JButton("Editar");
		panelBotones.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		panelBotones.add(btnEliminar);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		modelo = new DefaultTableModel();
		table = new JTable(modelo);
		scrollPane.setViewportView(table);
		
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		
		lblBuscar = new JLabel("Buscar");
		panel_1.add(lblBuscar);
		
		txtBuscar = new JTextField();
		panel_1.add(txtBuscar);
		txtBuscar.setColumns(10);

	}

}

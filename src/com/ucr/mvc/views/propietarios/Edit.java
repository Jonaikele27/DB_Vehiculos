package com.ucr.mvc.views.propietarios;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;

public class Edit extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField tNombre;
	public JTextField tTelefono;
	public JButton btnCancelar;
	public JButton btnEditar;
	public JSpinner tEdad;

	/**
	 * Create the panel.
	 */
	public Edit() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		btnCancelar = new JButton("Atras");
		btnCancelar.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(btnCancelar);
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(btnEditar);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(13, 9, 83, 35);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Telefono");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(13, 68, 86, 25);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 127, 86, 35);
		panel_2.add(lblNewLabel_2);
		
		tEdad = new JSpinner();
		tEdad.setBounds(91, 127, 166, 35);
		panel_2.add(tEdad);
		
		tNombre = new JTextField();
		tNombre.setColumns(10);
		tNombre.setBounds(91, 12, 166, 35);
		panel_2.add(tNombre);
		
		tTelefono = new JTextField();
		tTelefono.setColumns(10);
		tTelefono.setBounds(94, 68, 163, 35);
		panel_2.add(tTelefono);

	}
}

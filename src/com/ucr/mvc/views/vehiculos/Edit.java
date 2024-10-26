package com.ucr.mvc.views.vehiculos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import com.ucr.mvc.models.VO.Propietario;

import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;

public class Edit extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField placa;
	public JButton btnCancelar;
	public JButton btnEditar;
	public JComboBox <Propietario> comboBox;

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
		
		JLabel lblNewLabel = new JLabel("Placa");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(13, 9, 83, 35);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Propietario");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 77, 100, 35);
		panel_2.add(lblNewLabel_2);
		
		placa = new JTextField();
		placa.setColumns(10);
		placa.setBounds(63, 12, 166, 35);
		panel_2.add(placa);
		
		comboBox = new JComboBox<Propietario>();
		AutoCompleteDecorator.decorate(comboBox);
		comboBox.setBounds(107, 80, 166, 35);
		panel_2.add(comboBox);

	}
}

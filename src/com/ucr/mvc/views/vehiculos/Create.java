package com.ucr.mvc.views.vehiculos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import com.toedter.calendar.JDateChooser;
import com.ucr.mvc.models.VO.Propietario;
import com.ucr.mvc.models.VO.Vehiculo;

import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;

public class Create extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField tPlaca;
	public JButton btnCancelar;
	public JButton btnRegistar;
	public JComboBox <Propietario> comboBox;

	/**
	 * Create the panel.
	 */
	public Create() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		btnCancelar = new JButton("Atras");
		btnCancelar.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(btnCancelar);
		
		btnRegistar = new JButton("Registar");
		btnRegistar.setFont(new Font("Verdana", Font.PLAIN, 16));
		panel_1.add(btnRegistar);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Placa");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(13, 9, 83, 35);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Propietario");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(13, 68, 125, 25);
		panel_2.add(lblNewLabel_1);
		
		tPlaca = new JTextField();
		tPlaca.setColumns(10);
		tPlaca.setBounds(91, 12, 166, 35);
		panel_2.add(tPlaca);
		
		comboBox = new JComboBox<Propietario>();
		AutoCompleteDecorator.decorate(comboBox);
		comboBox.setBounds(117, 66, 166, 35);
		panel_2.add(comboBox);

	}
}

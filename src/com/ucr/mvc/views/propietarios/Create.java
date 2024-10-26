package com.ucr.mvc.views.propietarios;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import com.toedter.calendar.JDateChooser;
import com.ucr.mvc.models.VO.Propietario;

import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;

public class Create extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField tNombre;
	public JTextField tTelefono;
	public JButton btnCancelar;
	public JButton btnRegistar;
	public JSpinner tEdad;
	public JComboBox <Propietario> comboBox;
	public JDateChooser textField;

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
		
		comboBox = new JComboBox<Propietario>();
		AutoCompleteDecorator.decorate(comboBox);
		comboBox.setBounds(45, 192, 166, 35);
		panel_2.add(comboBox);
		
		textField = new JDateChooser();
		textField.setBounds(221, 195, 136, 28);
		panel_2.add(textField);

	}
}

package com.ucr.mvc.views;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ViewPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnVehiculos;
	public JButton btnPropietarios;
	public JLabel lblNewLabel;
	public JPanel panelContenido;
	
	public ViewPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 473);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(95, 158, 160));
		panel.setPreferredSize(new Dimension(175, 10));
		contentPane.add(panel, BorderLayout.WEST);
		
		btnPropietarios = new JButton("PROPIETARIOS");
		btnPropietarios.setBounds(10, 141, 160, 53);
		btnPropietarios.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnPropietarios.setOpaque(false);
		btnPropietarios.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		btnVehiculos = new JButton("VEHICULOS");
		btnVehiculos.setBounds(10, 235, 160, 53);
		btnVehiculos.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnVehiculos.setOpaque(false);
		btnVehiculos.setFont(new Font("Verdana", Font.PLAIN, 18));
		panel.setLayout(null);
		panel.add(btnPropietarios);
		panel.add(btnVehiculos);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 128, 128));
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("Pagina");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 24));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		panel_2.add(lblNewLabel);
		
		panelContenido = new JPanel();
		panelContenido.setBorder(new EmptyBorder(20, 20, 20, 20));
		panelContenido.setBackground(new Color(255, 255, 255));
		panel_1.add(panelContenido, BorderLayout.CENTER);
		panelContenido.setLayout(new BorderLayout(0, 0));
	}
	
	public void init() {
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setTitle("Gestion de Vehiculos");
	}
	
	public void setContenido(JComponent j, String titulo) {
		
		lblNewLabel.setText(titulo);
		panelContenido.removeAll();
		panelContenido.add(j ,BorderLayout.CENTER);
		panelContenido.repaint();
		panelContenido.revalidate();
		
	}
}

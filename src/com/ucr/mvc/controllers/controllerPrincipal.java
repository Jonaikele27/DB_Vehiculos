package com.ucr.mvc.controllers;

import com.ucr.mvc.views.ViewPrincipal;

public class controllerPrincipal {

	private ViewPrincipal vp;
	private ControllerPropietarios cp;
	private ControllerVehiculos cv;
	
	public controllerPrincipal() {
		vp = new ViewPrincipal();
		cp = new ControllerPropietarios(vp);
		cv = new ControllerVehiculos(vp);
	}
	
	public void init() {
		
		vp.btnPropietarios.addActionListener(e->{
			cp.index();
			
			
		});
		
		vp.btnVehiculos.addActionListener(e->{
			
			cv.index();
			
		});
		
		
		vp.init();
	}
}

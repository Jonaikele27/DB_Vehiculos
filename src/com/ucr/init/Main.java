package com.ucr.init;
import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.ucr.mvc.controllers.controllerPrincipal;

public class Main {

	public static void main(String[] args) {
		//Propietario p = new Propietario(19, "Dayana", "12345-12345");
		//new ControllerPropietarios().store(p);;
		
		//new ControllerPropietarios().prueba(6);
		FlatArcOrangeIJTheme.install();
		
		new controllerPrincipal().init();

	}

}

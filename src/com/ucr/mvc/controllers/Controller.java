package com.ucr.mvc.controllers;

public interface Controller {

	// Views

	public void index();

	public void create();

	public void edit(int id);

	public Object[][] getData();

	public String[] getColumns();

	// Models

	public void store(Object o);

	public void update(Object o, int id);

	public void destroy(int id);

}

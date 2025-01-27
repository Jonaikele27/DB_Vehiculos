package com.ucr.mvc.models.DAO;

import java.util.ArrayList;

public interface DAO {

	public boolean store(Object o);

	public boolean update(Object o, int id);

	public boolean destroy(int id);

	public Object getItem(int id);

	public ArrayList<Object> getList();

}

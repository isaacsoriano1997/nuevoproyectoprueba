package com.unu.proyectoWEB.models;

import java.util.ArrayList;
import java.util.List;

import com.unu.isaac.proyectoWEB.beans.*;

public class autoresModels {
	public List<autor> listarAutores(){
		ArrayList<autor> autores = new ArrayList<>();
		autores.add(new autor(1,"Isaac Soriano","Peru"));
		autores.add(new autor(2,"Cesar Vallejo","Peru"));
		autores.add(new autor(3,"Ricardo Palma","Peru"));
		return autores;
	}

}

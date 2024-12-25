package com.mx.apirest.cinepolis.service;

import java.util.List;

import com.mx.apirest.cinepolis.model.Pelicula;

public interface PeliculaService {
	
	public List<Pelicula> listar();
	
	public void guardar(Pelicula pelicula);
	
	public Pelicula buscar(int idPelicula);
	
	public void editar(Pelicula pelicula);
	
	public void eliminar(Pelicula pelicula);
}

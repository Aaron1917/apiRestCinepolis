package com.mx.apirest.cinepolis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mx.apirest.cinepolis.dao.PeliculaDao;
import com.mx.apirest.cinepolis.model.Pelicula;

public class PeliculaServiceImp implements PeliculaService{

	@Autowired
	PeliculaDao peliculasDao;
	
	@Override
	public List<Pelicula> listar() {
		// TODO Auto-generated method stub
		return peliculasDao.findAll();
	}

	@Override
	public void guardar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		peliculasDao.save(pelicula);
	}

	@Override
	public Pelicula buscar(int idPelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

}

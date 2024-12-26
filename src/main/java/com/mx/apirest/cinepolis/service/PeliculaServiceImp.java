package com.mx.apirest.cinepolis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apirest.cinepolis.dao.PeliculaDao;
import com.mx.apirest.cinepolis.model.Pelicula;

@Service
public class PeliculaServiceImp implements PeliculaService {

	@Autowired
	PeliculaDao peliculasDao;

	@Transactional(readOnly = true)
	@Override
	public List<Pelicula> listar() {
		// TODO Auto-generated method stub
		return peliculasDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		peliculasDao.save(pelicula);
	}

	@Transactional(readOnly = true)
	@Override
	public Pelicula buscar(int idPelicula) {
		// TODO Auto-generated method stub
		return peliculasDao.findById(idPelicula).orElse(null);
	}

	@Transactional
	@Override
	public void editar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		peliculasDao.save(pelicula);
	}

	@Transactional
	@Override
	public void eliminar(int idPelicula) {
		// TODO Auto-generated method stub
		peliculasDao.deleteById(idPelicula);
	}

}

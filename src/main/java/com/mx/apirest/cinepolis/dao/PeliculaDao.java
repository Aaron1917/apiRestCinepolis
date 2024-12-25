package com.mx.apirest.cinepolis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.apirest.cinepolis.model.Pelicula;

public interface PeliculaDao extends JpaRepository<Pelicula, Integer>{

}

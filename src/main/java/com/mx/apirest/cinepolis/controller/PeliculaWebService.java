package com.mx.apirest.cinepolis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apirest.cinepolis.model.Pelicula;
import com.mx.apirest.cinepolis.service.PeliculaServiceImp;

@RestController
@RequestMapping(path = "PeliculaWebService")
@CrossOrigin
public class PeliculaWebService {
	
	@Autowired
	PeliculaServiceImp peliculaService;
	
	// http://localhost:9000/PeliculaWebService/listar
	@GetMapping(path = "listar")
	public List<Pelicula> listar(){
		return peliculaService.listar();
	}
	// http://localhost:9000/PeliculaWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Pelicula pelicula) {
		peliculaService.guardar(pelicula);
	}
}

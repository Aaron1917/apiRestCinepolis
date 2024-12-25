package com.mx.apirest.cinepolis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * CREATE TABLE PELICULA(
 * ID_PELICULA NUMBER PRIMARY KEY,
 * NOMBRE VARCHAR2(120) NOT NULL,
 * GENERO VARCHAR(100) NOT NULL,
 * PRECIO NUMBER NOT NULL);
 * */
@Entity
@Table(name = "Pelicula")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pelicula {
	
	@Id
	@Column(name = "ID_PELICULA", columnDefinition = "NUMBER", nullable = false)
	private Integer idPelicula;
	
	@Column(name = "NOMBRE", columnDefinition = "VARCHAR2(120)", nullable = false)
	private String nombre;
	
	@Column(name = "GENERO", columnDefinition = "VARCHAR2(100)", nullable = false)
	private String genero;
	
	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = false)
	private Float precio;
}

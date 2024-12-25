--Realizar, desarrollar, diseñar, Implementar, Configuarar
--	Un proyecto de spring boot-----"apiRestCinepolis"
--	TABLA:PELICULAS
--	CAMPOS: ID_PELICULA, NOMBRE, GENERO, PRECIO
--	Desarrollar la logica
--		Crear el proyecto de spring boot, tipo maven
--		Conexion a la bd
--		Paquetes MVC
--	Probar las peticiones postman
--	Compartir el link de github

CREATE TABLE PELICULA(
ID_PELICULA NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(120) NOT NULL,
GENERO VARCHAR(100) NOT NULL,
PRECIO NUMBER NOT NULL
);

INSERT INTO PELICULA VALUES(1,'EL GRINCH','COMEDIA',80.50);
COMMIT;

SELECT * FROM PELICULA;
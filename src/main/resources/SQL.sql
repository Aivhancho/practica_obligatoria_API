DROP DATABASE IF EXISTS apiBooking;
CREATE DATABASE apiBooking;
USE apiBooking;

CREATE TABLE Hotel(
                      idHotel		integer 		AUTO_INCREMENT  PRIMARY KEY,
                      nombre		varchar(30)		NOT NULL,
                      descripcion	varchar(50)		NOT NULL,
                      categoria	int				NOT NULL,
                      piscina		bool			NOT NULL,
                      localidad	varchar(20)		NOT NULL

)ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1;

INSERT INTO Hotel (idHotel, nombre, descripcion, categoria, piscina, localidad)
values
    ( 1, 'VerdeJardin', 'Un hotel con verdes jardines en la zona exterior', 4, false, 'Sevilla'),
    ( 2, 'Estrellas', 'Un hotel con actividades de estrellas de la música', 2, true, 'Madrid'),
    ( 3, 'Matapozuelos', 'Un hotel rústico en el pueblo', 3, false, 'Matapozuelos');

CREATE TABLE Habitacion(
                           idHabitacion	integer			auto_increment	PRIMARY KEY,
                           idHotel 		INT 		 	NOT NULL,
                           tamaño			int				NOT NULL,
                           precio			int				NOT NULL,
                           desayuno		bool			NOT NULL,
                           ocupada			bool			NOT NULL,

                           FOREIGN KEY (idHotel) REFERENCES Hotel(idHotel)

)ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1;
INSERT INTO Habitacion
values
    ( 1, 1, 20, 70, true, false),
    ( 2, 2, 30, 90, true, true),
    ( 3, 3, 15, 60, false, false);
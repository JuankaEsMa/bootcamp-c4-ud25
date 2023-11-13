drop table if exists Salas;
drop table if exists Peliculas;

create table Peliculas(
	codigo int auto_increment primary key,
	nombre varchar(100),
    calificacion_edad int
);

create table Salas(
	codigo int auto_increment primary key,
    nombre varchar(100),
    pelicula int default null,
    foreign key (pelicula) references Peliculas(codigo)
);

insert into Peliculas (nombre, calificacion_edad) values ('The Ring', 18);
insert into Peliculas (nombre, calificacion_edad) values ('Avengers', 12);
insert into Peliculas (nombre, calificacion_edad) values ('Bob Esponja la pelicula', 3);
insert into Salas (nombre,pelicula) values ('Sala 1', 1);
insert into Salas (nombre,pelicula) values ('Sala 2', 2);
insert into Salas (nombre,pelicula) values ('Sala 3', 3);
drop table if exists Cajas;
drop table if exists Almacenes;

create table Almacenes(
	codigo int auto_increment primary key,
	lugar varchar(100),
    capacidad int
);

create table Cajas(
	num_referencia char(5) primary key,
    contenido varchar(100),
    valor int,
    almacen int,
    foreign key (almacen) references Almacenes(codigo)
);

insert into Almacenes (lugar, capacidad) values ('Catalunya', 200);
insert into Almacenes (lugar, capacidad) values ('País Vasco', 150);
insert into Almacenes (lugar, capacidad) values ('Madrid', 300);
insert into Cajas values ('AAAAA', 'Verduras', 200, 1);
insert into Cajas values ('ASDFS', 'Frutas', 300, 2);
insert into Cajas values ('SADER', 'Hortalizas', 150, 3);
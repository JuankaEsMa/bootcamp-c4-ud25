DROP table IF EXISTS articulos;
DROP table IF EXISTS fabricantes;

create table fabricantes(
	codigo int auto_increment primary key,
	nombre varchar(100)
);

create table articulos(
	codigo int auto_increment primary key,
    nombre varchar(100),
    precio int,
    fabricante int,
    constraint articulos_fk foreign key (fabricante) references fabricantes(codigo)
);

insert into fabricantes(nombre) values('Samsung');
insert into fabricantes(nombre) values('Apple');
insert into fabricantes(nombre)values('Xiaomi');
insert into articulos(nombre, precio, fabricante)values('Apple Watch','200',2);
insert into articulos(nombre, precio, fabricante)values('IPad','1000',2);
insert into articulos(nombre, precio, fabricante)values('Patin Xiaomi','400',3);
insert into articulos(nombre, precio, fabricante)values('Pocophone F2','300',3);
insert into articulos(nombre, precio, fabricante)values('Samsung A10','500',1);
insert into articulos(nombre, precio, fabricante)values('Samsung Galaxy S20','1200',1);

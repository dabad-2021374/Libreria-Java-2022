show databases;
create database db_libreria;
use db_libreria;
drop database db_libreria;

create table if not exists tbl_libro(
	id_libro int not null auto_increment,
    primary key(id_libro),
    unique(id_libro),
    nombre_del_libro varchar(25),
    autor_del_libro varchar(25),
    editorial varchar(25),
    edicion int not null
);

show tables;
describe tbl_libro; 

alter table tbl_libro
add estado_activo boolean;

DELIMITER //
	create procedure sp_ingresarLibro(
	in _nombre varchar(25),
	in _autor varchar(25),
	in _editorial varchar(25),
	in _edicion int)
	begin
	insert into tbl_libro(
	nombre_del_libro,
	autor_del_libro,
	editorial,
	edicion) 
	values (_nombre,_autor,_editorial,_edicion);
	END //
DELIMITER ;

DELIMITER //
	create procedure sp_agregarLibro(
	in _nombre varchar(25),
	in _autor varchar(25),
	in _editorial varchar(25),
	in _edicion int,
	in _estado boolean)
	begin
	insert into tbl_libro(
	nombre_del_libro,
	autor_del_libro,
	editorial,
	edicion,
	estado_activo) 
	values (_nombre,_autor,_editorial,_edicion,_estado);
	END //
DELIMITER ;

DELIMITER //
	create procedure sp_actualizarLibro(
	in _id int,
	in _nombre varchar(25),
	in _autor varchar(25),
	in _editorial varchar(25),
	in _edicion int,
	in _estado boolean)
	begin
	update tbl_libro
	set id_libro = _id, nombre_del_libro = _nombre, autor_del_libro = _autor, editorial = _editorial, edicion = _edicion, estado_activo = _estado
	where id_libro = _id;
	END //
DELIMITER ;

DELIMITER //
	create procedure sp_eliminarLibro(
	in _id int)
	begin
	delete from tbl_libro where id_libro = _id;
	END //
DELIMITER ;

drop procedure sp_eliminarLibro;

call sp_eliminarLibro(1);

select * from tbl_libro; 
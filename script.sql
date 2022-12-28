create database if not exists db_emps; 

use db_emps; 

create table if not exists T_EMPLOYE (
	id_emp int auto_increment primary key, 
	nom_emp varchar(40),
	prenom_emp varchar(40)
);


create table if not exists T_PROJET (
	id_proj int auto_increment primary key, 
	nom_proj varchar(40),
	ville_proj varchar(40)
);

create table if not exists T_EMP_DEP (
	id_emp int,
	id_proj int, 
	constraint pk_emp_proj primary key (id_emp, id_proj),
	constraint fk_emp foreign key (id_emp) references T_EMPLOYE(id_emp),
	constraint fk_proj foreign key (id_proj) references T_PROJET(id_proj),
);
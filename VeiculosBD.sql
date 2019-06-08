


go
create database avaliacao
go
use avaliacao
go

create table veiculos(
placa varchar(7) not null primary key,
modelo varchar(20),
marca varchar(15),
cor varchar(15),
preco varchar(10));

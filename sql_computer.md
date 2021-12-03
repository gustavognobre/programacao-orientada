~~~sql
CREATE DATABASE almoxarifado;
 CREATE TABLE IF NOT EXISTS dados_computador(
	id_patrimonio int not null auto_increment,
	placa_manutencao varchar(8) not null,
    hostname varchar(20) not null,
    modelo varchar(20) not null,
    memoria decimal(4) not null,
    processador varchar(20) not null,
    disco_rigido int(4) not null,
    estado_conservacao varchar(20) not null,
    primary key(id_patrimonio)
    );
~~~

~~~sql

~~~


drop table if exists client;
drop table if exists pancake;

create table client(
  id_client bigint not null auto_increment,
  name varchar(100) not null,
  street varchar(100) not null,
  houseNumber int not null,
primary key(id_client));

create table pancake(
  id_pancake bigint not null auto_increment,
  name varchar(100) not null,
  type varchar(100) not null,
  value double not null,
  amount int not null,
primary key(id_pancake));
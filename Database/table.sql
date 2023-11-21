

CREATE DATABASE statnba;
\c statnba


CREATE TABLE Genre (
    id serial primary key not null,
    nom varchar(50)
);

CREATE TABLE Equipe (
    id serial primary key not null,
    nom varchar(50)
);

CREATE TABLE Joueur (
    id serial primary key not null,
    nom varchar(50),
    dtn date,
    id_genre int references genre(id),
    id_equipe int references equipe(id)
);

CREATE TABLE Match (
    id serial primary key not null,
    date_debut timestamp,
    date_fin timestamp,
    lieu varchar(50),
    equipe1 int references equipe(id),
    equipe2 int references equipe(id)
);

CREATE TABLE Action (
    id serial primary key not null,
    nom varchar(50),
    point int 
);

CREATE TABLE Possession (
    id serial primary key not null,
    id_match int references Match(id),
    id_joueur int references Joueur(id),
    debut timestamp,
    fin timestamp
);

CREATE TABLE Player_action (
    id serial primary key not null,
    id_match int references Match(id),
    id_joueur int references Joueur(id),
    id_action int references Action(id)    
);



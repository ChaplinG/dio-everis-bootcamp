CREATE database jdbc_dio;

USE jdbc_dio;

CREATE TABLE jogador (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nomeUser VARCHAR(25) NOT NULL,
    nivel INTEGER NOT NULL,
    pais VARCHAR(30) NOT NULL
);

INSERT INTO jogador(nomeUser, nivel, pais) VALUES ('Rufus', 0, 'Colinas');
INSERT INTO jogador(nomeUser, nivel, pais) VALUES ('Mila', 12, 'Brasil');
INSERT INTO jogador(nomeUser, nivel, pais) VALUES ('Geraldão', 9, 'Rivia');
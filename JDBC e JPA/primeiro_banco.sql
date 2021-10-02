CREATE database digital_innovation_one;

USE digital_innovation_one;

CREATE TABLE aluno (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    idade INTEGER NOT NULL,
    estdo CHARACTER(2) NOT NULL
);

INSERT INTO aluno(nome, idade, estdo) VALUES ('Pedro', 20, 'RJ');
INSERT INTO aluno(nome, idade, estdo) VALUES ('Maria', 35, 'AC');
INSERT INTO aluno(nome, idade, estdo) VALUES ('João', 10, 'SC');
INSERT INTO aluno(nome, idade, estdo) VALUES ('Ana', 51, 'GO');

SELECT * FROM aluno;
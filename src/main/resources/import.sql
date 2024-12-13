INSERT INTO categoria (nome) VALUES ('Oficina');
INSERT INTO categoria (nome) VALUES ('Curso');
INSERT INTO categoria (nome) VALUES ('Ciencia');


INSERT INTO atividade (nome, descricao, preco, categoria_id) VALUES ('Curso de HTML', 'Curso básico de HTML', 100.0, 1);
INSERT INTO atividade (nome, descricao, preco, categoria_id) VALUES ('Oficina de Pintura', 'Curso básico de pintura', 200.0, 2);
INSERT INTO atividade (nome, descricao, preco, categoria_id) VALUES ('Oficina de Pintura', 'Curso básico de pintura', 200.0, 3);


INSERT INTO participante (nome, email) VALUES ('João Silva', 'joao@gmail.com');
INSERT INTO participante (nome, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO participante (nome, email) VALUES ('Maria do Rosario', 'maria@gmail.com');
INSERT INTO participante (nome, email) VALUES ('Teresa Silva', 'teresa@gmail.com');


INSERT INTO atividade_participante (participante_id, atividade_id) VALUES (1, 1);
INSERT INTO atividade_participante (participante_id, atividade_id) VALUES (1, 2);
INSERT INTO atividade_participante (participante_id, atividade_id) VALUES (2, 1);
INSERT INTO atividade_participante (participante_id, atividade_id) VALUES (3, 1);
INSERT INTO atividade_participante (participante_id, atividade_id) VALUES (3, 2);
INSERT INTO atividade_participante (participante_id, atividade_id) VALUES (4, 2);

INSERT INTO bloco_horario (inicio, fim, atividade_id) VALUES ('2017-09-25 08:00:00+00:00', '2017-09-25 11:00:00+00:00', 1);
INSERT INTO bloco_horario (inicio, fim, atividade_id) VALUES ('2017-09-25 14:00:00+00:00', '2017-09-25 18:00:00+00:00', 2);
INSERT INTO bloco_horario (inicio, fim, atividade_id) VALUES ('2017-09-26 08:00:00+00:00', '2017-09-26 11:00:00+00:00', 2);



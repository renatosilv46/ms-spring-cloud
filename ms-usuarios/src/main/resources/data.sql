INSERT INTO tb_usuarios (nome, email, senha) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_usuarios (nome, email, senha) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO tb_role (nome_role) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (nome_role) VALUES ('ROLE_ADMIN');

INSERT INTO tb_usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO tb_usuarios_roles (usuario_id, role_id) VALUES (2, 1);
INSERT INTO tb_usuarios_roles (usuario_id, role_id) VALUES (2, 2);
-- Inserindo os serviços iniciais da barbearia
INSERT INTO servicos (tipo, valor_atual, ativo) VALUES ('CORTE', 35.00, true);
INSERT INTO servicos (tipo, valor_atual, ativo) VALUES ('SOBRANCELHA', 15.00, true);
INSERT INTO servicos (tipo, valor_atual, ativo) VALUES ('PINTURA', 80.00, true);
INSERT INTO servicos (tipo, valor_atual, ativo) VALUES ('FACIAL', 45.00, true);
INSERT INTO servicos (tipo, valor_atual, ativo) VALUES ('BARBA', 25.00, true);

-- cliente de exemplo para testes
INSERT INTO clientes (cpf, senha, nome) VALUES ('12345678900', '123456', 'João Silva');
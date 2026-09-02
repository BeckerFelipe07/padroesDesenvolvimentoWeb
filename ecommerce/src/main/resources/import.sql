insert into categoria (nome, descricao) values ('Informática', 'Produtos de Informática');
insert into categoria (nome, descricao) values ('Livros', 'Livros Técnicos');
insert into categoria (nome, descricao) values ('Eletrônicos', 'Aparelhos Eletrônicos');
insert into categoria (nome, descricao) values ('Papelaria', 'Materiais de Escritório');
insert into categoria (nome, descricao) values ('Games', 'Jogos e Acessórios');

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Código Limpo', 'Livro do Autor: Robert C. Martin', 100.00, 20, 2);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Mouse Gamer', 'Mouse óptico 6 botões', 80.00, 15, 1);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Fone Bluetooth', 'Fone de ouvido sem fio', 150.00, 10, 3);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Caderno Universitário', 'Caderno 200 folhas', 25.00, 50, 4);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Controle Joystick', 'Controle para PC/Console', 120.00, 12, 5);

insert into cliente (nome, email, telefone) values ('Felipe Becker', 'felipebecker@gmail.com', '14 99223-4499');
insert into cliente (nome, email, telefone) values ('Ana Souza', 'ana.souza@gmail.com', '14 98123-5566');
insert into cliente (nome, email, telefone) values ('Bruno Lima', 'bruno.lima@gmail.com', '14 97654-3322');
insert into cliente (nome, email, telefone) values ('Carla Mendes', 'carla.mendes@gmail.com', '14 96543-2211');
insert into cliente (nome, email, telefone) values ('Diego Santos', 'diego.santos@gmail.com', '14 95432-1100');

insert into pagamento (data, status, valor_total, cliente_id) values ('2026-06-30', 'concluído', 180.00, 1);
insert into pagamento (data, status, valor_total, cliente_id) values ('2026-07-02', 'concluído', 80.00, 2);
insert into pagamento (data, status, valor_total, cliente_id) values ('2026-07-05', 'pendente', 150.00, 3);
insert into pagamento (data, status, valor_total, cliente_id) values ('2026-07-10', 'concluído', 50.00, 4);
insert into pagamento (data, status, valor_total, cliente_id) values ('2026-07-12', 'concluído', 120.00, 5);

insert into pedido (data, status, valor_total, cliente_id) values ('2026-06-30', 'pagamento aprovado', 180.00, 1);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-07-02', 'pagamento aprovado', 80.00, 2);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-07-05', 'aguardando pagamento', 150.00, 3);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-07-10', 'pagamento aprovado', 50.00, 4);
insert into pedido (data, status, valor_total, cliente_id) values ('2026-07-12', 'pagamento aprovado', 120.00, 5);

insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 180.00, 1, 1);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 80.00, 2, 2);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 150.00, 3, 3);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (2, 25.00, 4, 4);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 120.00, 5, 5);
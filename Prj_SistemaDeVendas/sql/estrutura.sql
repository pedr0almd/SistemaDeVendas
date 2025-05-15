-- 1. Criar banco e usar
CREATE DATABASE IF NOT EXISTS DB_SistemaDeVendas;
USE DB_SistemaDeVendas;

-- 2. Criar tabelas

CREATE TABLE CLIENTE_01 (
    A01_codigo INT AUTO_INCREMENT PRIMARY KEY,
    A01_nome VARCHAR(50) NOT NULL,
    A01_endereco VARCHAR(50) NOT NULL,
    A01_telefone CHAR(11) NOT NULL,
    A01_cpf CHAR(11) NOT NULL UNIQUE,
    A01_credito DECIMAL(10,2) NOT NULL
);

CREATE TABLE PEDIDO_02 (
    A02_codigo INT AUTO_INCREMENT PRIMARY KEY,
    A02_data DATE NOT NULL,
    A02_valortotal DECIMAL(10,2) NOT NULL,
    A01_codigo INT,
    A02_status VARCHAR(20) DEFAULT 'ABERTO',
    A02_dataFinalizacao DATETIME DEFAULT NULL,
    FOREIGN KEY (A01_codigo) REFERENCES CLIENTE_01(A01_codigo)
);

CREATE TABLE PRODUTO_03 (
    A03_codigo INT AUTO_INCREMENT PRIMARY KEY,
    A03_descricao VARCHAR(255) NOT NULL,
    A03_valorUnitario DECIMAL(10,2) NOT NULL,
    A03_estoque VARCHAR(255) NOT NULL
);

CREATE TABLE ITEM_04 (
    A04_codigo BIGINT AUTO_INCREMENT PRIMARY KEY,
    A02_codigo INT,
    A03_codigo INT,
    A04_quantidade INT,
    A04_valorItem DECIMAL(10,2),
    FOREIGN KEY (A02_codigo) REFERENCES PEDIDO_02(A02_codigo),
    FOREIGN KEY (A03_codigo) REFERENCES PRODUTO_03(A03_codigo)
);

-- 3. Inserir dados iniciais na tabela CLIENTE_01

INSERT INTO CLIENTE_01 (A01_nome, A01_endereco, A01_telefone, A01_cpf, A01_credito)
VALUES ('Joao da silva','Rua das Flores 12','11915671234','12345634550',1000);

-- 4. Procedures CLIENTE_01

DELIMITER $$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_InsCLIENTE (
    IN A01_nome VARCHAR(50),
    IN A01_endereco VARCHAR(50),
    IN A01_telefone CHAR(11),
    IN A01_cpf CHAR(11),
    IN A01_credito DECIMAL(10,2)
)
BEGIN
    INSERT INTO CLIENTE_01 (A01_nome, A01_endereco, A01_telefone, A01_cpf, A01_credito)
    VALUES (A01_nome, A01_endereco, A01_telefone, A01_cpf, A01_credito);
    COMMIT;
END$$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_AltCLIENTE (
    IN V_A01_nome VARCHAR(50),
    IN V_A01_endereco VARCHAR(50),
    IN V_A01_telefone CHAR(11),
    IN V_A01_credito DECIMAL(10,2),
    IN V_A01_cpf CHAR(11)
)
BEGIN
    UPDATE CLIENTE_01
    SET A01_nome = V_A01_nome,
        A01_endereco = V_A01_endereco,
        A01_telefone = V_A01_telefone,
        A01_credito = V_A01_credito
    WHERE A01_cpf = V_A01_cpf;
    COMMIT;
END$$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_DelCLIENTE (
    IN V_A01_codigo INT
)
BEGIN
    DELETE FROM CLIENTE_01 WHERE A01_codigo = V_A01_codigo;
    COMMIT;
END$$

DELIMITER ;

-- 5. Chamada de testes para CLIENTE

CALL PROC_InsCLIENTE('Daniel', 'Rua das sakuras 34', '11984227936', '59763854984', 5000);
CALL PROC_InsCLIENTE('Marcos', 'Rua das cerejeiras 34', '11993557167', '12357869363', 3000);
CALL PROC_InsCLIENTE('Laura', 'Rua dos beijaflores 34', '11949758634', '36795821469', 9000);

CALL PROC_DelCLIENTE(1); -- Exemplo para deletar cliente pelo código

-- 6. Procedures PEDIDO_02

DELIMITER $$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_InsPEDIDO (
    IN V_A02_data DATE,
    IN V_A02_valortotal DECIMAL(10,2),
    IN V_A01_codigo INT
)
BEGIN
    INSERT INTO PEDIDO_02 (A02_data, A02_valortotal, A01_codigo)
    VALUES (V_A02_data, V_A02_valortotal, V_A01_codigo);
    COMMIT;
END$$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_AltPEDIDO (
    IN V_A02_codigo INT,
    IN V_A02_data DATE,
    IN V_A02_valortotal DECIMAL(10,2),
    IN V_A01_codigo INT
)
BEGIN
    UPDATE PEDIDO_02
    SET A02_data = V_A02_data,
        A02_valortotal = V_A02_valortotal,
        A01_codigo = V_A01_codigo
    WHERE A02_codigo = V_A02_codigo;
    COMMIT;
END$$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_DelPEDIDO (
    IN V_A02_codigo INT
)
BEGIN
    DELETE FROM PEDIDO_02 WHERE A02_codigo = V_A02_codigo;
    COMMIT;
END$$

DELIMITER ;

-- 7. Procedures PRODUTO_03

DELIMITER $$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_InsPRODUTO (
    IN V_A03_descricao VARCHAR(255),
    IN V_A03_valorUnitario DECIMAL(10,2),
    IN V_A03_estoque VARCHAR(255)
)
BEGIN
    INSERT INTO PRODUTO_03 (A03_descricao, A03_valorUnitario, A03_estoque)
    VALUES (V_A03_descricao, V_A03_valorUnitario, V_A03_estoque);
    COMMIT;
END$$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_AltPRODUTO (
    IN V_A03_codigo INT,
    IN V_A03_descricao VARCHAR(255),
    IN V_A03_valorUnitario DECIMAL(10,2),
    IN V_A03_estoque VARCHAR(255)
)
BEGIN
    UPDATE PRODUTO_03
    SET A03_descricao = V_A03_descricao,
        A03_valorUnitario = V_A03_valorUnitario,
        A03_estoque = V_A03_estoque
    WHERE A03_codigo = V_A03_codigo;
    COMMIT;
END$$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_DelPRODUTO (
    IN V_A03_codigo INT
)
BEGIN
    DELETE FROM PRODUTO_03 WHERE A03_codigo = V_A03_codigo;
    COMMIT;
END$$

DELIMITER ;

-- 8. Procedures ITEM_04

DELIMITER $$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_InsITENS (
    IN V_A02_codigo INT,
    IN V_A03_codigo INT,
    IN V_A04_quantidade INT,
    IN V_A04_valorItem DECIMAL(10,2)
)
BEGIN
    INSERT INTO ITEM_04 (A02_codigo, A03_codigo, A04_quantidade, A04_valorItem)
    VALUES (V_A02_codigo, V_A03_codigo, V_A04_quantidade, V_A04_valorItem);
    COMMIT;
END$$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_AltITENS (
    IN V_A04_codigo INT,
    IN V_A02_codigo INT,
    IN V_A03_codigo INT,
    IN V_A04_quantidade INT,
    IN V_A04_valorItem DECIMAL(10,2)
)
BEGIN
    UPDATE ITEM_04
    SET A02_codigo = V_A02_codigo,
        A03_codigo = V_A03_codigo,
        A04_quantidade = V_A04_quantidade,
        A04_valorItem = V_A04_valorItem
    WHERE A04_codigo = V_A04_codigo;
    COMMIT;
END$$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_DelITEM (
    IN V_A04_codigo INT
)
BEGIN
    DELETE FROM ITEM_04 WHERE A04_codigo = V_A04_codigo;
    COMMIT;
END$$

DELIMITER ;

-- 9. Comandos de seleção para ver dados

SELECT * FROM CLIENTE_01;
SELECT * FROM PEDIDO_02;
SELECT * FROM PRODUTO_03;
SELECT * FROM ITEM_04;

-- 10. Comandos para apagar tudo (usar com cuidado!)

-- DROP PROCEDURE IF EXISTS PROC_InsCLIENTE;
-- DROP PROCEDURE IF EXISTS PROC_AltCLIENTE;
-- DROP PROCEDURE IF EXISTS PROC_DelCLIENTE;

-- DROP PROCEDURE IF EXISTS PROC_InsPEDIDO;
-- DROP PROCEDURE IF EXISTS PROC_AltPEDIDO;
-- DROP PROCEDURE IF EXISTS PROC_DelPEDIDO;

-- DROP PROCEDURE IF EXISTS PROC_InsPRODUTO;
-- DROP PROCEDURE IF EXISTS PROC_AltPRODUTO;
-- DROP PROCEDURE IF EXISTS PROC_DelPRODUTO;

-- DROP PROCEDURE IF EXISTS PROC_InsITEM;
-- DROP PROCEDURE IF EXISTS PROC_AltITEM;
-- DROP PROCEDURE IF EXISTS PROC_DelITEM;

-- DROP TABLE IF EXISTS ITEM_04;
-- DROP TABLE IF EXISTS PRODUTO_03;
-- DROP TABLE IF EXISTS PEDIDO_02;
-- DROP TABLE IF EXISTS CLIENTE_01;

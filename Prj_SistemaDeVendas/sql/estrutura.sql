CREATE DATABASE DB_SistemaDeVendas;
Use DB_SistemaDeVendas;

DROP DATABASE DB_SistemaDeVendas;

create table CLIENTE_01
(
 A01_codigo   int AUTO_INCREMENT primary key,
    A01_nome  varchar(50) not null,
    A01_endereco varchar(50) not null,
    A01_telefone char(11) not null,
    A01_cpf   char(11) not null UNIQUE,
    A01_credito  decimal(10,2) not null
);

select * FROM CLIENTE_01;

insert into CLIENTE_01 (A01_nome, A01_endereco, A01_telefone, A01_cpf, A01_credito)
values('Joao da silva','Rua das Flores 12','11915671234','12345634550',1000); 

DELIMITER $$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_InsCLIENTE
(
    A01_nome  varchar(50),
    A01_endereco varchar(50),
    A01_telefone char(11),
    A01_cpf   char(11),
    A01_credito  decimal(10,2)  
)
BEGIN
INSERT into CLIENTE_01 (A01_nome, A01_endereco, A01_telefone, A01_cpf, A01_credito)
values(A01_nome, A01_endereco, A01_telefone, A01_cpf, A01_credito);

 COMMIT;
END$$

CALL PROC_InsCLIENTE('Daniel', 'Rua das sakuras 34', '11984227936', '59763854984',5000);
CALL PROC_InsCLIENTE('Marcos', 'Rua das cerejeiras 34', '11993557167', '12357869363',3000);
CALL PROC_InsCLIENTE('Laura', 'Rua dos beijaflores 34', '11949758634', '36795821469',9000);


DELIMITER $$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_AltCLIENTE
(
    IN V_A01_nome      VARCHAR(50),
    IN V_A01_endereco  VARCHAR(50),
    IN V_A01_telefone  CHAR(11),
    IN V_A01_credito   DECIMAL(10,2),
    IN V_A01_cpf       CHAR(11)
)
BEGIN
    UPDATE CLIENTE_01 
    SET 
        A01_nome     = V_A01_nome,
        A01_endereco = V_A01_endereco,
        A01_telefone = V_A01_telefone,
        A01_credito  = V_A01_credito
    WHERE A01_cpf = V_A01_cpf;

    COMMIT;
END$$

DELIMITER ;


DELIMITER $$

CREATE DEFINER='root'@'localhost' PROCEDURE Proc_DelCLIENTE
(
    IN V_01_codigo int
)
BEGIN
 DELETE FROM cliente_01 WHERE V_01_cpf = A01_cpf;
    
    COMMIT;
END $$

CALL Proc_DelCliente(1);



create table PEDIDO_02
(
 A02_codigo int auto_increment primary key,
 A02_data date not null,
    A02_valortotal decimal(10,2) not null,
    A01_codigo int,
    foreign key (A01_codigo) REFERENCES CLIENTE_01 (A01_codigo)
);


select * FROM PEDIDO_02;

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




create table PRODUTO_03
(
 A03_codigo int not null auto_increment PRIMARY KEY,
    A03_descricao varchar(255) not null,
    A03_valorUnitario decimal(10,2) not null,
    A03_estoque varchar(255) not null
);

select * FROM PRODUTO_03;

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

DELIMITER $$
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

DELIMITER $$
CREATE DEFINER='root'@'localhost' PROCEDURE PROC_DelPRODUTO (
    IN V_A03_codigo INT
)
BEGIN
    DELETE FROM PRODUTO_03 WHERE A03_codigo = V_A03_codigo;
    COMMIT;
END$$

DELIMITER ;



create table ITEM_04
(
 A04_codigo int auto_increment primary key,
    A02_codigo int,
    A03_codigo int,
    A04_quantidade int,
    A04_valorItem decimal(10,2),
    foreign key (A02_codigo) REFERENCES PEDIDO_02 (A02_codigo),
    foreign key (A03_codigo) REFERENCES PRODUTO_03 (A03_codigo)
);

select * FROM ITEM_04;

DELIMITER $$

CREATE DEFINER='root'@'localhost' PROCEDURE PROC_InsITENS (
    IN V_A02_codigo INT,
    IN V_A03_codigo INT,
    IN V_A04_quantidade VARCHAR(255),
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
    IN V_A04_quantidade VARCHAR(255),
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
    DELETE FROM ITENS_04 WHERE A04_codigo = V_A04_codigo;
    COMMIT;
END$$

DELIMITER ;



DROP PROCEDURE PROC_InsCLIENTE;
DROP PROCEDURE PROC_AltCLIENTE;
DROP PROCEDURE PROC_DelCLIENTE;
DROP PROCEDURE IF EXISTS PROC_AltCLIENTE$$

DROP PROCEDURE PROC_InsPEDIDO;
DROP PROCEDURE PROC_AltPEDIDO;
DROP PROCEDURE PROC_DelPEDIDO;

DROP PROCEDURE PROC_InsPRODUTO;
DROP PROCEDURE PROC_AltPRODUTO;
DROP PROCEDURE PROC_DelPRODUTO;

DROP PROCEDURE PROC_InsITEM;
DROP PROCEDURE PROC_AltITEM;
DROP PROCEDURE PROC_DelITEM;

DROP TABLE CADASTRO_01;
DROP TABLE PEDIDO_02;
DROP TABLE PRODUTO_03;
DROP TABLE ITEM_04;
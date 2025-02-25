-- AULA 1 (24/02/2025)
-- Criando o banco de dados
CREATE DATABASE empresaCJ3025721;
GO

--Habilitando o contexto
USE empresaCJ3025721;
GO

-- Criando uma tabela (FUNCIONARIOS)
CREATE TABLE FUNCIONARIOS (
	ID INT PRIMARY KEY, 
	NOME VARCHAR (25) NOT NULL,
	Sexo CHAR(1) NULL,
	Admissao DATE NOT NULL,
	Salario DECIMAL (10, 2) NOT NULL
);
GO

-- Alterando o formato de data do SQL Server
SET DATEFORMAT DMY; -- DMY = Day, Year, Month 
GO

-- Inserindo dados na tabela FUNCIONARIOS
INSERT INTO FUNCIONARIOS (
	ID,
	NOME,
	Sexo,
	Admissao,
	Salario)
VALUES (1, 'Maria da Silva', 'F', '10/01/2018', 2500.00);
GO

-- Inserindo um novo registro
INSERT INTO FUNCIONARIOS 
VALUES (2, 'Pedro Pereira', 'M', '25/05/2015', 990.00);
GO

/*
Tentando inserir um funcion�rio em um ID j� cadastrado
INSERT INTO FUNCIONARIOS 
VALUES (2, 'Maria Cristina', 'F', '10/09/2015', 1200.00);
GO 
*/

-- Inserindo dois novos registros
INSERT INTO FUNCIONARIOS 
VALUES (3, 'Maria Cristina', 'F', '10/09/2015', 1200.00);
GO
INSERT INTO FUNCIONARIOS
VALUES (4, 'Ant�nio Carlos', 'M', '15/05/2015', 990.00);
GO

-- Inserindo quatro novos registros (sintaxe diferente)
INSERT INTO FUNCIONARIOS VALUES
	(5, 'Marcelo Augusto', 'M', '09/12/2017', 1900.00),
	(6, 'Pedro Silva', 'M', '15/11/2015', 1050.00),
	(7, 'M�nica da Silva', 'F', '12/10/2014', 3000.00),
	(8, 'Tiago Lima', 'M', '10/05/2016', 1350.00);
GO

SELECT ID AS 'C�digo do Funcion�rio',
	   Nome,
	   Sexo,
	   Salario AS 'Sal�rio'
FROM FUNCIONARIOS;
GO

-- Exibe a tabela
SELECT * FROM FUNCIONARIOS;
GO

-- Utilizando TOP para exibir somente os 3 primeiros registros da tabela FUNCIONARIOS
SELECT TOP 3 * FROM FUNCIONARIOS;
GO

-- Utilizando TOP para exibir somente os 3 primeiros registros da tabela
-- Exibe o somente o ID e o nome do funcion�rio
SELECT TOP 3
	ID,
	Nome
FROM FUNCIONARIOS;
GO

-- Selecionando e exibindo apenas funcion�rios masculinos com sal�rio acima de 1000
SELECT * FROM FUNCIONARIOS
WHERE Sexo = 'M' AND Salario > 1000;
GO

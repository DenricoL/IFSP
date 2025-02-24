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

INSERT INTO FUNCIONARIOS 
VALUES (2, 'Pedro Pereira', 'M', '25/05/2015', 990.00);
GO

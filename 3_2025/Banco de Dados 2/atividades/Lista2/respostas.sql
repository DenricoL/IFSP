USE LojaIFSP;

-- Questão 1
SELECT * FROM CLIENTES;
GO

-- Questão 2
SELECT * FROM CLIENTES
ORDER BY Nome;
GO

-- Questão 3
SELECT * FROM CLIENTES
ORDER BY Idade;
GO

-- Questão 4
SELECT * FROM CLIENTES
ORDER BY Idade DESC;
GO

-- Questão 5
SELECT * FROM CLIENTES
ORDER BY Sexo DESC, Idade;
GO

-- Questão 6
SELECT Nome, Idade, Email FROM CLIENTES;
GO

-- Questão 7
SELECT Nome, Idade, Email FROM CLIENTES
ORDER BY Nome;
GO

-- Questão 8
SELECT ID AS 'Código do Cliente', Nome, Idade, Email
FROM CLIENTES
WHERE ID >= 10;
GO

-- Questão 9
SELECT ID AS 'Código do Cliente', Nome, Idade, Email FROM CLIENTES
WHERE ID <= 5;
GO


-- Questão 10
SELECT ID AS 'Código do Cliente', Nome, Sexo, Idade, Email AS 'E-mail'
FROM CLIENTES
WHERE Idade > 30 AND Sexo = 'M'
ORDER BY Nome;
GO

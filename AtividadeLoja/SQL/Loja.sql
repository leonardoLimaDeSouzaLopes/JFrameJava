CREATE DATABASE bdLojinha;

USE bdLojinha;

CREATE TABLE tbCategoria (
    idCategoria INT PRIMARY KEY AUTO_INCREMENT
    , nomeCategoria VARCHAR (40)
);

CREATE TABLE tbCliente (
    idCliente INT PRIMARY KEY AUTO_INCREMENT
    , nomeCliente VARCHAR (60)
    , datanascCliente DATA
    , cpfCliente CHAR (11)
    , sexoCliente INT
    , logradouroCliente VARCHAR (40)
    , numLogradouroCliente INT
    , bairroCliente VARCHAR (60)
    , cidadeCliente VARCHAR (58)
);

CREATE TABLE tbProduto (
    idProduto INT PRIMARY KEY AUTO_INCREMENT
    , nomeProduto VARCHAR (60)
    , valorProduto MONEY
    , idCategoria INT FOREIGN KEY REFERENCES tbCategoria(idCategoria)
);

CREATE TABLE tbPedido (
    idPedido INT PRIMARY KEY AUTO_INCREMENT
    , valorPedido MONEY
    , dataPedido DATETIME
    , idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
    , statusPedido VARCHAR (40)
);

CREATE TABLE tbCarrinho (
    idCarrinho INT PRIMARY KEY AUTO_INCREMENT
    , idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)
    , idPedido INT FOREIGN KEY REFERENCES tbPedido(idPedido)
);



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
)

CREATE TABLE Produto (
    idProduto INT PRIMARY KEY AUTO_INCREMENT
    , nomePedido VARCHAR (60)
    , precoPedido MONEY
    ,  idCategoria INT FOREIGN KEY REFERENCES tbCategoria(idCategoria)
)

CREATE

CREATE TABLE Pedido (
    idPedido INT PRIMARY KEY AUTO_INCREMENT
    , 
)
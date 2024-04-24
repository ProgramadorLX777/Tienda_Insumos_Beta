-- Creación Base de Datos
CREATE DATABASE insumos_tecnologicos;

-- Usar BD
USE insumos_tecnologicos;

-- Creación Tabla Productos
CREATE TABLE producto(
  id_producto int PRIMARY KEY AUTO_INCREMENT,
  nombre varchar (120),
  descripcion varchar (150),  
  precio float,  
  cantidad_stock int,
  categoria varchar (60)
);    

-- Creación Tabla Proveedor
CREATE TABLE proveedor(
    id_proveedor int primary key AUTO_INCREMENT,
    id_producto_asociado int,
    nombre_proveedor varchar(60),
    direccion_proveedor varchar(700),
    fono varchar(15),
    correo varchar(50)

);

-- Creación tabla venta
CREATE TABLE venta (
    id_venta int PRIMARY KEY AUTO_INCREMENT,
    id_productoVenta int,
    nombre_cliente VARCHAR(30),
    fecha_venta date,
    cantidad_vendida int,
    precio_unitario float,
    precio_total float,
    FOREIGN KEY (id_productoVenta) REFERENCES producto(id_producto)
);

CREATE TABLE reporte(
    id_reporte int PRIMARY KEY AUTO_INCREMENT,
    id_producto_reporte int,
    producto_mayor_ventas varchar(40),
    stock_inicial int,
    cantidad_vendidos int,
    stock_final int,
    ingresos_generados float
    
);

-- Insertar Productos:
INSERT INTO producto VALUES(null, "Teclado", "con luces", 25000, 50, "tecnologia");

-- Insertar Proveedores:
INSERT INTO proveedor VALUES(null, 1, "Computacion LTDA", "Alameda 3560", "+56 9 4664 2950", "computacion@gmail.com");

-- Query Inner Join:
SELECT id_venta, id_productoVenta, nombre_cliente, fecha_venta, cantidad_vendida, precio_unitario, precio_total
FROM venta INNER JOIN producto ON id_productoVenta = id_producto;

-- Insertar Ventas:
INSERT INTO venta(id_productoVenta, nombre_cliente, fecha_venta, cantidad_vendida, precio_unitario, precio_total) 
VALUES(1, "Jorge", "2024-04-24", 3, 5500, 16500);
CREATE TABLE `bono` (
`idBono` int(11) NOT NULL AUTO_INCREMENT,
`bono` double NOT NULL,
`idEmpleado` int(11) NOT NULL,
PRIMARY KEY (`idBono`, `idEmpleado`) ,
INDEX `fk_bono_empleado1` (`idEmpleado`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `cliente` (
`idCliente` int(11) NOT NULL AUTO_INCREMENT,
`codigoCliente` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`nombre` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`apellido` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`telefonoCliente` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`direccionCliente` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`idPersona` int(11) NOT NULL,
PRIMARY KEY (`idCliente`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `empleado` (
`idEmpleado` int(11) NOT NULL AUTO_INCREMENT,
`codigoEmpleado` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`nombre` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`apellido` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`telefonoEmpleado` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`dirrecionEmpleado` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`salarioEmpleado` double NOT NULL,
`cargoEmpleado` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`afp` double NOT NULL,
`isss` double NOT NULL,
`contratacion` date NOT NULL,
`estado` int(11) NOT NULL,
`idEmpresa` int(11) NOT NULL,
`usuario_idUsuario` int(11) NOT NULL,
PRIMARY KEY (`idEmpleado`) ,
INDEX `fk_empleado_empresa1` (`idEmpresa`),
INDEX `fk_empleado_usuario1` (`usuario_idUsuario`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `empresa` (
`idEmpresa` int(11) NOT NULL AUTO_INCREMENT,
`codigoEmpresa` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`nombreEmpresa` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`dirrecionEmpresa` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`correoEmpresa` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
PRIMARY KEY (`idEmpresa`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `gastoempresa` (
`idGastos` int(11) NOT NULL AUTO_INCREMENT,
`codigoGasto` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`fecha` date NOT NULL,
`tipo` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`saldo` double NOT NULL,
`idEmpresa` int(11) NOT NULL,
PRIMARY KEY (`idGastos`) ,
INDEX `fk_gastoEmpresa_empresa1` (`idEmpresa`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `iniciocaja` (
`idCaja` int(11) NOT NULL AUTO_INCREMENT,
`codigoCaja` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`fechaInicio` date NOT NULL,
`fechaCierre` date NOT NULL,
`dineroCajaInicio` double NOT NULL,
`dineroCajaCierre` double NOT NULL,
`idUsuario` int(11) NOT NULL,
PRIMARY KEY (`idCaja`) ,
INDEX `fk_inicioCaja_usuario1` (`idUsuario`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `producto` (
`idProducto` int(11) NOT NULL AUTO_INCREMENT,
`codigoProducto` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`nombreProducto` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`precioCompra` double NOT NULL,
`cantidad` int(11) NOT NULL,
`fechaVencimiento` date NOT NULL,
`porcentaje` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`max` int(11) NOT NULL,
`min` int(11) NOT NULL,
`idEmpresa` int(11) NOT NULL,
PRIMARY KEY (`idProducto`) ,
INDEX `fk_producto_empresa1` (`idEmpresa`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `registros` (
`idRegistros` int(11) NOT NULL AUTO_INCREMENT,
`cantidadProducto` int(11) NOT NULL,
`precioTotalProducto` double NOT NULL,
`idVenta` int(11) NOT NULL,
`idProducto` int(11) NOT NULL,
PRIMARY KEY (`idRegistros`) ,
INDEX `fk_registros_venta1` (`idVenta`),
INDEX `fk_registros_producto1` (`idProducto`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `usuario` (
`idUsuario` int(11) NOT NULL AUTO_INCREMENT,
`usuario` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`contraseña` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
PRIMARY KEY (`idUsuario`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `venta` (
`idVenta` int(11) NOT NULL AUTO_INCREMENT,
`nFactura` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`fechaVenta` date NOT NULL,
`precioTotal` double NOT NULL,
`idCliente` int(11) NOT NULL,
`idCaja` int(11) NOT NULL,
`idEmpleado` int(11) NOT NULL,
`idEmpresa` int(11) NOT NULL,
PRIMARY KEY (`idVenta`) ,
INDEX `fk_venta_cliente1` (`idCliente`),
INDEX `fk_venta_inicioCaja1` (`idCaja`),
INDEX `fk_venta_empleado1` (`idEmpleado`),
INDEX `fk_venta_empresa` (`idEmpresa`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;


ALTER TABLE `bono` ADD CONSTRAINT `fk_bono_empleado1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`);
ALTER TABLE `empleado` ADD CONSTRAINT `fk_empleado_empresa1` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`);
ALTER TABLE `empleado` ADD CONSTRAINT `fk_empleado_usuario1` FOREIGN KEY (`usuario_idUsuario`) REFERENCES `usuario` (`idUsuario`);
ALTER TABLE `gastoempresa` ADD CONSTRAINT `fk_gastoEmpresa_empresa1` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`);
ALTER TABLE `iniciocaja` ADD CONSTRAINT `fk_inicioCaja_usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);
ALTER TABLE `producto` ADD CONSTRAINT `fk_producto_empresa1` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`);
ALTER TABLE `registros` ADD CONSTRAINT `fk_registros_producto1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
ALTER TABLE `registros` ADD CONSTRAINT `fk_registros_venta1` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`);
ALTER TABLE `venta` ADD CONSTRAINT `fk_venta_cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);
ALTER TABLE `venta` ADD CONSTRAINT `fk_venta_empleado1` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`);
ALTER TABLE `venta` ADD CONSTRAINT `fk_venta_empresa` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`);
ALTER TABLE `venta` ADD CONSTRAINT `fk_venta_inicioCaja1` FOREIGN KEY (`idCaja`) REFERENCES `iniciocaja` (`idCaja`);


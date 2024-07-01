CREATE DATABASE COPIASEGURIDAD;


CREATE TABLE TipoUsuario(
    idTipoUsuario INT IDENTITY(1,1) NOT NULL,
    nombreTipo VARCHAR(20) NOT NULL,
    PRIMARY KEY (idTipoUsuario)
);

CREATE TABLE Usuario(
    idUsuario int identity(1,1) NOT NULL,
    usuario varchar(20) NOT NULL,
    correo varchar(50) NOT NULL CHECK (correo LIKE '%_@_%._%'),
    estado char(1) NOT NULL DEFAULT 'A',
    fechaRegistro date NOT NULL,
    idTipoUsuario int NOT NULL, 
    PRIMARY KEY(idUsuario),
    FOREIGN KEY(idTipoUsuario) REFERENCES TipoUsuario(idTipoUsuario)   
);

CREATE TABLE BaseDatos(
    idDatabase INT IDENTITY(1,1) NOT NULL,
    nameDatabase VARCHAR(50) NOT NULL,
    idUsuario int NOT NULL,
    fechaRegistro datetime NOT NULL, 
    PRIMARY KEY (idDatabase),
    FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario)
);

CREATE TABLE TipoCopia(
    idTipoCopia INT IDENTITY(1,1) NOT NULL,
    nombreCopia VARCHAR(20) NOT NULL,
    PRIMARY KEY(idTipoCopia)
);

-- Almacena los días de la semana
CREATE TABLE Dia(
    idDia INT IDENTITY(1,1) NOT NULL,
    dia varchar(10) NOT NULL,
    primary key(idDia)
);

CREATE TABLE FrecuenciaCopia (
    idFrecuencia INT IDENTITY(1,1) NOT NULL,
    nombreFrecuencia VARCHAR(50) NOT NULL UNIQUE, -- Ej. "Cada 15 minutos", "Cada hora", etc.
    minutosIntervalo INT NOT NULL UNIQUE, -- Ej. 15 para cada 15 minutos, 60 para cada hora, etc.
    PRIMARY KEY (idFrecuencia)
);

CREATE TABLE ConfigurarCopia (
    idConfigurarCopia INT IDENTITY(1,1) NOT NULL,
    idTipoCopia INT NOT NULL,
    idDia INT NOT NULL, 
    idFrecuencia INT NOT NULL, -- Nueva columna para la frecuencia de la copia
    horaInicioCopia TIME NOT NULL, -- Cambiado a TIME para manejar horas
    PRIMARY KEY (idConfigurarCopia),
    FOREIGN KEY (idTipoCopia) REFERENCES TipoCopia (idTipoCopia),
    FOREIGN KEY (idDia) REFERENCES Dia (idDia),
    FOREIGN KEY (idFrecuencia) REFERENCES FrecuenciaCopia (idFrecuencia)
);


CREATE TABLE TipoUsuario(
    idTipoUsuario INTEGER PRIMARY KEY AUTOINCREMENT,
    nombreTipo VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE Usuario(
    idUsuario INTEGER PRIMARY KEY AUTOINCREMENT,
    usuario varchar(20) NOT NULL UNIQUE,
    correo varchar(50) NOT NULL CHECK (correo LIKE '%_@_%._%') UNIQUE,
    contrasena varchar(30) NOT NULL,
    estado char(1) NOT NULL DEFAULT 'A',
    fechaRegistro date NOT NULL,
    idTipoUsuario int NOT NULL, 
    FOREIGN KEY(idTipoUsuario) REFERENCES TipoUsuario(idTipoUsuario)   
);

CREATE TABLE BaseDatos(
    idDatabase INTEGER PRIMARY KEY AUTOINCREMENT,
    nameDatabase VARCHAR(50) NOT NULL UNIQUE,
    idUsuario int NOT NULL,
    fechaRegistro datetime NOT NULL, 
    FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario)
);

CREATE TABLE TipoCopia(
    idTipoCopia INTEGER PRIMARY KEY AUTOINCREMENT,
    nombreCopia VARCHAR(20) UNIQUE NOT NULL CHECK (nombreCopia IN ('FULL', 'Differential', 'Transaction Log'))
);

-- Almacena los días de la semana
CREATE TABLE Dia(
    idDia INTEGER PRIMARY KEY AUTOINCREMENT,
    dia varchar(10) NOT NULL UNIQUE
);

CREATE TABLE FrecuenciaCopia (
    idFrecuencia INTEGER PRIMARY KEY AUTOINCREMENT,
    nombreFrecuencia VARCHAR(50) NOT NULL UNIQUE, -- Ej. "Cada 15 minutos", "Cada hora", etc.
    minutosIntervalo INT NOT NULL UNIQUE -- Ej. 15 para cada 15 minutos, 60 para cada hora, etc.
);

CREATE TABLE ConfigurarCopia (
    idConfigurarCopia INTEGER PRIMARY KEY AUTOINCREMENT,
    idTipoCopia INT NOT NULL,
    idDia INT NOT NULL, 
    idFrecuencia INT NOT NULL, -- Nueva columna para la frecuencia de la copia
    horaInicioCopia TIME NOT NULL, -- Cambiado a TIME para manejar horas
    FOREIGN KEY (idTipoCopia) REFERENCES TipoCopia (idTipoCopia),
    FOREIGN KEY (idDia) REFERENCES Dia (idDia),
    FOREIGN KEY (idFrecuencia) REFERENCES FrecuenciaCopia (idFrecuencia)
);

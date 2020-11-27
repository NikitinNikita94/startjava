CREATE DATABASE jaegers;

CREATE TABLE Robots(
    id        SERIAL PRIMARY KEY,
    modelName TEXT,
    mark      CHAR(10),
    height    INTEGER,
    weight    INTEGER,
    status    TEXT,
    origin    TEXT,
    launch    DATE,
    kaijuKill INTEGER
);
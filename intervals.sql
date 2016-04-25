CREATE TABLE Category (Id integer PRIMARY KEY NOT NULL, Description TEXT, PathToSound TEXT);

CREATE TABLE UserSession (Id integer PRIMARY KEY NOT NULL, Created datetime);

CREATE TABLE Series(Id integer PRIMARY KEY NOT NULL,Repeats integer, UserSessionId integer REFERENCES UserSession(Id));

CREATE TABLE SeriesPart (Id integer PRIMARY KEY NOT NULL, Seconds integer, CategoryId REFERENCES Category(Id), SeriesId References Series(Id));


INSERT INTO Category VALUES(1,'Sprint','');
INSERT INTO Category VALUES(2,'Trucht','');

/*
WIDOK Pierwszy:

Nowa sesja:

Nowa seria:
	dodanie czêœci: nazwa, czas


Ostatnia sesja

Konfiguracja (sama góra)




*/
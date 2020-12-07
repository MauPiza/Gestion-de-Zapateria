CREATE DATABASE shoe_store;
USE shoe_store;
CREATE TABLE catalogue
(
    id_catalog int(3) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    type_catalog varchar(20),
    stock int(30)
);
CREATE TABLE article
(
    id_article int(3) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    id_catalogue int(3) NOT NULL,
    name_article varchar(50),
    price decimal(5,2), 
    existence boolean,
    FOREIGN KEY(id_catalogue) REFERENCES catalogue(id_catalog) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE TABLE sales
(
    folio int(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    id_catalog int(3) NOT NULL,
    id_article int(3) NOT NULL,
    name_article varchar(50),
    price decimal(5,2),
    sale_date date,
    FOREIGN KEY (id_catalog) REFERENCES catalogue(id_catalog) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (id_article) REFERENCES article(id_article) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO catalogue VALUES(NULL,"Zapatillas", 30);
INSERT INTO catalogue VALUES(NULL,"Zapato cerrado", 30);
INSERT INTO catalogue VALUES(NULL,"Tenis", 30);
INSERT INTO catalogue VALUES(NULL,"Huaraches", 30);

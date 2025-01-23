-- Création de la table 'produit'
CREATE TABLE IF NOT EXISTS produits (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    description VARCHAR(255) NOT NULL,
    prix DOUBLE NOT NULL CHECK (prix > 0)
);

-- Insertion de 10 produits dans la table 'produit'
INSERT INTO produits (nom, description, prix) VALUES ('Produit 1', 'Description du Produit 1', 10.99);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 2', 'Description du Produit 2', 20.49);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 3', 'Description du Produit 3', 15.79);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 4', 'Description du Produit 4', 25.99);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 5', 'Description du Produit 5', 30.00);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 6', 'Description du Produit 6', 45.50);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 7', 'Description du Produit 7', 50.00);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 8', 'Description du Produit 8', 5.00);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 9', 'Description du Produit 9', 8.25);
INSERT INTO produits (nom, description, prix) VALUES ('Produit 10', 'Description du Produit 10', 12.49);

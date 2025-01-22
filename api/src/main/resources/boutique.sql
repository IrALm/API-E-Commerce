-- Table Categories
DROP TABLE IF EXISTS Categories;
CREATE TABLE Categories (
    id_categorie INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL
);

-- Table Produits
DROP TABLE IF EXISTS Produits;
CREATE TABLE Produits (
    id_produit INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    description TEXT,
    prix DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL,
    categorie_id INT,
    FOREIGN KEY (categorie_id) REFERENCES Categories(id_categorie)
);
INSERT INTO Categories (nom) VALUES
('Électronique'),
('Vêtements et mode'),
('Maison et décoration'),
('Produits de beauté et soins personnels'),
('Alimentation et boissons'),
('Sports et loisirs'),
('Jouets et jeux'),
('Livres, musique et films'),
('Santé et bien-être'),
('Automobile');

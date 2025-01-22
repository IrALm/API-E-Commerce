# API RESTful de Gestion des Produits  

Cette API RESTful, créée avec **Spring Boot**, permet de gérer les produits d'une boutique en ligne en exposant des endpoints pour créer, mettre à jour, afficher et supprimer des produits.  

---

## **Technologies et Dépendances**  

- **Spring Web** : Pour la création d'API RESTful.  
- **Lombok** : Pour réduire le boilerplate code dans les classes Java.  
- **H2 Database** : Base de données embarquée pour le développement et les tests.  
- **Spring Data JPA** : Pour la gestion de la persistance des données.  

---

## **Structure du Projet**  

Le projet suit une architecture **MVC** avec les packages suivants :  
- **Controller** : Gère les endpoints RESTful.  
- **Service** : Contient la logique métier.  
- **Repository** : Interagit avec la base de données via Spring Data JPA.  
- **Model** : Représente les entités de données.  

Grâce à **Spring Boot**, la configuration de la base de données est simplifiée, nécessitant uniquement l'activation de la console H2 pour faciliter le développement et les tests.  

---

## **Contrôleur REST**  

Le contrôleur REST gère les requêtes HTTP entrantes et renvoie des réponses appropriées.  
### **Points clés** :
- **Annotations principales** :  
  - `@RestController` : Indique que cette classe gère des endpoints REST.  
  - `@RequestMapping("/api/products")` : Définit le chemin de base pour tous les endpoints relatifs aux produits.  

- **Endpoints courants** :  
  - `@GetMapping` : Récupérer des données (liste ou détails d’un produit).  
  - `@PostMapping` : Ajouter un nouveau produit.  
  - `@PutMapping` : Mettre à jour un produit existant.  
  - `@DeleteMapping` : Supprimer un produit.  

Les requêtes et réponses sont échangées au format JSON grâce à **Spring Web**.  

---

## **Tests**  

### **Tests unitaires** :  
- **Objectif** : Vérifier le bon fonctionnement des endpoints REST en isolant les contrôleurs du reste de l'application.  
- **Annotation principale** : `@WebMvcTest`  
- **Technologie utilisée** : `MockMvc` pour simuler des requêtes HTTP et valider les réponses.  

### **Tests d'intégration** :  
- **Objectif** : Valider le fonctionnement global de l'application, y compris l'interaction entre les contrôleurs, les services et la base de données H2.  
- **Annotations principales** :  
  - `@SpringBootTest` : Charge l'ensemble du contexte Spring.  
  - `@AutoConfigureMockMvc` : Active MockMvc pour tester les endpoints.  

---

## **Commandes de Déploiement**  

### **Prérequis** :  
- Installer **Java 17+**.  
- Installer **Maven 3.8+**.  
- Configurer votre IDE (Eclipse, IntelliJ, etc.) ou utiliser une ligne de commande.  

### **Étapes de Déploiement** :  

1. **Cloner le Repository** :  
   ```bash
   git clone https://github.com/votre-utilisateur/nom-du-repository.git
   cd nom-du-repository

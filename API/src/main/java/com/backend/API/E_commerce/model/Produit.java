package com.backend.API.E_commerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data // Génère automatiquement getters, setters, equals, hashCode, et toString
@NoArgsConstructor // Génère un constructeur sans arguments
@AllArgsConstructor // Génère un constructeur avec tous les arguments
@Table(name = "produits")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrément pour la clé primaire
    private Long id;

    @NotBlank(message = "Le nom est obligatoire") // Validation : champ non vide
    @Size(max = 100, message = "Le nom ne doit pas dépasser 100 caractères")
    private String nom;

    @NotBlank(message = "La description est obligatoire") // Validation : champ non vide
    @Size(max = 255, message = "La description ne doit pas dépasser 255 caractères")
    private String description;

    @NotNull(message = "Le prix est obligatoire") // Validation : ne peut pas être null
    @Positive(message = "Le prix doit être supérieur à zéro") // Validation : supérieur à zéro
    private Double prix;
}

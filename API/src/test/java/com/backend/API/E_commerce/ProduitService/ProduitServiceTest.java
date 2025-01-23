package com.backend.API.E_commerce.ProduitService;

import com.backend.API.E_commerce.repository.ProduitRepository;
import com.backend.API.E_commerce.service.ProduitService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.backend.API.E_commerce.model.Produit;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ProduitServiceTest {

    @Mock
    private ProduitRepository repository;

    @InjectMocks
    private ProduitService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void DoisRetournerTousLesProduits() {
        // Arrange
        Produit produit1 = new Produit(1L, "Produit 1", "Description du Produit 1", 10.0);
        Produit produit2 = new Produit(2L, "Produit 2", "Description du Produit 2", 20.0);

        when(repository.findAll()).thenReturn(Arrays.asList(produit1, produit2));

        // Act
        List<Produit> produits = service.getAllProduits();

        // Assert
        assertEquals(2, produits.size());
        assertThat(produits.get(0).getNom()).isEqualTo("Produit 1");
        assertThat(produits.get(0).getDescription()).isEqualTo("Description du Produit 1");
        assertThat(produits.get(0).getPrix()).isEqualTo(10.0);

        assertThat(produits.get(1).getNom()).isEqualTo("Produit 2");
        assertThat(produits.get(1).getDescription()).isEqualTo("Description du Produit 2");
        assertThat(produits.get(1).getPrix()).isEqualTo(20.0);
    }
}

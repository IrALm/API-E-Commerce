package com.backend.API.E_commerce.ProduitController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
public class ProduitControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void DoisRetournerTousLesProduits() throws Exception {
        mockMvc.perform(get("/api/produits"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void DoisAjouterProduit() throws Exception {
        String newProduit = """
                {
                    "nom" : "Test Produit",
                    "description" : "Test Description",
                    "prix": 29.99
                }
                """;

        mockMvc.perform(post("/api/produits")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(newProduit))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nom").value("Test Produit"))
                .andExpect(jsonPath("$.prix").value(29.99));
    }

    @Test
    void NajoutePasEntreerInvalid() throws Exception {
        String produitInvalid = """
            {
                "nom" : "",
                "description" : "",
                "prix" : -10
            }
            """;

        mockMvc.perform(post("/api/produits")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(produitInvalid))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.nom").value("Le nom est obligatoire"))
                .andExpect(jsonPath("$.description").value("La description est obligatoire"))
                .andExpect(jsonPath("$.prix").value("Le prix doit être supérieur à zéro"));
    }

}


package com.backend.API.E_commerce.controller;
import com.backend.API.E_commerce.model.Produit;
import com.backend.API.E_commerce.service.ProduitService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProduitController {

    private final ProduitService service ;

    public ProduitController( ProduitService _serv){
        this.service = _serv;
    }
    @GetMapping("/produits")
    public List<Produit> getProduits(){
        System.out.println("Produits récupérés : " + service.getAllProduits());
        return service.getAllProduits();
    }
    @PostMapping("/produits")
    public Produit addProduit(@Valid @RequestBody Produit prod){
        System.out.println("Produit ajouté : " + service.saveProduit(prod));
        return service.saveProduit(prod);
    }
    @DeleteMapping("/produits/{id}")
    public void deleteProduit(@PathVariable Long id) {
        System.out.println("Produit effacé : " );
        service.deleteProduit(id);
    }
}

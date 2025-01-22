package com.backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.api.model.Categorie;
import com.backend.api.service.CategorieService;

@RestController
@RequestMapping("/api")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/Categories")
    public Iterable<Categorie> getCategories(){
        return categorieService.getCategories();
    }
    @PostMapping("/Categories")
    public Categorie addCategorie(@RequestBody Categorie newcategorie){
        return categorieService.saveCategorie(newcategorie);
    }
    @DeleteMapping("/Categorie/{id_categorie}")
    public String deleteCategorie(@PathVariable Long id){
        categorieService.deleteCategorie(id);
        return "Categorie Supprimée avec Succès";
    }
}

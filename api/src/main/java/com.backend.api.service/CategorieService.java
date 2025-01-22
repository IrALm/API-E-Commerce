package com.backend.api.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.api.model.Categorie;
import com.backend.api.repository.CategorieRepository;
import lombok.Data;

@Data
@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public Optional<Categorie> getCategorie( final Long id){
        return categorieRepository.findById(id);
    }

    public Iterable<Categorie> getCategories(){
        return categorieRepository.findAll();
    }
    public void deleteCategorie( final  Long id){
        categorieRepository.deleteById((id));
    }
    public Categorie saveCategorie( Categorie categorie){

        Categorie saveCategorie = categorieRepository.save(categorie);
        return saveCategorie;
    }
}

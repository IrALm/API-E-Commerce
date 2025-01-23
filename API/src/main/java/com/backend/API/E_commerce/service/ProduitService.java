package com.backend.API.E_commerce.service;
import com.backend.API.E_commerce.repository.ProduitRepository;
import com.backend.API.E_commerce.model.Produit;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {


    private final ProduitRepository repository;

    public ProduitService(ProduitRepository _rep){
        this.repository = _rep;
    }

    public List<Produit> getAllProduits(){
        List<Produit> produits = repository.findAll();
        if(produits.isEmpty() ) System.out.println("aucun produit disponible");
        else System.out.println("produits disponibles");
        return produits;
    }

    public Produit saveProduit( Produit prod ){
        System.out.println("produit sauvegardé");
        return repository.save(prod);
    }

    public void deleteProduit(Long id){
        repository.deleteById(id);
    }
}

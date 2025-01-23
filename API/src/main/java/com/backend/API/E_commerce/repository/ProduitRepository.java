package com.backend.API.E_commerce.repository;
import com.backend.API.E_commerce.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit , Long>{
}

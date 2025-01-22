package com.backend.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.backend.api.model.Categorie;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long>{
}

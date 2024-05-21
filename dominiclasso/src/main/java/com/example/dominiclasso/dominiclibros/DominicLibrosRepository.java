package com.example.dominiclasso.dominiclibros;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DominicLibrosRepository extends CrudRepository<DominicLibros, Long> {
    List<DominicLibros> findAll();
    DominicLibros findByTitulo(String titulo);
    void deleteByTitulo(String titulo);

}   

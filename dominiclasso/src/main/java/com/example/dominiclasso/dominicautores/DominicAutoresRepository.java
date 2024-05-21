package com.example.dominiclasso.dominicautores;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DominicAutoresRepository extends CrudRepository<DominicAutores, Long> {
    List<DominicAutores> findAll();
}

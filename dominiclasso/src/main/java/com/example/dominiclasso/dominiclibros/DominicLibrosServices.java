package com.example.dominiclasso.dominiclibros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DominicLibrosServices {

    @Autowired
    private DominicLibrosRepository dominicLibrosRepository;

    public DominicLibros save(DominicLibros entity)
    {
        return dominicLibrosRepository.save(entity);
    }

    public DominicLibros findById(Long id)
    {
        return dominicLibrosRepository.findById(id).orElse(null);
    }

    public void deleteById( long id)
    {
        dominicLibrosRepository.deleteById(id);
        {
            dominicLibrosRepository.deleteById(id);
        }
    }

    public void deleteByTitulo(String titulo) {
        dominicLibrosRepository.deleteByTitulo(titulo);
    }

    public List<DominicLibros> findAll()
    {
        return dominicLibrosRepository.findAll();
    }

    
}

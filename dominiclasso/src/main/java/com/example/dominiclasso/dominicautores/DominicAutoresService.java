package com.example.dominiclasso.dominicautores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DominicAutoresService {
  
    @Autowired
    private DominicAutoresRepository dominicAutoresRepository;

    public DominicAutores save(DominicAutores entity)
    {
        return dominicAutoresRepository.save(entity);
    }

   public DominicAutores findById(Long id)
    {
        return dominicAutoresRepository.findById(id).orElse(null);
    }

    public void deleteById( long id)
    {
        dominicAutoresRepository.deleteById(id);
        {
            dominicAutoresRepository.deleteById(id);
        }
    }

    public List<DominicAutores> findAll()
    {
        return dominicAutoresRepository.findAll();
    }
 
}

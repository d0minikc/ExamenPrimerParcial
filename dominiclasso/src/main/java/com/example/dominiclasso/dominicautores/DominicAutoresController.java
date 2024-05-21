package com.example.dominiclasso.dominicautores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;


@RestController
@RequestMapping("/dominicAutores")
public class DominicAutoresController {
    
    @Autowired
    private DominicAutoresService dominicAutoresService;

    @PostMapping("/")
    public DominicAutores save(@RequestBody DominicAutores entity)
    {
        return dominicAutoresService.save(entity);
    }

     @GetMapping("/{id}")
    public DominicAutores findById(@PathVariable Long id)
    {
        return dominicAutoresService.findById(id);
    }

     @PutMapping("/")
    public DominicAutores Update(@RequestBody DominicAutores entity)
    {
        return dominicAutoresService.save(entity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        dominicAutoresService.deleteById(id);
    }

    @GetMapping("/")
    public List<DominicAutores> findAll()
    {
        return dominicAutoresService.findAll();
    }

}

package com.example.dominiclasso.dominiclibros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dominicLibros")
public class DominicLibrosController {

    @Autowired
    private DominicLibrosServices dominicLibrosServices;
    
    @PostMapping("/")
    public DominicLibros save(@RequestBody DominicLibros entity)
    {
        return dominicLibrosServices.save(entity);
    }

      @GetMapping("/{id}")
    public DominicLibros findById(@PathVariable Long id)
    {
        return dominicLibrosServices.findById(id);
    }

     @PutMapping("/")
    public DominicLibros Update(@RequestBody DominicLibros entity)
    {
        return dominicLibrosServices.save(entity);
    }

     @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        dominicLibrosServices.deleteById(id);
    }

    @DeleteMapping("/titulo/{titulo}")
    public ResponseEntity<String> deleteByTitulo(@PathVariable String titulo) {
        dominicLibrosServices.deleteByTitulo(titulo);
        return ResponseEntity.ok("Estudiante eliminado exitosamente.");
    }

    @GetMapping("/")
    public List<DominicLibros> findAll()
    {
        return dominicLibrosServices.findAll();
    }

}

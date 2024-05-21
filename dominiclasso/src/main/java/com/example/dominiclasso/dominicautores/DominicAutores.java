package com.example.dominiclasso.dominicautores;

import java.sql.Date;

import com.example.dominiclasso.dominiclibros.DominicLibros;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class DominicAutores {
    
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 15)
    private String nombre;
    @Column(length = 100)
    private Date fecha_nacimiento;
    @Column(length = 100)
    private Number telefono;
    @Column(length = 100)
    private Boolean activo;
    @ManyToOne
    private DominicLibros libro;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public Number getTelefono() {
        return telefono;
    }
    public void setTelefono(Number telefono) {
        this.telefono = telefono;
    }
    public Boolean getActivo() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}

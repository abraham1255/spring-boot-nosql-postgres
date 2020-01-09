package com.example.crudprofesores.controller;

import com.example.crudprofesores.model.Profesor;
import com.example.crudprofesores.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {
    @Autowired
    ProfesorRepository profesorRepository;

    @GetMapping("/getAll")
    public List<Profesor> getProfesor (){
        return profesorRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Profesor getAllProfesors (@PathVariable Integer id){

        return profesorRepository.findById(id);
    }

    @PostMapping("/addProfesor")
    public Profesor addProfesor (@RequestBody Profesor profesor){
        profesorRepository.save(profesor);
        return profesor;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProfesors (@PathVariable Integer id){
        profesorRepository.deleteById(id);
        return "PROFESOR ELIMINADO"+id;
    }
}

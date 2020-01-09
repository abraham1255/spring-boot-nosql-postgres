package com.example.crudprofesores.repository;

import com.example.crudprofesores.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ProfesorRepository extends JpaRepository<Profesor,Long> {
    Profesor findById(int id);
    public void deleteById(int id);
}

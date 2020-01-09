package com.example.crudprofesores.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class Profesor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private CaracteristicasProfesor caracteristicasProfesor;

    public CaracteristicasProfesor getCaracteristicasProfesor() {
        return caracteristicasProfesor;
    }

    public void setCaracteristicasProfesor(CaracteristicasProfesor caracteristicasProfesor) {
        this.caracteristicasProfesor = caracteristicasProfesor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Profesor() {
    }
}

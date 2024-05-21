package com.pabon.examenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pabon.common.usuario.models.entity.Examen;

@Repository
public interface ExamenRepository extends CrudRepository<Examen, Long> {

}

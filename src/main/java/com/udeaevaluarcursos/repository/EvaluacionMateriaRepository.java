package com.udeaevaluarcursos.repository;

import com.udeaevaluarcursos.models.EvaluacionMateria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluacionMateriaRepository extends JpaRepository<EvaluacionMateria,Integer> {


}

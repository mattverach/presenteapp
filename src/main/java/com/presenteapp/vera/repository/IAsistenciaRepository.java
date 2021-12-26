package com.presenteapp.vera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.presenteapp.vera.model.Asistencia;

@Repository
public interface IAsistenciaRepository extends JpaRepository<Asistencia, Integer> {

}

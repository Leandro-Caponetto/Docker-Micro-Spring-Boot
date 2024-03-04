package com.leandro.springcloud.msvc.cursos.repository;

import com.leandro.springcloud.msvc.cursos.model.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}

package com.leandro.springcloud.msvc.cursos.service;

import com.leandro.springcloud.msvc.cursos.model.Usuario;
import com.leandro.springcloud.msvc.cursos.model.entity.Curso;
import com.leandro.springcloud.msvc.cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface CursoService {

   List<Curso> listar();
   Optional<Curso> porId(Long id);
   Curso guardar(Curso curso);
   void eliminar(Long id);

   Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);
   Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);
   Optional<Usuario> eliminarUsuario(Usuario usuario, Long cursoId);


}

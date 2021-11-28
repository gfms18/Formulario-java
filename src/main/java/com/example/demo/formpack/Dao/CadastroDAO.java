package com.example.demo.formpack.Dao;

import com.example.demo.formpack.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroDAO extends JpaRepository<Grupo, Long> {

    public Grupo findGrupoByNome(String nome);
}

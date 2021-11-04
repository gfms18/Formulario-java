package com.example.demo.formpack.Dao;

import com.example.demo.formpack.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroDAO extends JpaRepository<Pessoa, Long> {
}

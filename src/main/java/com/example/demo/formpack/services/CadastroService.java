package com.example.demo.formpack.services;

import com.example.demo.formpack.Dao.CadastroDAO;
import com.example.demo.formpack.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastroService {

   @Autowired
   private CadastroDAO cadastroDAO;

   public void cadastrarGrupo(Pessoa pessoa){
      cadastroDAO.save(pessoa);


   }


}

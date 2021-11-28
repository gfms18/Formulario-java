package com.example.demo.formpack.services;

import com.example.demo.formpack.Dao.CadastroDAO;
import com.example.demo.formpack.Grupo;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroService {

   @Autowired
   private CadastroDAO cadastroDAO;

   public void cadastrarGrupo(Grupo grupo) throws Exception {
      Grupo grupo1 = cadastroDAO.findGrupoByNome(grupo.getNome());
      if (grupo.getTempoDuracao() <= 2) {
         throw new Exception("Musica menor que 2 minutos.");
      }
      if (grupo1 == null) {
         cadastroDAO.save(grupo);
      } else if (grupo1.getNome().toLowerCase().equalsIgnoreCase(grupo.getNome()) ){
         throw new Exception("Nome já exite, tente outro.");

         } else {
         cadastroDAO.save(grupo);
      }

      }

   public List<Grupo> findAll() {
      return cadastroDAO.findAll();
   }

   public List<Grupo> findAll(Sort sort) {
      return cadastroDAO.findAll(sort);
   }

   public List<Grupo> findAllById(Iterable<Long> longs) {
      return cadastroDAO.findAllById(longs);
   }

   public <S extends Grupo> List<S> saveAll(Iterable<S> entities) {
      return cadastroDAO.saveAll(entities);
   }

   public void flush() {
      cadastroDAO.flush();
   }

   public <S extends Grupo> S saveAndFlush(S entity) {
      return cadastroDAO.saveAndFlush(entity);
   }

   public <S extends Grupo> List<S> saveAllAndFlush(Iterable<S> entities) {
      return cadastroDAO.saveAllAndFlush(entities);
   }

   @Deprecated
   public void deleteInBatch(Iterable<Grupo> entities) {
      cadastroDAO.deleteInBatch(entities);
   }

   public void deleteAllInBatch(Iterable<Grupo> entities) {
      cadastroDAO.deleteAllInBatch(entities);
   }

   public void deleteAllByIdInBatch(Iterable<Long> longs) {
      cadastroDAO.deleteAllByIdInBatch(longs);
   }

   public void deleteAllInBatch() {
      cadastroDAO.deleteAllInBatch();
   }

   @Deprecated
   public Grupo getOne(Long aLong) {
      return cadastroDAO.getOne(aLong);
   }

   public Grupo getById(Long aLong) {
      return cadastroDAO.getById(aLong);
   }

   public <S extends Grupo> List<S> findAll(Example<S> example) {
      return cadastroDAO.findAll(example);
   }

   public <S extends Grupo> List<S> findAll(Example<S> example, Sort sort) {
      return cadastroDAO.findAll(example, sort);
   }

   public Page<Grupo> findAll(Pageable pageable) {
      return cadastroDAO.findAll(pageable);
   }

   public <S extends Grupo> S save(S entity) {
      return cadastroDAO.save(entity);
   }

   public Optional<Grupo> findById(Long aLong) {
      return cadastroDAO.findById(aLong);
   }

   public boolean existsById(Long aLong) {
      return cadastroDAO.existsById(aLong);
   }

   public long count() {
      return cadastroDAO.count();
   }

   public void deleteById(Long aLong) {
      cadastroDAO.deleteById(aLong);
   }

   public void delete(Grupo entity) {
      cadastroDAO.delete(entity);
   }

   public void deleteAllById(Iterable<? extends Long> longs) {
      cadastroDAO.deleteAllById(longs);
   }

   public void deleteAll(Iterable<? extends Grupo> entities) {
      cadastroDAO.deleteAll(entities);
   }

   public void deleteAll() {
      cadastroDAO.deleteAll();
   }

   public <S extends Grupo> Optional<S> findOne(Example<S> example) {
      return cadastroDAO.findOne(example);
   }

   public <S extends Grupo> Page<S> findAll(Example<S> example, Pageable pageable) {
      return cadastroDAO.findAll(example, pageable);
   }

   public <S extends Grupo> long count(Example<S> example) {
      return cadastroDAO.count(example);
   }

   public <S extends Grupo> boolean exists(Example<S> example) {
      return cadastroDAO.exists(example);
   }
}

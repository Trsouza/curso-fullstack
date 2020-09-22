package br.com.digitalhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}

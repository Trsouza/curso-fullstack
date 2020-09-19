package br.com.digitalhouse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

//	@Query("from Cliente where nome like :nome")
//	List<Cliente> buscarNomeRepo(String nome);

	List<Cliente> findByNome(String nome);

	//@Query("FROM Cliente where (TIMESTAMPDIFF(YEAR, dataNasci, CURRENT_DATE)) >=18")
	@Query("from Cliente where (YEAR(FROM_DAYS(DATEDIFF(CURRENT_DATE, dataNasci)))) >=18")
	List<Cliente> maiores();


//	@Query(value = "select * FROM Cliente INNER JOIN Telefone on Cliente.id_cli=Telefone.id", nativeQuery=true)
//	List<Cliente> listarClientesTelefones();

}
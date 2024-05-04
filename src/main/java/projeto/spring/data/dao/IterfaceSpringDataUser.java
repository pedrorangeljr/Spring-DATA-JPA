package projeto.spring.data.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import projeto.spring.data.model.UsuarioSpringData;

@Repository
public interface IterfaceSpringDataUser extends CrudRepository<UsuarioSpringData, Long>{

	@Query(value = "select p from UsuarioSpringData p where p.nome like %?1%")
	public List<UsuarioSpringData> buscarPorNome (String nome);
	
	
	@Query(value = "select p from UsuarioSpringData p where p.nome = :paramNome")
	public UsuarioSpringData buscarPorNomeParam (@Param("paramNome") String paramNome);
	
	@Modifying
	@Transactional
	@Query(value = "delete from UsuarioSpringData u where u.nome = ?1")
	public void deletePorNome (String nome);
}

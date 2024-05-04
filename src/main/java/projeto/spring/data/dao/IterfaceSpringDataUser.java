package projeto.spring.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projeto.spring.data.model.UsuarioSpringData;

@Repository
public interface IterfaceSpringDataUser extends CrudRepository<UsuarioSpringData, Long>{

	
}

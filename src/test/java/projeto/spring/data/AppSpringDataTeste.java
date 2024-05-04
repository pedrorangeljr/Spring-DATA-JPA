package projeto.spring.data;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import projeto.spring.data.dao.IterfaceSpringDataUser;
import projeto.spring.data.model.UsuarioSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring-config.xml" })
public class AppSpringDataTeste {

	@Autowired
	private IterfaceSpringDataUser interfaceSpringDataUser;

	/*
	 * @Test public void testeInsert() {
	 * 
	 * UsuarioSpringData usuarioSpringData = new UsuarioSpringData();
	 * 
	 * usuarioSpringData.setEmail("teste@gmail.com");
	 * usuarioSpringData.setIdade(38); usuarioSpringData.setLogin("teste");
	 * usuarioSpringData.setNome("Teste5"); usuarioSpringData.setSenha("Ra252563");
	 * 
	 * interfaceSpringDataUser.save(usuarioSpringData);
	 * 
	 * System.out.println("Usuarios cadastrados -> " +
	 * interfaceSpringDataUser.count()); }
	 */

	/*
	 * @Test public void consultar() {
	 * 
	 * Optional<UsuarioSpringData> usuarioSpringData =
	 * interfaceSpringDataUser.findById(3L);
	 * 
	 * 
	 * System.out.println(usuarioSpringData.get().getEmail());
	 * System.out.println(usuarioSpringData.get().getIdade());
	 * System.out.println(usuarioSpringData.get().getLogin());
	 * System.out.println(usuarioSpringData.get().getNome());
	 * 
	 * }
	 */

	/*
	 * @Test public void consultaTodos() {
	 * 
	 * Iterable<UsuarioSpringData> lista = interfaceSpringDataUser.findAll();
	 * 
	 * for(UsuarioSpringData usuarioSpringData : lista) {
	 * 
	 * System.out.println(usuarioSpringData.getId());
	 * System.out.println(usuarioSpringData.getEmail());
	 * System.out.println(usuarioSpringData.getIdade());
	 * System.out.println(usuarioSpringData.getLogin());
	 * System.out.println(usuarioSpringData.getNome());
	 * 
	 * System.out.println(
	 * "-----------------------------------------------------------"); } }
	 * 
	 * @Test public void testeUpdate() {
	 * 
	 * Optional<UsuarioSpringData> usuarioSpringData =
	 * interfaceSpringDataUser.findById(3L);
	 * 
	 * UsuarioSpringData data = usuarioSpringData.get();
	 * 
	 * data.setNome("Pedro Rangel"); data.setEmail("pedro@gmail.com");
	 * 
	 * interfaceSpringDataUser.save(data); }
	 * 
	 * @Test public void testDelete() {
	 * 
	 * Optional<UsuarioSpringData> usuarioSpringData =
	 * interfaceSpringDataUser.findById(7L);
	 * 
	 * interfaceSpringDataUser.delete(usuarioSpringData.get());
	 * 
	 * //interfaceSpringDataUser.deleteById(6L); }
	 */

	@Test
	public void testeConsultaNome() {

		List<UsuarioSpringData> list = interfaceSpringDataUser.buscarPorNome("pedro");

		for (UsuarioSpringData usuarioSpringData : list) {

			/*
			 * System.out.println(usuarioSpringData.getId());
			 * System.out.println(usuarioSpringData.getEmail());
			 * System.out.println(usuarioSpringData.getIdade());
			 * System.out.println(usuarioSpringData.getLogin());
			 */
			System.out.println(usuarioSpringData.getNome());

			System.out.println("-----------------------------------------------------------");
		}
	}
	
	/*@Test
	public void testeConsultaNomeParam() {

		UsuarioSpringData usuarioSpringData = interfaceSpringDataUser.buscarPorNomeParam("pedro");

		

			/*
			 * System.out.println(usuarioSpringData.getId());
			 * System.out.println(usuarioSpringData.getEmail());
			 * System.out.println(usuarioSpringData.getIdade());
			 * System.out.println(usuarioSpringData.getLogin());
			 
			System.out.println(usuarioSpringData.getNome());
	
	}*/
	
	@Test
	public void testeDeletePorNome() {
		
		interfaceSpringDataUser.deletePorNome("Teste5");
	}
}

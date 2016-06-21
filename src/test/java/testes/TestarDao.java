package testes;

import java.util.List;

import banco.DAO;
import org.junit.*;
import modelo.Adocao;

public class TestarDao {
	Adocao adocao = new Adocao();
	DAO dao = new DAO();
	
	Long idAdocao;
	
	@Test
	public void testarTodasOp(){
		adocao.setNomeAnunciante("Jorge");
		adocao.setTelefone("4456789000");
		adocao.setEndereco("Rua a");
		adocao.setNumCasa("4");
		adocao.setCpf("09066112964");
		
		adocao.setNomeAnimal("Bob");
		adocao.setDescricaoAnimal("atentado");
		adocao.setEspecie("cachorro");
		adocao.setPorte("pequeno");
		adocao.setPeso("3");
		adocao.setPelagem("pelos baixo, preto e branco");
		adocao.setRaca("vira lata");
		adocao.setSexo("macho");
		adocao.setCastrado("sim");
		adocao.setIdade(3);
		dao.inserir(adocao);
		
		//Verificar o tamanho da lista para ver se ela está retornando algo
		List<Adocao> listaAdocoes = dao.listar(Adocao.class);
		Assert.assertEquals(1, listaAdocoes.size());
		
		//Verificando se o nome do anunciante é igual ao informado
		Assert.assertEquals("Jorge", listaAdocoes.get(0).getNomeAnunciante());
		
		//Alterando o nome do animal
		adocao.setNomeAnimal("Tufa");
		dao.alterar(adocao);
		//Verificando a alteração do nome do animal
		Assert.assertEquals("Tufa", adocao.getNomeAnimal());
		
		//Verificando id
		Assert.assertEquals(idAdocao, adocao.getId());
		
		//Verificando pelo tamanho da lista se o registro foi excluido
		dao.exluir(adocao);
		Assert.assertEquals(0, listaAdocoes.size());
	}
}

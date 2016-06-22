package controle;

import banco.DAO;
import modelo.Adocao;

public class TesteDAO {

	public static void main(String [] args) {
		Adocao adocao = new Adocao();
		DAO dao = new DAO();
		
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
		adocao.setIdade("3");
		dao.inserir(adocao);

		
	}
}

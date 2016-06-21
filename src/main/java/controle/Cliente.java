package controle;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class Cliente {
	public static void main(String[] args){
		//criando um cliente de web service
		Client cli = ClientBuilder.newClient();
		//pegando o cliente e setando um alvo
		Boolean resul = cli.target("http://localhost:8080/ServicoWeb/resource/WebService/validarCpf").request().get(Boolean.class);
		System.out.println("Mensagem: " +resul);
		
		
		WebTarget target = cli.target("http://localhost:8080/ServicoWeb/resource/WebService/validarCnpjGet");		
		Boolean resul1 = target.queryParam("cnpj").request().get(Boolean.class);
		System.out.println(resul1);
	}

}

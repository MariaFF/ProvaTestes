package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import banco.DAO;
import modelo.Adocao;
import modelo.MausTratos;
import util.ValidarCNPJ;
import util.ValidarCpf;

/**
 * @author maria
 *
 */
@Path("/WebService")
@ApplicationPath("/resource")
public class HelloWebService extends Application{
	
	Adocao adocao = new Adocao();
	MausTratos mausTratos = new MausTratos();
	
	DAO dao = new DAO();
	
	
	/**
	 * Parametros usados no método SalvarAdocao
	 * 
	 * @param String nomeAnunciante
	 * @param String cpf
	 * @param String telefone
	 * @param String endereco
	 * @param String numCasa
	 * @param String nomeAnimal
	 * @param String descricaoAnimal
	 * @param String especie
	 * @param String porte
	 * @param String peso
	 * @param String pelagem
	 * @param String raca
	 * @param String sexo
	 * @param String castrado 
	 * @param Integer idade
	 */
	
	@POST
	@Path("/salvarAdocao")
	public void salvarAdocao(
			@FormParam("nomeAnunciante") String nomeAnunciante,
			@FormParam("cpf") String cpf,
			@FormParam("telefone") String telefone,
			@FormParam("endereco") String endereco,
			@FormParam("numCasa") String numCasa,
			@FormParam("nomeAnimal") String nomeAnimal,
			@FormParam("descricaoAnimal") String descricaoAnimal,
			@FormParam("especie") String especie,
			@FormParam("porte") String porte,
			@FormParam("peso") String peso,
			@FormParam("pelagem") String pelagem,
			@FormParam("raca") String raca,
			@FormParam("sexo") String sexo,
			@FormParam("castrado") String castrado,
			@FormParam("idade") Integer idade){
		
		try {
			adocao.setNomeAnunciante(nomeAnunciante);
			adocao.setCpf(cpf);
			adocao.setTelefone(telefone);
			adocao.setEndereco(endereco);
			adocao.setNumCasa(numCasa);
			adocao.setNomeAnimal(nomeAnimal);
			adocao.setDescricaoAnimal(descricaoAnimal);
			adocao.setEspecie(especie);
			adocao.setPorte(porte);
			adocao.setPeso(peso);
			adocao.setPelagem(pelagem);
			adocao.setRaca(raca);
			adocao.setSexo(sexo);
			adocao.setCastrado(castrado);
			adocao.setIdade(idade);
			
			dao.inserir(adocao);
			adocao = new Adocao();
			
			
		} catch (Exception e) {
			System.out.println("Erro ao tentar salvar Adoção");
			e.printStackTrace();
		}
		
	}
	
	//Registros de Adocao
	@GET
	@Path("/listaAdocao")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Adocao> listarAdocao() {
		List<Adocao> listaAdocoes = new ArrayList<>();
		listaAdocoes = dao.listar(Adocao.class);
		return listaAdocoes;
	}
	
	//FIM ADOÇÃO
	
	
	/**
	 *Parametros método salvarMausTratos
	 * @param String nome
	 * @param String telefone
	 * @param String descricaoAnimal
	 * @param String cidadeAnimal
	 * @param String longitude
	 * @param String altitude
	 */
	
	@POST
	@Path("/salvarMausTratos")
	public void salvaarMausTratos(
			@FormParam("nome") String nome,
			@FormParam("telefone") String telefone,
			@FormParam("descricaoAnimal") String descricaoAnimal,
			@FormParam("cidadeAnimal") String cidadeAnimal,
			@FormParam("longitude") String longitude,
			@FormParam("altitude") String altitude){
		
		try {
			mausTratos.setNome(nome);
			mausTratos.setTelefone(telefone);
			mausTratos.setDescricaoAnimal(descricaoAnimal);
			mausTratos.setCidadeAnimal(cidadeAnimal);
			mausTratos.setLongitude(longitude);
			mausTratos.setAltitude(altitude);
			
			dao.inserir(mausTratos);
			mausTratos = new MausTratos();
			
		} catch (Exception e) {
			System.out.println("Erro ao salvar Maus Tratos");
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * Retornar todos os registros 
	 */
	@GET
	@Path("/listaMausTratos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<MausTratos> listarMausTratos() {
		List<MausTratos> listaMausTratos = new ArrayList<>();
		listaMausTratos = dao.listar(MausTratos.class);
		return listaMausTratos;
	}
 }

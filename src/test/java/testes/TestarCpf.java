package testes;

import org.junit.*;

import util.ValidarCpf;

public class TestarCpf {

	ValidarCpf validarCPF = new ValidarCpf();

	// Verificar se o CPF informado é valido
	@Test
	public void testarCPF() {
		Assert.assertEquals(true, validarCPF.validacpf("09066112964"));
	}
}

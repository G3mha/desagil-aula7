package br.edu.insper.desagil.aula7.tikstik;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideoTest {
	private Video v;

	@BeforeEach
	private void setUp() {
		Produto produto = mock(Produto.class);
		v = new Video(produto);
	}

	private Usuario usuarioFalsoComNome(String nome) {
		Usuario usuario = mock(Usuario.class);
		when(usuario.getNome()).thenReturn(nome);
		return usuario;
	}

	@Test
	void mediaInteira() {
		v.adicionaAvaliacao(usuarioFalsoComNome("a"), 2);
		v.adicionaAvaliacao(usuarioFalsoComNome("b"), 3);
		v.adicionaAvaliacao(usuarioFalsoComNome("c"), 4);
		assertEquals(3, v.mediaAvaliacoes());
	}

	@Test
	void mediaUmQuarto() {
		v.adicionaAvaliacao(usuarioFalsoComNome("a"), 1);
		v.adicionaAvaliacao(usuarioFalsoComNome("b"), 2);
		v.adicionaAvaliacao(usuarioFalsoComNome("c"), 3);
		v.adicionaAvaliacao(usuarioFalsoComNome("d"), 3);
		assertEquals(2, v.mediaAvaliacoes());
	}

	@Test
	void mediaMeio() {
		v.adicionaAvaliacao(usuarioFalsoComNome("a"), 3);
		v.adicionaAvaliacao(usuarioFalsoComNome("b"), 4);
		assertEquals(4, v.mediaAvaliacoes());
	}

	@Test
	void mediaTresQuartos() {
		v.adicionaAvaliacao(usuarioFalsoComNome("a"), 1);
		v.adicionaAvaliacao(usuarioFalsoComNome("b"), 1);
		v.adicionaAvaliacao(usuarioFalsoComNome("c"), 2);
		v.adicionaAvaliacao(usuarioFalsoComNome("d"), 3);
		assertEquals(2, v.mediaAvaliacoes());
	}
}
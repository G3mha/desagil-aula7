package br.edu.insper.desagil.aula7.tikstik;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private static final double DELTA = 0.000001;

	private Usuario u;

	@BeforeEach
	private void setUp() {
		u = new Usuario("mariads");
	}

	private Video videoFalsoComMedia(int media) {
		Video video = mock(Video.class);
		when(video.mediaAvaliacoes()).thenReturn(media);
		return video;
	}

	@Test
	void mediaDeUm() {
		u.adicionaVideo(videoFalsoComMedia(1));
		assertEquals(1, u.mediaAvaliacoes(), DELTA);
	}

	@Test
	void mediaDeUmDois() {
		u.adicionaVideo(videoFalsoComMedia(1));
		u.adicionaVideo(videoFalsoComMedia(2));
		assertEquals(1.5, u.mediaAvaliacoes(), DELTA);
	}

	@Test
	void mediaDeUmTres() {
		u.adicionaVideo(videoFalsoComMedia(1));
		u.adicionaVideo(videoFalsoComMedia(3));
		assertEquals(2, u.mediaAvaliacoes(), DELTA);
	}

	@Test
	void mediaDeUmDoisTres() {
		u.adicionaVideo(videoFalsoComMedia(1));
		u.adicionaVideo(videoFalsoComMedia(3));
		assertEquals(2, u.mediaAvaliacoes(), DELTA);
	}

	@Test
	void mediaDeUmTresTres() {
		u.adicionaVideo(videoFalsoComMedia(1));
		u.adicionaVideo(videoFalsoComMedia(3));
		u.adicionaVideo(videoFalsoComMedia(3));
		assertEquals(2.333333333, u.mediaAvaliacoes(), DELTA);
	}
}
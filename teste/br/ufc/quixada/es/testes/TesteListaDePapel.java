package br.ufc.quixada.es.testes;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.ufc.quixada.es.DAOs.TarefaDAO;
import br.ufc.quixada.es.DAOs.UsuarioDAO;
import br.ufc.quixada.es.modelo.Tarefa;
import br.ufc.quixada.es.modelo.Usuario;

public class TesteListaDePapel {
	private Tarefa tarefa;
	private Usuario usuario;
	
	@Mock
	private TarefaDAO tarefaDao;
	private UsuarioDAO usuarioDao;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		tarefa = new Tarefa();
		usuario = new Usuario();
	}
	
	@Test
	public void insertTarefa() {
		when(tarefaDao.insert(tarefa)).thenReturn(true);
		boolean resposta = tarefaDao.insert(tarefa);
		
		assertEquals(true, resposta);
	}
	
	@Test
	public void insertUsuario() {
		when(usuarioDao.insert(usuario)).thenReturn(true);
		boolean resposta = usuarioDao.insert(usuario);
		
		assertEquals(true, resposta);
	}
	
	@Test
	public void deleteTarefa() {
		when(tarefaDao.insert(tarefa)).thenReturn(true);
		boolean resposta = tarefaDao.delete(tarefa);
		
		assertEquals(true, resposta);
	}
	
	@Test
	public void deleteUsuario() {
		when(usuarioDao.delete(usuario)).thenReturn(true);
		boolean resposta = usuarioDao.delete(usuario);
		
		assertEquals(true, resposta);
	}
}	
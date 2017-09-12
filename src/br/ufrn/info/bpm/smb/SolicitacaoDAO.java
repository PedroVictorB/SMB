package br.ufrn.info.bpm.smb;

import java.util.ArrayList;
import java.util.List;

public class SolicitacaoDAO {

	private static SolicitacaoDAO instance;
	private List<Solicitacao> listaSolicitacao = new ArrayList<Solicitacao>();
	
	public static synchronized SolicitacaoDAO getInstance() {
		if (instance == null) {
			instance = new SolicitacaoDAO();
		}
		return instance;
	}
	
	private SolicitacaoDAO() {
	}
	
	public void adicionarSolicitacao(Solicitacao p) {
		listaSolicitacao.add(p);
	}

	
	public Solicitacao procurarSolicitacao(long sigId) {
		Solicitacao soli = null;
		for (Solicitacao solicitacao : listaSolicitacao) {
			if (solicitacao.getId() == sigId) {
				soli = solicitacao;
				break;
			}
		}
		if (soli == null) {
			throw new RuntimeException("Solicitação não encontrada: " + sigId);
		}
		return soli;
	}

	public boolean isTodosAutenticaram() {
		return true; 
	}

}

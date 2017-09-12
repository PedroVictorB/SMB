package br.ufrn.info.bpm.smb;

import br.ufrn.info.bpm.api.GatewayObject;

public class GatewaySolicitacao extends GatewayObject<Solicitacao> {
	
	public GatewaySolicitacao(Solicitacao solicitacao) {
		super(solicitacao);
	}
	
	public boolean isAnaliseCoordenadorOk() {
		Solicitacao p = SolicitacaoDAO.getInstance().procurarSolicitacao(getSigId());
		if (!p.isAnaliseCoordenador()) {
			throw new RuntimeException("Informação não disponível: isAnaliseCoordenadorOk()");
		} else {
			return p.isAnaliseCoordenador();
		}
	}
	
	public boolean isAnaliseSetorComprasOk() {
		Solicitacao p = SolicitacaoDAO.getInstance().procurarSolicitacao(getSigId());
		if (!p.isAnaliseSetorDeCompras()) {
			throw new RuntimeException("Informação não disponível: isAnaliseSetorComprasOk()");
		} else {
			return p.isAnaliseSetorDeCompras();
		}
	}
	
	public boolean isTodosAutenticaram() {
		return SolicitacaoDAO.getInstance().isTodosAutenticaram();
	}
	
}

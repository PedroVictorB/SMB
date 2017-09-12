package br.ufrn.info.bpm.smb;

import br.ufrn.info.bpm.api.GatewayObject;

public class GatewaySolicitacao extends GatewayObject<Solicitacao> {
	
	public GatewaySolicitacao(Solicitacao progressao) {
		super(progressao);
	}
	
	public boolean isParecerOk() {
		Solicitacao p = SolicitacaoDAO.getInstance().procurarSolicitacao(getSigId());
		if (!p.isAnaliseCoordenador()) {
			throw new RuntimeException("Informação não disponível: getParecerOk()");
		} else {
			return p.isAnaliseCoordenador();
		}
	}
	
	public boolean isParecerRelatorOk() {
		Solicitacao p = SolicitacaoDAO.getInstance().procurarSolicitacao(getSigId());
		if (!p.isAnaliseSetorDeCompras()) {
			throw new RuntimeException("Informação não disponível: getParecerRelatorOk()");
		} else {
			return p.isAnaliseSetorDeCompras();
		}
	}
	
	public boolean isTodosAutenticaram() {
		return SolicitacaoDAO.getInstance().isTodosAutenticaram();
	}
	
}

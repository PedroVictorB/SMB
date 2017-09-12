package br.ufrn.info.bpm.smb;

import br.ufrn.info.bpm.api.GenericProcessAPI;

public class SolicitacaoProcAPI extends GenericProcessAPI<TarefaSolicitacao> {

	private static SolicitacaoProcAPI instance;
	
	public static synchronized SolicitacaoProcAPI getInstance() {
		if (instance == null) {
			instance = new SolicitacaoProcAPI();
		}
		return instance;
	}
	
	private SolicitacaoProcAPI() {
		super("Process_1");
	}
	
	@Override
	protected Object getGatewayObject(long sigId) {
		Solicitacao p = new Solicitacao();
		p.setId(sigId);
		return new GatewaySolicitacao(p);
	}
}

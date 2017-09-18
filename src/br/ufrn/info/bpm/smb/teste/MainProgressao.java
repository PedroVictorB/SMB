package br.ufrn.info.bpm.smb.teste;

import br.ufrn.info.bpm.api.BPMIntegrityException;
import br.ufrn.info.bpm.smb.Solicitacao;
import br.ufrn.info.bpm.smb.SolicitacaoDAO;
import br.ufrn.info.bpm.smb.SolicitacaoProcAPI;
import br.ufrn.info.bpm.smb.TarefaSolicitacao;

public class MainProgressao {

	// EXEMPLO DE USO
	public static void main(String[] args) throws BPMIntegrityException {
		long idSolicitacao = (long) (Math.random()*10000);
		
		Solicitacao solicitacao = new Solicitacao();
		solicitacao.setId(idSolicitacao);
		
		SolicitacaoDAO.getInstance().adicionarSolicitacao(solicitacao);

		SolicitacaoProcAPI api = SolicitacaoProcAPI.getInstance();

		// EMITIR NOVA SOLICITAÇÃO
		api.startNewProcessInstance(idSolicitacao);
//		api.startTask(TarefaProgressao.ORGANIZAR_PEDIDO, idPedidoProgressao);

		
		// SOLICITAR MATERIAL
		api.completeTask(TarefaSolicitacao.SOLICITAR_MATERIAL_ALUNO, idSolicitacao);
		
		// startProcessInstance(idProjeto);

		// COORDENADOR AVALIA
		solicitacao.setAnaliseCoordenador(true);
		solicitacao.setAnaliseSetorDeCompras(true);
		api.completeTask(TarefaSolicitacao.ANALISE_DO_COORDENADOR, idSolicitacao);
		
		// SETOR DE COMPRAS AVALIA
		
		api.completeTask(TarefaSolicitacao.ANALISE_DO_SETOR_DE_COMPRAS, idSolicitacao);
		
		// FLUXO DE COMPRAS
		api.completeTask(TarefaSolicitacao.FLUXO_DE_COMPRAS, idSolicitacao);
		
		// FLUXO DE TOMBAMENTO
		api.completeTask(TarefaSolicitacao.FLUXO_DE_TOMBAMENTO, idSolicitacao);
		
		// FLUXO DE TOMBAMENTO
		api.completeTask(TarefaSolicitacao.RECEBIMENTO_DO_BEM, idSolicitacao);
		
		System.out.println("fim");
	}
}

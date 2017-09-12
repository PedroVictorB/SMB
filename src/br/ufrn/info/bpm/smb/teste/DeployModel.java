package br.ufrn.info.bpm.smb.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.camunda.bpm.engine.repository.Deployment;

import br.ufrn.info.bpm.smb.SolicitacaoProcAPI;

public class DeployModel {

	public static void main(String[] args) throws FileNotFoundException {
		String model = "Processo de solicitação de material bibliografico.bpmn"; // COLOCAR AQUI O CAMINHO DO ARQUIVO .BPMN
		InputStream is = new FileInputStream(new File(model));
		Deployment d = SolicitacaoProcAPI.getInstance().deployDiagram(is);
	}

}

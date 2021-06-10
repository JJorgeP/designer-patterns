package br.com.jjp.loja.orcamento.situacao;

import br.com.jjp.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}

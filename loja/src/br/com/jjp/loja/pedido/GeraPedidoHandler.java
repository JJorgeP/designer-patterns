package br.com.jjp.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.jjp.loja.orcamento.ItemOrcamento;
import br.com.jjp.loja.orcamento.Orcamento;
import br.com.jjp.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acao;
	
	//injeção de dependencias para seviços de infra
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
//		this.acoes = acoes;
		acao = acoes;
	}

	public void execute(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
		
//		acoes.forEach(a -> a.executarAcao(pedido));
		this.acao.forEach(a -> a.executarAcao(pedido));

	}

}

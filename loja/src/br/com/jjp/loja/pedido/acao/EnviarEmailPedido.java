package br.com.jjp.loja.pedido.acao;

import br.com.jjp.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviar email com dados do pedido!");
	}

}

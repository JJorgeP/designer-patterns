package br.com.jjp.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.jjp.loja.pedido.GeraPedido;
import br.com.jjp.loja.pedido.GeraPedidoHandler;
import br.com.jjp.loja.pedido.acao.EnviarEmailPedido;
import br.com.jjp.loja.pedido.acao.LogDePedido;
import br.com.jjp.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {
	
	public static void main(String[] args) {
		//String cliente = args[0];
		String cliente = "Jorge";
		//BigDecimal valorOrcamento = new BigDecimal(args[1]);
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		//int quantidadeItens = Integer.parseInt(args[2]);
//		int quantidadeItens = Integer.parseInt("2");
		int quantidadeItens = 2;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new SalvarPedidoNoBancoDeDados(),
				new EnviarEmailPedido(),
				new LogDePedido()));
		
		handler.execute(gerador);
	}

}

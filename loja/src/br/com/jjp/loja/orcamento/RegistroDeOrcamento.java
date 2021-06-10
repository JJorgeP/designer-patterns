package br.com.jjp.loja.orcamento;

import java.util.Map;

import br.com.jjp.loja.DomainException;
import br.com.jjp.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		// chamada HTTP para a API externa
		// URL Connection
		//Http Client
		// lib Rest
		
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado!");
		}
		
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
				);
		
		http.post(url, dados);
	}

}

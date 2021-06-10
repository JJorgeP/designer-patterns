package br.com.jjp.loja.imposto;

import java.math.BigDecimal;

import br.com.jjp.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto Imposto) {
		return Imposto.calcular(orcamento);
	}

}

package br.com.jjp.loja;

import java.math.BigDecimal;

import br.com.jjp.loja.desconto.CalculadoraDeDescontos;
import br.com.jjp.loja.orcamento.ItemOrcamento;
import br.com.jjp.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiroorcamento = new Orcamento();
		primeiroorcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
		Orcamento segundoorcamento = new Orcamento();
		segundoorcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		
		Orcamento terceiroorcamento = new Orcamento();
		terceiroorcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiroorcamento));
		System.out.println(calculadora.calcular(segundoorcamento));
		System.out.println(calculadora.calcular(terceiroorcamento));
		
	}

}

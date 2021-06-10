package br.com.jjp.loja;

import java.math.BigDecimal;

import br.com.jjp.loja.imposto.CalculadoraDeImpostos;
import br.com.jjp.loja.imposto.ICMS;
import br.com.jjp.loja.imposto.ISS;
import br.com.jjp.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
		System.out.println(calculadora.calcular(orcamento, new ISS(null)));
		System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
	}

}

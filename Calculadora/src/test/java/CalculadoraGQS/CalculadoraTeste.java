
package CalculadoraGQS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

class CalculadoraTeste {
	@Test
	void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.SomaInteiros(2, 2));
	}
	

	void trêsSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(3, 7) == 10);

	}

	@Test
	void doisSubtraiDoisEsperaZero() {
		Calculadora c = new Calculadora();
		assertEquals(0, c.SubtraiInteiros(2, 2));
	}

	
	@Test
	void trêsSubtraiSeteEsperaQatroNegativo() {
		Calculadora c = new Calculadora();
		assertTrue(c.SubtraiInteiros(3, 7) == -4);

	}
	@Test
	void doisMultiplicaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.MultiplicaInteiros(2, 2));
	}
    @Test
	void trêsMultiplicaSeteEsperaVinteeUm() {
		Calculadora c = new Calculadora();
		assertTrue(c.MultiplicaInteiros(3, 7) == 21);
	}
    @Test
	void doisDivideDoisEsperaUm() {
		Calculadora c = new Calculadora();
		assertEquals(1, c.DivideInteiros(2, 2));
	}
    @Test
	void quatroDivideDoisEsperaDois () {
		Calculadora c = new Calculadora();
		assertTrue(c.DivideInteiros(4, 2) == 2);
	}

}

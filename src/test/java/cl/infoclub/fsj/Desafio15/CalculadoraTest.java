package cl.infoclub.fsj.Desafio15;

import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cl.infoclub.fsj.Desafio15.ServicioCalculadora.Calculadora;
import cl.infoclub.fsj.Desafio15.ServicioCalculadora.ServicioCalculadora;

@DisplayName("Test Calculadora")
public class CalculadoraTest {

	private static Logger log = Logger.getLogger("cl.infoclub.fsj.testing.ServicioCalculadoraTest");

	private final ServicioCalculadora call = new ServicioCalculadora();

	@Test

	public void sumar() {

		log.info("info test suma numeros");
		Calculadora suma = new Calculadora(5, 5);
		Integer respSuma = call.sumar(suma);
		equals(respSuma);

	}

	@Test

	public void restar() {
		log.info("info test restar numeros");
		Calculadora resta = new Calculadora(5, 5);
		Integer respResta = call.restar(resta);
		equals(respResta);

	}

	@Test
	public void mul() {

		log.info("Info test multiplicar numeros");
		Calculadora multi = new Calculadora(5, 5);
		Integer respMulti = call.multiplicar(multi);
		equals(respMulti);

	}

	@Test
	public void dividir() {
		log.info("info test dividir numeros");
		Calculadora div = new Calculadora(5, 5);
		Integer respDiv = call.dividir(div);
		equals(respDiv);

	}

	
}

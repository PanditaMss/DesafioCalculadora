package cl.infoclub.fsj.Desafio15.ServicioCalculadora;

import java.util.HashMap;
import java.util.Map;

public class ServicioCalculadora {

	private Map<Integer, Integer> cal = new HashMap<>();
	
	public Integer sumar(Calculadora calculadora) {
		cal.put(calculadora.getNum1(), calculadora.getNum2());
		int suma = calculadora.getNum1() + calculadora.getNum2();
		return suma;
	}
		
		public Integer restar(Calculadora calculadora) {
			cal.put(calculadora.getNum1(), calculadora.getNum2());
			int resta = calculadora.getNum1() - calculadora.getNum2();
			return resta;
			
			
		}
		
		public Integer multiplicar(Calculadora calculadora) {
			cal.put(calculadora.getNum1(), calculadora.getNum2());
			int multiplicar = calculadora.getNum1()*calculadora.getNum2();
			return multiplicar;
			
		}
		
		public Integer dividir(Calculadora calculadora) {
			cal.put(calculadora.getNum1(), calculadora.getNum2());
			int dividir = calculadora.getNum1() / calculadora.getNum2();
			return dividir;
			
		}
	}
	
	
	

	


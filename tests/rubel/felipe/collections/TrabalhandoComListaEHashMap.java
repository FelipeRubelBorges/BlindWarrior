package rubel.felipe.collections;

import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;

/**
 *
 */
public class TrabalhandoComListaEHashMap {

	List<Integer> numeros = Arrays.asList( 1, 1, 2, 3 );

	@Test
	public void exercicio0(){
		Integer total = somarNumeros();
		assertEquals( 7, total, 0 );
	}

	private Integer somarNumeros() {

		int soma = 0;

		for(Integer numero: numeros)
		{
			soma = numero + soma;
		}

		return soma;
	}







	@Test
	public void exercicio1(){
		Map<Integer, Integer> totais = contarQuantidadeDosNumeros();

		assertEquals( 2, totais.get( 1 ), 0 );
		assertEquals( 1, totais.get( 2 ), 0 );
		assertEquals( 1, totais.get( 3 ), 0 );
	}

	private Map<Integer, Integer> contarQuantidadeDosNumeros() {
		Map<Integer, Integer> totais = new HashMap<>();


		for(Integer numero:numeros){

			

		}

		return totais;
	}
}

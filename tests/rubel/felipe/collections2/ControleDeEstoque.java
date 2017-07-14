package rubel.felipe.collections2;

import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Restriçao para todos os exercicios:
 *  - nenhum metodo com mais de 10 linhas.
 */
public class ControleDeEstoque {

	// indices podem ser salvos aqui...


	@Before
	public void criarIndices(){

	}

	/**
	 * Calcular o total vendido por categoria.
	 */
	@Test
	public void exercicio1(){
		double[] totais = calcularTotalVendidoPorCategoria(); // aqui tu vais calcular o total vendido de comida.

		// total de comidas
		assertEquals( 75.89, totais[0], 0 );
		// total de bebidas
		assertEquals( 75.89, totais[1], 0 );
	}

	private double[] calcularTotalVendidoPorCategoria() {
		return null;
	}

	/**
	 * Calcular o total vendido por cliente.
	 */
	@Test
	public void exercicio2(){
		double[] totais = calcularTotalVendidoPorCliente();

		// total do Felipe
		assertEquals( 75.89, totais[0], 0 );
		// total do Miere
		assertEquals( 75.89, totais[1], 0 );
	}

	private double[] calcularTotalVendidoPorCliente() {
		return null;
	}

	/**
	 * Calcular a quantidade media de produtos comprados por cliente.
	 */
	@Test
	public void exercicio3(){
		double media = calcularMedidaDeProdutosCompradosPorCliente();
		assertEquals( 1, media, 0 );
	}

	// SELECT COUNT(*) FROM ITEMS GROUP BY ID_PEDIDO
	private double calcularMedidaDeProdutosCompradosPorCliente() {
		return 0;
	}
}

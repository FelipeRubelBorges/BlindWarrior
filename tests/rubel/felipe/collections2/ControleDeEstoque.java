package rubel.felipe.collections2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

/**
 * Restriçao para todos os exercicios: - nenhum metodo com mais de 10 linhas.
 */
public class ControleDeEstoque {

	static Cliente felipe = new Cliente().nome("Felipe");
	static Cliente miere = new Cliente().nome("Miere");

	static CategoriaDeProduto comida = new CategoriaDeProduto().nome("Comida"),
			bebida = new CategoriaDeProduto().nome("Bebida");

	static Produto pao = new Produto().nome("Pao").idCategoria(comida.id),
			weiss = new Produto().nome("Cerveja Weiss").idCategoria(bebida.id),
			carne = new Produto().nome("Carne").idCategoria(comida.id),
			suco = new Produto().nome("Suco").idCategoria(bebida.id),
			pilsen = new Produto().nome("Cerveja Pilsen").idCategoria(bebida.id);

	static Pedido pedido1 = new Pedido().idCliente(felipe.id), 
			pedido2 = new Pedido().idCliente(felipe.id),
			pedido3 = new Pedido().idCliente(miere.id);

	static List<ItemComprado> itemComprados = Arrays.asList(
			new ItemComprado().idPedido(pedido1.id).idProduto(pao.id).preco(9).quantidade(2),
			new ItemComprado().idPedido(pedido1.id).idProduto(carne.id).preco(20.99),
			new ItemComprado().idPedido(pedido1.id).idProduto(weiss.id).preco(7.99).quantidade(6),
			new ItemComprado().idPedido(pedido2.id).idProduto(pao.id).preco(9).quantidade(1),
			new ItemComprado().idPedido(pedido2.id).idProduto(weiss.id).preco(7.99).quantidade(6),
			new ItemComprado().idPedido(pedido3.id).idProduto(carne.id).preco(19.9),
			new ItemComprado().idPedido(pedido3.id).idProduto(pao.id).preco(8.5).quantidade(2),
			new ItemComprado().idPedido(pedido3.id).idProduto(pilsen.id).preco(7.99).quantidade(6),
			new ItemComprado().idPedido(pedido3.id).idProduto(suco.id).preco(6.99).quantidade(2));

	@Before
	public void criarIndices() {

	}

	/**
	 * Calcular o total vendido por categoria.
	 */
	@Test
	public void exercicio1() {
		double[] totais = calcularTotalVendidoPorCategoria(); // aqui tu vais
																// calcular o
																// total vendido
																// de comida.

		System.out.println(totais[0]);
		System.out.println(totais[1]);
		// total de comidas
		assertEquals(84.89, totais[0], 0.001);
		// total de bebidas
		assertEquals(157.8, totais[1], 0.001);
	}

	private double[] calcularTotalVendidoPorCategoria() {
		double[] totais = new double[2];

		for (ItemComprado itemComprado : itemComprados) {
			if (itemComprado.idProduto() == pao.id || itemComprado.idProduto() == carne.id) {
				totais[0] += itemComprado.preco() * itemComprado.quantidade();
			} else {
				totais[1] += itemComprado.preco() * itemComprado.quantidade();
			}
		}

		return totais;
	}

	/**
	 * Calcular o total vendido por cliente.
	 */
	@Test
	public void exercicio2() {
		double[] totais = calcularTotalVendidoPorCliente();

		System.out.println(totais[0]);
		System.out.println(totais[1]);

		// total do Felipe
		assertEquals(143.87, totais[0], 0.001);
		// total do Miere
		assertEquals(98.82, totais[1], 0.001);
	}

	private double[] calcularTotalVendidoPorCliente() {

		double[] totais = new double[2];

		for (ItemComprado itemComprado : itemComprados) {
			if (itemComprado.idPedido() == pedido3.id) {
				totais[1] += itemComprado.preco() * itemComprado.quantidade();
			} else {
				totais[0] += itemComprado.preco() * itemComprado.quantidade();
			}
		}

		return totais;
	}

	/**
	 * Calcular a quantidade media de produtos comprados por cliente.
	 */
	@Test
	public void exercicio3() {
		double media = calcularMedidaDeProdutosCompradosPorCliente();

		assertEquals(13.5, media, 0.001);
	}

	// SELECT COUNT(*) FROM ITEMS GROUP BY ID_PEDIDO
	private double calcularMedidaDeProdutosCompradosPorCliente() {

		double media = 0;

		for (ItemComprado itemComprado : itemComprados) {

			media += itemComprado.quantidade;

		}

		media = media / 2;

		System.out.println(media);

		return media;
	}
}

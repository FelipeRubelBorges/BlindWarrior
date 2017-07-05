package rubel.felipe.collections;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.*;

/**
*
*/
public class TrabalhandoComListas {

	ArrayList<ItensASeremComprados> itens;

	@Before
	public void criarItensASeremComprados() {
		itens = new ArrayList<>();
		itens.add(new ItensASeremComprados("Arroz", 5.99, "Alimento"));
		itens.add(new ItensASeremComprados("Feijao", 10.99, "Alimento"));
		itens.add(new ItensASeremComprados("Macarrao", 3.45, "ALimento"));
		itens.add(new ItensASeremComprados("Cerveja", 3.00, "Bebidas"));
		itens.add(new ItensASeremComprados("Cerveja Ruim", 1.70, "Bebidas"));
		itens.add(new ItensASeremComprados("Pneu", 120.00, "Transporte"));
		itens.add(new ItensASeremComprados("Fraldas", 55.00, "Crianças"));
	}

	/**
	 * Ordene a lista por preço. Restriçao: com 4 ou menos linhas.
	 */
	@Test
	public void exercicio1() {

		Collections.sort(itens,
				(ItensASeremComprados o1, ItensASeremComprados o2) -> Double.compare(o1.preço, o2.preço));

		// ** Outra forma de realizar o exercicio **
		/*
		 * Collections.sort(itens, new Comparator<ItensASeremComprados>() {
		 * 
		 * @Override public int compare(ItensASeremComprados o1,
		 * ItensASeremComprados o2) {
		 * 
		 * return Double.compare(o1.preço, o2.preço);
		 * 
		 * } });
		 */

		assertEquals(1.70, itens.get(0).preço, 0);
		assertEquals(3.00, itens.get(1).preço, 0);
		assertEquals(3.45, itens.get(2).preço, 0);
		assertEquals(5.99, itens.get(3).preço, 0);
		assertEquals(10.99, itens.get(4).preço, 0);
		assertEquals(55.00, itens.get(5).preço, 0);
		assertEquals(120.00, itens.get(6).preço, 0);

	}

	/**
	 * Ordene a lista alfabeticamente por nome. Restriçao: com 4 ou menos
	 * linhas.
	 */
	@Test
	public void exercicio2() {

		Collections.sort(itens, (ItensASeremComprados o1, ItensASeremComprados o2) -> o1.nome.compareTo(o2.nome));

		// ** Outra forma de realizar o exercicio **
		/*
		 * Collections.sort(itens, new Comparator<ItensASeremComprados>() {
		 * 
		 * @Override public int compare(ItensASeremComprados o1,
		 * ItensASeremComprados o2) {
		 * 
		 * return o1.nome.compareTo(o2.nome);
		 * 
		 * } });
		 */

		assertEquals("Arroz", itens.get(0).nome);
		assertEquals("Cerveja", itens.get(1).nome);
		assertEquals("Cerveja Ruim", itens.get(2).nome);
		assertEquals("Feijao", itens.get(3).nome);
		assertEquals("Fraldas", itens.get(4).nome);
		assertEquals("Macarrao", itens.get(5).nome);
		assertEquals("Pneu", itens.get(6).nome);
	}

	/**
	 * Classificar itens por "Categoria". Restriçao: com 8 ou menos linhas.
	 */
	@Test
	public void exercicio3() {
		Map<String, List<ItensASeremComprados>> itensClassificados;

		ItensASeremComprados itens[] = { new ItensASeremComprados("Arroz", 5.99, "Alimento"),
										 new ItensASeremComprados("Feijao", 10.99, "Alimento"),
										 new ItensASeremComprados("Macarrao", 3.45, "Alimento"),
										 new ItensASeremComprados("Cerveja", 3.00, "Bebidas"),
										 new ItensASeremComprados("Cerveja Ruim", 1.70, "Bebidas"),
										 new ItensASeremComprados("Pneu", 120.00, "Transporte"),
										 new ItensASeremComprados("Fraldas", 55.00, "Crianças") };

		itensClassificados = Arrays.asList(itens).stream().collect(Collectors.groupingBy(i -> i.categoria));

		assertEquals(3, itensClassificados.get("Alimento").size());
		assertEquals(2, itensClassificados.get("Bebidas").size());
		assertEquals(1, itensClassificados.get("Crianças").size());
		assertEquals(1, itensClassificados.get("Transporte").size());
	}

	/**
	 * Gerar um relatorio de Categoria e a soma do preço de todos os produtos a
	 * ela associados. Restriçao: com 8 ou menos linhas.
	 */
	@Test
	public void exercicio4() {
		Map<String, Double> itensClassificados = null;

		ItensASeremComprados itens[] = { new ItensASeremComprados("Arroz", 5.99, "Alimento"),
										 new ItensASeremComprados("Feijao", 10.99, "Alimento"),
										 new ItensASeremComprados("Macarrao", 3.45, "Alimento"),
										 new ItensASeremComprados("Cerveja", 3.00, "Bebidas"),
										 new ItensASeremComprados("Cerveja Ruim", 1.70, "Bebidas"),
										 new ItensASeremComprados("Pneu", 120.00, "Transporte"),
										 new ItensASeremComprados("Fraldas", 55.00, "Crianças") };

		itensClassificados = Arrays.asList(itens).stream()
				.collect(Collectors.groupingBy(i -> i.categoria, Collectors.summingDouble(j -> j.preço)));

		assertEquals(20.43, itensClassificados.get("Alimento"), 0);
		assertEquals(4.70, itensClassificados.get("Bebidas"), 0);
		assertEquals(55.00, itensClassificados.get("Crianças"), 0);
		assertEquals(120.00, itensClassificados.get("Transporte"), 0);
	}

}

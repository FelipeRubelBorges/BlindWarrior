package rubel.felipe.collections;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

/**
 *
 */
public class ExemplosDeHashMap {

	// VALE A PENA PROCURAR MAIS INFORMAÇOES SOBRE "Generics" NO JAVA
	HashMap<String, ItensASeremComprados> indice = new HashMap<>();

	@Before
	public void mostrarComoEstaOMapAntesDosTestes() {
		System.out.println(indice);
	}

	@After
	public void mostrarComoEstaOMapAposOsTestes() {
		System.out.println(indice);
	}

	@Test
	public void inclusaoDeItensNoMap() {
		ItensASeremComprados item = new ItensASeremComprados("Pao", 1.99, "Comida");
		indice.put("COmida", item);
	}

	@Test
	public void percorrendoMap() {
		ItensASeremComprados item = new ItensASeremComprados("Pao", 1.99, "Comida");
		indice.put("COmida", item);
		indice.put("COmida1", item);
		indice.put("COmida2", item);

		for (Map.Entry<String, ItensASeremComprados> entrada : indice.entrySet()) {
			System.out.println(entrada);
		}
	}

	@Test
	public void percorrendoMap2() {
		ItensASeremComprados item = new ItensASeremComprados("queijo", 1.99, "Comida");
		indice.put("COmida", item);
		indice.put("COmida1", item);
		indice.put("COmida2", item);

		for (ItensASeremComprados item2 : indice.values()) {
			System.out.println(item2);
		}
	}

	@Test
	public void percorrendoMap3() {
		ItensASeremComprados item = new ItensASeremComprados("Pao", 1.99, "Comida");
		indice.put("COmida", item);
		indice.put("COmida1", item);
		indice.put("COmida2", item);

		for (String categoria : indice.keySet()) {
			System.out.println(categoria);
		}
	}

	@Test
	public void obtendoValorDoMap() {
		ItensASeremComprados item = new ItensASeremComprados("Pao", 1.99, "Comida");
		ItensASeremComprados item1 = new ItensASeremComprados("Pao", 1.99, "Comida");

		indice.put("COmida", item);
		indice.put("COmida1", item1);
		indice.put("COmida2", item);

		ItensASeremComprados comida = indice.get("COmida");
		assertEquals(item, comida);

		ItensASeremComprados comida1 = indice.get("COmida1");
		assertEquals(item1, comida1);

		ItensASeremComprados comida2 = indice.get("COmida2");
		assertEquals(item, comida2);
		assertEquals(comida, comida2);
	}

	@Test
	public void obtendoValorInexistenteDoMap() {
		ItensASeremComprados cOmida = indice.get("COmida");
		assertNull(cOmida);
	}

	@Test
	public void obtendoValorInexistenteDoMap1() {
		ItensASeremComprados itemPadrao = new ItensASeremComprados("itemPadrao", 0, "Desconhecido");

		ItensASeremComprados cOmida = indice.getOrDefault("COmida", itemPadrao);
		assertEquals(cOmida, itemPadrao);

		assertEquals(0, indice.size());
	}

	@Test
	public void obtendoValorInexistenteDoMap2() {
		ItensASeremComprados cOmida = indice.get("COmida");
		if (cOmida == null) {
			cOmida = new ItensASeremComprados("Item Novo", 1.00, "Conhecido");
			indice.put("COmida", cOmida);
		}

		assertEquals(1, indice.size());
	}

	/*
	 * 
	 * ItensASeremComprados itemPadrao = new ItensASeremComprados("itemPadrao",
	 * 0, "Desconhecido");
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void obtendoValorInexistenteDoMap3() {
		ItensASeremComprados cOmida = indice.computeIfAbsent("COmida", (k) -> {
			return new ItensASeremComprados("Item Novo", 1.00, "COnhecido");
		});

		assertEquals(1, indice.size());
	}

	@Test
	public void listaDentroDoMap() {
		HashMap<String, ArrayList<ItensASeremComprados>> novoIndice = new HashMap<>();

		ItensASeremComprados comida = new ItensASeremComprados("Item Novo", 1.00, "DHASIDUASHDAHSDHIsiu");
		ItensASeremComprados comida2 = new ItensASeremComprados("Item Novo", 1.00, "COnhecido2");
		ItensASeremComprados comida3 = new ItensASeremComprados("Item Novo", 1.00, "COnhecido2");

		ArrayList<ItensASeremComprados> listaConhecido = new ArrayList<>();
		listaConhecido.add(comida);

		novoIndice.put(comida.categoria, listaConhecido);

		novoIndice.computeIfAbsent(comida2.categoria, (k) -> new ArrayList<>()).add(comida2);
		novoIndice.computeIfAbsent(comida3.categoria, (k) -> new ArrayList<>()).add(comida3);

		assertEquals(2, novoIndice.size());

		assertEquals(1, novoIndice.get("DHASIDUASHDAHSDHIsiu").size());

		assertEquals(2, novoIndice.get("COnhecido2").size());

		assertNull(novoIndice.get("COnhecido"));
	}
}

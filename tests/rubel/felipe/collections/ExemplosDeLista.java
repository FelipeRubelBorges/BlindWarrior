package rubel.felipe.collections;

import java.util.ArrayList;
import org.junit.*;

/**
 *
 */
public class ExemplosDeLista {

	ArrayList<ItensASeremComprados> itens;

	@Before
	public void criarItensASeremComprados()
	{
		itens = new ArrayList<>();
		itens.add( new ItensASeremComprados( "Arroz", 5.99, "Alimento" ) );
		itens.add( new ItensASeremComprados( "Feijao", 10.99, "Alimento" ) );
		itens.add( new ItensASeremComprados( "Macarrao", 3.45, "ALimento" ) );
		itens.add( new ItensASeremComprados( "Cerveja", 3.00, "Bebidas" ) );
		itens.add( new ItensASeremComprados( "Cerveja Ruim", 1.70, "Bebidas" ) );
		itens.add( new ItensASeremComprados( "Pneu", 120.00, "Transporte" ) );
		itens.add( new ItensASeremComprados( "Fraldas", 55.00, "Crianças" ) );


		System.out.println( "Lista: " + itens );
	}

	@After
	public void mostrarComoEstaAListaAposOsTestes(){
		System.out.println( "Lista: " + itens );
	}

	@Test
	public void exemploDeRemocaoDeItemDaLista(){
		itens.remove( 2 );
	}

	@Test
	public void percorrendoItensDaLista()
	{
		for ( ItensASeremComprados item : itens ) {
			System.out.println( item );
		}
	}

	@Test
	public void exemploDeRemocaoDeInclusaDaLista(){
		ItensASeremComprados item = new ItensASeremComprados("Pneu", 120.00, "Transporte");
		itens.add( item );
	}
}

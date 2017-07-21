package rubel.felipe.collections2;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 */
public class TestesDasFuncoes {

	@Test
	public void consegueAgruparItemsPorPedido(){
		ArrayList<ArrayList<ItemComprado>> grupos =
			Funcoes.groupBy(Dados.itemComprados, (ItemComprado item) -> item.idPedido);

		assertEquals( 3, grupos.get( 0 ).size() );
		assertEquals( 2, grupos.get( 1 ).size() );
		assertEquals( 4, grupos.get( 2 ).size() );
	}
}

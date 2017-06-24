package rubel.felipe;

import org.junit.*;

/**
 *
 */
public class TesteASerExcluido {

	int ESFORCO_ERRADO = 51,
		ESFORCO_NORMAL = 50;

	@Test
	public void umCansadoAtletaSeMachucaSeFizerEsforcoErradoAoLevantarPeso(){
		Atleta atleta = new Atleta();
		atleta.estaDescansado = false;
		atleta.fazerEsforco( ESFORCO_ERRADO );
		Assert.assertTrue( atleta.seMachucou );
	}

	@Test
	public void umDescansadoAtletaNaoSeMachucaSeFizerEsforcoErradoAoLevantarPeso(){
		Atleta atleta = new Atleta();
		atleta.fazerEsforco( ESFORCO_ERRADO );
		Assert.assertFalse( atleta.seMachucou );
	}

	@Test
	public void umAtletaNaoSeMachucaSeFizerEsforcoDaManeiraCertaAoLevantarPeso(){
		Atleta atleta = new Atleta();
		atleta.fazerEsforco( ESFORCO_NORMAL );
		Assert.assertFalse( atleta.seMachucou );
	}
}

class Atleta {

	boolean estaDescansado = true;
	boolean seMachucou = false;

	void fazerEsforco( int quantidadeEsforco ) {
		if ( quantidadeEsforco > 50 && !estaDescansado )
			seMachucou = true;
		else
			seMachucou = false;
	}
}
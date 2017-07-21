package rubel.felipe.collections2;

import java.util.*;

/**
 *
 */
public class Dados {

	static Cliente felipe = new Cliente().nome( "Felipe" );
	static Cliente miere = new Cliente().nome( "Miere" );

	static CategoriaDeProduto
		comida = new CategoriaDeProduto().nome( "Comida" ),
		bebida = new CategoriaDeProduto().nome( "Bebida" )
	;

	static Produto
		pao = new Produto().nome( "Pao" ).idCategoria( comida.id ),
		weiss = new Produto().nome( "Cerveja Weiss" ).idCategoria( bebida.id ),
		carne = new Produto().nome( "Carne" ).idCategoria( comida.id ),
		suco = new Produto().nome( "Suco" ).idCategoria( bebida.id ),
		pilsen = new Produto().nome( "Cerveja Pilsen" ).idCategoria( bebida.id )
	;

	static Pedido
		pedido1 = new Pedido().idCliente( felipe.id ),
		pedido2 = new Pedido().idCliente( felipe.id ),
		pedido3 = new Pedido().idCliente( miere.id )
	;

	static List<ItemComprado> itemComprados = Arrays.asList(
		new ItemComprado().idPedido( pedido1.id ).idProduto( pao.id ).preco( 9 ).quantidade( 2 ),
		new ItemComprado().idPedido( pedido1.id ).idProduto( carne.id ).preco( 20.99 ),
		new ItemComprado().idPedido( pedido1.id ).idProduto( weiss.id ).preco( 7.99 ).quantidade( 6 ),
		new ItemComprado().idPedido( pedido2.id ).idProduto( pao.id ).preco( 9 ).quantidade( 1 ),
		new ItemComprado().idPedido( pedido2.id ).idProduto( weiss.id ).preco( 7.99 ).quantidade( 6 ),
		new ItemComprado().idPedido( pedido3.id ).idProduto( carne.id ).preco( 19.9 ),
		new ItemComprado().idPedido( pedido3.id ).idProduto( pao.id ).preco( 8.5 ).quantidade( 2 ),
		new ItemComprado().idPedido( pedido3.id ).idProduto( pilsen.id ).preco( 7.99 ).quantidade( 6 ),
		new ItemComprado().idPedido( pedido3.id ).idProduto( suco.id ).preco( 6.99 ).quantidade( 2 )
	);
}

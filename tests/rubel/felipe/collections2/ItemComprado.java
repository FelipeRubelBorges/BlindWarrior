package rubel.felipe.collections2;

import lombok.*;

/**
 *
 */
@Getter
@Setter
public class ItemComprado {

	long id = GeradorDeId.gerar();
	long idPedido;
	long idProduto;
	double preco;
	double quantidade = 1;
}

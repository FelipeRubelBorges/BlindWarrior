package rubel.felipe.collections2;

import lombok.*;

/**
 *
 */
@Getter
@Setter
public class Pedido {

	long id = GeradorDeId.gerar();
	long idCliente;

}

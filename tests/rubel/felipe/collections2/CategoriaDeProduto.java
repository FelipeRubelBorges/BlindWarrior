package rubel.felipe.collections2;

import lombok.*;

/**
 *
 */
@Getter
@Setter
public class CategoriaDeProduto {

	long id = GeradorDeId.gerar();

	String nome;

}
